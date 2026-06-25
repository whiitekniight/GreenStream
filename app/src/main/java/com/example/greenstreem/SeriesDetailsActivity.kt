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
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SeriesDetailsActivity : AppCompatActivity() {

    private lateinit var ivCover: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvPlot: TextView
    private lateinit var rvSeasons: RecyclerView
    private lateinit var rvEpisodes: RecyclerView

    private var seriesId: Int = -1
    private var allEpisodes: Map<String, List<XtreamEpisode>> = emptyMap()
    private var currentSeason: SeasonRow? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_series_details)

        ivCover = findViewById(R.id.ivSeriesCover)
        tvName = findViewById(R.id.tvSeriesName)
        tvPlot = findViewById(R.id.tvSeriesPlot)
        rvSeasons = findViewById(R.id.rvSeasons)
        rvEpisodes = findViewById(R.id.rvEpisodes)

        seriesId = intent.getIntExtra("series_id", -1)
        val name = intent.getStringExtra("series_name")
        val cover = intent.getStringExtra("series_cover")

        tvName.text = name
        Glide.with(this).load(cover).into(ivCover)

        rvSeasons.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvEpisodes.layoutManager = LinearLayoutManager(this)

        fetchSeriesInfo()
    }

    private fun fetchSeriesInfo() {
        val service = XtreamManager.getService() ?: return
        service.getSeriesInfo(XtreamManager.username, XtreamManager.password, seriesId)
            .enqueue(object : Callback<XtreamSeriesInfoResponse> {
                override fun onResponse(call: Call<XtreamSeriesInfoResponse>, response: Response<XtreamSeriesInfoResponse>) {
                    if (response.isSuccessful) {
                        val data = response.body()
                        tvPlot.text = data?.info?.plot ?: "No description available"
                        allEpisodes = data?.episodes.orEmpty().filterValues { it.isNotEmpty() }
                        
                        val seasonRows = buildSeasonRows(data?.seasons.orEmpty(), allEpisodes)
                        rvSeasons.adapter = SeasonAdapter(seasonRows) { season ->
                            displayEpisodes(season)
                        }
                        
                        if (seasonRows.isNotEmpty()) {
                            displayEpisodes(seasonRows.first())
                        } else {
                            rvEpisodes.adapter = EpisodeAdapter(emptyList(), emptySet()) { _, _ -> }
                            Toast.makeText(this@SeriesDetailsActivity, "No episodes found for this series", Toast.LENGTH_SHORT).show()
                        }
                    }
                }
                override fun onFailure(call: Call<XtreamSeriesInfoResponse>, t: Throwable) {}
            })
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

        seasons.forEach { season ->
            val number = season.seasonNumber ?: season.id ?: return@forEach
            val key = findEpisodeKeyForSeason(number, episodes) ?: number.toString()
            rowsByNumber.putIfAbsent(
                number,
                SeasonRow(key, season.name?.takeIf { it.isNotBlank() } ?: "Season $number", number)
            )
        }

        episodes.forEach { (key, seasonEpisodes) ->
            val number = key.toIntOrNull() ?: seasonEpisodes.firstNotNullOfOrNull { it.season }
            if (number != null) {
                rowsByNumber.putIfAbsent(number, SeasonRow(key, "Season $number", number))
            } else {
                rowsWithoutNumber.putIfAbsent(key, SeasonRow(key, "Season $key", null))
            }
        }

        episodes.values.flatten()
            .mapNotNull { it.season }
            .distinct()
            .forEach { number ->
                rowsByNumber.putIfAbsent(
                    number,
                    SeasonRow(findEpisodeKeyForSeason(number, episodes) ?: number.toString(), "Season $number", number)
                )
            }

        return rowsByNumber.values.sortedBy { it.number ?: Int.MAX_VALUE } + rowsWithoutNumber.values
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
    }
}
