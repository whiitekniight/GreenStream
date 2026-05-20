package com.example.greenstreem

import android.content.Context
import android.util.Xml
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.sync.Mutex
import kotlinx.coroutines.sync.withLock
import kotlinx.coroutines.withContext
import org.xmlpull.v1.XmlPullParser
import java.io.InputStream
import java.io.PushbackInputStream
import java.net.URL
import java.text.SimpleDateFormat
import java.util.Locale
import java.util.zip.GZIPInputStream

object SecondaryEpgProvider {

    private const val PREFS = "iptv_prefs"
    private const val KEY_SECONDARY_EPG_URL = "secondary_epg_url"
    private const val KEY_SECONDARY_EPG_URLS = "secondary_epg_urls"
    private const val KEY_SECONDARY_EPG_ENABLED = "secondary_epg_enabled"
    private const val KEY_XMLTV_INDEX_URL = "xmltv_index_url"
    private const val KEY_XMLTV_INDEXED_AT = "xmltv_indexed_at"
    private const val KEY_XMLTV_INDEX_VERSION = "xmltv_index_version"
    private const val XMLTV_INDEX_VERSION = 3
    private const val CACHE_MAX_AGE_MS = 6 * 60 * 60 * 1000L
    private const val XMLTV_KEEP_PAST_SECONDS = 30 * 60L
    private const val XMLTV_KEEP_FUTURE_SECONDS = 12 * 60 * 60L
    private const val XMLTV_QUERY_PAST_SECONDS = 30 * 60L
    private const val XMLTV_QUERY_FUTURE_SECONDS = 8 * 60 * 60L

    private val mutex = Mutex()
    private val cacheByUrl = mutableMapOf<String, ParsedXmltv>()
    private val loadedAtByUrl = mutableMapOf<String, Long>()
    private val errorByUrl = mutableMapOf<String, String>()

    suspend fun getListingsForChannel(context: Context, epgId: String): List<XtreamEpgListing> {
        if (!ProEntitlement.isProUnlocked(context)) return emptyList()
        val keys = lookupKeysFor(epgId)
        if (keys.isEmpty()) return emptyList()

        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        if (!prefs.getBoolean(KEY_SECONDARY_EPG_ENABLED, false)) return emptyList()
        for (source in configuredSources(context)) {
            val listings = runCatching {
                getIndexedListingsForKeys(context, source.url, keys)
            }.getOrDefault(emptyList())
            if (listings.isNotEmpty()) return listings
        }
        return emptyList()
    }

    suspend fun getListingsForChannelCandidates(context: Context, candidates: List<String>): List<XtreamEpgListing> {
        if (!ProEntitlement.isProUnlocked(context)) return emptyList()
        val keys = candidates.flatMap { lookupKeysFor(it) }.distinct()
        if (keys.isEmpty()) return emptyList()

        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        if (!prefs.getBoolean(KEY_SECONDARY_EPG_ENABLED, false)) return emptyList()
        for (source in configuredSources(context)) {
            val listings = runCatching {
                getIndexedListingsForKeys(context, source.url, keys)
            }.getOrDefault(emptyList())
            if (listings.isNotEmpty()) return listings
        }
        return emptyList()
    }

    suspend fun getListingsForChannel(context: Context, epgId: String, sourceUrl: String): List<XtreamEpgListing> {
        if (!ProEntitlement.isProUnlocked(context)) return emptyList()
        val keys = lookupKeysFor(epgId)
        val url = sourceUrl.trim()
        if (keys.isEmpty() || url.isBlank()) return emptyList()
        return getIndexedListingsForKeys(context, url, keys)
    }

    suspend fun getChannels(context: Context): List<SecondaryEpgChannel> {
        val source = configuredSources(context).firstOrNull() ?: return emptyList()
        return getChannels(context, source.url)
    }

    suspend fun getChannels(context: Context, sourceUrl: String): List<SecondaryEpgChannel> {
        if (!ProEntitlement.isProUnlocked(context)) return emptyList()
        val url = sourceUrl.trim()
        if (url.isBlank()) return emptyList()
        ensureLoaded(url)
        val parsed = cacheByUrl[url] ?: return emptyList()
        return parsed.channels.ifEmpty {
            parsed.listingsByChannel.keys.map { key -> SecondaryEpgChannel(key, key) }
        }
    }

    fun getLastError(sourceUrl: String): String? = errorByUrl[sourceUrl.trim()]

    fun clearCache() {
        cacheByUrl.clear()
        loadedAtByUrl.clear()
        errorByUrl.clear()
    }

    fun configuredSources(context: Context): List<SecondaryEpgSource> {
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val saved = prefs.getString(KEY_SECONDARY_EPG_URLS, null)
            ?.lines()
            ?.map { it.trim() }
            ?.filter { it.isNotBlank() }
            .orEmpty()
        val legacy = prefs.getString(KEY_SECONDARY_EPG_URL, null)?.trim().orEmpty()
        val urls = (saved + legacy)
            .filter { it.isNotBlank() }
            .distinct()
        return urls.mapIndexed { index, url ->
            SecondaryEpgSource(
                id = url,
                label = "XMLTV ${index + 1}",
                url = url
            )
        }
    }

    private suspend fun ensureLoaded(url: String) {
        val now = System.currentTimeMillis()
        val cached = cacheByUrl[url]
        val loadedAt = loadedAtByUrl[url] ?: 0L
        if (cached != null && now - loadedAt < CACHE_MAX_AGE_MS && cached.listingsByChannel.isNotEmpty()) return

        mutex.withLock {
            val nowLocked = System.currentTimeMillis()
            val cachedLocked = cacheByUrl[url]
            val loadedAtLocked = loadedAtByUrl[url] ?: 0L
            if (cachedLocked != null && nowLocked - loadedAtLocked < CACHE_MAX_AGE_MS && cachedLocked.listingsByChannel.isNotEmpty()) return
            val parsed = loadXmltv(url)
            cacheByUrl[url] = parsed
            loadedAtByUrl[url] = nowLocked
        }
    }

    private suspend fun getIndexedListingsForKeys(
        context: Context,
        sourceUrl: String,
        keys: List<String>
    ): List<XtreamEpgListing> = withContext(Dispatchers.IO) {
        val url = sourceUrl.trim()
        if (url.isBlank() || keys.isEmpty()) return@withContext emptyList()
        ensureIndexed(context, url)
        val dao = AppDatabase.getDatabase(context).xmltvDao()
        val now = System.currentTimeMillis() / 1000L
        for (key in keys) {
            val channelKey = dao.getChannelKeyForAlias(key) ?: key
            val programs = dao.getProgramsForChannels(
                channelKeys = listOf(channelKey),
                windowStart = now - XMLTV_QUERY_PAST_SECONDS,
                windowEnd = now + XMLTV_QUERY_FUTURE_SECONDS
            )
            if (programs.isNotEmpty()) return@withContext programs.map { it.toListing() }
        }
        emptyList()
    }

    private suspend fun ensureIndexed(context: Context, url: String) {
        val prefs = context.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val indexedUrl = prefs.getString(KEY_XMLTV_INDEX_URL, "").orEmpty()
        val indexedAt = prefs.getLong(KEY_XMLTV_INDEXED_AT, 0L)
        val indexedVersion = prefs.getInt(KEY_XMLTV_INDEX_VERSION, 0)
        val now = System.currentTimeMillis()
        val dao = AppDatabase.getDatabase(context).xmltvDao()
        if (indexedUrl == url &&
            indexedVersion == XMLTV_INDEX_VERSION &&
            now - indexedAt < CACHE_MAX_AGE_MS &&
            dao.countPrograms() > 0
        ) return

        mutex.withLock {
            val lockedIndexedUrl = prefs.getString(KEY_XMLTV_INDEX_URL, "").orEmpty()
            val lockedIndexedAt = prefs.getLong(KEY_XMLTV_INDEXED_AT, 0L)
            val lockedIndexedVersion = prefs.getInt(KEY_XMLTV_INDEX_VERSION, 0)
            val lockedNow = System.currentTimeMillis()
            if (lockedIndexedUrl == url &&
                lockedIndexedVersion == XMLTV_INDEX_VERSION &&
                lockedNow - lockedIndexedAt < CACHE_MAX_AGE_MS &&
                dao.countPrograms() > 0
            ) return
            indexXmltv(context, url)
            prefs.edit()
                .putString(KEY_XMLTV_INDEX_URL, url)
                .putLong(KEY_XMLTV_INDEXED_AT, lockedNow)
                .putInt(KEY_XMLTV_INDEX_VERSION, XMLTV_INDEX_VERSION)
                .apply()
        }
    }

    private suspend fun indexXmltv(context: Context, url: String) = withContext(Dispatchers.IO) {
        val dao = AppDatabase.getDatabase(context).xmltvDao()
        dao.clearPrograms()
        dao.clearAliases()
        val aliases = linkedMapOf<String, XmltvAliasEntity>()
        val ambiguousAliases = mutableSetOf<String>()
        val channelDisplayNames = linkedMapOf<String, String>()
        val programs = mutableListOf<XmltvProgramEntity>()
        val result = runCatching {
            openStream(url).use { input ->
                val parser = Xml.newPullParser()
                parser.setInput(input, null)
                parseXmltvToIndex(parser, channelDisplayNames, aliases, ambiguousAliases, programs) { batch ->
                    dao.insertPrograms(batch)
                }
            }
            if (aliases.isNotEmpty()) dao.insertAliases(aliases.values.toList())
            if (programs.isNotEmpty()) {
                dao.insertPrograms(programs.toList())
                programs.clear()
            }
        }
        result.onFailure { error ->
            errorByUrl[url] = error.message ?: error.javaClass.simpleName
        }.onSuccess {
            errorByUrl.remove(url)
        }
        result.getOrThrow()
    }

    private suspend fun loadXmltv(url: String): ParsedXmltv = withContext(Dispatchers.IO) {
        val map = mutableMapOf<String, MutableList<XtreamEpgListing>>()
        val channelMap = linkedMapOf<String, SecondaryEpgChannel>()
        val result = runCatching {
            val stream = openStream(url)
            stream.use { input ->
                val parser = Xml.newPullParser()
                parser.setInput(input, null)
                parseXmltv(parser, channelMap, map)
            }
        }
        result.onFailure { error ->
            errorByUrl[url] = error.message ?: error.javaClass.simpleName
        }.onSuccess {
            errorByUrl.remove(url)
        }
        ParsedXmltv(
            channels = channelMap.values.sortedBy { it.name.lowercase(Locale.getDefault()) },
            listingsByChannel = buildLookupMap(channelMap, map)
        )
    }

    private fun buildLookupMap(
        channels: Map<String, SecondaryEpgChannel>,
        listings: Map<String, List<XtreamEpgListing>>
    ): Map<String, List<XtreamEpgListing>> {
        val lookup = linkedMapOf<String, List<XtreamEpgListing>>()
        listings.forEach { (channelKey, rawListings) ->
            val sortedListings = rawListings.sortedBy { it.startTimestamp }
            val channel = channels[channelKey]
            val aliases = listOf(channelKey, channel?.id.orEmpty(), channel?.name.orEmpty())
                .flatMap { lookupKeysFor(it) }
                .distinct()
            aliases.forEach { key ->
                lookup.putIfAbsent(key, sortedListings)
            }
        }
        return lookup
    }

    private fun openStream(url: String): InputStream {
        val conn = URL(url).openConnection().apply {
            connectTimeout = 12_000
            readTimeout = 20_000
            setRequestProperty("User-Agent", "GreenStreem/1.0")
        }
        val encoding = conn.contentEncoding.orEmpty().lowercase(Locale.getDefault())
        val raw = PushbackInputStream(conn.getInputStream(), 2)
        val isGzip = isGzipStream(raw)
        return if (
            encoding.contains("gzip") ||
            url.lowercase(Locale.getDefault()).contains(".gz") ||
            isGzip
        ) {
            GZIPInputStream(raw)
        } else {
            raw
        }
    }

    private fun isGzipStream(input: PushbackInputStream): Boolean {
        val header = ByteArray(2)
        val read = input.read(header)
        if (read > 0) input.unread(header, 0, read)
        return read == 2 &&
            (header[0].toInt() and 0xFF) == 0x1F &&
            (header[1].toInt() and 0xFF) == 0x8B
    }

    private fun putUniqueAlias(
        aliasesOut: MutableMap<String, XmltvAliasEntity>,
        ambiguousAliases: MutableSet<String>,
        alias: String,
        channelKey: String
    ) {
        if (alias.isBlank() || ambiguousAliases.contains(alias)) return
        val existing = aliasesOut[alias]
        when {
            existing == null -> aliasesOut[alias] = XmltvAliasEntity(alias, channelKey)
            existing.channelKey != channelKey -> {
                aliasesOut.remove(alias)
                ambiguousAliases += alias
            }
        }
    }

    private suspend fun parseXmltvToIndex(
        parser: XmlPullParser,
        channelDisplayNames: MutableMap<String, String>,
        aliasesOut: MutableMap<String, XmltvAliasEntity>,
        ambiguousAliases: MutableSet<String>,
        programsOut: MutableList<XmltvProgramEntity>,
        emitPrograms: suspend (List<XmltvProgramEntity>) -> Unit
    ) {
        val nowSeconds = System.currentTimeMillis() / 1000L
        val keepStart = nowSeconds - XMLTV_KEEP_PAST_SECONDS
        val keepEnd = nowSeconds + XMLTV_KEEP_FUTURE_SECONDS
        var event = parser.eventType
        while (event != XmlPullParser.END_DOCUMENT) {
            if (event == XmlPullParser.START_TAG) {
                when (parser.name) {
                    "channel" -> {
                        val channelRaw = parser.getAttributeValue(null, "id").orEmpty()
                        val channelKey = normalizeChannelId(channelRaw)
                        val displayNames = mutableListOf<String>()
                        while (!(parser.eventType == XmlPullParser.END_TAG && parser.name == "channel")) {
                            if (parser.eventType == XmlPullParser.START_TAG && parser.name == "display-name") {
                                parser.nextText().orEmpty().trim().takeIf { it.isNotBlank() }?.let { displayNames += it }
                            }
                            parser.next()
                        }
                        if (channelKey.isNotBlank()) {
                            channelDisplayNames[channelKey] = displayNames.firstOrNull() ?: channelRaw
                            (listOf(channelRaw, channelKey) + displayNames)
                                .flatMap { lookupKeysFor(it) }
                                .distinct()
                                .forEach { alias ->
                                    putUniqueAlias(aliasesOut, ambiguousAliases, alias, channelKey)
                                }
                        }
                    }
                    "programme" -> {
                        val channelRaw = parser.getAttributeValue(null, "channel").orEmpty()
                        val channelKey = normalizeChannelId(channelRaw)
                        val start = parseXmltvTime(parser.getAttributeValue(null, "start"))
                        val stop = parseXmltvTime(parser.getAttributeValue(null, "stop"))
                        var title = ""
                        var desc = ""

                        while (!(parser.eventType == XmlPullParser.END_TAG && parser.name == "programme")) {
                            if (parser.eventType == XmlPullParser.START_TAG) {
                                when (parser.name) {
                                    "title" -> title = cleanXmltvText(parser.nextText().orEmpty())
                                    "desc" -> desc = cleanXmltvText(parser.nextText().orEmpty())
                                }
                            }
                            parser.next()
                        }

                        if (
                            channelKey.isNotBlank() &&
                            start > 0L &&
                            stop > start &&
                            stop > keepStart &&
                            start < keepEnd
                        ) {
                            putUniqueAlias(aliasesOut, ambiguousAliases, channelKey, channelKey)
                            programsOut += XmltvProgramEntity(
                                id = "${channelKey}_${start}",
                                channelKey = channelKey,
                                epgId = channelRaw,
                                title = title,
                                description = desc,
                                startTimestamp = start,
                                stopTimestamp = stop
                            )
                            if (programsOut.size >= 1000) {
                                emitPrograms(programsOut.toList())
                                programsOut.clear()
                            }
                        }
                    }
                }
            }
            event = parser.next()
        }
    }

    private fun parseXmltv(
        parser: XmlPullParser,
        channelsOut: MutableMap<String, SecondaryEpgChannel>,
        programmesOut: MutableMap<String, MutableList<XtreamEpgListing>>
    ) {
        val nowSeconds = System.currentTimeMillis() / 1000L
        val keepStart = nowSeconds - XMLTV_KEEP_PAST_SECONDS
        val keepEnd = nowSeconds + XMLTV_KEEP_FUTURE_SECONDS
        var event = parser.eventType
        while (event != XmlPullParser.END_DOCUMENT) {
            if (event == XmlPullParser.START_TAG) {
                when (parser.name) {
                    "channel" -> {
                        val channelRaw = parser.getAttributeValue(null, "id").orEmpty()
                        val channel = normalizeChannelId(channelRaw)
                        var displayName = ""
                        while (!(parser.eventType == XmlPullParser.END_TAG && parser.name == "channel")) {
                            if (parser.eventType == XmlPullParser.START_TAG && parser.name == "display-name") {
                                if (displayName.isBlank()) displayName = parser.nextText().orEmpty()
                            }
                            parser.next()
                        }
                        if (channel.isNotBlank()) {
                            channelsOut[channel] = SecondaryEpgChannel(
                                id = channelRaw,
                                name = displayName.trim().ifBlank { channelRaw }
                            )
                        }
                    }
                    "programme" -> {
                        val channelRaw = parser.getAttributeValue(null, "channel").orEmpty()
                        val channel = normalizeChannelId(channelRaw)
                        val start = parseXmltvTime(parser.getAttributeValue(null, "start"))
                        val stop = parseXmltvTime(parser.getAttributeValue(null, "stop"))
                        var title = ""
                        var desc = ""

                        while (!(parser.eventType == XmlPullParser.END_TAG && parser.name == "programme")) {
                            if (parser.eventType == XmlPullParser.START_TAG) {
                                when (parser.name) {
                                    "title" -> title = parser.nextText().orEmpty()
                                    "desc" -> desc = parser.nextText().orEmpty()
                                }
                            }
                            parser.next()
                        }

                        if (
                            channel.isNotBlank() &&
                            start > 0L &&
                            stop > start &&
                            stop > keepStart &&
                            start < keepEnd
                        ) {
                            channelsOut.putIfAbsent(channel, SecondaryEpgChannel(channelRaw, channelRaw))
                            val listing = XtreamEpgListing(
                                id = "${channel}_${start}",
                                epgId = channelRaw,
                                title = title,
                                description = desc,
                                start = start.toString(),
                                end = stop.toString(),
                                startTimestamp = start,
                                stopTimestamp = stop
                            )
                            programmesOut.getOrPut(channel) { mutableListOf() }.add(listing)
                        }
                    }
                }
            }
            event = parser.next()
        }
    }

    private fun parseXmltvTime(raw: String?): Long {
        val value = raw?.trim().orEmpty()
        if (value.isBlank()) return 0L
        val normalized = if (value.length > 14) {
            val datePart = value.substring(0, 14)
            val tzPart = value.substring(14).trim().replace(" ", "")
            "$datePart $tzPart"
        } else {
            value
        }
        val formats = listOf(
            SimpleDateFormat("yyyyMMddHHmmss Z", Locale.US),
            SimpleDateFormat("yyyyMMddHHmmss", Locale.US)
        )
        for (fmt in formats) {
            runCatching {
                return (fmt.parse(normalized)?.time ?: 0L) / 1000L
            }
        }
        return 0L
    }

    private fun XmltvProgramEntity.toListing(): XtreamEpgListing {
        return XtreamEpgListing(
            id = id,
            epgId = epgId,
            title = title,
            description = description,
            start = startTimestamp.toString(),
            end = stopTimestamp.toString(),
            startTimestamp = startTimestamp,
            stopTimestamp = stopTimestamp
        )
    }

    private fun cleanXmltvText(value: String): String {
        if (value.isBlank()) return ""
        return value
            .replace('\uFFFD', ' ')
            .filter { ch -> ch == '\n' || ch == '\r' || ch == '\t' || !ch.isISOControl() }
            .replace(Regex("""\s+"""), " ")
            .trim()
    }

    private fun normalizeChannelId(value: String): String {
        return value.trim().lowercase(Locale.getDefault())
    }

    private fun lookupKeysFor(value: String): List<String> {
        val exact = normalizeChannelId(value)
        val directional = normalizeChannelName(value, keepDirection = true)
        val loose = normalizeChannelName(value, keepDirection = false)
        return (listOf(exact, directional, loose) + stationAliases(value)).filter { it.isNotBlank() }.distinct()
    }

    private fun firstListingsForKeys(
        listingsByChannel: Map<String, List<XtreamEpgListing>>?,
        keys: List<String>
    ): List<XtreamEpgListing> {
        if (listingsByChannel == null) return emptyList()
        for (key in keys) {
            val listings = listingsByChannel[key].orEmpty()
            if (listings.isNotEmpty()) return listings
        }
        return emptyList()
    }

    private fun normalizeChannelName(value: String, keepDirection: Boolean): String {
        var normalized = value
            .lowercase(Locale.getDefault())
            .replace(Regex("""^\s*(us|usa|uk|ca|canada|mx|au|nz)\s*[:|\-/\s]+\s*"""), "")
            .replace(Regex("""^\s*\d+\s+"""), "")
            .replace(Regex("""^\s*the\s+"""), "")
            .replace(Regex("""\b(network|channel|tv|fhd|uhd|hd|sd|4k|hevc|h265|h\.265)\b"""), "")
            .replace(Regex("""[\[\]()]"""), " ")
        if (!keepDirection) {
            normalized = normalized.replace(Regex("""\b(east|west|pacific|national feed|usa)\b"""), " ")
        }
        return normalized
            .replace(Regex("""[^a-z0-9]+"""), " ")
            .trim()
    }

    private fun stationAliases(value: String): List<String> {
        val aliases = mutableListOf<String>()
        val upper = value.uppercase(Locale.US)
        val compact = value.lowercase(Locale.US).replace(Regex("""[^a-z0-9]+"""), "")
        val baseCompact = value.substringBefore('.').lowercase(Locale.US).replace(Regex("""[^a-z0-9]+"""), "")

        if (compact in setOf("aande", "aandeus", "ae", "aeus") || baseCompact in setOf("aande", "ae")) {
            aliases += "a e"
            aliases += "a and e"
            aliases += "ae"
        }

        Regex("""\(([A-Z]{3,6})(?:-[A-Z0-9]+)?\)""")
            .findAll(upper)
            .map { it.groupValues[1] }
            .forEach { aliases += it.lowercase(Locale.US) }

        Regex("""\b([WK][A-Z]{2,4})(?:-[A-Z0-9]+)?\b""")
            .findAll(upper)
            .map { it.groupValues[1] }
            .forEach { aliases += it.lowercase(Locale.US) }

        Regex("""^([A-Z]{3,6})(?:-[A-Z0-9]+)?\.""")
            .find(upper)
            ?.groupValues
            ?.getOrNull(1)
            ?.lowercase(Locale.US)
            ?.let { aliases += it }

        Regex("""^(?:ABC|CBS|FOX|NBC|CW|PBS)([WK][A-Z]{2,4})\.""")
            .find(upper)
            ?.groupValues
            ?.getOrNull(1)
            ?.lowercase(Locale.US)
            ?.let { aliases += it }

        return aliases.distinct()
    }

    private data class ParsedXmltv(
        val channels: List<SecondaryEpgChannel>,
        val listingsByChannel: Map<String, List<XtreamEpgListing>>
    )
}

data class SecondaryEpgChannel(
    val id: String,
    val name: String
)

data class SecondaryEpgSource(
    val id: String,
    val label: String,
    val url: String
)
