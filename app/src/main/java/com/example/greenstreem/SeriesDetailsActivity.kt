package com.example.greenstreem

import android.content.Intent
import android.content.Context
import android.graphics.Color
import android.os.Bundle
import android.view.Gravity
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.gson.Gson
import com.google.gson.JsonElement
import com.google.gson.JsonObject
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.io.BufferedReader
import java.io.InputStreamReader
import java.net.URL
import java.net.URLConnection
import java.net.URLEncoder
import java.util.Locale

class SeriesDetailsActivity : AppCompatActivity() {

    private lateinit var ivCover: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvPlot: TextView
    private lateinit var tvStatus: TextView
    private lateinit var rvSeasons: RecyclerView
    private lateinit var rvEpisodes: RecyclerView

    private var seriesId: Int = -1
    private var seriesName: String = ""
    private var allEpisodes: Map<String, List<XtreamEpisode>> = emptyMap()
    private var currentSeason: SeasonRow? = null
    private val gson = Gson()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_series_details)

        ivCover = findViewById(R.id.ivSeriesCover)
        tvName = findViewById(R.id.tvSeriesName)
        tvPlot = findViewById(R.id.tvSeriesPlot)
        tvStatus = findViewById(R.id.tvSeriesStatus)
        rvSeasons = findViewById(R.id.rvSeasons)
        rvEpisodes = findViewById(R.id.rvEpisodes)

        seriesId = intent.getIntExtra("series_id", -1)
        val name = intent.getStringExtra("series_name")
        val cover = intent.getStringExtra("series_cover")
        seriesName = name.orEmpty()

        tvName.text = name
        Glide.with(this).load(cover).into(ivCover)

        rvSeasons.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvEpisodes.layoutManager = LinearLayoutManager(this)
        showSeriesStatus("Loading episodes...")

        fetchSeriesInfo()
    }

    private fun fetchSeriesInfo() {
        val service = XtreamManager.getService() ?: return
        showCachedFallbackEpisodesIfAvailable()
        service.getSeriesInfoRaw(XtreamManager.username, XtreamManager.password, seriesId)
            .enqueue(object : Callback<JsonObject> {
                override fun onResponse(call: Call<JsonObject>, response: Response<JsonObject>) {
                    if (response.isSuccessful) {
                        val body = response.body()
                        lifecycleScope.launch {
                            val data = withContext(Dispatchers.Default) {
                                body?.let { parseSeriesInfo(it) }
                            }
                            val parsedEpisodes = data?.episodes.orEmpty().filterValues { it.isNotEmpty() }
                            val fallbackEpisodes = if (parsedEpisodes.isEmpty()) {
                                showSeriesStatus("Loading episodes from playlist...")
                                withContext(Dispatchers.IO) { loadSeriesEpisodesFromM3u(seriesName) }
                            } else {
                                emptyMap()
                            }
                            tvPlot.text = data?.info?.plot ?: "No description available"
                            allEpisodes = if (parsedEpisodes.isNotEmpty()) parsedEpisodes else fallbackEpisodes
                            if (parsedEpisodes.isEmpty() && fallbackEpisodes.isNotEmpty()) {
                                saveFallbackEpisodesToCache(fallbackEpisodes)
                            }

                            if (showSeriesEpisodes(data?.seasons.orEmpty(), allEpisodes)) {
                                hideSeriesStatus()
                            } else {
                                showSeriesStatus("No episodes found")
                                Toast.makeText(this@SeriesDetailsActivity, "No episodes found for this series", Toast.LENGTH_SHORT).show()
                            }
                        }
                    }
                }
                override fun onFailure(call: Call<JsonObject>, t: Throwable) {
                    if (allEpisodes.isEmpty()) {
                        showSeriesStatus("Unable to load episodes")
                    }
                }
            })
    }

    private fun showCachedFallbackEpisodesIfAvailable() {
        val cached = loadFallbackEpisodesFromCache()
        if (cached.isEmpty()) return
        allEpisodes = cached
        if (showSeriesEpisodes(emptyList(), cached)) {
            showSeriesStatus("Refreshing episodes...")
        }
    }

    private fun showSeriesEpisodes(
        seasons: List<XtreamSeason>,
        episodes: Map<String, List<XtreamEpisode>>
    ): Boolean {
        val seasonRows = buildSeasonRows(seasons, episodes)
        rvSeasons.adapter = SeasonAdapter(seasonRows) { season ->
            displayEpisodes(season)
        }
        if (seasonRows.isEmpty()) {
            rvEpisodes.adapter = EpisodeAdapter(emptyList(), emptySet()) { _, _ -> }
            return false
        }
        displayEpisodes(seasonRows.first())
        return true
    }

    private fun showSeriesStatus(message: String) {
        tvStatus.text = message
        tvStatus.visibility = View.VISIBLE
    }

    private fun hideSeriesStatus() {
        tvStatus.visibility = View.GONE
    }

    private fun parseSeriesInfo(root: JsonObject): XtreamSeriesInfoResponse {
        return XtreamSeriesInfoResponse(
            seasons = parseSeasons(root.get("seasons")),
            episodes = parseEpisodes(root.get("episodes")),
            info = root.get("info")?.takeIf { it.isJsonObject }?.let {
                gson.fromJson(it, XtreamSeriesDetailsInfo::class.java)
            }
        )
    }

    private fun parseSeasons(element: JsonElement?): List<XtreamSeason> {
        if (element == null || element.isJsonNull) return emptyList()
        return when {
            element.isJsonArray -> element.asJsonArray.mapNotNull { parseSeason(it) }
            element.isJsonObject -> element.asJsonObject.entrySet().mapNotNull { parseSeason(it.value) }
            else -> emptyList()
        }
    }

    private fun parseSeason(element: JsonElement): XtreamSeason? {
        return runCatching {
            element.takeIf { it.isJsonObject }?.let { gson.fromJson(it, XtreamSeason::class.java) }
        }.getOrNull()
    }

    private fun parseEpisodes(element: JsonElement?): Map<String, List<XtreamEpisode>> {
        if (element == null || element.isJsonNull) return emptyMap()
        val grouped = linkedMapOf<String, MutableList<XtreamEpisode>>()
        fun add(seasonKey: String?, episode: XtreamEpisode) {
            val key = episode.season?.toString()
                ?: seasonKey?.takeIf { it.isNotBlank() }
                ?: "1"
            grouped.getOrPut(key) { mutableListOf() }.add(episode)
        }

        collectEpisodes(element, null) { seasonKey, episode -> add(seasonKey, episode) }

        return grouped.mapValues { (_, episodes) ->
            episodes.distinctBy { it.id }.sortedWith(compareBy<XtreamEpisode> { it.episodeNum ?: Int.MAX_VALUE }.thenBy { it.title })
        }
    }

    private fun collectEpisodes(
        element: JsonElement,
        seasonKey: String?,
        add: (String?, XtreamEpisode) -> Unit
    ) {
        when {
            element.isJsonArray -> {
                element.asJsonArray.forEach { collectEpisodes(it, seasonKey, add) }
            }
            element.isJsonObject -> {
                val obj = element.asJsonObject
                if (looksLikeEpisode(obj)) {
                    parseEpisode(obj, seasonKey)?.let { add(seasonKey, it) }
                    return
                }
                obj.entrySet().forEach { (key, value) ->
                    val nextSeasonKey = key.toIntOrNull()?.toString() ?: seasonKey
                    collectEpisodes(value, nextSeasonKey, add)
                }
            }
        }
    }

    private fun looksLikeEpisode(obj: JsonObject): Boolean {
        return firstString(obj, "id", "stream_id", "episode_id", "movie_id").isNotBlank() &&
            (firstString(obj, "title", "name", "episode_title").isNotBlank() ||
                obj.has("episode_num") ||
                obj.has("episode") ||
                obj.has("episode_number"))
    }

    private fun parseEpisode(element: JsonElement, fallbackSeason: String?): XtreamEpisode? {
        if (!element.isJsonObject) return null
        val obj = element.asJsonObject
        val info = obj.get("info")?.takeIf { it.isJsonObject }?.asJsonObject
        val id = firstString(obj, "id", "stream_id", "episode_id", "movie_id")
        if (id.isBlank()) return null
        val episodeNum = firstInt(obj, "episode_num", "episode", "episode_number", "num")
            ?: info?.let { firstInt(it, "episode_num", "episode", "episode_number", "num") }
        val season = firstInt(obj, "season", "season_number")
            ?: info?.let { firstInt(it, "season", "season_number") }
            ?: fallbackSeason?.toIntOrNull()
        val title = firstString(obj, "title", "name", "episode_title")
            .ifBlank { info?.let { firstString(it, "title", "name", "episode_title") }.orEmpty() }
            .ifBlank { episodeNum?.let { "Episode $it" }.orEmpty() }
            .ifBlank { "Episode" }
        val extension = firstString(obj, "container_extension", "containerExtension", "extension")
            .ifBlank { info?.let { firstString(it, "container_extension", "containerExtension", "extension") }.orEmpty() }
            .ifBlank { "mp4" }
        val directUrl = firstString(obj, "direct_source", "direct_url", "url", "stream_url").takeIf { it.isNotBlank() }

        return XtreamEpisode(
            id = id,
            title = title,
            containerExtension = extension,
            season = season,
            episodeNum = episodeNum,
            directUrl = directUrl
        )
    }

    private fun loadSeriesEpisodesFromM3u(showName: String): Map<String, List<XtreamEpisode>> {
        if (showName.isBlank() || XtreamManager.baseUrl.isBlank()) return emptyMap()
        return runCatching {
            URL(xtreamM3uUrl()).openConnection().applyPlaylistTimeouts().getInputStream().use { stream ->
                val target = normalizeSeriesTitle(showName)
                val grouped = linkedMapOf<String, MutableList<XtreamEpisode>>()
                val reader = BufferedReader(InputStreamReader(stream))
                var pendingName: String? = null
                var line: String?
                while (reader.readLine().also { line = it } != null) {
                    val value = line?.trim().orEmpty()
                    when {
                        value.startsWith("#EXTINF:", ignoreCase = true) -> {
                            pendingName = value.substringAfterLast(',', "").trim()
                        }
                        pendingName != null && isPlayableUrl(value) -> {
                            fallbackEpisodeFromM3uEntry(pendingName.orEmpty(), value, target)?.let { episode ->
                                val key = episode.season?.toString() ?: "1"
                                grouped.getOrPut(key) { mutableListOf() }.add(episode)
                            }
                            pendingName = null
                        }
                    }
                    if (grouped.size >= 40 && grouped.values.sumOf { it.size } >= 900) break
                }
                grouped.mapValues { (_, episodes) ->
                    episodes
                        .distinctBy { it.directUrl ?: it.id }
                        .sortedWith(compareBy<XtreamEpisode> { it.season ?: Int.MAX_VALUE }
                            .thenBy { it.episodeNum ?: Int.MAX_VALUE }
                            .thenBy { it.title })
                }
            }
        }.getOrDefault(emptyMap())
    }

    private fun URLConnection.applyPlaylistTimeouts(): URLConnection {
        connectTimeout = PLAYLIST_CONNECT_TIMEOUT_MS
        readTimeout = PLAYLIST_READ_TIMEOUT_MS
        return this
    }

    private fun loadFallbackEpisodesFromCache(): Map<String, List<XtreamEpisode>> {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val key = fallbackCacheKey()
        val savedAt = prefs.getLong("${key}_at", 0L)
        if (savedAt <= 0L || System.currentTimeMillis() - savedAt > FALLBACK_CACHE_TTL_MS) return emptyMap()
        val raw = prefs.getString(key, "").orEmpty()
        if (raw.isBlank()) return emptyMap()
        val type = object : TypeToken<Map<String, List<XtreamEpisode>>>() {}.type
        return runCatching {
            gson.fromJson<Map<String, List<XtreamEpisode>>>(raw, type).orEmpty()
        }.getOrDefault(emptyMap())
    }

    private fun saveFallbackEpisodesToCache(episodes: Map<String, List<XtreamEpisode>>) {
        if (episodes.isEmpty()) return
        val key = fallbackCacheKey()
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putString(key, gson.toJson(episodes))
            .putLong("${key}_at", System.currentTimeMillis())
            .apply()
    }

    private fun fallbackCacheKey(): String {
        val titleKey = normalizeSeriesTitle(seriesName).take(80)
        return "series_fallback_${seriesId}_$titleKey"
    }

    private fun xtreamM3uUrl(): String {
        val user = URLEncoder.encode(XtreamManager.username, "UTF-8")
        val pass = URLEncoder.encode(XtreamManager.password, "UTF-8")
        return "${XtreamManager.baseUrl}/get.php?username=$user&password=$pass&type=m3u_plus&output=ts"
    }

    private fun fallbackEpisodeFromM3uEntry(name: String, streamUrl: String, targetTitle: String): XtreamEpisode? {
        if (!streamUrl.contains("/series/", ignoreCase = true) && !hasEpisodePattern(name)) return null
        val parsed = parseSeriesEpisodeName(name) ?: return null
        if (!matchesSeriesTitle(parsed.seriesTitle, targetTitle)) return null
        val cleanUrl = streamUrl.substringBefore('?')
        val lastSegment = cleanUrl.substringAfterLast('/')
        val streamId = lastSegment.substringBeforeLast('.', lastSegment).ifBlank { cleanUrl.hashCode().toString() }
        val ext = lastSegment.substringAfterLast('.', "mp4").ifBlank { "mp4" }
        return XtreamEpisode(
            id = streamId,
            title = parsed.episodeTitle,
            containerExtension = ext,
            season = parsed.season,
            episodeNum = parsed.episode,
            directUrl = streamUrl
        )
    }

    private fun isPlayableUrl(value: String): Boolean {
        val lower = value.lowercase(Locale.US)
        return lower.startsWith("http://") ||
            lower.startsWith("https://") ||
            lower.startsWith("rtmp://") ||
            lower.startsWith("rtsp://") ||
            lower.startsWith("udp://")
    }

    private fun parseSeriesEpisodeName(rawName: String): ParsedSeriesEpisode? {
        val name = rawName.trim()
        val match = Regex("""(?i)\bS(\d{1,3})\s*E(\d{1,3})\b""").find(name)
            ?: Regex("""(?i)\bSeason\s*(\d{1,3}).*?\bEpisode\s*(\d{1,3})\b""").find(name)
            ?: Regex("""(?i)\b(\d{1,3})x(\d{1,3})\b""").find(name)
            ?: return null
        val season = match.groupValues.getOrNull(1)?.toIntOrNull() ?: return null
        val episode = match.groupValues.getOrNull(2)?.toIntOrNull() ?: return null
        val seriesTitle = name.substring(0, match.range.first)
            .trim(' ', '-', ':', '|')
            .ifBlank { seriesName }
        val episodeTitle = name.substring(match.range.last + 1)
            .trim(' ', '-', ':', '|')
            .ifBlank { "Episode $episode" }
        return ParsedSeriesEpisode(seriesTitle, season, episode, episodeTitle)
    }

    private fun hasEpisodePattern(name: String): Boolean {
        return Regex("""(?i)\bS\d{1,3}\s*E\d{1,3}\b""").containsMatchIn(name) ||
            Regex("""(?i)\bSeason\s*\d{1,3}.*?\bEpisode\s*\d{1,3}\b""").containsMatchIn(name) ||
            Regex("""(?i)\b\d{1,3}x\d{1,3}\b""").containsMatchIn(name)
    }

    private fun normalizeSeriesTitle(value: String): String {
        return value
            .lowercase(Locale.US)
            .replace("&", "and")
            .replace(Regex("""^\[[^]]+]\s*"""), "")
            .replace(Regex("""\(\d{4}\)"""), "")
            .replace(Regex("""\b\d{4}\b"""), "")
            .replace(Regex("""(?i)\bS\d{1,3}\s*E\d{1,3}.*$"""), "")
            .replace(Regex("""(?i)\bSeason\s*\d{1,3}.*$"""), "")
            .replace(Regex("""[^a-z0-9]+"""), " ")
            .trim()
    }

    private fun matchesSeriesTitle(candidate: String, target: String): Boolean {
        val cleanCandidate = normalizeSeriesTitle(candidate)
        val cleanTarget = normalizeSeriesTitle(target)
        if (cleanCandidate == cleanTarget) return true
        if (cleanCandidate.isBlank() || cleanTarget.isBlank()) return false
        if (cleanCandidate.contains(cleanTarget) || cleanTarget.contains(cleanCandidate)) return true
        return singularizeTitle(cleanCandidate) == singularizeTitle(cleanTarget)
    }

    private fun singularizeTitle(value: String): String {
        return value.split(' ')
            .joinToString(" ") { word ->
                if (word.length > 3 && word.endsWith("s")) word.dropLast(1) else word
            }
            .trim()
    }

    private fun firstString(obj: JsonObject, vararg names: String): String {
        names.forEach { name ->
            val value = obj.get(name) ?: return@forEach
            if (value.isJsonNull) return@forEach
            return runCatching { value.asString }.getOrDefault("").trim()
        }
        return ""
    }

    private fun firstInt(obj: JsonObject, vararg names: String): Int? {
        names.forEach { name ->
            val value = obj.get(name) ?: return@forEach
            if (value.isJsonNull) return@forEach
            val parsed = runCatching { value.asInt }.getOrNull()
                ?: runCatching { value.asString.trim().toIntOrNull() }.getOrNull()
            if (parsed != null) return parsed
        }
        return null
    }

    private fun displayEpisodes(season: SeasonRow) {
        currentSeason = season
        val seasonKey = season.key
        val episodes = episodesForSeason(season)
        val urls = ArrayList<String>()
        val titles = ArrayList<String>()
        val resumeKeys = ArrayList<String>()
        episodes.forEach { episode ->
            urls.add(episodeUrl(episode))
            titles.add(episode.title)
            resumeKeys.add(resumeKeyFor(seasonKey, episode))
        }
        val watchedKeys = watchedKeysFor(resumeKeys)
        rvEpisodes.adapter = EpisodeAdapter(episodes, watchedKeys) { episode, index ->
            val queue = buildSeriesQueue()
            val queueIndex = queue.indexOfFirst { it.seasonKey == seasonKey && it.episode.id == episode.id }
                .takeIf { it >= 0 }
                ?: index
            val queueItem = queue.getOrNull(queueIndex)
                ?: SeriesQueueItem(seasonKey, episode)
            val url = episodeUrl(queueItem.episode)
            val resumeKey = resumeKeyFor(queueItem.seasonKey, queueItem.episode)
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("play_url", url)
            intent.putExtra("media_title", queueItem.episode.title)
            intent.putExtra("resume_key", resumeKey)
            intent.putStringArrayListExtra(EXTRA_SERIES_EPISODE_URLS, ArrayList(queue.map { episodeUrl(it.episode) }))
            intent.putStringArrayListExtra(EXTRA_SERIES_EPISODE_TITLES, ArrayList(queue.map { it.episode.title }))
            intent.putStringArrayListExtra(EXTRA_SERIES_EPISODE_KEYS, ArrayList(queue.map { resumeKeyFor(it.seasonKey, it.episode) }))
            intent.putExtra(EXTRA_SERIES_EPISODE_INDEX, queueIndex)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }
    }

    private fun episodesForSeason(season: SeasonRow): List<XtreamEpisode> {
        val seasonKey = season.key
        return allEpisodes[seasonKey]
            ?: allEpisodes[seasonKey.toIntOrNull()?.toString().orEmpty()]
            ?: allEpisodes[seasonKey.toIntOrNull()?.let { "%02d".format(it) }.orEmpty()]
            ?: season.number?.let { number ->
                allEpisodes.values.flatten().filter { it.season == number }.takeIf { it.isNotEmpty() }
            }
            ?: emptyList()
    }

    private fun buildSeriesQueue(): List<SeriesQueueItem> {
        return buildSeasonRows(emptyList(), allEpisodes)
            .flatMap { season ->
                episodesForSeason(season).map { episode -> SeriesQueueItem(season.key, episode) }
            }
            .distinctBy { it.episode.id }
    }

    override fun onResume() {
        super.onResume()
        currentSeason?.let { displayEpisodes(it) }
    }

    private fun episodeUrl(episode: XtreamEpisode): String {
        episode.directUrl?.let { return it }
        return "${XtreamManager.baseUrl}/series/${XtreamManager.username}/${XtreamManager.password}/${episode.id}.${episode.containerExtension ?: "mp4"}"
    }

    private fun resumeKeyFor(seasonKey: String, episode: XtreamEpisode): String {
        return "series_${seriesId}_s${seasonKey}_ep${episode.id}"
    }

    private fun watchedKeysFor(keys: List<String>): Set<String> {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        return keys.filter { prefs.getBoolean("$KEY_VOD_WATCHED_PREFIX$it", false) }.toSet()
    }

    private fun buildSeasonRows(
        seasons: List<XtreamSeason>,
        episodes: Map<String, List<XtreamEpisode>>
    ): List<SeasonRow> {
        val rowsByNumber = linkedMapOf<Int, SeasonRow>()
        val rowsWithoutNumber = linkedMapOf<String, SeasonRow>()
        val hasRealSeason = seasons.any { (it.seasonNumber ?: it.id ?: -1) > 0 } ||
            episodes.keys.any { it.toIntOrNull()?.let { number -> number > 0 } == true } ||
            episodes.values.flatten().any { (it.season ?: -1) > 0 }

        seasons.forEach { season ->
            val number = season.seasonNumber ?: season.id ?: return@forEach
            if (number == 0 && hasRealSeason) return@forEach
            val key = findEpisodeKeyForSeason(number, episodes) ?: number.toString()
            val label = season.name?.takeIf { it.isNotBlank() && !it.equals("Season 0", ignoreCase = true) }
                ?: seasonLabelFor(number)
            rowsByNumber.putIfAbsent(
                number,
                SeasonRow(key, label, number)
            )
        }

        episodes.forEach { (key, seasonEpisodes) ->
            val number = key.toIntOrNull() ?: seasonEpisodes.firstNotNullOfOrNull { it.season }
            if (number != null) {
                if (number == 0 && hasRealSeason) return@forEach
                rowsByNumber.putIfAbsent(number, SeasonRow(key, seasonLabelFor(number), number))
            } else {
                rowsWithoutNumber.putIfAbsent(key, SeasonRow(key, "Season $key", null))
            }
        }

        episodes.values.flatten()
            .mapNotNull { it.season }
            .filter { it > 0 || !hasRealSeason }
            .distinct()
            .forEach { number ->
                rowsByNumber.putIfAbsent(
                    number,
                    SeasonRow(findEpisodeKeyForSeason(number, episodes) ?: number.toString(), seasonLabelFor(number), number)
                )
            }

        return rowsByNumber.values.sortedBy { it.number ?: Int.MAX_VALUE } + rowsWithoutNumber.values
    }

    private fun seasonLabelFor(number: Int): String {
        return if (number <= 0) "Episodes" else "Season $number"
    }

    private fun findEpisodeKeyForSeason(
        seasonNumber: Int,
        episodes: Map<String, List<XtreamEpisode>>
    ): String? {
        val candidates = listOf(seasonNumber.toString(), "%02d".format(seasonNumber))
        return candidates.firstOrNull { episodes[it]?.isNotEmpty() == true }
            ?: episodes.entries.firstOrNull { (_, eps) -> eps.any { it.season == seasonNumber } }?.key
    }

    private data class SeasonRow(
        val key: String,
        val label: String,
        val number: Int?
    )

    private data class SeriesQueueItem(
        val seasonKey: String,
        val episode: XtreamEpisode
    )

    private data class ParsedSeriesEpisode(
        val seriesTitle: String,
        val season: Int,
        val episode: Int,
        val episodeTitle: String
    )

    private class SeasonAdapter(
        private val items: List<SeasonRow>,
        private val onClick: (SeasonRow) -> Unit
    ) : RecyclerView.Adapter<SeasonAdapter.VH>() {
        class VH(v: View) : RecyclerView.ViewHolder(v) {
            val tv: TextView = v.findViewById(android.R.id.text1)
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
            val context = parent.context
            val v = TextView(context).apply {
                id = android.R.id.text1
                minWidth = (128 * context.resources.displayMetrics.density).toInt()
                layoutParams = RecyclerView.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.MATCH_PARENT
                ).apply {
                    marginEnd = (10 * context.resources.displayMetrics.density).toInt()
                }
                gravity = Gravity.CENTER
                setPadding(
                    (18 * context.resources.displayMetrics.density).toInt(),
                    0,
                    (18 * context.resources.displayMetrics.density).toInt(),
                    0
                )
                textSize = 17f
            }
            return VH(v)
        }
        override fun onBindViewHolder(holder: VH, position: Int) {
            val s = items[position]
            holder.tv.text = s.label
            holder.tv.setTextColor(Color.WHITE)
            holder.itemView.isFocusable = true
            holder.itemView.setBackgroundResource(R.drawable.selector_button_bg)
            holder.itemView.setOnClickListener { onClick(s) }
        }
        override fun getItemCount() = items.size
    }

    private class EpisodeAdapter(
        private val items: List<XtreamEpisode>,
        private val watchedKeys: Set<String>,
        private val onClick: (XtreamEpisode, Int) -> Unit
    ) : RecyclerView.Adapter<EpisodeAdapter.VH>() {
        class VH(v: View) : RecyclerView.ViewHolder(v) {
            val tv: TextView = v.findViewById(android.R.id.text1)
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
            val v = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
            return VH(v)
        }
        override fun onBindViewHolder(holder: VH, position: Int) {
            val e = items[position]
            val marker = if (watchedKeys.any { it.endsWith("_ep${e.id}") }) "✓ " else ""
            holder.tv.text = "$marker E${e.episodeNum}: ${e.title}"
            holder.tv.setTextColor(android.graphics.Color.WHITE)
            holder.itemView.isFocusable = true
            holder.itemView.setBackgroundResource(R.drawable.selector_button_bg)
            holder.itemView.setOnClickListener { onClick(e, position) }
        }
        override fun getItemCount() = items.size
    }

    companion object {
        private const val KEY_VOD_WATCHED_PREFIX = "vod_watched_"
        private const val EXTRA_SERIES_EPISODE_URLS = "series_episode_urls"
        private const val EXTRA_SERIES_EPISODE_TITLES = "series_episode_titles"
        private const val EXTRA_SERIES_EPISODE_KEYS = "series_episode_keys"
        private const val EXTRA_SERIES_EPISODE_INDEX = "series_episode_index"
        private const val FALLBACK_CACHE_TTL_MS = 24L * 60L * 60L * 1000L
        private const val PLAYLIST_CONNECT_TIMEOUT_MS = 10_000
        private const val PLAYLIST_READ_TIMEOUT_MS = 45_000
    }
}
