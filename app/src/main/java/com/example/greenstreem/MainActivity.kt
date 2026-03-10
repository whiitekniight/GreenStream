package com.example.greenstreem

import android.app.AlertDialog
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.FrameLayout
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import androidx.annotation.OptIn
import androidx.activity.OnBackPressedCallback
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.lifecycleScope
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.common.C
import androidx.media3.common.TrackSelectionOverride
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.ui.AspectRatioFrameLayout
import androidx.media3.ui.PlayerView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.google.gson.Gson
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.text.SimpleDateFormat
import java.util.Calendar
import java.util.Date
import java.util.Locale

@OptIn(UnstableApi::class)
class MainActivity : FragmentActivity() {

    enum class UiState { FULL_SCREEN, EPG_GRID, CATEGORIES, NAV_RAIL }
    enum class ContentMode { LIVE_TV, MOVIES, SERIES }

    private var currentState = UiState.FULL_SCREEN
    private var currentMode = ContentMode.LIVE_TV
    private var lastBackPressTs = 0L

    private var player: ExoPlayer? = null
    private lateinit var playerView: PlayerView
    private lateinit var playerContainer: FrameLayout
    private lateinit var videoPreviewBox: FrameLayout
    private lateinit var topInfo: View
    private lateinit var mainContentArea: View
    private lateinit var zapBar: View
    private lateinit var ivZapPrev: ImageView
    private lateinit var ivZapCurrent: ImageView
    private lateinit var ivZapNext: ImageView
    private lateinit var tvZapPrev: TextView
    private lateinit var tvZapCurrent: TextView
    private lateinit var tvZapNext: TextView
    private lateinit var timeRulerContainer: LinearLayout
    
    private lateinit var epgOverlay: View
    private lateinit var navRail: View
    private lateinit var rvCategories: RecyclerView
    private lateinit var rvRecentChannels: RecyclerView
    private lateinit var rvContent: RecyclerView
    private lateinit var hsvTimeRuler: HorizontalScrollView
    
    private lateinit var tvProgramTitleLarge: TextView
    private lateinit var tvProgramDescription: TextView
    private lateinit var tvProgramTimeRange: TextView
    private lateinit var tvProgramDuration: TextView
    private var pbProgramProgress: ProgressBar? = null

    private lateinit var db: AppDatabase
    private var currentChannel: Channel? = null
    private var currentAspectRatioMode = AspectRatioFrameLayout.RESIZE_MODE_FILL
    private var previousChannel: Channel? = null
    private var currentVodResumeKey: String? = null

    private var lastCategoryPosition = 0
    private var lastGridPosition = 0
    
    private lateinit var epgScrollSync: ScrollSync

    private val hoverHandler = Handler(Looper.getMainLooper())
    private var hoverRunnable: Runnable? = null
    private val miniInfoHandler = Handler(Looper.getMainLooper())
    private var miniInfoRunnable: Runnable? = null
    private val zapBarHandler = Handler(Looper.getMainLooper())
    private var zapBarRunnable: Runnable? = null
    private val epgUiUpdateHandler = Handler(Looper.getMainLooper())
    private var epgUiFlushRunnable: Runnable? = null
    private val pendingEpgUiUpdates = LinkedHashMap<Int, List<XtreamEpgListing>>()
    private var isRvContentScrolling = false
    private var epgUiSuppressUntilMs = 0L
    private val epgUiSuppressDuringNavMs = 350L
    private var epgFocusRequestToken = 0
    private val uiTickHandler = Handler(Looper.getMainLooper())
    private var uiTickRunnable: Runnable? = null
    private val sleepTimerHandler = Handler(Looper.getMainLooper())
    private var sleepTimerRunnable: Runnable? = null
    private var currentContentCall: Call<*>? = null
    private val pendingEpgCalls = mutableListOf<Call<XtreamEpgResponse>>()
    private val epgCacheByStreamId = LinkedHashMap<Int, List<XtreamEpgListing>>()
    private val epgInFlightStreamIds = mutableSetOf<Int>()
    private val epgQueuedStreamIds = mutableSetOf<Int>()
    private val epgFetchQueue = ArrayDeque<Pair<Channel, Boolean>>()
    private var epgActiveFetchCount = 0
    private val maxConcurrentEpgFetches = 6
    private val epgDiskCacheTtlMs = 24L * 60L * 60L * 1000L
    private val gson by lazy { Gson() }
    private val liveStreamsPrefetchInFlight = mutableSetOf<String>()
    private val doubleBackWindowMs = 500L
    private var miniInfoTimeoutMs = 4000L
    private val zapBarTimeoutMs = 2500L

    // In-memory caches
    private var cachedRawCategories: List<XtreamCategory>? = null
    private var cachedLiveStreams: Map<String, List<XtreamLiveStream>>? = null
    private var cachedVodStreams: Map<String, List<XtreamVodStream>>? = null
    private var cachedSeries: Map<String, List<XtreamSeries>>? = null
    private var currentLiveChannels: List<Channel> = emptyList()
    private var currentLiveChannelIndex: Int = -1
    private var currentLiveCategoryId: String? = null
    private var returnToPlayingChannelOnNextGridOpen = false
    private var pendingEpgRefresh = false
    private var pendingEpgRefreshUserRequested = false
    private var isChannelVisibilityEditMode = false
    private var visibilityEditOriginalState: UiState = UiState.EPG_GRID
    private var visibilityEditChannels: List<Channel> = emptyList()
    private val visibilityHiddenIds = mutableSetOf<Long>()
    private val maxEpgCacheEntries = 1500
    private val aspectModes = listOf(
        AspectRatioFrameLayout.RESIZE_MODE_FIT to "Fit",
        AspectRatioFrameLayout.RESIZE_MODE_FILL to "Fill",
        AspectRatioFrameLayout.RESIZE_MODE_ZOOM to "Zoom"
    )

    private val categoryAdapter = CategoryAdapter(
        onCategoryClick = { category ->
            fetchContentForCategory(category)
            updateUiState(UiState.EPG_GRID)
        },
        onCategoryFocus = { category, position -> 
            lastCategoryPosition = position
            saveLastCategoryForCurrentMode(category.id, position)
            centerRecyclerPosition(rvCategories, position, 56)
            onCategoryFocused(category) 
        }
    )

    private lateinit var epgAdapter: EpgRowAdapter
    private lateinit var recentChannelAdapter: RecentChannelAdapter
    private val posterAdapter = PosterAdapter(
        onClick = { item -> handleVodClick(item) },
        onFocus = { item, position -> 
            lastGridPosition = position
            if (currentMode == ContentMode.MOVIES || currentMode == ContentMode.SERIES) {
                saveLastGridPositionForMode(currentMode, position)
            }
            updateVodInfo(item) 
        },
        onLongClick = { item -> showVodOptions(item) }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        currentAspectRatioMode = prefs.getInt(KEY_PLAYER_ASPECT_MODE, AspectRatioFrameLayout.RESIZE_MODE_FILL)
        miniInfoTimeoutMs = prefs.getInt(KEY_MINI_INFO_TIMEOUT_SEC, 4).coerceAtLeast(0) * 1000L
        pendingEpgRefresh = prefs.getBoolean(KEY_EPG_UPDATE_ON_START, true)
        currentMode = ContentMode.LIVE_TV
        if (!prefs.getBoolean("has_playlist", false)) {
            startActivity(Intent(this, SetupActivity::class.java))
            finish()
            return
        }

        db = AppDatabase.getDatabase(this)
        XtreamManager.initFromPrefs(this)
        val hasValidService = XtreamManager.getService() != null &&
            XtreamManager.username.isNotBlank() &&
            XtreamManager.password.isNotBlank()
        if (!hasValidService) {
            startActivity(Intent(this, SetupActivity::class.java))
            finish()
            return
        }

        setContentView(R.layout.activity_main)
        
        playerView = findViewById(R.id.playerView) ?: return
        playerContainer = findViewById(R.id.playerContainer) ?: return
        videoPreviewBox = findViewById(R.id.videoPreviewBox) ?: return
        epgOverlay = findViewById(R.id.epgOverlay) ?: return
        topInfo = findViewById(R.id.topInfo) ?: return
        mainContentArea = findViewById(R.id.mainContentArea) ?: return
        zapBar = findViewById(R.id.zapBar) ?: return
        ivZapPrev = findViewById(R.id.ivZapPrev) ?: return
        ivZapCurrent = findViewById(R.id.ivZapCurrent) ?: return
        ivZapNext = findViewById(R.id.ivZapNext) ?: return
        tvZapPrev = findViewById(R.id.tvZapPrev) ?: return
        tvZapCurrent = findViewById(R.id.tvZapCurrent) ?: return
        tvZapNext = findViewById(R.id.tvZapNext) ?: return
        navRail = findViewById(R.id.navRail) ?: return
        rvCategories = findViewById(R.id.rvCategories) ?: return
        rvRecentChannels = findViewById(R.id.rvRecentChannels) ?: return
        rvContent = findViewById(R.id.rvEpg) ?: return
        hsvTimeRuler = findViewById(R.id.hsvTimeRuler) ?: return
        timeRulerContainer = findViewById(R.id.timeRulerContainer) ?: return
        tvProgramTitleLarge = findViewById(R.id.tvProgramTitleLarge) ?: return
        tvProgramDescription = findViewById(R.id.tvProgramDescription) ?: return
        tvProgramTimeRange = findViewById(R.id.tvProgramTimeRange) ?: return
        tvProgramDuration = findViewById(R.id.tvProgramDuration) ?: return
        pbProgramProgress = findViewById(R.id.pbProgramProgress)

        rvCategories.layoutManager = LinearLayoutManager(this)
        rvCategories.adapter = categoryAdapter
        hsvTimeRuler.isFocusable = false
        hsvTimeRuler.isFocusableInTouchMode = false
        hsvTimeRuler.descendantFocusability = ViewGroup.FOCUS_BLOCK_DESCENDANTS
        timeRulerContainer.isFocusable = false
        timeRulerContainer.isFocusableInTouchMode = false

        recentChannelAdapter = RecentChannelAdapter { channel ->
            playChannel(channel)
            updateUiState(UiState.FULL_SCREEN)
        }
        rvRecentChannels.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rvRecentChannels.adapter = recentChannelAdapter

        epgScrollSync = ScrollSync()
        epgScrollSync.onAnyRowScrolled = { x -> hsvTimeRuler.scrollTo(x, 0) }

        epgAdapter = EpgRowAdapter(5, epgScrollSync,
            onProgramFocus = { channel, listing ->
                val pos = epgAdapter.getPositionForChannelId(channel.id)
                if (pos != RecyclerView.NO_POSITION) {
                    epgAdapter.focusedRowPosition = pos
                    saveLiveFocusedRowPosition(pos)
                }
                updateFocusInfo(channel, listing)
            },
            onProgramClick = { channel ->
                if (isChannelVisibilityEditMode) return@EpgRowAdapter
                if (prefs.getBoolean(KEY_EPG_CLICK_TO_PLAY, true)) {
                    playChannel(channel)
                } else {
                    updateFocusInfo(channel, null)
                }
            },
            onProgramLongClick = { channel ->
                if (!isChannelVisibilityEditMode) showChannelOptions(channel)
            },
            onVisibilityToggleClick = { channel ->
                if (isChannelVisibilityEditMode) toggleChannelVisibilitySelection(channel)
            }
        )
        rvContent.addOnScrollListener(object : RecyclerView.OnScrollListener() {
            override fun onScrollStateChanged(recyclerView: RecyclerView, newState: Int) {
                isRvContentScrolling = newState != RecyclerView.SCROLL_STATE_IDLE
                if (!isRvContentScrolling) {
                    flushPendingEpgUiUpdates()
                }
            }
        })

        initializePlayer()
        setupDynamicTimeRuler()
        setupNavRail()
        setupBackNavigationDispatcher()
        updateUiState(if (isTvUiMode()) UiState.FULL_SCREEN else UiState.CATEGORIES)
        
        fetchCategories(autoSelectFirst = true, shouldScrollToActive = true)
        if (prefs.getBoolean(KEY_PLAYLIST_UPDATE_ON_START, true)) {
            preloadAllStreams()
        }
        refreshRecentChannelsRow()
        lifecycleScope.launch { AppUpdater.maybeAutoCheck(this@MainActivity) }

        @Suppress("DEPRECATION")
        val playChannelExtra = intent.getSerializableExtra("play_channel") as? Channel
        if (playChannelExtra != null) {
            playChannel(playChannelExtra)
        } else if (handleExternalPlaybackIntent(intent)) {
            // handled by external VOD/series playback intent
        } else {
            val lastId = prefs.getLong("last_channel_id", -1L)
            if (lastId != -1L && prefs.getBoolean(KEY_AUTOPLAY_LAST_CHANNEL, true)) {
                resumeLastChannel(lastId)
            }
        }
    }

    override fun onStart() {
        super.onStart()
        player?.play()
    }

    override fun onStop() {
        super.onStop()
        saveVodResumeProgress()
        player?.pause()
    }

    override fun onResume() {
        super.onResume()
        fetchCategories(autoSelectFirst = false, shouldScrollToActive = true)
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        if (prefs.getBoolean(KEY_EPG_FORCE_REFRESH_NOW, false)) {
            pendingEpgRefresh = true
            pendingEpgRefreshUserRequested = true
            prefs.edit().putBoolean(KEY_EPG_FORCE_REFRESH_NOW, false).apply()
        }
        maybeRunPendingEpgRefresh()
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        handleExternalPlaybackIntent(intent)
    }

    private fun updateFocusInfo(channel: Channel, listing: XtreamEpgListing?) {
        tvProgramTitleLarge.text = DataUtils.decodeBase64(listing?.title ?: channel.name)
        tvProgramDescription.text = DataUtils.decodeBase64(listing?.description ?: "No description")
        
        lifecycleScope.launch {
            val isFav = db.favoriteDao().isFavorite(channel.id.toInt())
            findViewById<ImageView>(R.id.ivFavoriteStar)?.setImageResource(
                if (isFav) android.R.drawable.btn_star_big_on else android.R.drawable.btn_star_big_off
            )
        }

        if (listing != null) {
            val sdfTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
            val sdfDate = SimpleDateFormat("MMM dd", Locale.getDefault())
            val startDate = Date(listing.startTimestamp * 1000)
            val stopDate = Date(listing.stopTimestamp * 1000)
            tvProgramTimeRange.text = "${sdfDate.format(startDate)}, ${sdfTime.format(startDate)} - ${sdfTime.format(stopDate)}"
            tvProgramDuration.text = "${(listing.stopTimestamp - listing.startTimestamp) / 60} min"
            val now = System.currentTimeMillis() / 1000
            if (now in listing.startTimestamp..listing.stopTimestamp) {
                pbProgramProgress?.progress = ((now - listing.startTimestamp).toFloat() / (listing.stopTimestamp - listing.startTimestamp).toFloat() * 100).toInt()
            } else pbProgramProgress?.progress = 0
        } else {
            tvProgramTimeRange.text = ""; tvProgramDuration.text = ""; pbProgramProgress?.progress = 0
        }
    }

    private fun showChannelOptions(channel: Channel) {
        lifecycleScope.launch {
            val isFav = runCatching { db.favoriteDao().isFavorite(channel.id.toInt()) }.getOrDefault(false)
            val options = arrayOf(
                if (isFav) "Remove from Favorites" else "Add to Favorites",
                "Manage Channel Visibility",
                "Hide Channel",
                "Show all hidden channels"
            )
            AlertDialog.Builder(this@MainActivity)
                .setTitle(channel.name)
                .setItems(options) { _, which ->
                    handleOptionSelection(options[which], channel)
                }
                .show()
        }
    }

    private fun showQuickPanel() {
        val options = arrayOf(
            "Channel options",
            "Cycle aspect ratio",
            "Audio tracks",
            "Subtitle tracks",
            "Sleep timer"
        )
        AlertDialog.Builder(this)
            .setTitle("Quick Panel")
            .setItems(options) { _, which ->
                when (which) {
                    0 -> {
                        val channel = currentChannel ?: getFocusedEpgChannel()
                        if (channel != null) showChannelOptions(channel)
                    }
                    1 -> cycleAspectRatio()
                    2 -> showAudioTrackDialog()
                    3 -> showSubtitleTrackDialog()
                    4 -> showSleepTimerDialog()
                }
            }
            .show()
    }

    private data class TrackChoice(
        val label: String,
        val override: TrackSelectionOverride?,
        val isSelected: Boolean
    )

    private fun showAudioTrackDialog() {
        val trackInfo = player?.currentTracks ?: run {
            Toast.makeText(this, "Player not ready", Toast.LENGTH_SHORT).show()
            return
        }
        val groups = trackInfo.groups.filter { it.type == C.TRACK_TYPE_AUDIO }
        val choices = groups.flatMap { group ->
            (0 until group.length)
                .filter { idx -> group.isTrackSupported(idx) }
                .map { idx ->
                    val format = group.getTrackFormat(idx)
                    val lang = format.language?.uppercase(Locale.getDefault()) ?: "Unknown"
                    val ch = if (format.channelCount > 0) " ${format.channelCount}ch" else ""
                    val rate = if (format.sampleRate > 0) " ${format.sampleRate}Hz" else ""
                    TrackChoice(
                        label = "$lang$ch$rate",
                        override = TrackSelectionOverride(group.mediaTrackGroup, listOf(idx)),
                        isSelected = group.isTrackSelected(idx)
                    )
                }
        }
        if (choices.isEmpty()) {
            Toast.makeText(this, "No audio tracks", Toast.LENGTH_SHORT).show()
            return
        }
        val selectedIndex = choices.indexOfFirst { it.isSelected }.coerceAtLeast(0)
        AlertDialog.Builder(this)
            .setTitle("Audio track")
            .setSingleChoiceItems(choices.map { it.label }.toTypedArray(), selectedIndex) { dialog, which ->
                val choice = choices[which]
                val updated = (player?.trackSelectionParameters ?: return@setSingleChoiceItems)
                    .buildUpon()
                    .clearOverridesOfType(C.TRACK_TYPE_AUDIO)
                    .setTrackTypeDisabled(C.TRACK_TYPE_AUDIO, false)
                    .addOverride(choice.override ?: return@setSingleChoiceItems)
                    .build()
                player?.trackSelectionParameters = updated
                dialog.dismiss()
            }
            .show()
    }

    private fun showSubtitleTrackDialog() {
        val trackInfo = player?.currentTracks ?: run {
            Toast.makeText(this, "Player not ready", Toast.LENGTH_SHORT).show()
            return
        }
        val groups = trackInfo.groups.filter { it.type == C.TRACK_TYPE_TEXT }
        val subtitleChoices = groups.flatMap { group ->
            (0 until group.length)
                .filter { idx -> group.isTrackSupported(idx) }
                .map { idx ->
                    val format = group.getTrackFormat(idx)
                    val lang = format.language?.uppercase(Locale.getDefault()) ?: "Unknown"
                    val label = format.label?.takeIf { it.isNotBlank() } ?: lang
                    TrackChoice(
                        label = label,
                        override = TrackSelectionOverride(group.mediaTrackGroup, listOf(idx)),
                        isSelected = group.isTrackSelected(idx)
                    )
                }
        }
        val choices = listOf(TrackChoice("Off", null, subtitleChoices.none { it.isSelected })) + subtitleChoices
        val selectedIndex = choices.indexOfFirst { it.isSelected }.coerceAtLeast(0)
        AlertDialog.Builder(this)
            .setTitle("Subtitles")
            .setSingleChoiceItems(choices.map { it.label }.toTypedArray(), selectedIndex) { dialog, which ->
                val builder = (player?.trackSelectionParameters ?: return@setSingleChoiceItems)
                    .buildUpon()
                    .clearOverridesOfType(C.TRACK_TYPE_TEXT)
                val updated = if (which == 0) {
                    builder.setTrackTypeDisabled(C.TRACK_TYPE_TEXT, true).build()
                } else {
                    builder
                        .setTrackTypeDisabled(C.TRACK_TYPE_TEXT, false)
                        .addOverride(choices[which].override ?: return@setSingleChoiceItems)
                        .build()
                }
                player?.trackSelectionParameters = updated
                dialog.dismiss()
            }
            .show()
    }

    private fun showSleepTimerDialog() {
        val labels = arrayOf("Off", "15 minutes", "30 minutes", "60 minutes")
        val values = arrayOf(0, 15, 30, 60)
        AlertDialog.Builder(this)
            .setTitle("Sleep timer")
            .setItems(labels) { _, which -> scheduleSleepTimer(values[which]) }
            .show()
    }

    private fun scheduleSleepTimer(minutes: Int) {
        sleepTimerRunnable?.let { sleepTimerHandler.removeCallbacks(it) }
        if (minutes <= 0) {
            Toast.makeText(this, "Sleep timer off", Toast.LENGTH_SHORT).show()
            return
        }
        sleepTimerRunnable = Runnable {
            player?.pause()
            Toast.makeText(this, "Sleep timer finished", Toast.LENGTH_SHORT).show()
        }
        sleepTimerHandler.postDelayed(sleepTimerRunnable!!, minutes * 60_000L)
        Toast.makeText(this, "Sleep timer: $minutes minutes", Toast.LENGTH_SHORT).show()
    }

    private fun handleOptionSelection(selection: String, channel: Channel) {
        lifecycleScope.launch {
            when (selection) {
                "Add to Favorites" -> {
                    db.favoriteDao().insert(Favorite(channel.id.toInt(), channel.name, channel.logoUrl, channel.epgId, channel.group))
                    Toast.makeText(this@MainActivity, "Added to Favorites", Toast.LENGTH_SHORT).show()
                }
                "Remove from Favorites" -> {
                    db.favoriteDao().delete(Favorite(channel.id.toInt(), channel.name, channel.logoUrl, channel.epgId, channel.group))
                    Toast.makeText(this@MainActivity, "Removed from Favorites", Toast.LENGTH_SHORT).show()
                }
                "Hide Channel" -> {
                    db.hiddenChannelDao().hideChannel(HiddenChannel(channel.id, channel.name))
                    Toast.makeText(this@MainActivity, "Channel Hidden", Toast.LENGTH_SHORT).show()
                    val currentCat = categoryAdapter.getItemAt(lastCategoryPosition)
                    if (currentCat != null) fetchContentForCategory(currentCat)
                }
                "Manage Channel Visibility" -> {
                    enterChannelVisibilityEditMode()
                    return@launch
                }
                "Show all hidden channels" -> {
                    showUnhideChannelsDialog()
                }
            }
            val currentCat = categoryAdapter.getItemAt(lastCategoryPosition)
            if (currentCat?.id == "favorites") fetchContentForCategory(currentCat)
            updateFocusInfo(channel, null)
        }
    }

    private fun showUnhideChannelsDialog() {
        lifecycleScope.launch {
            val hidden = db.hiddenChannelDao().getAllHidden().first()
            if (hidden.isEmpty()) {
                Toast.makeText(this@MainActivity, "No hidden channels", Toast.LENGTH_SHORT).show()
                return@launch
            }
            
            val names = hidden.map { it.name }
            AlertDialog.Builder(this@MainActivity)
                .setTitle("Unhide Channels")
                .setItems(names.toTypedArray()) { _, which ->
                    lifecycleScope.launch {
                        db.hiddenChannelDao().unhideChannel(hidden[which])
                        Toast.makeText(this@MainActivity, "Channel Unhidden", Toast.LENGTH_SHORT).show()
                        val currentCat = categoryAdapter.getItemAt(lastCategoryPosition)
                        if (currentCat != null) fetchContentForCategory(currentCat)
                    }
                }
                .show()
        }
    }

    private fun enterChannelVisibilityEditMode() {
        if (currentMode != ContentMode.LIVE_TV) {
            Toast.makeText(this, "Channel visibility is only for Live TV", Toast.LENGTH_SHORT).show()
            return
        }
        val categoryId = currentLiveCategoryId
            ?: categoryAdapter.getItemAt(lastCategoryPosition)?.id
            ?: return
        if (categoryId == "favorites" || categoryId == "recent") {
            Toast.makeText(this, "Open a live group first", Toast.LENGTH_SHORT).show()
            return
        }

        val cached = cachedLiveStreams?.get(categoryId)
        if (cached == null) {
            Toast.makeText(this, "Group not cached yet. Open the group once, then try again.", Toast.LENGTH_SHORT).show()
            return
        }
        lifecycleScope.launch {
            applyVisibilityEditData(categoryId, cached)
        }
    }

    private suspend fun applyVisibilityEditData(categoryId: String, streams: List<XtreamLiveStream>) {
        val allChannels = streams.map { stream ->
            Channel(
                id = stream.streamId.toLong(),
                name = stream.name,
                group = categoryId,
                logoUrl = stream.streamIcon,
                streamUrl = "",
                epgId = stream.epgId,
                number = stream.num,
                hasCatchup = supportsCatchup(stream)
            )
        }
        val sortedChannels = applyLiveChannelSort(allChannels, categoryId)
        val hiddenIds = db.hiddenChannelDao().getAllHidden().first().map { it.channelId }.toSet()
        visibilityEditChannels = sortedChannels
        visibilityHiddenIds.clear()
        visibilityHiddenIds.addAll(sortedChannels.map { it.id }.filter { it in hiddenIds })
        visibilityEditOriginalState = currentState
        isChannelVisibilityEditMode = true

        currentLiveChannels = sortedChannels
        epgAdapter.setData(sortedChannels)
        epgAdapter.setChannelVisibilityEditMode(true)
        epgAdapter.setHiddenChannelIds(visibilityHiddenIds.toSet())
        updateUiState(UiState.EPG_GRID)
        Toast.makeText(this@MainActivity, "Visibility mode: tap eye to hide/show, Back to apply", Toast.LENGTH_SHORT).show()
    }

    private fun toggleChannelVisibilitySelection(channel: Channel) {
        if (channel.id in visibilityHiddenIds) visibilityHiddenIds.remove(channel.id) else visibilityHiddenIds.add(channel.id)
        epgAdapter.setHiddenChannelIds(visibilityHiddenIds.toSet())
    }

    private fun applyAndExitChannelVisibilityEditMode() {
        if (!isChannelVisibilityEditMode) return
        lifecycleScope.launch {
            val hiddenNow = db.hiddenChannelDao().getAllHidden().first().associateBy { it.channelId }
            visibilityEditChannels.forEach { channel ->
                val shouldBeHidden = channel.id in visibilityHiddenIds
                val currentlyHidden = hiddenNow[channel.id] != null
                if (shouldBeHidden && !currentlyHidden) {
                    db.hiddenChannelDao().hideChannel(HiddenChannel(channel.id, channel.name))
                } else if (!shouldBeHidden && currentlyHidden) {
                    db.hiddenChannelDao().unhideChannel(hiddenNow[channel.id]!!)
                }
            }

            isChannelVisibilityEditMode = false
            visibilityEditChannels = emptyList()
            visibilityHiddenIds.clear()
            epgAdapter.setChannelVisibilityEditMode(false)
            epgAdapter.setHiddenChannelIds(emptySet())

            val currentCat = categoryAdapter.getItemAt(lastCategoryPosition)
            if (currentCat != null) fetchContentForCategory(currentCat)
            updateUiState(visibilityEditOriginalState)
            Toast.makeText(this@MainActivity, "Channel visibility updated", Toast.LENGTH_SHORT).show()
        }
    }

    private inner class DialogOptionsAdapter(
        private val items: List<String>,
        private val onClick: (String) -> Unit
    ) : RecyclerView.Adapter<DialogOptionsAdapter.ViewHolder>() {

        inner class ViewHolder(v: View) : RecyclerView.ViewHolder(v) {
            val tv: TextView = v.findViewById(R.id.tvOptionText)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val v = LayoutInflater.from(parent.context).inflate(R.layout.item_dialog_option, parent, false)
            return ViewHolder(v)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
            holder.tv.text = item
            holder.itemView.isFocusable = true
            holder.itemView.setBackgroundResource(R.drawable.selector_button_bg)
            holder.itemView.setOnClickListener { onClick(item) }
        }

        override fun getItemCount() = items.size
    }

    private fun toggleFavorite(channel: Channel) {
        lifecycleScope.launch {
            val isFav = db.favoriteDao().isFavorite(channel.id.toInt())
            if (isFav) {
                db.favoriteDao().delete(Favorite(channel.id.toInt(), channel.name, channel.logoUrl, channel.epgId, channel.group))
                Toast.makeText(this@MainActivity, "${channel.name} removed from favorites", Toast.LENGTH_SHORT).show()
            } else {
                db.favoriteDao().insert(Favorite(channel.id.toInt(), channel.name, channel.logoUrl, channel.epgId, channel.group))
                Toast.makeText(this@MainActivity, "${channel.name} added to favorites", Toast.LENGTH_SHORT).show()
            }
            val currentCat = categoryAdapter.getItemAt(lastCategoryPosition)
            if (currentCat?.id == "favorites") {
                fetchContentForCategory(currentCat)
            }
            updateFocusInfo(channel, null)
        }
    }

    private fun initializePlayer() {
        try {
            player = ExoPlayer.Builder(this).build()
            playerView.player = player
            playerView.resizeMode = currentAspectRatioMode
            player?.addListener(object : Player.Listener {
                override fun onPlaybackStateChanged(playbackState: Int) {
                    if (playbackState == Player.STATE_ENDED) {
                        clearVodResumeProgress()
                    }
                }
            })
        } catch (e: Exception) { e.printStackTrace() }
    }

    private fun setupNavRail() {
        findViewById<View>(R.id.navSearch)?.setOnClickListener { startActivity(Intent(this, SearchActivity::class.java)) }
        findViewById<View>(R.id.navTv)?.setOnClickListener {
            if (currentMode == ContentMode.LIVE_TV) {
                enterLiveGuideAtCurrentChannel()
            } else {
                switchMode(ContentMode.LIVE_TV)
            }
        }
        findViewById<View>(R.id.navMovies)?.setOnClickListener { switchMode(ContentMode.MOVIES) }
        findViewById<View>(R.id.navSeries)?.setOnClickListener { switchMode(ContentMode.SERIES) }
        findViewById<View>(R.id.navSettings)?.setOnClickListener { startActivity(Intent(this, SettingsActivity::class.java)) }
        findViewById<View>(R.id.navExit)?.setOnClickListener { finishAffinity() }
    }

    private fun setupDynamicTimeRuler() {
        renderDynamicTimeRuler()
        uiTickRunnable?.let { uiTickHandler.removeCallbacks(it) }
        uiTickRunnable = Runnable {
            renderDynamicTimeRuler()
            uiTickHandler.postDelayed(uiTickRunnable!!, 60_000L)
        }
        uiTickHandler.postDelayed(uiTickRunnable!!, 60_000L)
    }

    private fun renderDynamicTimeRuler() {
        timeRulerContainer.removeAllViews()
        val sdf = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val cal = Calendar.getInstance().apply {
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            val minute = get(Calendar.MINUTE)
            set(Calendar.MINUTE, if (minute < 30) 0 else 30)
        }
        repeat(8) {
            val tv = TextView(this).apply {
                layoutParams = LinearLayout.LayoutParams(150, ViewGroup.LayoutParams.WRAP_CONTENT)
                text = sdf.format(cal.time)
                setTextColor(resources.getColor(R.color.tivimate_text_primary, theme))
                gravity = android.view.Gravity.CENTER
                textSize = 10f
            }
            timeRulerContainer.addView(tv)
            cal.add(Calendar.MINUTE, 30)
        }
    }

    private fun switchMode(mode: ContentMode) {
        currentMode = mode
        saveCurrentMode(mode)
        fetchCategories(autoSelectFirst = true)
        updateUiState(UiState.CATEGORIES)
    }

    private fun fetchCategories(autoSelectFirst: Boolean = false, shouldScrollToActive: Boolean = false) {
        if (!isPlaylistEnabled()) {
            categoryAdapter.submitList(emptyList())
            return
        }
        val service = XtreamManager.getService() ?: return
        val call = when (currentMode) {
            ContentMode.LIVE_TV -> service.getLiveCategories(XtreamManager.username, XtreamManager.password)
            ContentMode.MOVIES -> service.getVodCategories(XtreamManager.username, XtreamManager.password)
            ContentMode.SERIES -> service.getSeriesCategories(XtreamManager.username, XtreamManager.password)
        }
        
        call.enqueue(object : Callback<List<XtreamCategory>> {
            override fun onResponse(call: Call<List<XtreamCategory>>, response: Response<List<XtreamCategory>>) {
                if (response.isSuccessful) {
                    val rawCategories = response.body() ?: emptyList()
                    cachedRawCategories = rawCategories
                    lifecycleScope.launch {
                        val hiddenIds = db.groupDao().getAllHidden().first().map { it.groupId }.toSet()
                        val savedOrder = db.groupOrderDao().getAllOrder().first().associateBy({ it.groupId }, { it.position })
                        
                        val filtered = rawCategories.filter { it.id !in hiddenIds }
                            .sortedWith(compareBy<XtreamCategory> { savedOrder[it.id] ?: Int.MAX_VALUE }.thenBy { it.name })
                            .toMutableList()

                        if (currentMode == ContentMode.LIVE_TV) {
                            filtered.add(0, XtreamCategory("favorites", "Favorites", 0))
                        } else if (currentMode == ContentMode.MOVIES) {
                            filtered.add(0, XtreamCategory(MY_LIST_MOVIES_ID, "My List", 0))
                        } else if (currentMode == ContentMode.SERIES) {
                            filtered.add(0, XtreamCategory(MY_LIST_SERIES_ID, "My List", 0))
                        }

                        categoryAdapter.submitList(filtered)

                        val restoreCategoryId = if (currentMode == ContentMode.LIVE_TV) {
                            resolveLiveCategoryId(currentChannel)
                                ?: getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE).getString("last_category_id", null)
                                ?: getLastCategoryIdForMode(currentMode)
                        } else {
                            getLastCategoryIdForMode(currentMode)
                        }
                        val restoredPos = filtered.indexOfFirst { it.id == restoreCategoryId }
                        lastCategoryPosition = when {
                            restoredPos != -1 -> restoredPos
                            lastCategoryPosition < filtered.size -> lastCategoryPosition
                            else -> 0
                        }
                        
                        if (shouldScrollToActive) {
                            rvCategories.post {
                                val idx = if (lastCategoryPosition < filtered.size) lastCategoryPosition else 0
                                centerRecyclerPosition(rvCategories, idx, 56)
                            }
                        }
                        
                        if (autoSelectFirst && filtered.isNotEmpty()) {
                            val idx = if (lastCategoryPosition in filtered.indices) lastCategoryPosition else 0
                            fetchContentForCategory(filtered[idx])
                        }
                    }
                }
            }
            override fun onFailure(call: Call<List<XtreamCategory>>, t: Throwable) {}
        })
    }

    private fun preloadAllStreams() {
        if (!isPlaylistEnabled()) return
        val service = XtreamManager.getService() ?: return
        service.getLiveStreams(XtreamManager.username, XtreamManager.password, null)
            .enqueue(object : Callback<List<XtreamLiveStream>> {
                override fun onResponse(call: Call<List<XtreamLiveStream>>, response: Response<List<XtreamLiveStream>>) {
                    if (response.isSuccessful) {
                        cachedLiveStreams = (response.body() ?: emptyList()).groupBy { it.categoryId ?: "" }
                        runOnUiThread { refreshRecentChannelsRow() }
                    }
                }
                override fun onFailure(call: Call<List<XtreamLiveStream>>, t: Throwable) {}
            })
        service.getVodStreams(XtreamManager.username, XtreamManager.password, null)
            .enqueue(object : Callback<List<XtreamVodStream>> {
                override fun onResponse(call: Call<List<XtreamVodStream>>, response: Response<List<XtreamVodStream>>) {
                    if (response.isSuccessful) {
                        cachedVodStreams = (response.body() ?: emptyList()).groupBy { it.categoryId ?: "" }
                    }
                }
                override fun onFailure(call: Call<List<XtreamVodStream>>, t: Throwable) {}
            })
        service.getSeries(XtreamManager.username, XtreamManager.password, null)
            .enqueue(object : Callback<List<XtreamSeries>> {
                override fun onResponse(call: Call<List<XtreamSeries>>, response: Response<List<XtreamSeries>>) {
                    if (response.isSuccessful) {
                        cachedSeries = (response.body() ?: emptyList()).groupBy { it.categoryId ?: "" }
                    }
                }
                override fun onFailure(call: Call<List<XtreamSeries>>, t: Throwable) {}
            })
    }

    private fun fetchContentForCategory(category: XtreamCategory) {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val lastChanId = prefs.getLong("last_channel_id", -1L)
        currentContentCall?.cancel()
        pendingEpgCalls.forEach { it.cancel() }
        pendingEpgCalls.clear()
        epgInFlightStreamIds.clear()
        epgQueuedStreamIds.clear()
        epgFetchQueue.clear()
        epgActiveFetchCount = 0

        if (category.id == "favorites") {
            lifecycleScope.launch {
                val favs = db.favoriteDao().getAll().first()
                val channels = favs.map { fav ->
                Channel(id = fav.streamId.toLong(), name = fav.name, group = fav.categoryId ?: "favorites", logoUrl = fav.streamIcon, streamUrl = "", epgId = fav.epgId)
                }
                if (rvContent.adapter != epgAdapter) {
                    rvContent.layoutManager = LinearLayoutManager(this@MainActivity)
                    rvContent.adapter = epgAdapter
                    rvContent.itemAnimator = null
                }
                currentLiveChannels = channels
                currentLiveCategoryId = category.id
                currentLiveChannelIndex = channels.indexOfFirst { it.id == currentChannel?.id }
                epgAdapter.setData(channels)
                hydrateEpgCacheFromDisk(channels)
                enqueueEpgForChannels(channels)
                refreshRecentChannelsRow()
            }
            return
        }

        if (category.id == "recent") {
            lifecycleScope.launch {
                val channels = buildRecentChannels()
                if (rvContent.adapter != epgAdapter) {
                    rvContent.layoutManager = LinearLayoutManager(this@MainActivity)
                    rvContent.adapter = epgAdapter
                    rvContent.itemAnimator = null
                }
                currentLiveChannels = channels
                currentLiveCategoryId = category.id
                currentLiveChannelIndex = channels.indexOfFirst { it.id == currentChannel?.id }
                epgAdapter.setData(channels)
                hydrateEpgCacheFromDisk(channels)
                enqueueEpgForChannels(channels)
                refreshRecentChannelsRow()
            }
            return
        }

        if (category.id == MY_LIST_MOVIES_ID) {
            val allMovies = cachedVodStreams?.values?.flatten().orEmpty().distinctBy { it.streamId }
            val ids = getMyListMovieIds()
            posterAdapter.submitList(allMovies.filter { it.streamId in ids })
            if (rvContent.adapter != posterAdapter) {
                rvContent.layoutManager = GridLayoutManager(this, calculatePosterSpanCount())
                rvContent.adapter = posterAdapter
            }
            centerRecyclerPosition(rvContent, 0, 220)
            return
        }

        if (category.id == MY_LIST_SERIES_ID) {
            val allSeries = cachedSeries?.values?.flatten().orEmpty().distinctBy { it.seriesId }
            val ids = getMyListSeriesIds()
            posterAdapter.submitList(allSeries.filter { it.seriesId in ids })
            if (rvContent.adapter != posterAdapter) {
                rvContent.layoutManager = GridLayoutManager(this, calculatePosterSpanCount())
                rvContent.adapter = posterAdapter
            }
            centerRecyclerPosition(rvContent, 0, 220)
            return
        }

        when (currentMode) {
            ContentMode.LIVE_TV -> {
                if (rvContent.adapter != epgAdapter) {
                    rvContent.layoutManager = LinearLayoutManager(this)
                    rvContent.adapter = epgAdapter
                    rvContent.itemAnimator = null
                }
                val cached = cachedLiveStreams?.get(category.id)
                if (cached != null) {
                    showLiveStreams(cached, category.id, prefs, lastChanId)
                } else {
                    val service = XtreamManager.getService() ?: return
                    val call = service.getLiveStreams(XtreamManager.username, XtreamManager.password, category.id)
                    currentContentCall = call
                    call.enqueue(object : Callback<List<XtreamLiveStream>> {
                        override fun onResponse(call: Call<List<XtreamLiveStream>>, response: Response<List<XtreamLiveStream>>) {
                            if (response.isSuccessful) {
                                val body = response.body() ?: emptyList()
                                val map = (cachedLiveStreams ?: emptyMap()).toMutableMap()
                                map[category.id] = body
                                cachedLiveStreams = map
                                showLiveStreams(body, category.id, prefs, lastChanId)
                            }
                        }
                        override fun onFailure(call: Call<List<XtreamLiveStream>>, t: Throwable) {}
                    })
                }
            }
            ContentMode.MOVIES -> {
                lastGridPosition = getLastGridPositionForMode(ContentMode.MOVIES)
                if (rvContent.adapter != posterAdapter) {
                    rvContent.layoutManager = GridLayoutManager(this, calculatePosterSpanCount())
                    rvContent.adapter = posterAdapter
                }
                val cached = cachedVodStreams?.get(category.id)
                if (cached != null) {
                    posterAdapter.submitList(cached)
                    centerRecyclerPosition(rvContent, lastGridPosition, 220)
                } else {
                    val service = XtreamManager.getService() ?: return
                    val call = service.getVodStreams(XtreamManager.username, XtreamManager.password, category.id)
                    currentContentCall = call
                    call.enqueue(object : Callback<List<XtreamVodStream>> {
                        override fun onResponse(call: Call<List<XtreamVodStream>>, response: Response<List<XtreamVodStream>>) {
                            if (response.isSuccessful) {
                                posterAdapter.submitList(response.body()?.toList() ?: emptyList())
                                centerRecyclerPosition(rvContent, lastGridPosition, 220)
                            }
                        }
                        override fun onFailure(call: Call<List<XtreamVodStream>>, t: Throwable) {}
                    })
                }
            }
            ContentMode.SERIES -> {
                lastGridPosition = getLastGridPositionForMode(ContentMode.SERIES)
                if (rvContent.adapter != posterAdapter) {
                    rvContent.layoutManager = GridLayoutManager(this, calculatePosterSpanCount())
                    rvContent.adapter = posterAdapter
                }
                val cached = cachedSeries?.get(category.id)
                if (cached != null) {
                    posterAdapter.submitList(cached)
                    centerRecyclerPosition(rvContent, lastGridPosition, 220)
                } else {
                    val service = XtreamManager.getService() ?: return
                    val call = service.getSeries(XtreamManager.username, XtreamManager.password, category.id)
                    currentContentCall = call
                    call.enqueue(object : Callback<List<XtreamSeries>> {
                        override fun onResponse(call: Call<List<XtreamSeries>>, response: Response<List<XtreamSeries>>) {
                            if (response.isSuccessful) {
                                posterAdapter.submitList(response.body()?.toList() ?: emptyList())
                                centerRecyclerPosition(rvContent, lastGridPosition, 220)
                            }
                        }
                        override fun onFailure(call: Call<List<XtreamSeries>>, t: Throwable) {}
                    })
                }
            }
        }
    }

    private fun showLiveStreams(streams: List<XtreamLiveStream>, categoryId: String, prefs: android.content.SharedPreferences, lastChanId: Long) {
        lifecycleScope.launch {
            val hiddenChannels = db.hiddenChannelDao().getAllHidden().first().map { it.channelId }.toSet()
            val channels = streams.filter { it.streamId.toLong() !in hiddenChannels }.map { stream ->
                Channel(
                    id = stream.streamId.toLong(),
                    name = stream.name,
                    group = categoryId,
                    logoUrl = stream.streamIcon,
                    streamUrl = "",
                    epgId = stream.epgId,
                    number = stream.num,
                    hasCatchup = supportsCatchup(stream)
                )
            }
            val sortedChannels = applyLiveChannelSort(channels, categoryId)
            currentLiveCategoryId = categoryId
            currentLiveChannels = sortedChannels
            currentLiveChannelIndex = sortedChannels.indexOfFirst { it.id == currentChannel?.id }
            epgAdapter.setData(sortedChannels)
            hydrateEpgCacheFromDisk(sortedChannels)
            // Paint cached EPG immediately so rows fill instantly while network refresh runs.
            sortedChannels.forEach { ch ->
                val cached = epgCacheByStreamId[ch.id.toInt()]
                if (!cached.isNullOrEmpty()) {
                    setEpgDataBuffered(ch.id.toInt(), cached)
                }
            }
            val playingIdx = sortedChannels.indexOfFirst { it.id == currentChannel?.id }
            val lastPlayedIdx = if (categoryId == prefs.getString("last_category_id", "")) {
                sortedChannels.indexOfFirst { it.id == lastChanId }
            } else {
                -1
            }
            val savedGroupRow = getLiveFocusedRowPositionForCategory(categoryId)
            val targetRow = when {
                playingIdx in sortedChannels.indices -> playingIdx
                lastPlayedIdx in sortedChannels.indices -> lastPlayedIdx
                savedGroupRow in sortedChannels.indices -> savedGroupRow
                else -> 0
            }
            epgAdapter.focusedRowPosition = targetRow
            lastGridPosition = targetRow
            saveLiveFocusedRowPosition(targetRow)
            saveLiveFocusedRowPositionForCategory(categoryId, targetRow)
            centerRecyclerPosition(rvContent, targetRow, 34)
            enqueueEpgForChannels(sortedChannels)
            prefetchAdjacentLiveGroups(categoryId)
            refreshRecentChannelsRow()
            maybeRunPendingEpgRefresh()
        }
    }

    private fun maybeRunPendingEpgRefresh() {
        if (!pendingEpgRefresh) return
        if (currentMode != ContentMode.LIVE_TV || currentLiveChannels.isEmpty()) return
        enqueueEpgForChannels(currentLiveChannels, forceRefresh = true)
        pendingEpgRefresh = false
        if (pendingEpgRefreshUserRequested) {
            Toast.makeText(this, "EPG updated", Toast.LENGTH_SHORT).show()
            pendingEpgRefreshUserRequested = false
        }
    }

    private suspend fun applyLiveChannelSort(channels: List<Channel>, categoryId: String): List<Channel> {
        val sortMode = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString("sort_mode", "Default")
            ?: "Default"
        return when (sortMode) {
            "Alphabetical" -> channels.sortedBy { it.name.lowercase(Locale.getDefault()) }
            "Numerical" -> channels.sortedWith(compareBy<Channel> { it.number ?: Int.MAX_VALUE }.thenBy { it.name.lowercase(Locale.getDefault()) })
            "Manual" -> {
                val orderMap = db.channelOrderDao().getOrderForGroup(categoryId).first()
                    .associateBy({ it.channelId }, { it.position })
                channels.sortedWith(compareBy<Channel> { orderMap[it.id] ?: Int.MAX_VALUE })
            }
            else -> channels
        }
    }

    private fun fetchRowEpg(channel: Channel, forceRefresh: Boolean = false) {
        val streamId = channel.id.toInt()
        if (!forceRefresh) {
            val cached = epgCacheByStreamId[streamId]
            if (!cached.isNullOrEmpty()) {
                epgAdapter.setEpgData(streamId, cached)
                return
            }
        }
        if (epgInFlightStreamIds.contains(streamId) || !epgQueuedStreamIds.add(streamId)) return
        epgFetchQueue.addLast(channel to forceRefresh)
        processEpgFetchQueue()
    }

    private fun enqueueEpgForChannels(channels: List<Channel>, forceRefresh: Boolean = false) {
        if (channels.isEmpty()) return
        val anchorIndex = channels.indexOfFirst { it.id == currentChannel?.id }
            .takeIf { it >= 0 }
            ?: epgAdapter.focusedRowPosition.takeIf { it in channels.indices }
            ?: 0
        val ordered = ArrayList<Channel>(channels.size)
        ordered.add(channels[anchorIndex])
        var delta = 1
        while (ordered.size < channels.size) {
            val down = anchorIndex + delta
            if (down < channels.size) ordered.add(channels[down])
            val up = anchorIndex - delta
            if (up >= 0) ordered.add(channels[up])
            delta++
        }
        ordered.forEach { fetchRowEpg(it, forceRefresh) }
    }

    private fun processEpgFetchQueue() {
        while (epgActiveFetchCount < maxConcurrentEpgFetches && epgFetchQueue.isNotEmpty()) {
            val (channel, forceRefresh) = epgFetchQueue.removeFirst()
            val streamId = channel.id.toInt()
            epgQueuedStreamIds.remove(streamId)
            if (epgInFlightStreamIds.contains(streamId)) continue
            if (!forceRefresh) {
                val cached = epgCacheByStreamId[streamId]
                if (!cached.isNullOrEmpty()) {
                    setEpgDataBuffered(streamId, cached)
                    continue
                }
            }
            if (!epgInFlightStreamIds.add(streamId)) continue
        val service = XtreamManager.getService() ?: run {
            epgInFlightStreamIds.remove(streamId)
                continue
        }
            epgActiveFetchCount++
        val call = service.getShortEpg(
            XtreamManager.username,
            XtreamManager.password,
            streamId,
            getEpgLimitFromDaysSetting()
        )
        pendingEpgCalls.add(call)
        call.enqueue(object : Callback<XtreamEpgResponse> {
            override fun onResponse(call: Call<XtreamEpgResponse>, response: Response<XtreamEpgResponse>) {
                pendingEpgCalls.remove(call)
                epgInFlightStreamIds.remove(streamId)
                epgActiveFetchCount = (epgActiveFetchCount - 1).coerceAtLeast(0)
                processEpgFetchQueue()
                if (!response.isSuccessful) return
                val primary = response.body()?.listings.orEmpty()
                lifecycleScope.launch {
                    val merged = applySecondaryEpgFallback(channel, primary)
                    cacheEpg(streamId, merged)
                    setEpgDataBuffered(streamId, merged)
                }
            }
            override fun onFailure(call: Call<XtreamEpgResponse>, t: Throwable) {
                pendingEpgCalls.remove(call)
                epgInFlightStreamIds.remove(streamId)
                epgActiveFetchCount = (epgActiveFetchCount - 1).coerceAtLeast(0)
                processEpgFetchQueue()
                lifecycleScope.launch {
                    val merged = applySecondaryEpgFallback(channel, emptyList())
                    if (merged.isNotEmpty()) {
                        cacheEpg(streamId, merged)
                        setEpgDataBuffered(streamId, merged)
                    }
                }
            }
        })
        }
    }

    private fun setEpgDataBuffered(streamId: Int, listings: List<XtreamEpgListing>) {
        val now = System.currentTimeMillis()
        val shouldDefer = currentMode == ContentMode.LIVE_TV &&
            currentState == UiState.EPG_GRID &&
            (isRvContentScrolling || now < epgUiSuppressUntilMs)
        if (!shouldDefer) {
            epgAdapter.setEpgData(streamId, listings)
            return
        }
        pendingEpgUiUpdates[streamId] = listings
        schedulePendingEpgUiFlush()
    }

    private fun schedulePendingEpgUiFlush() {
        epgUiFlushRunnable?.let { epgUiUpdateHandler.removeCallbacks(it) }
        epgUiFlushRunnable = Runnable {
            val now = System.currentTimeMillis()
            if (isRvContentScrolling || now < epgUiSuppressUntilMs) {
                schedulePendingEpgUiFlush()
                return@Runnable
            }
            flushPendingEpgUiUpdates()
        }
        epgUiUpdateHandler.postDelayed(epgUiFlushRunnable!!, 120L)
    }

    private fun flushPendingEpgUiUpdates() {
        if (pendingEpgUiUpdates.isEmpty()) return
        val snapshot = pendingEpgUiUpdates.toMap()
        pendingEpgUiUpdates.clear()
        snapshot.forEach { (streamId, listings) ->
            epgAdapter.setEpgData(streamId, listings)
        }
    }

    private fun suppressEpgUiUpdatesTemporarily() {
        epgUiSuppressUntilMs = System.currentTimeMillis() + epgUiSuppressDuringNavMs
        if (pendingEpgUiUpdates.isNotEmpty()) {
            schedulePendingEpgUiFlush()
        }
    }

    private fun cacheEpg(streamId: Int, listings: List<XtreamEpgListing>) {
        epgCacheByStreamId[streamId] = listings
        val now = System.currentTimeMillis()
        lifecycleScope.launch(Dispatchers.IO) {
            db.epgCacheDao().upsert(
                EpgCacheEntry(
                    streamId = streamId,
                    listingsJson = gson.toJson(listings),
                    updatedAtMs = now
                )
            )
        }
        if (epgCacheByStreamId.size <= maxEpgCacheEntries) return
        val removeCount = epgCacheByStreamId.size - maxEpgCacheEntries
        repeat(removeCount.coerceAtLeast(0)) {
            val firstKey = epgCacheByStreamId.entries.firstOrNull()?.key ?: return
            epgCacheByStreamId.remove(firstKey)
        }
    }

    private suspend fun hydrateEpgCacheFromDisk(channels: List<Channel>) {
        if (channels.isEmpty()) return
        val now = System.currentTimeMillis()
        val cutoff = now - epgDiskCacheTtlMs
        val ids = channels.map { it.id.toInt() }.distinct()
        val entries = withContext(Dispatchers.IO) {
            db.epgCacheDao().deleteOlderThan(cutoff)
            db.epgCacheDao().getByStreamIds(ids)
        }
        entries.forEach { entry ->
            if (entry.updatedAtMs < cutoff) return@forEach
            val parsed = parseEpgListingsJson(entry.listingsJson)
            if (parsed.isNotEmpty()) {
                epgCacheByStreamId[entry.streamId] = parsed
                setEpgDataBuffered(entry.streamId, parsed)
            }
        }
    }

    private fun parseEpgListingsJson(raw: String): List<XtreamEpgListing> {
        return runCatching {
            gson.fromJson(raw, Array<XtreamEpgListing>::class.java)?.toList().orEmpty()
        }.getOrDefault(emptyList())
    }

    private fun prefetchAdjacentLiveGroups(centerCategoryId: String) {
        if (currentMode != ContentMode.LIVE_TV) return
        if (centerCategoryId == "favorites" || centerCategoryId == "recent") return
        val center = categoryAdapter.findPositionById(centerCategoryId)
        if (center == -1) return
        listOf(center - 1, center + 1).forEach { idx ->
            val cat = categoryAdapter.getItemAt(idx) ?: return@forEach
            if (cat.id == "favorites" || cat.id == "recent") return@forEach
            prefetchLiveCategory(cat.id)
        }
    }

    private fun prefetchLiveCategory(categoryId: String) {
        if (cachedLiveStreams?.containsKey(categoryId) == true) return
        if (!liveStreamsPrefetchInFlight.add(categoryId)) return
        val service = XtreamManager.getService() ?: run {
            liveStreamsPrefetchInFlight.remove(categoryId)
            return
        }
        service.getLiveStreams(XtreamManager.username, XtreamManager.password, categoryId)
            .enqueue(object : Callback<List<XtreamLiveStream>> {
                override fun onResponse(call: Call<List<XtreamLiveStream>>, response: Response<List<XtreamLiveStream>>) {
                    liveStreamsPrefetchInFlight.remove(categoryId)
                    if (!response.isSuccessful) return
                    val body = response.body() ?: emptyList()
                    val map = (cachedLiveStreams ?: emptyMap()).toMutableMap()
                    map[categoryId] = body
                    cachedLiveStreams = map
                }

                override fun onFailure(call: Call<List<XtreamLiveStream>>, t: Throwable) {
                    liveStreamsPrefetchInFlight.remove(categoryId)
                }
            })
    }

    private suspend fun applySecondaryEpgFallback(channel: Channel, primary: List<XtreamEpgListing>): List<XtreamEpgListing> {
        if (!getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE).getBoolean(KEY_SECONDARY_EPG_ENABLED, false)) {
            return primary
        }
        val epgId = channel.epgId?.takeIf { it.isNotBlank() } ?: return primary
        val secondary = SecondaryEpgProvider.getListingsForChannel(this, epgId)
        if (secondary.isEmpty()) return primary
        if (primary.isEmpty()) return secondary
        return mergeNoInfoListings(primary, secondary)
    }

    private fun mergeNoInfoListings(primary: List<XtreamEpgListing>, secondary: List<XtreamEpgListing>): List<XtreamEpgListing> {
        return primary.map { entry ->
            val title = DataUtils.decodeBase64(entry.title).trim()
            val isNoInfo = title.isEmpty() || title.equals("No Information", ignoreCase = true)
            if (!isNoInfo) return@map entry
            val replacement = findOverlappingListing(entry, secondary) ?: return@map entry
            entry.copy(
                title = replacement.title,
                description = replacement.description
            )
        }
    }

    private fun findOverlappingListing(target: XtreamEpgListing, candidates: List<XtreamEpgListing>): XtreamEpgListing? {
        val midpoint = (target.startTimestamp + target.stopTimestamp) / 2L
        return candidates.firstOrNull { midpoint >= it.startTimestamp && midpoint < it.stopTimestamp }
    }

    private fun getEpgLimitFromDaysSetting(): Int {
        val idx = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getInt(KEY_EPG_DAYS, 2)
            .coerceIn(0, 2)
        // Approximate half-hour blocks per day; request enough entries for selected range.
        return when (idx) {
            0 -> 48
            1 -> 96
            else -> 144
        }
    }

    private fun handleVodClick(item: Any) {
        when (item) {
            is XtreamVodStream -> {
                val ext = item.containerExtension ?: "mp4"
                val url = "${XtreamManager.baseUrl}/movie/${XtreamManager.username}/${XtreamManager.password}/${item.streamId}.$ext"
                playVodWithResume(url, item.name, movieResumeKey(item.streamId))
            }
            is XtreamSeries -> {
                val intent = Intent(this, SeriesDetailsActivity::class.java).apply {
                    putExtra("series_id", item.seriesId); putExtra("series_name", item.name); putExtra("series_cover", item.cover)
                }
                startActivity(intent)
            }
        }
    }

    private fun showVodOptions(item: Any) {
        val inMyList = isInMyList(item)
        val toggleLabel = if (inMyList) "Remove from My List" else "Add to My List"
        AlertDialog.Builder(this)
            .setTitle(
                when (item) {
                    is XtreamVodStream -> item.name
                    is XtreamSeries -> item.name
                    else -> "Options"
                }
            )
            .setItems(arrayOf(toggleLabel)) { _, _ ->
                toggleMyList(item)
            }
            .show()
    }

    private fun toggleMyList(item: Any) {
        when (item) {
            is XtreamVodStream -> {
                val ids = getMyListMovieIds().toMutableSet()
                val added = if (ids.contains(item.streamId)) {
                    ids.remove(item.streamId)
                    false
                } else {
                    ids.add(item.streamId)
                    true
                }
                saveMyListMovieIds(ids)
                Toast.makeText(this, if (added) "Added to My List" else "Removed from My List", Toast.LENGTH_SHORT).show()
                refreshMyListIfActive()
            }
            is XtreamSeries -> {
                val ids = getMyListSeriesIds().toMutableSet()
                val added = if (ids.contains(item.seriesId)) {
                    ids.remove(item.seriesId)
                    false
                } else {
                    ids.add(item.seriesId)
                    true
                }
                saveMyListSeriesIds(ids)
                Toast.makeText(this, if (added) "Added to My List" else "Removed from My List", Toast.LENGTH_SHORT).show()
                refreshMyListIfActive()
            }
        }
    }

    private fun isInMyList(item: Any): Boolean {
        return when (item) {
            is XtreamVodStream -> item.streamId in getMyListMovieIds()
            is XtreamSeries -> item.seriesId in getMyListSeriesIds()
            else -> false
        }
    }

    private fun refreshMyListIfActive() {
        val currentCat = categoryAdapter.getItemAt(lastCategoryPosition) ?: return
        if ((currentMode == ContentMode.MOVIES && currentCat.id == MY_LIST_MOVIES_ID) ||
            (currentMode == ContentMode.SERIES && currentCat.id == MY_LIST_SERIES_ID)
        ) {
            fetchContentForCategory(currentCat)
        }
    }

    private fun getMyListMovieIds(): Set<Int> {
        val raw = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_MY_LIST_MOVIES, "")
            .orEmpty()
        if (raw.isBlank()) return emptySet()
        return raw.split(",").mapNotNull { it.toIntOrNull() }.toSet()
    }

    private fun saveMyListMovieIds(ids: Set<Int>) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_MY_LIST_MOVIES, ids.sorted().joinToString(","))
            .apply()
    }

    private fun getMyListSeriesIds(): Set<Int> {
        val raw = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_MY_LIST_SERIES, "")
            .orEmpty()
        if (raw.isBlank()) return emptySet()
        return raw.split(",").mapNotNull { it.toIntOrNull() }.toSet()
    }

    private fun saveMyListSeriesIds(ids: Set<Int>) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_MY_LIST_SERIES, ids.sorted().joinToString(","))
            .apply()
    }

    private fun updateVodInfo(item: Any) {
        tvProgramTitleLarge.text = ""
        tvProgramDescription.text = "Loading details..."
        tvProgramTimeRange.text = ""
        tvProgramDuration.text = ""
        
        val service = XtreamManager.getService() ?: return
        
        when (item) {
            is XtreamVodStream -> {
                tvProgramTitleLarge.text = item.name
                findViewById<ImageView>(R.id.ivFavoriteStar)?.let { Glide.with(this).load(item.streamIcon).into(it) }
                
                service.getVodInfo(XtreamManager.username, XtreamManager.password, item.streamId)
                    .enqueue(object : Callback<XtreamVodInfoResponse> {
                        override fun onResponse(call: Call<XtreamVodInfoResponse>, response: Response<XtreamVodInfoResponse>) {
                            if (response.isSuccessful) {
                                val info = response.body()?.info
                                tvProgramDescription.text = info?.plot ?: "No plot available"
                                tvProgramTimeRange.text = "Released: ${info?.releaseDate ?: "N/A"}"
                                tvProgramDuration.text = "${info?.duration ?: "N/A"} | Rating: ${info?.rating ?: "N/A"}"
                            }
                        }
                        override fun onFailure(call: Call<XtreamVodInfoResponse>, t: Throwable) {
                            tvProgramDescription.text = "Movie"
                        }
                    })
            }
            is XtreamSeries -> {
                tvProgramTitleLarge.text = item.name
                findViewById<ImageView>(R.id.ivFavoriteStar)?.let { Glide.with(this).load(item.cover).into(it) }
                
                service.getSeriesInfo(XtreamManager.username, XtreamManager.password, item.seriesId)
                    .enqueue(object : Callback<XtreamSeriesInfoResponse> {
                        override fun onResponse(call: Call<XtreamSeriesInfoResponse>, response: Response<XtreamSeriesInfoResponse>) {
                            if (response.isSuccessful) {
                                val info = response.body()?.info
                                tvProgramDescription.text = info?.plot ?: "No plot available"
                                tvProgramTimeRange.text = "Released: ${info?.releaseDate ?: "N/A"}"
                                tvProgramDuration.text = "Rating: ${info?.rating ?: "N/A"}"
                            }
                        }
                        override fun onFailure(call: Call<XtreamSeriesInfoResponse>, t: Throwable) {
                            tvProgramDescription.text = "Series"
                        }
                    })
            }
        }
    }

    private fun playMedia(url: String, title: String) {
        saveVodResumeProgress()
        currentVodResumeKey = null
        tvProgramTitleLarge.text = title
        try {
            player?.setMediaItem(MediaItem.fromUri(url))
            player?.prepare(); player?.play()
            updateUiState(UiState.FULL_SCREEN)
        } catch (e: Exception) { e.printStackTrace() }
    }

    private fun playVodWithResume(url: String, title: String, resumeKey: String) {
        val savedMs = getVodResumeMs(resumeKey)
        if (savedMs < 10_000L) {
            startVodPlayback(url, title, resumeKey, 0L)
            return
        }
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage("Resume from ${formatPosition(savedMs)}?")
            .setPositiveButton("Resume") { _, _ ->
                startVodPlayback(url, title, resumeKey, savedMs)
            }
            .setNegativeButton("Start over") { _, _ ->
                clearVodResumeByKey(resumeKey)
                startVodPlayback(url, title, resumeKey, 0L)
            }
            .show()
    }

    private fun startVodPlayback(url: String, title: String, resumeKey: String, startPositionMs: Long) {
        saveVodResumeProgress()
        currentChannel = null
        currentVodResumeKey = resumeKey
        tvProgramTitleLarge.text = title
        try {
            player?.setMediaItem(MediaItem.fromUri(url))
            player?.prepare()
            if (startPositionMs > 0L) player?.seekTo(startPositionMs)
            player?.play()
            updateUiState(UiState.FULL_SCREEN)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun saveVodResumeProgress() {
        val key = currentVodResumeKey ?: return
        val pos = player?.currentPosition ?: 0L
        val duration = player?.duration ?: 0L
        if (duration > 0L && pos >= duration - 30_000L) {
            clearVodResumeByKey(key)
            return
        }
        if (pos < 10_000L) return
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        prefs.edit().putLong(vodResumePrefsKey(key), pos).apply()
    }

    private fun clearVodResumeProgress() {
        val key = currentVodResumeKey ?: return
        clearVodResumeByKey(key)
    }

    private fun clearVodResumeByKey(key: String) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .remove(vodResumePrefsKey(key))
            .apply()
    }

    private fun getVodResumeMs(key: String): Long {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getLong(vodResumePrefsKey(key), 0L)
            .coerceAtLeast(0L)
    }

    private fun vodResumePrefsKey(key: String): String = "vod_resume_$key"

    private fun movieResumeKey(streamId: Int): String = "movie_$streamId"

    private fun formatPosition(ms: Long): String {
        val totalSec = (ms / 1000L).coerceAtLeast(0L)
        val hours = totalSec / 3600
        val minutes = (totalSec % 3600) / 60
        val seconds = totalSec % 60
        return if (hours > 0) {
            String.format(Locale.getDefault(), "%d:%02d:%02d", hours, minutes, seconds)
        } else {
            String.format(Locale.getDefault(), "%02d:%02d", minutes, seconds)
        }
    }

    private fun handleExternalPlaybackIntent(intent: Intent?): Boolean {
        val playUrl = intent?.getStringExtra("play_url")?.trim().orEmpty()
        if (playUrl.isBlank()) return false
        val title = intent?.getStringExtra("media_title")?.takeIf { it.isNotBlank() } ?: "Playback"
        val resumeKey = intent?.getStringExtra("resume_key")?.takeIf { it.isNotBlank() }
            ?: "ext_${playUrl.hashCode()}"
        playVodWithResume(playUrl, title, resumeKey)
        return true
    }

    private fun updateUiState(newState: UiState) {
        currentState = newState
        saveCurrentUiState(newState)
        if (newState != UiState.FULL_SCREEN) {
            miniInfoRunnable?.let { miniInfoHandler.removeCallbacks(it) }
            mainContentArea.visibility = View.VISIBLE
            pbProgramProgress?.visibility = View.VISIBLE
            zapBar.visibility = View.GONE
        }
        when (newState) {
            UiState.FULL_SCREEN -> {
                movePlayerToContainer(playerContainer)
                epgOverlay.visibility = View.GONE
                rvRecentChannels.visibility = View.GONE
            }
            UiState.EPG_GRID -> {
                movePlayerToContainer(videoPreviewBox)
                epgOverlay.visibility = View.VISIBLE
                navRail.visibility = View.GONE
                rvCategories.visibility = View.GONE
                rvContent.visibility = View.VISIBLE
                hsvTimeRuler.clearFocus()
                timeRulerContainer.clearFocus()
                updateRecentChannelsVisibility()
                rvCategories.descendantFocusability = ViewGroup.FOCUS_BLOCK_DESCENDANTS
                rvContent.descendantFocusability = ViewGroup.FOCUS_AFTER_DESCENDANTS
                
                rvContent.postDelayed({
                    if (currentMode == ContentMode.LIVE_TV) {
                        val targetPos = resolveFocusedEpgRowPosition()
                        focusEpgRowAt(targetPos)
                    } else {
                        val vh = rvContent.findViewHolderForAdapterPosition(lastGridPosition)
                        vh?.itemView?.requestFocus() ?: rvContent.requestFocus()
                    }
                }, 100)
            }
            UiState.CATEGORIES -> {
                movePlayerToContainer(videoPreviewBox)
                epgOverlay.visibility = View.VISIBLE
                navRail.visibility = View.GONE
                rvCategories.visibility = View.VISIBLE
                rvContent.visibility = View.VISIBLE
                updateRecentChannelsVisibility()
                rvCategories.descendantFocusability = ViewGroup.FOCUS_AFTER_DESCENDANTS
                rvContent.descendantFocusability = ViewGroup.FOCUS_BLOCK_DESCENDANTS
                alignLiveCategorySelectionToPlayback()
                
                epgAdapter.focusedRowPosition = RecyclerView.NO_POSITION
                rvCategories.post {
                    centerRecyclerPosition(rvCategories, lastCategoryPosition, 56)
                    rvCategories.post {
                        rvCategories.findViewHolderForAdapterPosition(lastCategoryPosition)?.itemView?.requestFocus()
                            ?: rvCategories.requestFocus()
                    }
                }
            }
            UiState.NAV_RAIL -> {
                movePlayerToContainer(videoPreviewBox)
                epgOverlay.visibility = View.VISIBLE
                navRail.visibility = View.VISIBLE
                rvCategories.visibility = View.VISIBLE
                rvContent.visibility = View.VISIBLE
                updateRecentChannelsVisibility()
                val focusTarget = if (isTvUiMode()) R.id.navTv else R.id.navSettings
                navRail.findViewById<View>(focusTarget)?.requestFocus()
            }
        }
    }

    private fun movePlayerToContainer(newContainer: ViewGroup) {
        val parent = playerView.parent as? ViewGroup
        if (parent != newContainer) {
            parent?.removeView(playerView)
            newContainer.addView(playerView)
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_GUIDE -> {
                when (currentState) {
                    UiState.FULL_SCREEN -> updateUiState(UiState.EPG_GRID)
                    UiState.EPG_GRID, UiState.CATEGORIES, UiState.NAV_RAIL -> updateUiState(UiState.FULL_SCREEN)
                }
                return true
            }
            KeyEvent.KEYCODE_CHANNEL_UP, KeyEvent.KEYCODE_PAGE_UP -> {
                if (zapChannel(next = true)) return true
            }
            KeyEvent.KEYCODE_CHANNEL_DOWN, KeyEvent.KEYCODE_PAGE_DOWN -> {
                if (zapChannel(next = false)) return true
            }
            KeyEvent.KEYCODE_MENU -> {
                if (currentMode == ContentMode.LIVE_TV) {
                    showQuickPanel()
                    return true
                }
            }
            KeyEvent.KEYCODE_MEDIA_PREVIOUS -> {
                if (playPreviousChannel()) return true
            }
            KeyEvent.KEYCODE_INFO, KeyEvent.KEYCODE_MEDIA_AUDIO_TRACK -> {
                cycleAspectRatio()
                return true
            }
            KeyEvent.KEYCODE_BACK -> {
                if (handleBackNavigation()) return true
            }
            KeyEvent.KEYCODE_DPAD_LEFT -> {
                if (currentState == UiState.EPG_GRID) {
                    if (currentMode == ContentMode.LIVE_TV) {
                        val focused = currentFocus
                        val canMoveLeftInRow = focused?.let { current ->
                            val nextLeft = current.focusSearch(View.FOCUS_LEFT)
                            nextLeft != null && nextLeft !== current &&
                                rvContent.findContainingItemView(nextLeft) == rvContent.findContainingItemView(current)
                        } == true
                        if (canMoveLeftInRow) {
                            return false
                        }
                        persistCurrentLiveFocusedRowForCurrentCategory()
                        updateUiState(UiState.CATEGORIES)
                        return true
                    } else {
                        val focused = currentFocus ?: return false
                        val view = rvContent.findContainingItemView(focused) ?: return false
                        val pos = rvContent.getChildAdapterPosition(view)
                        if (pos != RecyclerView.NO_POSITION && pos % 10 == 0) {
                            updateUiState(UiState.CATEGORIES); return true
                        }
                    }
                } else if (currentState == UiState.CATEGORIES) {
                    updateUiState(UiState.NAV_RAIL); return true
                }
            }
            KeyEvent.KEYCODE_DPAD_RIGHT -> {
                if (currentState == UiState.NAV_RAIL) {
                    alignLiveCategorySelectionToPlayback()
                    returnToPlayingChannelOnNextGridOpen = (currentMode == ContentMode.LIVE_TV)
                    updateUiState(UiState.CATEGORIES)
                    return true
                }
                if (currentState == UiState.CATEGORIES) {
                    if (currentMode == ContentMode.LIVE_TV && shouldOpenPlayingChannelFromCategories()) {
                        enterLiveGuideAtCurrentChannel()
                    } else {
                        loadFocusedCategoryIfApplicable()
                        if (currentMode == ContentMode.LIVE_TV) {
                            restoreLiveFocusForSelectedCategory()
                        }
                        updateUiState(UiState.EPG_GRID)
                    }
                    returnToPlayingChannelOnNextGridOpen = false
                    return true
                }
            }
            KeyEvent.KEYCODE_DPAD_DOWN -> {
                if (currentState == UiState.EPG_GRID) {
                    if (currentMode == ContentMode.LIVE_TV) {
                        suppressEpgUiUpdatesTemporarily()
                        if (moveEpgFocus(true)) return true
                    }
                } else {
                    if (handleDpadWrapping(true)) return true
                    if (currentState == UiState.CATEGORIES) returnToPlayingChannelOnNextGridOpen = false
                    rvCategories.post { loadFocusedCategoryIfApplicable() }
                }
            }
            KeyEvent.KEYCODE_DPAD_UP -> {
                if (currentState == UiState.EPG_GRID) {
                    if (currentMode == ContentMode.LIVE_TV) {
                        suppressEpgUiUpdatesTemporarily()
                        if (moveEpgFocus(false)) return true
                    }
                } else {
                    if (handleDpadWrapping(false)) return true
                    if (currentState == UiState.CATEGORIES) returnToPlayingChannelOnNextGridOpen = false
                    rvCategories.post { loadFocusedCategoryIfApplicable() }
                }
            }
            KeyEvent.KEYCODE_DPAD_CENTER, KeyEvent.KEYCODE_ENTER -> {
                if (currentState == UiState.FULL_SCREEN) {
                    if (currentMode == ContentMode.LIVE_TV) {
                        enterLiveGuideAtCurrentChannel()
                    } else {
                        updateUiState(UiState.EPG_GRID)
                    }
                    return true
                }
                if (currentState == UiState.CATEGORIES) {
                    loadFocusedCategoryIfApplicable()
                    if (currentMode == ContentMode.LIVE_TV) {
                        restoreLiveFocusForSelectedCategory()
                    }
                    updateUiState(UiState.EPG_GRID)
                    return true
                }
            }
        }
        return super.onKeyDown(keyCode, event)
    }

    private fun setupBackNavigationDispatcher() {
        onBackPressedDispatcher.addCallback(this, object : OnBackPressedCallback(true) {
            override fun handleOnBackPressed() {
                if (!handleBackNavigation()) {
                    isEnabled = false
                    onBackPressedDispatcher.onBackPressed()
                    isEnabled = true
                }
            }
        })
    }

    private fun handleBackNavigation(): Boolean {
        if (isChannelVisibilityEditMode) {
            applyAndExitChannelVisibilityEditMode()
            return true
        }

        if (isTvUiMode()) {
            val now = System.currentTimeMillis()
            if (currentMode == ContentMode.LIVE_TV &&
                now - lastBackPressTs <= doubleBackWindowMs &&
                playPreviousChannel()
            ) {
                lastBackPressTs = 0L
                return true
            }
            lastBackPressTs = now
            when (currentState) {
                UiState.NAV_RAIL -> updateUiState(UiState.FULL_SCREEN)
                UiState.CATEGORIES -> updateUiState(UiState.NAV_RAIL)
                UiState.EPG_GRID -> {
                    persistCurrentLiveFocusedRowForCurrentCategory()
                    updateUiState(UiState.CATEGORIES)
                }
                UiState.FULL_SCREEN -> enterLiveGuideAtCurrentChannel()
            }
            return true
        }

        // Phone/tablet back flow: Full screen -> Groups -> Nav rail (Settings) -> Groups
        when (currentState) {
            UiState.FULL_SCREEN -> updateUiState(UiState.CATEGORIES)
            UiState.EPG_GRID -> {
                persistCurrentLiveFocusedRowForCurrentCategory()
                updateUiState(UiState.CATEGORIES)
            }
            UiState.CATEGORIES -> updateUiState(UiState.NAV_RAIL)
            UiState.NAV_RAIL -> updateUiState(UiState.CATEGORIES)
        }
        return true
    }

    override fun onKeyLongPress(keyCode: Int, event: KeyEvent?): Boolean {
        if (currentMode == ContentMode.LIVE_TV &&
            (keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER)
        ) {
            when (currentState) {
                UiState.FULL_SCREEN -> {
                    val channel = currentChannel
                    if (channel != null) {
                        showChannelOptions(channel)
                        return true
                    }
                }
                UiState.EPG_GRID -> {
                    val channel = getFocusedEpgChannel()
                    if (channel != null) {
                        showChannelOptions(channel)
                        return true
                    }
                }
                else -> Unit
            }
        }
        if ((currentMode == ContentMode.MOVIES || currentMode == ContentMode.SERIES) &&
            currentState == UiState.EPG_GRID &&
            (keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER)
        ) {
            val item = getFocusedPosterItem()
            if (item != null) {
                showVodOptions(item)
                return true
            }
        }
        return super.onKeyLongPress(keyCode, event)
    }

    private fun getFocusedPosterItem(): Any? {
        val focused = currentFocus ?: return null
        val rowView = rvContent.findContainingItemView(focused) ?: return null
        val pos = rvContent.getChildAdapterPosition(rowView)
        if (pos == RecyclerView.NO_POSITION) return null
        return posterAdapter.getItemAt(pos)
    }

    private fun getFocusedEpgChannel(): Channel? {
        val focused = currentFocus ?: return null
        val rowView = rvContent.findContainingItemView(focused) ?: return null
        val pos = rvContent.getChildAdapterPosition(rowView)
        if (pos == RecyclerView.NO_POSITION) return null
        return epgAdapter.getChannelAt(pos)
    }

    private fun handleDpadWrapping(isDown: Boolean): Boolean {
        val focused = currentFocus ?: return false
        val rv = when (currentState) {
            UiState.CATEGORIES -> rvCategories
            UiState.EPG_GRID -> rvContent
            else -> return false
        }
        val viewInRv = rv.findContainingItemView(focused) ?: return false
        val currentPos = rv.getChildAdapterPosition(viewInRv)
        if (currentPos == RecyclerView.NO_POSITION) return false
        val adapter = rv.adapter ?: return false
        if (isDown && currentPos == adapter.itemCount - 1) { centerRecyclerPosition(rv, 0, 56); return true }
        else if (!isDown && currentPos == 0) { centerRecyclerPosition(rv, adapter.itemCount - 1, 56); return true }
        return false
    }

    private fun moveEpgFocus(isDown: Boolean): Boolean {
        val itemCount = epgAdapter.itemCount
        if (itemCount == 0) return false

        val currentPos = resolveFocusedEpgRowPosition()
        val targetPos = if (isDown) {
            if (currentPos >= itemCount - 1) 0 else currentPos + 1
        } else {
            if (currentPos <= 0) itemCount - 1 else currentPos - 1
        }

        focusEpgRowAt(targetPos)
        return true
    }

    private fun resolveFocusedEpgRowPosition(): Int {
        val focused = currentFocus
        if (focused != null) {
            val rowView = rvContent.findContainingItemView(focused)
            if (rowView != null) {
                val pos = rvContent.getChildAdapterPosition(rowView)
                if (pos != RecyclerView.NO_POSITION) return pos
            }
        }
        val fromAdapter = epgAdapter.focusedRowPosition
        if (fromAdapter != RecyclerView.NO_POSITION) return fromAdapter.coerceAtLeast(0)
        return getLiveFocusedRowPosition()
    }

    private fun focusEpgRowAt(position: Int, attempt: Int = 0, requestToken: Int = -1) {
        val token = if (requestToken == -1) {
            ++epgFocusRequestToken
        } else {
            requestToken
        }
        val itemCount = epgAdapter.itemCount
        if (itemCount == 0) return
        val targetPos = position.coerceIn(0, itemCount - 1)
        epgAdapter.focusedRowPosition = targetPos
        lastGridPosition = targetPos
        saveLiveFocusedRowPosition(targetPos)
        currentLiveCategoryId?.takeIf { it.isNotBlank() }?.let { categoryId ->
            saveLiveFocusedRowPositionForCategory(categoryId, targetPos)
        }

        // Scroll and focus in ONE post to avoid focus jumping between two separate async calls
        rvContent.post {
            if (token != epgFocusRequestToken) return@post
            val lm = rvContent.layoutManager as? LinearLayoutManager
            if (lm != null) {
                val itemHeight = rvContent.findViewHolderForAdapterPosition(targetPos)?.itemView?.height
                    ?: rvContent.getChildAt(0)?.height
                    ?: 34
                val offset = ((rvContent.height - itemHeight) / 2).coerceAtLeast(0)
                lm.scrollToPositionWithOffset(targetPos, offset)
            }
            val holder = rvContent.findViewHolderForAdapterPosition(targetPos) as? EpgRowAdapter.VH
            if (holder == null) {
                if (attempt < 6) {
                    rvContent.postDelayed({
                        if (token == epgFocusRequestToken) {
                            focusEpgRowAt(targetPos, attempt + 1, token)
                        }
                    }, 50)
                }
                return@post
            }
            val timelineX = epgScrollSync.getCurrentX()
            val timelineIndex = findProgramIndexForTimelineX(holder.container, timelineX)
            val focusTarget = holder.container.getChildAt(timelineIndex)
                ?: holder.container.getChildAt(0)
                ?: holder.itemView
            if (token == epgFocusRequestToken) {
                focusTarget.requestFocus()
            }
        }
    }

    private fun findProgramIndexForTimelineX(container: LinearLayout, timelineX: Int): Int {
        val childCount = container.childCount
        if (childCount <= 0) return 0
        val anchorX = (timelineX + 24).coerceAtLeast(0)
        for (i in 0 until childCount) {
            val child = container.getChildAt(i) ?: continue
            if (anchorX < child.right) return i
        }
        return childCount - 1
    }

    private fun centerRecyclerPosition(rv: RecyclerView, position: Int, defaultItemHeightPx: Int) {
        rv.post {
            val adapter = rv.adapter ?: return@post
            if (position !in 0 until adapter.itemCount) return@post
            val lm = rv.layoutManager as? LinearLayoutManager ?: return@post
            val measuredHeight = rv.findViewHolderForAdapterPosition(position)?.itemView?.height
                ?: rv.getChildAt(0)?.height
                ?: defaultItemHeightPx
            val offset = ((rv.height - measuredHeight) / 2).coerceAtLeast(0)
            lm.scrollToPositionWithOffset(position, offset)
        }
    }

    private fun calculatePosterSpanCount(): Int {
        val widthDp = resources.displayMetrics.widthPixels / resources.displayMetrics.density
        return (widthDp / 120f).toInt().coerceIn(3, 10)
    }

    private fun onCategoryFocused(category: XtreamCategory) {
        hoverRunnable?.let { hoverHandler.removeCallbacks(it) }
        hoverRunnable = Runnable { fetchContentForCategory(category) }
        hoverHandler.postDelayed(hoverRunnable!!, 50)
    }

    private fun saveLastCategoryForCurrentMode(categoryId: String, position: Int) {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        prefs.edit()
            .putString(lastCategoryIdKey(currentMode), categoryId)
            .putInt(lastCategoryPosKey(currentMode), position)
            .apply()
    }

    private fun saveLastCategoryIdForMode(mode: ContentMode, categoryId: String) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putString(lastCategoryIdKey(mode), categoryId)
            .apply()
    }

    private fun saveLastCategoryPositionForMode(mode: ContentMode, position: Int) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putInt(lastCategoryPosKey(mode), position.coerceAtLeast(0))
            .apply()
    }

    private fun saveCurrentUiState(state: UiState) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_LAST_UI_STATE, state.name)
            .apply()
    }

    private fun getSavedUiState(): UiState {
        val saved = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_LAST_UI_STATE, UiState.FULL_SCREEN.name)
        return UiState.entries.firstOrNull { it.name == saved } ?: UiState.FULL_SCREEN
    }

    private fun saveCurrentMode(mode: ContentMode) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_LAST_CONTENT_MODE, mode.name)
            .apply()
    }

    private fun getSavedContentMode(): ContentMode {
        val saved = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_LAST_CONTENT_MODE, ContentMode.LIVE_TV.name)
        return ContentMode.entries.firstOrNull { it.name == saved } ?: ContentMode.LIVE_TV
    }

    private fun getLastCategoryIdForMode(mode: ContentMode): String? {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(lastCategoryIdKey(mode), null)
    }

    private fun getLastGridPositionForMode(mode: ContentMode): Int {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getInt(lastGridPosKey(mode), 0)
            .coerceAtLeast(0)
    }

    private fun saveLastGridPositionForMode(mode: ContentMode, position: Int) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putInt(lastGridPosKey(mode), position.coerceAtLeast(0))
            .apply()
    }

    private fun saveLiveFocusedRowPosition(position: Int) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putInt(KEY_LAST_LIVE_FOCUSED_ROW, position.coerceAtLeast(0))
            .apply()
    }

    private fun getLiveFocusedRowPosition(): Int {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getInt(KEY_LAST_LIVE_FOCUSED_ROW, 0)
            .coerceAtLeast(0)
    }

    private fun saveLiveFocusedRowPositionForCategory(categoryId: String, position: Int) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putInt("$KEY_LIVE_FOCUSED_ROW_PREFIX$categoryId", position.coerceAtLeast(0))
            .apply()
    }

    private fun getLiveFocusedRowPositionForCategory(categoryId: String): Int {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getInt("$KEY_LIVE_FOCUSED_ROW_PREFIX$categoryId", 0)
            .coerceAtLeast(0)
    }

    private fun lastCategoryIdKey(mode: ContentMode): String = when (mode) {
        ContentMode.LIVE_TV -> KEY_LAST_CATEGORY_ID_LIVE
        ContentMode.MOVIES -> KEY_LAST_CATEGORY_ID_MOVIES
        ContentMode.SERIES -> KEY_LAST_CATEGORY_ID_SERIES
    }

    private fun lastCategoryPosKey(mode: ContentMode): String = when (mode) {
        ContentMode.LIVE_TV -> KEY_LAST_CATEGORY_POS_LIVE
        ContentMode.MOVIES -> KEY_LAST_CATEGORY_POS_MOVIES
        ContentMode.SERIES -> KEY_LAST_CATEGORY_POS_SERIES
    }

    private fun lastGridPosKey(mode: ContentMode): String = when (mode) {
        ContentMode.MOVIES -> KEY_LAST_GRID_POS_MOVIES
        ContentMode.SERIES -> KEY_LAST_GRID_POS_SERIES
        ContentMode.LIVE_TV -> KEY_LAST_LIVE_FOCUSED_ROW
    }

    private fun loadFocusedCategoryIfApplicable() {
        val focused = currentFocus ?: return
        val view = rvCategories.findContainingItemView(focused) ?: return
        val pos = rvCategories.getChildAdapterPosition(view)
        if (pos == RecyclerView.NO_POSITION) return
        categoryAdapter.getItemAt(pos)?.let { 
            lastCategoryPosition = pos
            onCategoryFocused(it) 
        }
    }

    private fun enterLiveGuideAtCurrentChannel() {
        if (currentMode != ContentMode.LIVE_TV) {
            updateUiState(UiState.EPG_GRID)
            return
        }
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val playing = currentChannel
        val lastPlayedId = prefs.getLong("last_channel_id", -1L).takeIf { it > 0L }
        val targetCategoryId = resolveLiveCategoryId(playing)
            ?: prefs.getString("last_category_id", null)

        if (!targetCategoryId.isNullOrBlank()) {
            saveLastCategoryIdForMode(ContentMode.LIVE_TV, targetCategoryId)
            val pos = categoryAdapter.findPositionById(targetCategoryId)
            if (pos != -1) {
                lastCategoryPosition = pos
                saveLastCategoryPositionForMode(ContentMode.LIVE_TV, pos)
                if (currentLiveCategoryId != targetCategoryId) {
                    categoryAdapter.getItemAt(pos)?.let { fetchContentForCategory(it) }
                }
            }
        }

        val targetChannelId = playing?.id ?: lastPlayedId
        val row = if (targetChannelId != null) {
            currentLiveChannels.indexOfFirst { it.id == targetChannelId }
        } else {
            -1
        }
        if (row != -1) {
            epgAdapter.focusedRowPosition = row
            lastGridPosition = row
            saveLiveFocusedRowPosition(row)
        }

        updateUiState(UiState.EPG_GRID)
        if (row != -1) {
            rvContent.post { focusEpgRowAt(row) }
        }
    }

    private fun alignLiveCategorySelectionToPlayback() {
        if (currentMode != ContentMode.LIVE_TV) return
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val targetCategoryId = resolveLiveCategoryId(currentChannel)
            ?: prefs.getString("last_category_id", null)
            ?: return
        val pos = categoryAdapter.findPositionById(targetCategoryId)
        if (pos == -1) return
        lastCategoryPosition = pos
        saveLastCategoryIdForMode(ContentMode.LIVE_TV, targetCategoryId)
        saveLastCategoryPositionForMode(ContentMode.LIVE_TV, pos)
    }

    private fun shouldOpenPlayingChannelFromCategories(): Boolean {
        if (!returnToPlayingChannelOnNextGridOpen) return false
        val targetCategoryId = getTargetLiveCategoryIdForReturn() ?: return false
        val selectedCategoryId = categoryAdapter.getItemAt(lastCategoryPosition)?.id ?: return false
        return selectedCategoryId == targetCategoryId
    }

    private fun getTargetLiveCategoryIdForReturn(): String? {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        return resolveLiveCategoryId(currentChannel)
            ?: prefs.getString("last_category_id", null)
    }

    private fun focusPlayingRowIfCurrentGroupSelected() {
        val selectedCategoryId = categoryAdapter.getItemAt(lastCategoryPosition)?.id ?: return
        if (selectedCategoryId != currentLiveCategoryId) return
        val playingId = currentChannel?.id ?: return
        val row = currentLiveChannels.indexOfFirst { it.id == playingId }
        if (row == -1) return
        epgAdapter.focusedRowPosition = row
        lastGridPosition = row
        saveLiveFocusedRowPosition(row)
    }

    private fun persistCurrentLiveFocusedRowForCurrentCategory() {
        if (currentMode != ContentMode.LIVE_TV) return
        val categoryId = currentLiveCategoryId?.takeIf { it.isNotBlank() } ?: return
        val row = resolveFocusedEpgRowPosition().coerceAtLeast(0)
        saveLiveFocusedRowPosition(row)
        saveLiveFocusedRowPositionForCategory(categoryId, row)
    }

    private fun restoreLiveFocusForSelectedCategory() {
        if (currentMode != ContentMode.LIVE_TV) return
        val selectedCategoryId = categoryAdapter.getItemAt(lastCategoryPosition)?.id ?: return
        if (selectedCategoryId != currentLiveCategoryId) return

        val playingIdInSelectedGroup = currentChannel
            ?.takeIf { resolveLiveCategoryId(it) == selectedCategoryId }
            ?.id
        val playingRow = playingIdInSelectedGroup?.let { id ->
            currentLiveChannels.indexOfFirst { it.id == id }
        } ?: -1
        val savedGroupRow = getLiveFocusedRowPositionForCategory(selectedCategoryId)

        val targetRow = when {
            playingRow in currentLiveChannels.indices -> playingRow
            savedGroupRow in currentLiveChannels.indices -> savedGroupRow
            else -> resolveFocusedEpgRowPosition().coerceIn(0, (currentLiveChannels.size - 1).coerceAtLeast(0))
        }

        epgAdapter.focusedRowPosition = targetRow
        lastGridPosition = targetRow
        saveLiveFocusedRowPosition(targetRow)
        saveLiveFocusedRowPositionForCategory(selectedCategoryId, targetRow)
    }

    fun playChannel(channel: Channel) {
        if (!isPlaylistEnabled()) {
            Toast.makeText(this, "Playlist is disabled in settings", Toast.LENGTH_SHORT).show()
            return
        }
        val wasFullScreen = currentState == UiState.FULL_SCREEN
        if (currentChannel?.id != channel.id) {
            previousChannel = currentChannel
        }
        val resolvedCategoryId = resolveLiveCategoryId(channel)
        val normalizedChannel = if (!resolvedCategoryId.isNullOrBlank() && channel.group != resolvedCategoryId) {
            channel.copy(group = resolvedCategoryId)
        } else {
            channel
        }
        currentChannel = normalizedChannel
        epgAdapter.setCurrentPlayingChannelId(normalizedChannel.id)
        if (!resolvedCategoryId.isNullOrBlank()) {
            saveLastCategoryIdForMode(ContentMode.LIVE_TV, resolvedCategoryId)
        }
        updateCurrentLiveChannelIndex(normalizedChannel.id)
        addToRecentChannels(normalizedChannel.id)
        refreshRecentChannelsRow()
        val prefsEdit = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putLong("last_channel_id", normalizedChannel.id)
        if (!resolvedCategoryId.isNullOrBlank()) {
            prefsEdit.putString("last_category_id", resolvedCategoryId)
        }
        prefsEdit.apply()
        updateTopInfo(normalizedChannel)
        playMedia("${XtreamManager.baseUrl}/live/${XtreamManager.username}/${XtreamManager.password}/${normalizedChannel.id}.ts", normalizedChannel.name)
        if (wasFullScreen) showMiniInfoTemporarily()
    }

    private fun resumeLastChannel(id: Long) {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        currentChannel = Channel(id = id, name = "Resuming...", group = prefs.getString("last_category_id", "") ?: "", streamUrl = "")
        epgAdapter.setCurrentPlayingChannelId(id)
        player?.setMediaItem(MediaItem.fromUri("${XtreamManager.baseUrl}/live/${XtreamManager.username}/${XtreamManager.password}/$id.ts"))
        player?.prepare(); player?.play()
    }

    private fun updateTopInfo(channel: Channel) {
        tvProgramTitleLarge.text = channel.name; tvProgramDescription.text = "Loading..."
        findViewById<ImageView>(R.id.ivFavoriteStar)?.let { Glide.with(this).load(channel.logoUrl).into(it) }
    }

    private fun showZapBar(baseIndex: Int, targetIndex: Int) {
        if (currentLiveChannels.isEmpty()) return
        val prevIndex = if (targetIndex - 1 < 0) currentLiveChannels.lastIndex else targetIndex - 1
        val nextIndex = (targetIndex + 1) % currentLiveChannels.size
        val prevChannel = currentLiveChannels.getOrNull(prevIndex)
        val currentZapChannel = currentLiveChannels.getOrNull(targetIndex) ?: currentLiveChannels.getOrNull(baseIndex)
        val nextChannel = currentLiveChannels.getOrNull(nextIndex)

        setZapItem(ivZapPrev, tvZapPrev, prevChannel)
        setZapItem(ivZapCurrent, tvZapCurrent, currentZapChannel)
        setZapItem(ivZapNext, tvZapNext, nextChannel)
        animateZapBar(show = true)

        zapBarRunnable?.let { zapBarHandler.removeCallbacks(it) }
        zapBarRunnable = Runnable {
            if (currentState == UiState.FULL_SCREEN) animateZapBar(show = false)
        }
        zapBarHandler.postDelayed(zapBarRunnable!!, zapBarTimeoutMs)
    }

    private fun setZapItem(icon: ImageView, text: TextView, channel: Channel?) {
        text.text = channel?.name ?: ""
        Glide.with(this)
            .load(channel?.logoUrl)
            .placeholder(android.R.drawable.ic_menu_report_image)
            .error(android.R.drawable.ic_menu_report_image)
            .into(icon)
    }

    private fun animateZapBar(show: Boolean) {
        if (show) {
            zapBar.visibility = View.VISIBLE
            zapBar.alpha = 0f
            zapBar.animate().alpha(1f).setDuration(140L).start()
        } else {
            zapBar.animate().alpha(0f).setDuration(180L).withEndAction {
                zapBar.visibility = View.GONE
            }.start()
        }
    }

    private fun zapChannel(next: Boolean): Boolean {
        if (currentMode != ContentMode.LIVE_TV || currentLiveChannels.isEmpty()) return false
        val baseIndex = if (currentLiveChannelIndex in currentLiveChannels.indices) {
            currentLiveChannelIndex
        } else {
            currentLiveChannels.indexOfFirst { it.id == currentChannel?.id }.coerceAtLeast(0)
        }
        val targetIndex = if (next) {
            (baseIndex + 1) % currentLiveChannels.size
        } else {
            if (baseIndex - 1 < 0) currentLiveChannels.lastIndex else baseIndex - 1
        }
        showZapBar(baseIndex, targetIndex)
        currentLiveChannelIndex = targetIndex
        playChannel(currentLiveChannels[targetIndex])
        return true
    }

    private fun playPreviousChannel(): Boolean {
        if (currentMode != ContentMode.LIVE_TV) return false
        val target = previousChannel ?: run {
            Toast.makeText(this, "No previous channel", Toast.LENGTH_SHORT).show()
            return true
        }
        playChannel(target)
        return true
    }

    private fun cycleAspectRatio() {
        val currentIndex = aspectModes.indexOfFirst { it.first == currentAspectRatioMode }.coerceAtLeast(0)
        val next = aspectModes[(currentIndex + 1) % aspectModes.size]
        currentAspectRatioMode = next.first
        playerView.resizeMode = currentAspectRatioMode
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putInt(KEY_PLAYER_ASPECT_MODE, currentAspectRatioMode)
            .apply()
        Toast.makeText(this, "Aspect ratio: ${next.second}", Toast.LENGTH_SHORT).show()
    }

    private fun buildRecentChannels(): List<Channel> {
        val recentIds = getRecentChannelIds()
        if (recentIds.isEmpty()) return emptyList()
        val allStreams = cachedLiveStreams?.values?.flatten().orEmpty()
        val streamById = allStreams.associateBy { it.streamId.toLong() }
        return recentIds.mapNotNull { id ->
            val stream = streamById[id] ?: return@mapNotNull null
            Channel(
                id = stream.streamId.toLong(),
                name = stream.name,
                group = stream.categoryId ?: "",
                logoUrl = stream.streamIcon,
                streamUrl = "",
                epgId = stream.epgId,
                number = stream.num,
                hasCatchup = supportsCatchup(stream)
            )
        }
    }

    private fun supportsCatchup(stream: XtreamLiveStream): Boolean {
        val archiveEnabled = stream.tvArchive?.trim().orEmpty().lowercase(Locale.getDefault())
        val duration = stream.tvArchiveDuration?.toIntOrNull() ?: 0
        return archiveEnabled == "1" ||
            archiveEnabled == "true" ||
            archiveEnabled == "yes" ||
            archiveEnabled == "on" ||
            duration > 0
    }

    private fun getRecentChannelIds(): MutableList<Long> {
        val raw = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE).getString(KEY_RECENT_CHANNELS, "") ?: ""
        if (raw.isBlank()) return mutableListOf()
        return raw.split(",").mapNotNull { it.toLongOrNull() }.toMutableList()
    }

    private fun addToRecentChannels(channelId: Long) {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val ids = getRecentChannelIds()
        ids.remove(channelId)
        ids.add(0, channelId)
        while (ids.size > MAX_RECENT_CHANNELS) ids.removeAt(ids.lastIndex)
        prefs.edit().putString(KEY_RECENT_CHANNELS, ids.joinToString(",")).apply()
    }

    private fun refreshRecentChannelsRow() {
        val recent = buildRecentChannels()
        recentChannelAdapter.submitList(recent)
        updateRecentChannelsVisibility()
    }

    private fun updateRecentChannelsVisibility() {
        rvRecentChannels.visibility = View.GONE
    }

    private fun updateCurrentLiveChannelIndex(channelId: Long) {
        val idx = currentLiveChannels.indexOfFirst { it.id == channelId }
        if (idx != -1) currentLiveChannelIndex = idx
    }

    private fun showMiniInfoTemporarily() {
        if (currentState != UiState.FULL_SCREEN) return
        if (miniInfoTimeoutMs <= 0L) return
        epgOverlay.visibility = View.VISIBLE
        topInfo.visibility = View.VISIBLE
        navRail.visibility = View.GONE
        rvRecentChannels.visibility = View.GONE
        rvCategories.visibility = View.GONE
        mainContentArea.visibility = View.GONE
        pbProgramProgress?.visibility = View.GONE

        miniInfoRunnable?.let { miniInfoHandler.removeCallbacks(it) }
        miniInfoRunnable = Runnable {
            if (currentState == UiState.FULL_SCREEN) {
                epgOverlay.visibility = View.GONE
                mainContentArea.visibility = View.VISIBLE
                pbProgramProgress?.visibility = View.VISIBLE
            }
        }
        miniInfoHandler.postDelayed(miniInfoRunnable!!, miniInfoTimeoutMs)
    }

    companion object {
        private const val KEY_AUTOPLAY_LAST_CHANNEL = "autoplay_last_channel"
        private const val KEY_PLAYER_ASPECT_MODE = "player_aspect_mode"
        private const val KEY_MINI_INFO_TIMEOUT_SEC = "mini_info_timeout_sec"
        private const val KEY_LAST_UI_STATE = "last_ui_state"
        private const val KEY_LAST_CONTENT_MODE = "last_content_mode"
        private const val KEY_RECENT_CHANNELS = "recent_channel_ids"
        private const val KEY_LAST_CATEGORY_ID_LIVE = "last_category_id_live"
        private const val KEY_LAST_CATEGORY_ID_MOVIES = "last_category_id_movies"
        private const val KEY_LAST_CATEGORY_ID_SERIES = "last_category_id_series"
        private const val KEY_LAST_CATEGORY_POS_LIVE = "last_category_pos_live"
        private const val KEY_LAST_CATEGORY_POS_MOVIES = "last_category_pos_movies"
        private const val KEY_LAST_CATEGORY_POS_SERIES = "last_category_pos_series"
        private const val KEY_LAST_GRID_POS_MOVIES = "last_grid_pos_movies"
        private const val KEY_LAST_GRID_POS_SERIES = "last_grid_pos_series"
        private const val KEY_LAST_LIVE_FOCUSED_ROW = "last_live_focused_row"
        private const val KEY_LIVE_FOCUSED_ROW_PREFIX = "last_live_focused_row_"
        private const val KEY_UI_MODE = "ui_mode"
        private const val UI_MODE_AUTO = "auto"
        private const val UI_MODE_TV = "tv"
        private const val UI_MODE_MOBILE = "mobile"
        private const val KEY_EPG_DAYS = "epg_days"
        private const val KEY_EPG_UPDATE_ON_START = "epg_update_on_start"
        private const val KEY_EPG_FORCE_REFRESH_NOW = "epg_force_refresh_now"
        private const val KEY_EPG_CLICK_TO_PLAY = "epg_click_to_play"
        private const val KEY_PLAYLIST_ENABLED = "playlist_enabled"
        private const val KEY_PLAYLIST_UPDATE_ON_START = "playlist_update_on_start"
        private const val KEY_SECONDARY_EPG_ENABLED = "secondary_epg_enabled"
        private const val KEY_MY_LIST_MOVIES = "my_list_movie_ids"
        private const val KEY_MY_LIST_SERIES = "my_list_series_ids"
        private const val MY_LIST_MOVIES_ID = "my_list_movies"
        private const val MY_LIST_SERIES_ID = "my_list_series"
        private const val MAX_RECENT_CHANNELS = 30
    }

    private fun isPlaylistEnabled(): Boolean {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getBoolean(KEY_PLAYLIST_ENABLED, true)
    }

    private fun resolveLiveCategoryId(channel: Channel?): String? {
        val group = channel?.group?.trim().orEmpty()
        if (group.isNotBlank() && group != "favorites" && group != "recent") return group
        val stream = cachedLiveStreams
            ?.values
            ?.asSequence()
            ?.flatten()
            ?.firstOrNull { it.streamId.toLong() == channel?.id }
        return stream?.categoryId?.takeIf { it.isNotBlank() }
    }

    private fun isTvUiMode(): Boolean {
        val prefMode = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_UI_MODE, UI_MODE_AUTO)
        return when (prefMode) {
            UI_MODE_TV -> true
            UI_MODE_MOBILE -> false
            else -> packageManager.hasSystemFeature("android.software.leanback")
        }
    }

    override fun onDestroy() {
        saveVodResumeProgress()
        miniInfoRunnable?.let { miniInfoHandler.removeCallbacks(it) }
        zapBarRunnable?.let { zapBarHandler.removeCallbacks(it) }
        epgUiFlushRunnable?.let { epgUiUpdateHandler.removeCallbacks(it) }
        pendingEpgUiUpdates.clear()
        uiTickRunnable?.let { uiTickHandler.removeCallbacks(it) }
        sleepTimerRunnable?.let { sleepTimerHandler.removeCallbacks(it) }
        super.onDestroy()
        player?.release()
    }
}
