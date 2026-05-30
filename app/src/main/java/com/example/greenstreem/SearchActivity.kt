package com.example.greenstreem

import android.content.Context
import android.content.Intent
import android.app.DownloadManager
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.view.KeyEvent
import android.util.TypedValue
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.ImageView
import android.widget.TextView
import android.widget.Toast
import androidx.activity.OnBackPressedCallback
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.net.URL

class SearchActivity : AppCompatActivity() {

    private lateinit var etSearch: EditText
    private lateinit var rvResults: RecyclerView
    private val prefs by lazy { getSharedPreferences("iptv_prefs", MODE_PRIVATE) }
    private val db by lazy { AppDatabase.getDatabase(this) }
    
    private var allChannels: List<Channel> = emptyList()
    private var allMovies: List<XtreamVodStream> = emptyList()
    private var allSeries: List<XtreamSeries> = emptyList()
    private var allPrograms: List<ProgramSearchResult> = emptyList()
    private var recentQueries: MutableList<String> = mutableListOf()
    private val searchHandler = Handler(Looper.getMainLooper())
    private var searchRunnable: Runnable? = null
    private var hasActiveSearch = false
    private var lastSearchQuery: String = ""
    private val gson = Gson()

    private data class ProgramSearchResult(
        val channel: Channel,
        val title: String
    )

    private val searchAdapter = GlobalSearchAdapter(
        onRecentClick = { query ->
            etSearch.setText(query)
            etSearch.setSelection(query.length)
            performSearch(query, saveQuery = true)
            rvResults.requestFocus()
        },
        onRecentDelete = { query -> deleteRecentQuery(query) },
        onClearRecent = { confirmClearRecentQueries() },
        onChannelClick = { channel -> playChannel(channel) },
        onChannelLongClick = { channel -> showChannelActions(channel) },
        onProgramClick = { result -> playChannel(result.channel) },
        onMovieClick = { movie -> showMovieActions(movie) },
        onMovieLongClick = { movie -> showMovieActions(movie) },
        onSeriesClick = { series -> openSeries(series) },
        onSeriesLongClick = { series -> showSeriesActions(series) }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_search)

        etSearch = findViewById(R.id.etSearch)
        rvResults = findViewById(R.id.rvSearchResults)
        
        val layoutManager = GridLayoutManager(this, 6)
        layoutManager.spanSizeLookup = object : GridLayoutManager.SpanSizeLookup() {
            override fun getSpanSize(position: Int): Int {
                return when (searchAdapter.getItemViewType(position)) {
                    GlobalSearchAdapter.TYPE_HEADER,
                    GlobalSearchAdapter.TYPE_RECENT_QUERY,
                    GlobalSearchAdapter.TYPE_RECENT_CLEAR,
                    GlobalSearchAdapter.TYPE_CHANNEL,
                    GlobalSearchAdapter.TYPE_PROGRAM -> 6
                    else -> 1
                }
            }
        }
        
        rvResults.layoutManager = layoutManager
        rvResults.adapter = searchAdapter
        rvResults.setOnKeyListener { _, keyCode, event ->
            if (keyCode == KeyEvent.KEYCODE_BACK && event.action == KeyEvent.ACTION_UP) {
                handleSearchBack()
                true
            } else {
                false
            }
        }

        recentQueries = loadRecentQueries().toMutableList()
        searchAdapter.setRecentQueries(recentQueries)
        fetchAllData()

        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                handleSearchBack()
            }
        })

        etSearch.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                scheduleSearch(s.toString())
            }
            override fun afterTextChanged(s: Editable?) {}
        })
        etSearch.setOnEditorActionListener { _, actionId, event ->
            val enterPressed = event?.keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP
            val submitAction = actionId == EditorInfo.IME_ACTION_SEARCH ||
                actionId == EditorInfo.IME_ACTION_NEXT ||
                actionId == EditorInfo.IME_ACTION_DONE
            if (submitAction || enterPressed) {
                submitSearchFromKeyboard()
                true
            } else {
                false
            }
        }
        etSearch.requestFocus()
    }

    override fun onDestroy() {
        searchRunnable?.let { searchHandler.removeCallbacks(it) }
        super.onDestroy()
    }

    private fun fetchAllData() {
        val service = XtreamManager.getService() ?: return
        val user = XtreamManager.username
        val pass = XtreamManager.password

        // Fetch Live Channels
        service.getLiveStreams(user, pass).enqueue(object : Callback<List<XtreamLiveStream>> {
            override fun onResponse(call: Call<List<XtreamLiveStream>>, response: Response<List<XtreamLiveStream>>) {
                if (response.isSuccessful) {
                    allChannels = response.body()?.map { stream ->
                        Channel(id = stream.streamId.toLong(), name = stream.name, group = "", logoUrl = stream.streamIcon, streamUrl = "", epgId = stream.epgId, number = stream.num)
                    } ?: emptyList()
                    loadCachedProgramSearchIndex()
                    rerunVisibleSearch()
                }
            }
            override fun onFailure(call: Call<List<XtreamLiveStream>>, t: Throwable) {}
        })

        // Fetch Movies
        service.getVodStreams(user, pass).enqueue(object : Callback<List<XtreamVodStream>> {
            override fun onResponse(call: Call<List<XtreamVodStream>>, response: Response<List<XtreamVodStream>>) {
                if (response.isSuccessful) {
                    mergeMovies(response.body().orEmpty())
                    rerunVisibleSearch()
                }
            }
            override fun onFailure(call: Call<List<XtreamVodStream>>, t: Throwable) {}
        })
        service.getVodCategories(user, pass).enqueue(object : Callback<List<XtreamCategory>> {
            override fun onResponse(call: Call<List<XtreamCategory>>, response: Response<List<XtreamCategory>>) {
                if (!response.isSuccessful) return
                response.body().orEmpty().forEach { category ->
                    service.getVodStreams(user, pass, category.id).enqueue(object : Callback<List<XtreamVodStream>> {
                        override fun onResponse(call: Call<List<XtreamVodStream>>, response: Response<List<XtreamVodStream>>) {
                            if (response.isSuccessful) {
                                mergeMovies(response.body().orEmpty())
                                rerunVisibleSearch()
                            }
                        }
                        override fun onFailure(call: Call<List<XtreamVodStream>>, t: Throwable) {}
                    })
                }
            }
            override fun onFailure(call: Call<List<XtreamCategory>>, t: Throwable) {}
        })

        // Fetch Series
        service.getSeries(user, pass).enqueue(object : Callback<List<XtreamSeries>> {
            override fun onResponse(call: Call<List<XtreamSeries>>, response: Response<List<XtreamSeries>>) {
                if (response.isSuccessful) {
                    mergeSeries(response.body().orEmpty())
                    rerunVisibleSearch()
                }
            }
            override fun onFailure(call: Call<List<XtreamSeries>>, t: Throwable) {}
        })
        service.getSeriesCategories(user, pass).enqueue(object : Callback<List<XtreamCategory>> {
            override fun onResponse(call: Call<List<XtreamCategory>>, response: Response<List<XtreamCategory>>) {
                if (!response.isSuccessful) return
                response.body().orEmpty().forEach { category ->
                    service.getSeries(user, pass, category.id).enqueue(object : Callback<List<XtreamSeries>> {
                        override fun onResponse(call: Call<List<XtreamSeries>>, response: Response<List<XtreamSeries>>) {
                            if (response.isSuccessful) {
                                mergeSeries(response.body().orEmpty())
                                rerunVisibleSearch()
                            }
                        }
                        override fun onFailure(call: Call<List<XtreamSeries>>, t: Throwable) {}
                    })
                }
            }
            override fun onFailure(call: Call<List<XtreamCategory>>, t: Throwable) {}
        })
    }

    private fun mergeMovies(movies: List<XtreamVodStream>) {
        if (movies.isEmpty()) return
        allMovies = (allMovies + movies).distinctBy { it.streamId }
    }

    private fun mergeSeries(series: List<XtreamSeries>) {
        if (series.isEmpty()) return
        allSeries = (allSeries + series).distinctBy { it.seriesId }
    }

    private fun loadCachedProgramSearchIndex() {
        val channelById = allChannels.associateBy { it.id.toInt() }
        if (channelById.isEmpty()) return
        lifecycleScope.launch {
            val programs = withContext(Dispatchers.IO) {
                db.epgCacheDao().getAll().flatMap { entry ->
                    val channel = channelById[entry.streamId] ?: return@flatMap emptyList()
                    runCatching {
                        gson.fromJson(entry.listingsJson, Array<XtreamEpgListing>::class.java)
                            ?.asSequence()
                            .orEmpty()
                            .map { listing ->
                                ProgramSearchResult(
                                    channel = channel,
                                    title = DataUtils.decodeBase64(listing.title).ifBlank { "No Information" }
                                )
                            }
                            .toList()
                    }.getOrDefault(emptyList())
                }
            }
            allPrograms = programs.distinctBy { "${it.channel.id}:${it.title}" }
            rerunVisibleSearch()
        }
    }

    private fun scheduleSearch(query: String) {
        searchRunnable?.let { searchHandler.removeCallbacks(it) }
        searchRunnable = Runnable { performSearch(query, saveQuery = false) }
        searchHandler.postDelayed(searchRunnable!!, 350L)
    }

    private fun rerunVisibleSearch() {
        val query = etSearch.text?.toString().orEmpty()
        if (query.trim().length >= 2 && query == lastSearchQuery) {
            performSearch(query, saveQuery = false)
        }
    }

    private fun submitSearchFromKeyboard() {
        searchRunnable?.let { searchHandler.removeCallbacks(it) }
        performSearch(etSearch.text?.toString().orEmpty(), saveQuery = true)
        val imm = getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager
        imm?.hideSoftInputFromWindow(etSearch.windowToken, 0)
        rvResults.post { rvResults.requestFocus() }
    }

    private fun performSearch(query: String, saveQuery: Boolean = true) {
        val normalized = query.trim()
        if (normalized.length < 2) {
            hasActiveSearch = false
            lastSearchQuery = ""
            searchAdapter.setRecentQueries(recentQueries)
            return
        }
        lastSearchQuery = query

        val filteredChannels = allChannels.asSequence()
            .filter { it.name.contains(normalized, ignoreCase = true) }
            .take(120)
            .toList()
        val filteredMovies = allMovies.asSequence()
            .filter { it.name.contains(normalized, ignoreCase = true) }
            .take(120)
            .toList()
        val filteredSeries = allSeries.asSequence()
            .filter { it.name.contains(normalized, ignoreCase = true) }
            .take(120)
            .toList()
        val filteredPrograms = allPrograms.asSequence()
            .filter {
                it.title.contains(normalized, ignoreCase = true) ||
                    it.channel.name.contains(normalized, ignoreCase = true)
            }
            .take(120)
            .toList()

        searchAdapter.setResults(filteredChannels, filteredMovies, filteredSeries, filteredPrograms)
        hasActiveSearch = true
        if (saveQuery) saveRecentQuery(normalized)
    }

    private fun handleSearchBack() {
        val currentQuery = etSearch.text?.toString().orEmpty()
        when {
            currentQuery.isNotBlank() || hasActiveSearch -> {
                searchRunnable?.let { searchHandler.removeCallbacks(it) }
                if (currentQuery.isNotBlank()) {
                    saveRecentQuery(currentQuery)
                }
                etSearch.setText("")
                hasActiveSearch = false
                searchAdapter.setRecentQueries(recentQueries)
                rvResults.requestFocus()
            }
            rvResults.hasFocus() -> etSearch.requestFocus()
            else -> finish()
        }
    }

    private fun loadRecentQueries(): List<String> {
        return prefs.getString(KEY_RECENT_SEARCHES, "")
            .orEmpty()
            .split("|")
            .map { it.trim() }
            .filter { it.isNotBlank() }
            .distinct()
            .take(MAX_RECENT_SEARCHES)
    }

    private fun saveRecentQuery(raw: String) {
        val query = raw.trim()
        if (query.length < 2) return
        val next = mutableListOf<String>()
        next.add(query)
        next.addAll(recentQueries.filterNot { it.equals(query, ignoreCase = true) })
        recentQueries = next.take(MAX_RECENT_SEARCHES).toMutableList()
        prefs.edit().putString(KEY_RECENT_SEARCHES, recentQueries.joinToString("|")).apply()
        if (!hasActiveSearch) {
            searchAdapter.setRecentQueries(recentQueries)
        }
    }

    private fun deleteRecentQuery(query: String) {
        recentQueries = recentQueries
            .filterNot { it.equals(query, ignoreCase = true) }
            .toMutableList()
        prefs.edit().putString(KEY_RECENT_SEARCHES, recentQueries.joinToString("|")).apply()
        searchAdapter.setRecentQueries(recentQueries)
        Toast.makeText(this, "Search removed", Toast.LENGTH_SHORT).show()
    }

    private fun confirmClearRecentQueries() {
        AlertDialog.Builder(this)
            .setTitle("Clear recent searches?")
            .setMessage("This removes all saved search history.")
            .setPositiveButton("Clear") { _, _ ->
                recentQueries.clear()
                prefs.edit().remove(KEY_RECENT_SEARCHES).apply()
                etSearch.setText("")
                hasActiveSearch = false
                searchAdapter.setRecentQueries(recentQueries)
                Toast.makeText(this, "Search history cleared", Toast.LENGTH_SHORT).show()
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun playChannel(channel: Channel) {
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("play_channel", channel)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        startActivity(intent)
        finish()
    }

    private fun showChannelActions(channel: Channel) {
        lifecycleScope.launch {
            val isFavorite = withContext(Dispatchers.IO) {
                db.favoriteDao().isFavorite(channel.id.toInt())
            }
            val favoriteLabel = if (isFavorite) "Remove from Favorites" else "Add to Favorites"
            AlertDialog.Builder(this@SearchActivity)
                .setTitle(ChannelNameFormatter.format(this@SearchActivity, channel.name))
                .setItems(arrayOf("Play", favoriteLabel)) { _, which ->
                    when (which) {
                        0 -> playChannel(channel)
                        1 -> toggleFavorite(channel, isFavorite)
                    }
                }
                .show()
        }
    }

    private fun toggleFavorite(channel: Channel, isFavorite: Boolean) {
        lifecycleScope.launch {
            withContext(Dispatchers.IO) {
                val favorite = Favorite(channel.id.toInt(), channel.name, channel.logoUrl, channel.epgId, channel.group)
                if (isFavorite) db.favoriteDao().delete(favorite) else db.favoriteDao().insert(favorite)
            }
            Toast.makeText(
                this@SearchActivity,
                if (isFavorite) "Removed from Favorites" else "Added to Favorites",
                Toast.LENGTH_SHORT
            ).show()
        }
    }

    private fun playMovie(movie: XtreamVodStream) {
        val url = buildMovieUrl(movie)
        if (shouldUseExternalMoviePlayer()) {
            openMovieExternally(url, movie.name)
            return
        }
        val intent = Intent(this, MainActivity::class.java)
        intent.putExtra("play_url", url)
        intent.putExtra("media_title", movie.name)
        intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
        startActivity(intent)
        finish()
    }

    private fun showMovieActions(movie: XtreamVodStream) {
        val inMyList = movie.streamId in getMyListMovieIds()
        val myListLabel = if (inMyList) "Remove from My List" else "Add to My List"
        AlertDialog.Builder(this)
            .setTitle(movie.name)
            .setItems(arrayOf("Play", "Open in external player", "Download movie", myListLabel)) { _, which ->
                val url = buildMovieUrl(movie)
                when (which) {
                    0 -> playMovie(movie)
                    1 -> openMovieExternally(url, movie.name)
                    2 -> downloadMovie(url, movie.name, movie.containerExtension)
                    3 -> toggleMovieMyList(movie)
                }
            }
            .show()
    }

    private fun buildMovieUrl(movie: XtreamVodStream): String {
        val ext = movie.containerExtension?.takeIf { it.isNotBlank() } ?: "mp4"
        return movie.directUrl ?: "${XtreamManager.baseUrl}/movie/${XtreamManager.username}/${XtreamManager.password}/${movie.streamId}.$ext"
    }

    private fun shouldUseExternalMoviePlayer(): Boolean {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_MOVIE_PLAYER_MODE, MOVIE_PLAYER_BUILT_IN) == MOVIE_PLAYER_EXTERNAL
    }

    private fun openMovieExternally(url: String, title: String) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(android.net.Uri.parse(url), "video/*")
            putExtra(Intent.EXTRA_TITLE, title)
            putExtra("title", title)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        startActivity(Intent.createChooser(intent, "Open movie with"))
        finish()
    }

    private fun openSeries(series: XtreamSeries) {
        val intent = Intent(this, SeriesDetailsActivity::class.java)
        intent.putExtra("series_id", series.seriesId)
        intent.putExtra("series_name", series.name)
        intent.putExtra("series_cover", series.cover)
        startActivity(intent)
    }

    private fun showSeriesActions(series: XtreamSeries) {
        val inMyList = series.seriesId in getMyListSeriesIds()
        val myListLabel = if (inMyList) "Remove from My List" else "Add to My List"
        AlertDialog.Builder(this)
            .setTitle(series.name)
            .setItems(arrayOf("Open series", myListLabel)) { _, which ->
                when (which) {
                    0 -> openSeries(series)
                    1 -> toggleSeriesMyList(series)
                }
            }
            .show()
    }

    private fun toggleMovieMyList(movie: XtreamVodStream) {
        val ids = getMyListMovieIds().toMutableSet()
        val added = if (ids.contains(movie.streamId)) {
            ids.remove(movie.streamId)
            false
        } else {
            ids.add(movie.streamId)
            true
        }
        prefs.edit().putString(KEY_MY_LIST_MOVIES, ids.sorted().joinToString(",")).apply()
        Toast.makeText(this, if (added) "Added to My List" else "Removed from My List", Toast.LENGTH_SHORT).show()
    }

    private fun toggleSeriesMyList(series: XtreamSeries) {
        val ids = getMyListSeriesIds().toMutableSet()
        val added = if (ids.contains(series.seriesId)) {
            ids.remove(series.seriesId)
            false
        } else {
            ids.add(series.seriesId)
            true
        }
        prefs.edit().putString(KEY_MY_LIST_SERIES, ids.sorted().joinToString(",")).apply()
        Toast.makeText(this, if (added) "Added to My List" else "Removed from My List", Toast.LENGTH_SHORT).show()
    }

    private fun getMyListMovieIds(): Set<Int> {
        return prefs.getString(KEY_MY_LIST_MOVIES, "")
            .orEmpty()
            .split(",")
            .mapNotNull { it.trim().toIntOrNull() }
            .toSet()
    }

    private fun getMyListSeriesIds(): Set<Int> {
        return prefs.getString(KEY_MY_LIST_SERIES, "")
            .orEmpty()
            .split(",")
            .mapNotNull { it.trim().toIntOrNull() }
            .toSet()
    }

    private fun downloadMovie(url: String, title: String, extension: String?) {
        val smbServer = prefs.getString(DownloadPrefs.KEY_SMB_SERVER, "").orEmpty()
        val smbShare = prefs.getString(DownloadPrefs.KEY_SMB_SHARE, "").orEmpty()
        if (smbServer.isNotBlank() && smbShare.isNotBlank()) {
            downloadMovieToSmb(url, title, extension)
            return
        }
        val manager = getSystemService(DownloadManager::class.java) ?: run {
            Toast.makeText(this, "Downloads are not available on this device", Toast.LENGTH_LONG).show()
            return
        }
        val location = prefs.getString(DownloadPrefs.KEY_LOCATION, DownloadPrefs.LOCATION_DOWNLOADS)
            ?: DownloadPrefs.LOCATION_DOWNLOADS
        val subfolder = prefs.getString(DownloadPrefs.KEY_SUBFOLDER, DownloadPrefs.DEFAULT_SUBFOLDER)
            ?.let { DownloadPrefs.cleanPathSegment(it) }
            ?.ifBlank { DownloadPrefs.DEFAULT_SUBFOLDER }
            ?: DownloadPrefs.DEFAULT_SUBFOLDER
        val safeTitle = title.replace(Regex("""[\\/:*?"<>|]"""), "_").take(80).ifBlank { "movie" }
        val ext = extension?.takeIf { it.isNotBlank() } ?: url.substringBefore('?').substringAfterLast('.', "mp4")
        val destinationName = "$subfolder/$safeTitle.$ext"
        val request = DownloadManager.Request(android.net.Uri.parse(url))
            .setTitle(safeTitle)
            .setDescription("GreenStreem movie download to ${DownloadPrefs.locationLabel(location)}")
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setDestinationInExternalPublicDir(DownloadPrefs.publicDirectory(location), destinationName)
            .setAllowedOverMetered(true)
            .setAllowedOverRoaming(true)
        runCatching {
            manager.enqueue(request)
            updateDownloadStatus(DownloadPrefs.STATUS_RUNNING, safeTitle, "${DownloadPrefs.locationLabel(location)}/$destinationName", 0)
            Toast.makeText(this, "Download started", Toast.LENGTH_SHORT).show()
        }.onFailure {
            updateDownloadStatus(DownloadPrefs.STATUS_FAILED, safeTitle, it.message ?: "Download failed", 0)
            Toast.makeText(this, "Download failed: ${it.message}", Toast.LENGTH_LONG).show()
        }
    }

    private fun downloadMovieToSmb(url: String, title: String, extension: String?) {
        val server = prefs.getString(DownloadPrefs.KEY_SMB_SERVER, "").orEmpty()
        val share = prefs.getString(DownloadPrefs.KEY_SMB_SHARE, "").orEmpty()
        val folder = prefs.getString(DownloadPrefs.KEY_SMB_FOLDER, "").orEmpty()
        val subfolder = prefs.getString(DownloadPrefs.KEY_SUBFOLDER, DownloadPrefs.DEFAULT_SUBFOLDER)
            ?.let { DownloadPrefs.cleanPathSegment(it) }
            ?.ifBlank { DownloadPrefs.DEFAULT_SUBFOLDER }
            ?: DownloadPrefs.DEFAULT_SUBFOLDER
        val targetFolder = DownloadPrefs.joinPath(folder, subfolder)
        val username = prefs.getString(DownloadPrefs.KEY_SMB_USERNAME, "").orEmpty()
        val password = prefs.getString(DownloadPrefs.KEY_SMB_PASSWORD, "").orEmpty()
        val safeTitle = title.replace(Regex("""[\\/:*?"<>|]"""), "_").take(80).ifBlank { "movie" }
        val ext = extension?.takeIf { it.isNotBlank() } ?: url.substringBefore('?').substringAfterLast('.', "mp4")
        val fileName = "$safeTitle.$ext"
        val target = SmbBrowser.targetUrl(server, share, targetFolder)

        updateDownloadStatus(DownloadPrefs.STATUS_RUNNING, safeTitle, target, 0)
        Toast.makeText(this, "Network download started", Toast.LENGTH_SHORT).show()
        lifecycleScope.launch {
            val result = withContext(Dispatchers.IO) {
                runCatching {
                    val connection = URL(url).openConnection()
                    val totalBytes = connection.contentLengthLong.takeIf { it > 0L } ?: -1L
                    connection.getInputStream().use { input ->
                        SmbBrowser.openOutputStream(server, username, password, share, targetFolder, fileName).use { output ->
                            val buffer = ByteArray(DEFAULT_BUFFER_SIZE)
                            var copiedBytes = 0L
                            var lastProgress = -1
                            while (true) {
                                val count = input.read(buffer)
                                if (count < 0) break
                                output.write(buffer, 0, count)
                                copiedBytes += count
                                if (totalBytes > 0L) {
                                    val progress = ((copiedBytes * 100L) / totalBytes).toInt().coerceIn(0, 100)
                                    if (progress != lastProgress && (progress == 100 || progress - lastProgress >= 2)) {
                                        lastProgress = progress
                                        updateDownloadStatus(DownloadPrefs.STATUS_RUNNING, safeTitle, target, progress)
                                    }
                                }
                            }
                        }
                    }
                }
            }
            result.onSuccess {
                updateDownloadStatus(DownloadPrefs.STATUS_DONE, safeTitle, target, 100)
                Toast.makeText(this@SearchActivity, "Saved to $target", Toast.LENGTH_LONG).show()
            }.onFailure { error ->
                updateDownloadStatus(
                    DownloadPrefs.STATUS_FAILED,
                    safeTitle,
                    error.message ?: error.javaClass.simpleName,
                    prefs.getInt(DownloadPrefs.KEY_DOWNLOAD_PROGRESS, 0)
                )
                Toast.makeText(this@SearchActivity, "Network download failed: ${error.message ?: error.javaClass.simpleName}", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun updateDownloadStatus(status: String, title: String, target: String, progress: Int) {
        prefs.edit()
            .putString(DownloadPrefs.KEY_DOWNLOAD_STATUS, status)
            .putString(DownloadPrefs.KEY_DOWNLOAD_TITLE, title)
            .putString(DownloadPrefs.KEY_DOWNLOAD_TARGET, target)
            .putInt(DownloadPrefs.KEY_DOWNLOAD_PROGRESS, progress.coerceIn(0, 100))
            .putLong(DownloadPrefs.KEY_DOWNLOAD_UPDATED_AT, System.currentTimeMillis())
            .apply()
    }

    private class GlobalSearchAdapter(
        private val onRecentClick: (String) -> Unit,
        private val onRecentDelete: (String) -> Unit,
        private val onClearRecent: () -> Unit,
        private val onChannelClick: (Channel) -> Unit,
        private val onChannelLongClick: (Channel) -> Unit,
        private val onProgramClick: (ProgramSearchResult) -> Unit,
        private val onMovieClick: (XtreamVodStream) -> Unit,
        private val onMovieLongClick: (XtreamVodStream) -> Unit,
        private val onSeriesClick: (XtreamSeries) -> Unit,
        private val onSeriesLongClick: (XtreamSeries) -> Unit
    ) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

        companion object {
            const val TYPE_HEADER = 0
            const val TYPE_CHANNEL = 1
            const val TYPE_MOVIE = 2
            const val TYPE_SERIES = 3
            const val TYPE_RECENT_QUERY = 4
            const val TYPE_RECENT_CLEAR = 5
            const val TYPE_PROGRAM = 6
        }

        private var items: List<Any> = emptyList()

        fun setRecentQueries(queries: List<String>) {
            if (queries.isEmpty()) {
                items = emptyList()
                notifyDataSetChanged()
                return
            }
            val newList = mutableListOf<Any>()
            newList.add("Recent Searches")
            newList.add(ClearRecentSearches)
            queries.forEach { newList.add(RecentSearchQuery(it)) }
            items = newList
            notifyDataSetChanged()
        }

        fun setResults(
            channels: List<Channel>,
            movies: List<XtreamVodStream>,
            series: List<XtreamSeries>,
            programs: List<ProgramSearchResult>
        ) {
            val newList = mutableListOf<Any>()
            if (channels.isNotEmpty()) {
                newList.add("Live Channels")
                newList.addAll(channels)
            }
            if (programs.isNotEmpty()) {
                newList.add("Programs")
                newList.addAll(programs)
            }
            if (movies.isNotEmpty()) {
                newList.add("Movies")
                newList.addAll(movies)
            }
            if (series.isNotEmpty()) {
                newList.add("Series")
                newList.addAll(series)
            }
            items = newList
            notifyDataSetChanged()
        }

        override fun getItemViewType(position: Int): Int {
            return when (items[position]) {
                is String -> TYPE_HEADER
                is Channel -> TYPE_CHANNEL
                is XtreamVodStream -> TYPE_MOVIE
                is XtreamSeries -> TYPE_SERIES
                is RecentSearchQuery -> TYPE_RECENT_QUERY
                is ClearRecentSearches -> TYPE_RECENT_CLEAR
                is ProgramSearchResult -> TYPE_PROGRAM
                else -> -1
            }
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
            val inflater = LayoutInflater.from(parent.context)
            return when (viewType) {
                TYPE_HEADER -> HeaderVH(inflater.inflate(android.R.layout.simple_list_item_1, parent, false))
                TYPE_RECENT_CLEAR -> RecentVH(inflater.inflate(android.R.layout.simple_list_item_1, parent, false))
                TYPE_RECENT_QUERY -> RecentVH(inflater.inflate(android.R.layout.simple_list_item_1, parent, false))
                TYPE_PROGRAM -> ItemVH(inflater.inflate(R.layout.item_channel_epg, parent, false))
                TYPE_CHANNEL -> ItemVH(inflater.inflate(R.layout.item_channel_epg, parent, false))
                else -> ItemVH(inflater.inflate(R.layout.item_poster, parent, false))
            }
        }

        override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
            val item = items[position]
            holder.itemView.isFocusable = true
            holder.itemView.setBackgroundResource(R.drawable.selector_button_bg)

            when (holder) {
                is HeaderVH -> {
                    val tv = holder.itemView.findViewById<TextView>(android.R.id.text1)
                    tv.text = item as String
                    tv.setTextColor(android.graphics.Color.YELLOW)
                    tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 20f)
                    holder.itemView.isFocusable = false
                }
                is RecentVH -> {
                    val tv = holder.itemView.findViewById<TextView>(android.R.id.text1)
                    val isClearRow = item is ClearRecentSearches
                    val query = (item as? RecentSearchQuery)?.query.orEmpty()
                    tv.text = if (isClearRow) "Clear all recent searches" else query
                    tv.setTextColor(if (isClearRow) android.graphics.Color.rgb(255, 180, 120) else android.graphics.Color.WHITE)
                    tv.setTextSize(TypedValue.COMPLEX_UNIT_SP, 22f)
                    holder.itemView.setPadding(24, 18, 24, 18)
                    holder.itemView.setOnClickListener {
                        if (isClearRow) onClearRecent() else onRecentClick(query)
                    }
                    holder.itemView.setOnLongClickListener {
                        if (!isClearRow) {
                            onRecentDelete(query)
                            true
                        } else {
                            false
                        }
                    }
                }
                is ItemVH -> {
                    val ivLogo = holder.itemView.findViewById<ImageView>(R.id.ivChannelLogo) ?: holder.itemView.findViewById<ImageView>(R.id.ivPoster)
                    val tvName = holder.itemView.findViewById<TextView>(R.id.tvChannelName) ?: holder.itemView.findViewById<TextView>(R.id.tvPosterTitle)
                    
                    when (item) {
                        is Channel -> {
                            tvName.text = ChannelNameFormatter.format(holder.itemView.context, item.name)
                            Glide.with(holder.itemView).load(item.logoUrl).into(ivLogo)
                            holder.itemView.setOnClickListener { onChannelClick(item) }
                            holder.itemView.setOnLongClickListener {
                                onChannelLongClick(item)
                                true
                            }
                        }
                        is ProgramSearchResult -> {
                            tvName.text = "${item.title}  -  ${ChannelNameFormatter.format(holder.itemView.context, item.channel.name)}"
                            Glide.with(holder.itemView).load(item.channel.logoUrl).into(ivLogo)
                            holder.itemView.setOnClickListener { onProgramClick(item) }
                            holder.itemView.setOnLongClickListener {
                                onProgramClick(item)
                                true
                            }
                        }
                        is XtreamVodStream -> {
                            tvName.text = item.name
                            Glide.with(holder.itemView).load(item.streamIcon).override(130, 195).into(ivLogo)
                            holder.itemView.setOnClickListener { onMovieClick(item) }
                            holder.itemView.setOnLongClickListener {
                                onMovieLongClick(item)
                                true
                            }
                        }
                        is XtreamSeries -> {
                            tvName.text = item.name
                            Glide.with(holder.itemView).load(item.cover).override(130, 195).into(ivLogo)
                            holder.itemView.setOnClickListener { onSeriesClick(item) }
                            holder.itemView.setOnLongClickListener {
                                onSeriesLongClick(item)
                                true
                            }
                        }
                    }
                }
            }
        }

        override fun getItemCount() = items.size

        class HeaderVH(v: View) : RecyclerView.ViewHolder(v)
        class RecentVH(v: View) : RecyclerView.ViewHolder(v)
        class ItemVH(v: View) : RecyclerView.ViewHolder(v)

        private data class RecentSearchQuery(val query: String)
        private object ClearRecentSearches

        override fun onViewRecycled(holder: RecyclerView.ViewHolder) {
            super.onViewRecycled(holder)
            holder.itemView.setOnClickListener(null)
            holder.itemView.setOnLongClickListener(null)
        }
    }

    companion object {
        private const val KEY_RECENT_SEARCHES = "recent_searches"
        private const val KEY_MOVIE_PLAYER_MODE = "player_movie_player_mode"
        private const val KEY_MY_LIST_MOVIES = "my_list_movie_ids"
        private const val KEY_MY_LIST_SERIES = "my_list_series_ids"
        private const val MOVIE_PLAYER_BUILT_IN = "built_in"
        private const val MOVIE_PLAYER_EXTERNAL = "external"
        private const val MAX_RECENT_SEARCHES = 12
    }
}
