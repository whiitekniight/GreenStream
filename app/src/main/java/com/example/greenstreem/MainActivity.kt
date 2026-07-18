package com.example.greenstreem

import android.app.AlertDialog
import android.app.Dialog
import android.app.DownloadManager
import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.os.Environment
import android.os.Handler
import android.os.Looper
import android.text.Editable
import android.text.TextWatcher
import android.text.method.ScrollingMovementMethod
import android.util.Log
import android.view.Gravity
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.view.WindowManager
import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.widget.FrameLayout
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.ListAdapter
import android.widget.BaseAdapter
import android.widget.ArrayAdapter
import android.widget.EditText
import android.widget.ListView
import android.widget.ProgressBar
import android.widget.PopupMenu
import android.widget.TextView
import android.widget.Toast
import android.widget.AdapterView
import androidx.annotation.OptIn
import androidx.activity.OnBackPressedCallback
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.lifecycleScope
import androidx.media3.common.AudioAttributes
import androidx.media3.common.MediaItem
import androidx.media3.common.MimeTypes
import androidx.media3.common.PlaybackException
import androidx.media3.common.Player
import androidx.media3.common.C
import androidx.media3.common.TrackSelectionOverride
import androidx.media3.common.TrackSelectionParameters
import androidx.media3.common.Tracks
import androidx.media3.common.util.UnstableApi
import androidx.media3.exoplayer.DefaultRenderersFactory
import androidx.media3.exoplayer.DefaultLoadControl
import androidx.media3.exoplayer.ExoPlayer
import androidx.media3.exoplayer.source.DefaultMediaSourceFactory
import androidx.media3.exoplayer.trackselection.DefaultTrackSelector
import androidx.media3.exoplayer.video.VideoFrameMetadataListener
import androidx.media3.datasource.DefaultHttpDataSource
import androidx.media3.ui.AspectRatioFrameLayout
import androidx.media3.ui.PlayerView
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions
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
import java.net.URL

@OptIn(UnstableApi::class)
class MainActivity : FragmentActivity() {
    enum class UiState { FULL_SCREEN, EPG_GRID, CATEGORIES, NAV_RAIL }
    enum class ContentMode { LIVE_TV, MOVIES, SERIES }
    private enum class M3uContentKind { LIVE, MOVIES, SERIES }

    private var currentState = UiState.FULL_SCREEN
    private var currentMode = ContentMode.LIVE_TV
    private var lastBackPressTs = 0L
    private var suppressExitOnUserLeaveHint = false
    private var mutedForInternalActivity = false
    private var volumeBeforeInternalActivity = 1f
    private var trackSelectionBeforeInternalActivity: TrackSelectionParameters? = null

    private var player: ExoPlayer? = null
    private lateinit var playerView: PlayerView
    private lateinit var previewPlayerView: PlayerView
    private lateinit var playerContainer: FrameLayout
    private lateinit var videoPreviewBox: FrameLayout
    private lateinit var ivVodPoster: ImageView
    private lateinit var ivVodBackdrop: ImageView
    private lateinit var vVodBackdropFeather: View
    private lateinit var vVodBackdropShade: View
    private lateinit var topInfo: View
    private lateinit var libraryInfoPanel: View
    private lateinit var mainContentArea: View
    private lateinit var zapBar: View
    private lateinit var ivZapPrev: ImageView
    private lateinit var ivZapCurrent: ImageView
    private lateinit var ivZapNext: ImageView
    private lateinit var tvZapPrev: TextView
    private lateinit var tvZapCurrent: TextView
    private lateinit var tvZapNext: TextView
    private lateinit var movieControlsBar: View
    private lateinit var movieControlsButtons: View
    private lateinit var tvMovieControlsTitle: TextView
    private lateinit var tvMovieControlsPosition: TextView
    private lateinit var tvMovieProgressStart: TextView
    private lateinit var tvMovieProgressEnd: TextView
    private lateinit var pbMovieControlsProgress: ProgressBar
    private lateinit var btnMoviePlayPause: TextView
    private lateinit var nextEpisodePrompt: View
    private lateinit var tvNextEpisodeTitle: TextView
    private lateinit var tvNextEpisodeCountdown: TextView
    private lateinit var btnNextEpisodeStart: TextView
    private lateinit var btnNextEpisodeAuto: TextView
    private lateinit var timeRulerContainer: LinearLayout
    private lateinit var tvGuideClock: TextView
    private var topInfoDefaultHeightPx = 0
    private var categoryDefaultWidthPx = 0
    private var libraryGridRestTopPx = 0
    
    private lateinit var epgOverlay: View
    private lateinit var navRail: View
    private lateinit var rvCategories: RecyclerView
    private lateinit var rvRecentChannels: RecyclerView
    private lateinit var rvContent: RecyclerView
    private lateinit var hsvTimeRuler: HorizontalScrollView
    private lateinit var rightPanel: View
    private lateinit var nowTimeLine: View
    
    private lateinit var tvProgramTitleLarge: TextView
    private lateinit var tvProgramDescription: TextView
    private lateinit var tvProgramTimeRange: TextView
    private lateinit var tvProgramDuration: TextView
    private lateinit var tvLibraryCategoryCount: TextView
    private lateinit var vodTopActionsScroller: HorizontalScrollView
    private lateinit var vodTopActionsBar: LinearLayout
    private lateinit var vodInlineActionsScroller: HorizontalScrollView
    private lateinit var vodInlineActionsBar: LinearLayout
    private var pbProgramProgress: ProgressBar? = null

    private lateinit var db: AppDatabase
    private var currentChannel: Channel? = null
    private var currentAspectRatioMode = AspectRatioFrameLayout.RESIZE_MODE_FILL
    private var currentDisplayModeId = "full"
    private var previousChannel: Channel? = null
    private var currentVodResumeKey: String? = null
    private var isKeepingScreenAwake = false

    private var lastCategoryPosition = 0
    private var lastGridPosition = 0
    
    private lateinit var epgScrollSync: ScrollSync

    private val hoverHandler = Handler(Looper.getMainLooper())
    private var hoverRunnable: Runnable? = null
    private val vodInfoHandler = Handler(Looper.getMainLooper())
    private var vodInfoStartRunnable: Runnable? = null
    private var vodInfoRunnable: Runnable? = null
    private var vodInfoRequestToken = 0
    private var currentVodInfoCall: Call<*>? = null
    private val libraryIconOptions = RequestOptions()
        .format(DecodeFormat.PREFER_RGB_565)
        .disallowHardwareConfig()
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        .override(72, 72)
        .dontAnimate()
    private val libraryPosterOptions = RequestOptions()
        .format(DecodeFormat.PREFER_RGB_565)
        .disallowHardwareConfig()
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        .override(220, 330)
        .centerCrop()
        .dontAnimate()
    private val libraryBackdropOptions = RequestOptions()
        .format(DecodeFormat.PREFER_RGB_565)
        .disallowHardwareConfig()
        .diskCacheStrategy(DiskCacheStrategy.AUTOMATIC)
        .override(480, 270)
        .dontAnimate()
    private val miniInfoHandler = Handler(Looper.getMainLooper())
    private var miniInfoRunnable: Runnable? = null
    private val zapBarHandler = Handler(Looper.getMainLooper())
    private var zapBarRunnable: Runnable? = null
    private val movieControlsHandler = Handler(Looper.getMainLooper())
    private var movieControlsHideRunnable: Runnable? = null
    private var movieControlsTickRunnable: Runnable? = null
    private val vodResumeHandler = Handler(Looper.getMainLooper())
    private var vodResumeRunnable: Runnable? = null
    private val epgUiUpdateHandler = Handler(Looper.getMainLooper())
    private var epgUiFlushRunnable: Runnable? = null
    private val liveFocusSaveHandler = Handler(Looper.getMainLooper())
    private var liveFocusSaveRunnable: Runnable? = null
    private val pendingEpgUiUpdates = LinkedHashMap<Int, List<XtreamEpgListing>>()
    private var isRvContentScrolling = false
    private var epgUiSuppressUntilMs = 0L
    private val epgUiSuppressDuringNavMs = 350L
    private var suppressEpgFocusUpdatesUntilMs = 0L
    private var epgFocusRequestToken = 0
    private val uiTickHandler = Handler(Looper.getMainLooper())
    private var uiTickRunnable: Runnable? = null
    private var lastEpgClockRefreshMinute: Long = -1L
    private val sleepTimerHandler = Handler(Looper.getMainLooper())
    private var sleepTimerRunnable: Runnable? = null
    private val startupWorkHandler = Handler(Looper.getMainLooper())
    private var startupWorkRunnable: Runnable? = null
    private var initialStartupWorkDeferred = false
    private val livePlaybackHandler = Handler(Looper.getMainLooper())
    private var livePlaybackWatchdogRunnable: Runnable? = null
    private var lastLivePlaybackPositionMs = -1L
    private var lastLivePlaybackAdvancedAtMs = 0L
    private var lastLivePlaybackReconnectAtMs = 0L
    private var lastLiveVideoFrameRenderedAtMs = 0L
    private var hasLiveVideoFrameRendered = false
    private var currentLivePlaybackUrl: String? = null
    private var currentLivePlaybackUrls: List<String> = emptyList()
    private var currentLivePlaybackUrlIndex = 0
    private val rejectedLivePlaybackUrls = mutableSetOf<String>()
    private var currentContentCall: Call<*>? = null
    private val pendingEpgCalls = mutableListOf<Call<XtreamEpgResponse>>()
    private val epgCacheByStreamId = LinkedHashMap<Int, List<XtreamEpgListing>>()
    private val epgInFlightStreamIds = mutableSetOf<Int>()
    private val epgQueuedStreamIds = mutableSetOf<Int>()
    private val epgFetchQueue = ArrayDeque<Pair<Channel, Boolean>>()
    private var epgActiveFetchCount = 0
    private val maxConcurrentEpgFetches = 6
    private val xmlOnlyEpgWindowRadius = 6
    private val epgDiskCacheTtlMs = 7L * 24L * 60L * 60L * 1000L
    private val gson by lazy { Gson() }
    private val liveStreamsPrefetchInFlight = mutableSetOf<String>()
    private val doubleBackWindowMs = 500L
    private var miniInfoTimeoutMs = 4000L
    private val zapBarTimeoutMs = 2500L
    private val movieControlsTimeoutMs = 6500L
    private var suppressBackToCategoriesUntilMs = 0L
    private var suppressCategoriesToNavUntilMs = 0L

    // In-memory caches
    private var cachedRawCategories: List<XtreamCategory>? = null
    private var cachedLiveStreams: Map<String, List<XtreamLiveStream>>? = null
    private var cachedVodStreams: Map<String, List<XtreamVodStream>>? = null
    private var cachedSeries: Map<String, List<XtreamSeries>>? = null
    private var cachedM3uChannels: List<Channel>? = null
    private var cachedXtreamM3uPlusChannels: List<Channel>? = null
    private var currentLiveChannels: List<Channel> = emptyList()
    private var currentLiveChannelIndex: Int = -1
    private var currentLiveCategoryId: String? = null
    private var currentLibraryCategoryName: String = ""
    private var selectedPosterKey: String? = null
    private var vodInlineActionsActive = false
    private var currentActionDialog: Dialog? = null
    private var expandedPlaylistProfileId: String? = null
    private var playlistExpansionInitialized = false
    private var categoryFetchGeneration = 0
    private var contentFetchGeneration = 0
    private var lastLiveProgramDescription: String = ""
    private var returnToPlayingChannelOnNextGridOpen = false
    private var restorePlayingChannelFocusOnNextGuideOpen = false
    private var resetLiveCategoriesToTopOnNextLoad = false
    private var guideFullscreenReturnChannelId: Long? = null
    private var categoryCenterPressTracking = false
    private var categoryCenterLongPressHandled = false
    private var categoryActionMenuShowing = false
    private var didInitialCategoryLoad = false
    private var lastVodAudioWarningKey: String? = null
    private var currentVodUrl: String? = null
    private var currentVodTitle: String? = null
    private var seriesEpisodeUrls: List<String> = emptyList()
    private var seriesEpisodeTitles: List<String> = emptyList()
    private var seriesEpisodeResumeKeys: List<String> = emptyList()
    private var seriesEpisodeIndex = -1
    private var nextEpisodePromptShownForKey: String? = null
    private var lastUnsupportedVodAudioSummary: String = ""
    private var pendingEpgRefresh = false
    private var pendingEpgRefreshUserRequested = false
    private var isChannelVisibilityEditMode = false
    private val epgPxPerMinute = 5
    private var suppressPlayingIndicatorUpdatesUntilMs = 0L
    private var visibilityEditOriginalState: UiState = UiState.EPG_GRID
    private var visibilityEditChannels: List<Channel> = emptyList()
    private val visibilityHiddenIds = mutableSetOf<Long>()
    private val maxEpgCacheEntries = 1500
    private val aspectModes = listOf(
        "normal" to "Normal",
        "full" to "Full",
        "zoom" to "Zoom",
        "cinema_zoom" to "Cinema Zoom"
    )
    private data class DisplayModeChoice(
        val id: String,
        val resizeMode: Int,
        val title: String,
        val description: String,
        val scaleX: Float = 1f,
        val scaleY: Float = 1f
    )

    private val displayModeChoices = listOf(
        DisplayModeChoice(
            "normal",
            AspectRatioFrameLayout.RESIZE_MODE_FIT,
            "Normal",
            "Shows the whole picture with the original shape. Best first choice for most movies."
        ),
        DisplayModeChoice(
            "full",
            AspectRatioFrameLayout.RESIZE_MODE_FILL,
            "Full",
            "Fills the screen edge to edge. Good for TV-sized video, but may stretch some movies."
        ),
        DisplayModeChoice(
            "zoom",
            AspectRatioFrameLayout.RESIZE_MODE_ZOOM,
            "Zoom",
            "Crops the edges to remove black bars and make the picture larger."
        ),
        DisplayModeChoice(
            "cinema_zoom",
            AspectRatioFrameLayout.RESIZE_MODE_ZOOM,
            "Cinema Zoom",
            "A stronger zoom for wide movies with black bars.",
            scaleX = 1.08f,
            scaleY = 1.08f
        ),
        DisplayModeChoice(
            "fixed_width",
            AspectRatioFrameLayout.RESIZE_MODE_FIXED_WIDTH,
            "Fixed Width",
            "Locks the video to the screen width and lets height adjust."
        ),
        DisplayModeChoice(
            "fixed_height",
            AspectRatioFrameLayout.RESIZE_MODE_FIXED_HEIGHT,
            "Fixed Height",
            "Locks the video to the screen height and lets width adjust."
        ),
        DisplayModeChoice(
            "wide_16_9",
            AspectRatioFrameLayout.RESIZE_MODE_FIT,
            "16:9",
            "Keeps a standard widescreen TV shape.",
            scaleX = 1.02f
        ),
        DisplayModeChoice(
            "classic_4_3",
            AspectRatioFrameLayout.RESIZE_MODE_FIT,
            "4:3",
            "Narrows older square TV video instead of stretching it wide.",
            scaleX = 0.75f
        ),
        DisplayModeChoice(
            "cinema_235",
            AspectRatioFrameLayout.RESIZE_MODE_FIT,
            "2.35:1",
            "Wide cinema shape for scope movies.",
            scaleY = 0.76f
        )
    )

    private val categoryAdapter = CategoryAdapter(
        onCategoryClick = { category ->
            if (isPlaylistHeader(category)) {
                handlePlaylistHeaderClick(category)
                return@CategoryAdapter
            }
            fetchContentForCategory(category)
            updateUiState(UiState.EPG_GRID)
        },
        onCategoryFocus = { category, position -> 
            if (isPlaylistHeader(category)) {
                lastCategoryPosition = position
                if (currentMode == ContentMode.LIVE_TV) {
                    centerRecyclerPosition(rvCategories, position, 56)
                }
                return@CategoryAdapter
            }
            lastCategoryPosition = position
            saveLastCategoryForCurrentMode(category.id, position)
            if (currentMode == ContentMode.LIVE_TV) {
                centerRecyclerPosition(rvCategories, position, 56)
            }
            onCategoryFocused(category) 
        },
        onCategoryLongClick = { category, position, anchor ->
            showCategoryActionMenu(category, position, anchor)
        }
    )

    private lateinit var epgAdapter: EpgRowAdapter
    private lateinit var recentChannelAdapter: RecentChannelAdapter
    private val posterAdapter = PosterAdapter(
        onClick = { item, position -> handleVodClick(item, position) },
        onFocus = { item, position -> 
            lastGridPosition = position
            updateLibraryPositionCount()
            requestVodInfoUpdate(item)
        },
        onLongClick = { item -> showVodOptions(item) },
        onResolveMoviePoster = { movie -> requestMoviePosterForGrid(movie) }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        currentDisplayModeId = prefs.getString(KEY_PLAYER_DISPLAY_MODE_ID, "full") ?: "full"
        currentAspectRatioMode = displayModeChoices
            .firstOrNull { it.id == currentDisplayModeId }
            ?.resizeMode
            ?: prefs.getInt(KEY_PLAYER_ASPECT_MODE, AspectRatioFrameLayout.RESIZE_MODE_FILL)
        miniInfoTimeoutMs = prefs.getInt(KEY_MINI_INFO_TIMEOUT_SEC, 4).coerceAtLeast(0) * 1000L
        pendingEpgRefresh = shouldRefreshEpgOnStartup(prefs)
        currentMode = ContentMode.LIVE_TV
        promoteXtreamM3uPrefsIfNeeded(prefs)
        if (!prefs.getBoolean("has_playlist", false)) {
            startActivity(Intent(this, SetupActivity::class.java))
            finish()
            return
        }

        db = AppDatabase.getDatabase(this)
        XtreamManager.initFromPrefs(this)
        CloudBackupManager.startManagementSync(applicationContext)
        val hasValidService = if (isM3uPlaylist()) {
            prefs.getString(KEY_M3U_URL, "").orEmpty().isNotBlank()
        } else {
            XtreamManager.getService() != null &&
                XtreamManager.username.isNotBlank() &&
                XtreamManager.password.isNotBlank()
        }
        if (!hasValidService) {
            startActivity(Intent(this, SetupActivity::class.java))
            finish()
            return
        }

        setContentView(R.layout.activity_main)
        
        playerView = findViewById(R.id.playerView) ?: return
        previewPlayerView = findViewById(R.id.previewPlayerView) ?: return
        playerContainer = findViewById(R.id.playerContainer) ?: return
        videoPreviewBox = findViewById(R.id.videoPreviewBox) ?: return
        ivVodPoster = findViewById(R.id.ivVodPoster) ?: return
        ivVodBackdrop = findViewById(R.id.ivVodBackdrop) ?: return
        vVodBackdropFeather = findViewById(R.id.vVodBackdropFeather) ?: return
        vVodBackdropShade = findViewById(R.id.vVodBackdropShade) ?: return
        epgOverlay = findViewById(R.id.epgOverlay) ?: return
        topInfo = findViewById(R.id.topInfo) ?: return
        libraryInfoPanel = findViewById(R.id.libraryInfoPanel) ?: return
        mainContentArea = findViewById(R.id.mainContentArea) ?: return
        zapBar = findViewById(R.id.zapBar) ?: return
        ivZapPrev = findViewById(R.id.ivZapPrev) ?: return
        ivZapCurrent = findViewById(R.id.ivZapCurrent) ?: return
        ivZapNext = findViewById(R.id.ivZapNext) ?: return
        tvZapPrev = findViewById(R.id.tvZapPrev) ?: return
        tvZapCurrent = findViewById(R.id.tvZapCurrent) ?: return
        tvZapNext = findViewById(R.id.tvZapNext) ?: return
        movieControlsBar = findViewById(R.id.movieControlsBar) ?: return
        movieControlsButtons = findViewById(R.id.movieControlsButtons) ?: return
        tvMovieControlsTitle = findViewById(R.id.tvMovieControlsTitle) ?: return
        tvMovieControlsPosition = findViewById(R.id.tvMovieControlsPosition) ?: return
        tvMovieProgressStart = findViewById(R.id.tvMovieProgressStart) ?: return
        tvMovieProgressEnd = findViewById(R.id.tvMovieProgressEnd) ?: return
        pbMovieControlsProgress = findViewById(R.id.pbMovieControlsProgress) ?: return
        btnMoviePlayPause = findViewById(R.id.btnMoviePlayPause) ?: return
        nextEpisodePrompt = findViewById(R.id.nextEpisodePrompt) ?: return
        tvNextEpisodeTitle = findViewById(R.id.tvNextEpisodeTitle) ?: return
        tvNextEpisodeCountdown = findViewById(R.id.tvNextEpisodeCountdown) ?: return
        btnNextEpisodeStart = findViewById(R.id.btnNextEpisodeStart) ?: return
        btnNextEpisodeAuto = findViewById(R.id.btnNextEpisodeAuto) ?: return
        navRail = findViewById(R.id.navRail) ?: return
        rvCategories = findViewById(R.id.rvCategories) ?: return
        rvRecentChannels = findViewById(R.id.rvRecentChannels) ?: return
        rvContent = findViewById(R.id.rvEpg) ?: return
        hsvTimeRuler = findViewById(R.id.hsvTimeRuler) ?: return
        rightPanel = findViewById(R.id.rightPanel) ?: return
        timeRulerContainer = findViewById(R.id.timeRulerContainer) ?: return
        tvGuideClock = findViewById(R.id.tvGuideClock) ?: return
        nowTimeLine = findViewById(R.id.nowTimeLine) ?: return
        tvProgramTitleLarge = findViewById(R.id.tvProgramTitleLarge) ?: return
        tvProgramDescription = findViewById(R.id.tvProgramDescription) ?: return
        tvProgramDescription.movementMethod = ScrollingMovementMethod()
        tvProgramDescription.isVerticalScrollBarEnabled = true
        tvProgramTimeRange = findViewById(R.id.tvProgramTimeRange) ?: return
        tvProgramDuration = findViewById(R.id.tvProgramDuration) ?: return
        tvLibraryCategoryCount = findViewById(R.id.tvLibraryCategoryCount) ?: return
        vodTopActionsScroller = findViewById(R.id.vodTopActionsScroller) ?: return
        vodTopActionsBar = findViewById(R.id.vodTopActionsBar) ?: return
        vodInlineActionsScroller = findViewById(R.id.vodInlineActionsScroller) ?: return
        vodInlineActionsBar = findViewById(R.id.vodInlineActionsBar) ?: return
        pbProgramProgress = findViewById(R.id.pbProgramProgress)
        topInfoDefaultHeightPx = topInfo.layoutParams.height
        categoryDefaultWidthPx = rvCategories.layoutParams.width
        applyAppearanceTheme()

        rvCategories.layoutManager = LinearLayoutManager(this)
        rvCategories.adapter = categoryAdapter
        hsvTimeRuler.isFocusable = false
        hsvTimeRuler.isFocusableInTouchMode = false
        hsvTimeRuler.descendantFocusability = ViewGroup.FOCUS_BLOCK_DESCENDANTS
        timeRulerContainer.isFocusable = false
        timeRulerContainer.isFocusableInTouchMode = false

        recentChannelAdapter = RecentChannelAdapter { channel ->
            playChannel(channel)
        }
        rvRecentChannels.layoutManager = LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
        rvRecentChannels.adapter = recentChannelAdapter

        epgScrollSync = ScrollSync()
        epgScrollSync.onAnyRowScrolled = { x ->
            hsvTimeRuler.scrollTo(x, 0)
            updateNowTimeLinePosition(x)
        }

        epgAdapter = EpgRowAdapter(epgPxPerMinute, epgScrollSync,
            onProgramFocus = { channel, listing ->
                val now = System.currentTimeMillis()
                if (currentMode == ContentMode.LIVE_TV &&
                    currentState == UiState.EPG_GRID &&
                    now < suppressEpgFocusUpdatesUntilMs
                ) {
                    if (DEBUG_EPG_FOCUS) {
                        Log.d(TAG, "skip focus update channel=${channel.id} during suppress window")
                    }
                    return@EpgRowAdapter
                }
                if (DEBUG_EPG_FOCUS) {
                    Log.d(TAG, "focus update channel=${channel.id} state=$currentState current=${currentChannel?.id} listing=${listing?.title?.take(24)}")
                }
                val pos = epgAdapter.getPositionForChannelId(channel.id)
                if (pos != RecyclerView.NO_POSITION) {
                    epgAdapter.focusedRowPosition = pos
                    scheduleLiveFocusedRowSave(pos)
                }
                updateFocusInfo(channel, listing)
            },
            onProgramClick = { channel, listing ->
                if (isChannelVisibilityEditMode) return@EpgRowAdapter
                if (prefs.getBoolean(KEY_EPG_CLICK_TO_PLAY, true)) {
                    playChannel(channel, preferredListing = listing)
                } else {
                    updateFocusInfo(channel, listing)
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
        startLivePlaybackWatchdog()
        PlayBillingManager.start(this)
        setupMovieControls()
        setupPhoneMovieTouchControls()
        setupNextEpisodePrompt()
        setupDynamicTimeRuler()
        setupNavRail()
        setupBackNavigationDispatcher()
        val lastId = prefs.getLong("last_channel_id", -1L)
        val shouldAutoplayLastChannel = lastId != -1L && prefs.getBoolean(KEY_AUTOPLAY_LAST_CHANNEL, true)
        val hasLastPlayback = prefs.getString(KEY_LAST_PLAYBACK_URL, "").orEmpty().isNotBlank() ||
            prefs.getLong(KEY_LAST_PLAYBACK_CHANNEL_ID, -1L) != -1L
        val shouldAutoplayLastPlayback = hasLastPlayback && prefs.getBoolean(KEY_AUTOPLAY_LAST_CHANNEL, true)
        updateUiState(
            if (shouldAutoplayLastChannel || shouldAutoplayLastPlayback) {
                UiState.FULL_SCREEN
            } else {
                UiState.CATEGORIES
            }
        )

        @Suppress("DEPRECATION")
        val playChannelExtra = intent.getSerializableExtra("play_channel") as? Channel
        val startedInitialPlayback = if (playChannelExtra != null) {
            playChannel(playChannelExtra)
            true
        } else if (handleExternalPlaybackIntent(intent)) {
            // handled by external VOD/series playback intent
            true
        } else {
            if (shouldAutoplayLastPlayback && resumeLastPlayback()) {
                // resumed the last movie, series episode, or live channel
                true
            } else if (shouldAutoplayLastChannel) {
                resumeLastChannel(lastId)
                true
            } else {
                false
            }
        }

        scheduleInitialStartupWork(
            autoSelectFirst = !startedInitialPlayback && !shouldAutoplayLastChannel,
            shouldDefer = startedInitialPlayback
        )
    }

    override fun onStart() {
        super.onStart()
        player?.play()
    }

    override fun onPause() {
        if (suppressExitOnUserLeaveHint) {
            muteForInternalActivity()
        }
        super.onPause()
    }

    override fun onStop() {
        super.onStop()
        CloudBackupManager.backupIfDue(applicationContext)
        if (!suppressExitOnUserLeaveHint) {
            saveVodResumeProgress()
            stopVodResumeTicker()
            player?.pause()
        }
    }

    override fun onResume() {
        super.onResume()
        restoreVolumeAfterInternalActivity()
        suppressExitOnUserLeaveHint = false
        PlayBillingManager.refreshPurchases()
        applyAppearanceTheme()
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val groupsChanged = prefs.getBoolean(KEY_GROUPS_CHANGED, false)
        if (groupsChanged) {
            prefs.edit().putBoolean(KEY_GROUPS_CHANGED, false).apply()
            fetchCategories(autoSelectFirst = false, shouldScrollToActive = true)
        } else if (!didInitialCategoryLoad && !initialStartupWorkDeferred) {
            fetchCategories(autoSelectFirst = false, shouldScrollToActive = true)
        } else {
            categoryAdapter.notifyDataSetChanged()
            epgAdapter.notifyDataSetChanged()
            refreshRecentChannelsRow()
        }
        val forceEpgRefreshNow = prefs.getBoolean(KEY_EPG_FORCE_REFRESH_NOW, false)
        if (forceEpgRefreshNow) {
            pendingEpgRefresh = true
            pendingEpgRefreshUserRequested = true
            prefs.edit().putBoolean(KEY_EPG_FORCE_REFRESH_NOW, false).apply()
        }
        if (!handleEpgSettingsInvalidation(prefs, forceEpgRefreshNow)) {
            maybeRunPendingEpgRefresh()
        }
    }

    override fun onNewIntent(intent: Intent) {
        super.onNewIntent(intent)
        setIntent(intent)
        handleExternalPlaybackIntent(intent)
    }

    override fun onUserLeaveHint() {
        super.onUserLeaveHint()
        if (suppressExitOnUserLeaveHint || isChangingConfigurations) return
        player?.pause()
        finishAndRemoveTask()
    }

    private fun updateFocusInfo(
        channel: Channel,
        listing: XtreamEpgListing?,
        preserveDescription: Boolean = false,
        respectSuppressWindow: Boolean = true
    ) {
        val nowMs = System.currentTimeMillis()
        if (respectSuppressWindow &&
            currentMode == ContentMode.LIVE_TV &&
            currentState == UiState.EPG_GRID &&
            nowMs < suppressEpgFocusUpdatesUntilMs &&
            currentChannel?.id == channel.id
        ) {
            if (DEBUG_EPG_FOCUS) {
                Log.d(TAG, "updateFocusInfo suppressed channel=${channel.id} state=$currentState")
            }
            return
        }
        if (DEBUG_EPG_FOCUS) {
            Log.d(TAG, "updateFocusInfo channel=${channel.id} state=$currentState preserve=$preserveDescription listing=${listing?.title?.take(24)}")
        }
        val effectiveListing = listing ?: resolveCurrentlyAiringListing(channel.id.toInt())
        tvProgramTitleLarge.text = DataUtils.decodeBase64(
            effectiveListing?.title ?: ChannelNameFormatter.format(this, channel.name)
        )
        if (!preserveDescription) {
            val decodedDescription = cleanEpgDescription(DataUtils.decodeBase64(effectiveListing?.description))
            if (!decodedDescription.isNullOrBlank() && !decodedDescription.isLoadingLike()) {
                tvProgramDescription.text = decodedDescription
                lastLiveProgramDescription = decodedDescription
            } else if (lastLiveProgramDescription.isNotBlank()) {
                tvProgramDescription.text = lastLiveProgramDescription
            } else if (tvProgramDescription.text.isNullOrBlank()) {
                tvProgramDescription.text = "No description available"
            }
        }
        
        lifecycleScope.launch {
            val isFav = db.favoriteDao().isFavorite(channel.id.toInt())
            findViewById<ImageView>(R.id.ivFavoriteStar)?.setImageResource(
                if (isFav) android.R.drawable.btn_star_big_on else android.R.drawable.btn_star_big_off
            )
        }

        if (effectiveListing != null) {
            val sdfTime = SimpleDateFormat("hh:mm a", Locale.getDefault())
            val sdfDate = SimpleDateFormat("MMM dd", Locale.getDefault())
            val startDate = Date(effectiveListing.startTimestamp * 1000)
            val stopDate = Date(effectiveListing.stopTimestamp * 1000)
            tvProgramTimeRange.text = "${sdfDate.format(startDate)}, ${sdfTime.format(startDate)} - ${sdfTime.format(stopDate)}"
            tvProgramDuration.text = "${(effectiveListing.stopTimestamp - effectiveListing.startTimestamp) / 60} min"
            val now = System.currentTimeMillis() / 1000
            if (now in effectiveListing.startTimestamp..effectiveListing.stopTimestamp) {
                pbProgramProgress?.progress = ((now - effectiveListing.startTimestamp).toFloat() / (effectiveListing.stopTimestamp - effectiveListing.startTimestamp).toFloat() * 100).toInt()
            } else pbProgramProgress?.progress = 0
        } else {
            tvProgramTimeRange.text = ""
            tvProgramDuration.text = ""
            pbProgramProgress?.progress = 0
        }
    }

    private fun cleanEpgDescription(description: String?): String {
        if (description.isNullOrBlank()) return ""
        val withoutCreditTail = description
            .replace(Regex("(?i)\\s*epg\\s*credits?\\s*:\\s*.*$"), "")
            .replace(Regex("(?i)\\s*credits?\\s*:\\s*epg[-\\w\\s./]*.*$"), "")
        return withoutCreditTail
            .lines()
            .filterNot { line ->
                val normalized = line.trim().lowercase(Locale.getDefault())
                normalized.contains("epg credits") ||
                    normalized.contains("epg-4iptv") ||
                    normalized.startsWith("credits:") ||
                    normalized == "credits"
            }
            .joinToString("\n")
            .trim()
    }

    private fun applyAppearanceTheme() {
        if (!::navRail.isInitialized) return
        listOf(
            R.id.navSearch,
            R.id.navTv,
            R.id.navMovies,
            R.id.navSeries,
            R.id.navSettings,
            R.id.navExit
        ).forEach { id ->
            navRail.findViewById<View>(id)?.background = AppearanceTheme.buttonBackground(this)
        }
        pbProgramProgress?.progressDrawable = AppearanceTheme.progressDrawable(this)
        if (::pbMovieControlsProgress.isInitialized) {
            pbMovieControlsProgress.progressDrawable = AppearanceTheme.progressDrawable(this)
        }
        if (::nowTimeLine.isInitialized) {
            val accent = AppearanceTheme.accentColor(this)
            nowTimeLine.setBackgroundColor(
                Color.argb(80, Color.red(accent), Color.green(accent), Color.blue(accent))
            )
        }
        rvCategories.adapter?.notifyDataSetChanged()
        rvRecentChannels.adapter?.notifyDataSetChanged()
        rvContent.adapter?.notifyDataSetChanged()
        if (::epgAdapter.isInitialized) {
            epgAdapter.notifyDataSetChanged()
        }
    }

    private fun showChannelOptions(channel: Channel) {
        lifecycleScope.launch {
            val isFav = runCatching { db.favoriteDao().isFavorite(channel.id.toInt()) }.getOrDefault(false)
            val options = arrayOf(
                if (isFav) "Remove from Favorites" else "Add to Favorites",
                "EPG channel finder / override",
                "Manage Channel Visibility",
                "Hide Channel",
                "Show all hidden channels"
            )
            AlertDialog.Builder(this@MainActivity)
                .setTitle(ChannelNameFormatter.format(this@MainActivity, channel.name))
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
        val isSelected: Boolean,
        val isSupported: Boolean = true
    )

    private fun showAudioTrackDialog() {
        val trackInfo = player?.currentTracks ?: run {
            Toast.makeText(this, "Player not ready", Toast.LENGTH_SHORT).show()
            return
        }
        val groups = trackInfo.groups.filter { it.type == C.TRACK_TYPE_AUDIO }
        val audioChoices = groups.flatMap { group ->
            (0 until group.length)
                .map { idx ->
                    val format = group.getTrackFormat(idx)
                    val lang = format.language?.uppercase(Locale.getDefault()) ?: "Unknown"
                    val ch = if (format.channelCount > 0) " ${format.channelCount}ch" else ""
                    val rate = if (format.sampleRate > 0) " ${format.sampleRate}Hz" else ""
                    val codec = format.sampleMimeType?.substringAfterLast(".")?.uppercase(Locale.getDefault()).orEmpty()
                    val supported = group.isTrackSupported(idx)
                    val supportLabel = if (supported) "" else " (not supported)"
                    TrackChoice(
                        label = listOf(lang, codec).filter { it.isNotBlank() }.joinToString(" ") + "$ch$rate$supportLabel",
                        override = if (supported) TrackSelectionOverride(group.mediaTrackGroup, listOf(idx)) else null,
                        isSelected = group.isTrackSelected(idx),
                        isSupported = supported
                    )
                }
        }
        val choices = listOf(
            TrackChoice(
                label = "Auto",
                override = null,
                isSelected = audioChoices.none { it.isSelected },
                isSupported = true
            )
        ) + audioChoices
        if (choices.isEmpty()) {
            Toast.makeText(this, "No audio tracks", Toast.LENGTH_SHORT).show()
            return
        }
        val selectedIndex = choices.indexOfFirst { it.isSelected }.coerceAtLeast(0)
        AlertDialog.Builder(this)
            .setTitle("Audio track")
            .setSingleChoiceItems(choices.map { it.label }.toTypedArray(), selectedIndex) { dialog, which ->
                val choice = choices[which]
                if (!choice.isSupported) {
                    Toast.makeText(this, "This movie audio codec is not supported by this build", Toast.LENGTH_LONG).show()
                    dialog.dismiss()
                    return@setSingleChoiceItems
                }
                val builder = (player?.trackSelectionParameters ?: return@setSingleChoiceItems)
                    .buildUpon()
                    .clearOverridesOfType(C.TRACK_TYPE_AUDIO)
                    .setTrackTypeDisabled(C.TRACK_TYPE_AUDIO, false)
                val updated = choice.override
                    ?.let { builder.addOverride(it).build() }
                    ?: builder.build()
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
        if (subtitleChoices.isEmpty()) {
            Toast.makeText(
                this,
                if (currentMode == ContentMode.LIVE_TV) {
                    "No subtitle tracks found in this live stream"
                } else {
                    "No subtitles found"
                },
                Toast.LENGTH_LONG
            ).show()
            return
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
                "EPG channel finder / override" -> {
                    showEpgProviderPicker(channel)
                    return@launch
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

    private fun showEpgProviderPicker(channel: Channel) {
        val sources = SecondaryEpgProvider.configuredSources(this)
        val providers = listOf("Provider EPG (default)") +
            sources.map { "${it.label}: ${it.url}" }
        AlertDialog.Builder(this)
            .setTitle("EPG for ${ChannelNameFormatter.format(this, channel.name)}")
            .setItems(providers.toTypedArray()) { _, which ->
                when {
                    which == 0 -> resetManualEpgMapping(channel)
                    sources.isEmpty() -> Toast.makeText(
                        this,
                        "Add XMLTV URLs in TV Guide settings first",
                        Toast.LENGTH_LONG
                    ).show()
                    else -> showSecondaryEpgChannelPicker(channel, sources[which - 1])
                }
            }
            .show()
    }

    private fun resetManualEpgMapping(channel: Channel) {
        lifecycleScope.launch {
            db.epgChannelMappingDao().deleteForChannel(channel.id)
            clearEpgCacheForChannel(channel)
            Toast.makeText(this@MainActivity, "Using provider EPG for ${channel.name}", Toast.LENGTH_SHORT).show()
            fetchRowEpg(channel, forceRefresh = true)
        }
    }

    private fun showSecondaryEpgChannelPicker(channel: Channel, source: SecondaryEpgSource) {
        lifecycleScope.launch {
            val loadingDialog = AlertDialog.Builder(this@MainActivity)
                .setTitle("Loading ${source.label}")
                .setMessage("Reading EPG channel list...")
                .setView(ProgressBar(this@MainActivity).apply {
                    isIndeterminate = true
                    setPadding(dp(32), dp(18), dp(32), dp(18))
                })
                .setCancelable(false)
                .create()
            loadingDialog.show()
            val channels = withContext(Dispatchers.IO) {
                SecondaryEpgProvider.getChannels(this@MainActivity, source.url)
            }
            loadingDialog.dismiss()
            if (channels.isEmpty()) {
                val detail = SecondaryEpgProvider.getLastError(source.url)
                    ?.takeIf { it.isNotBlank() }
                    ?.let { " ($it)" }
                    .orEmpty()
                Toast.makeText(
                    this@MainActivity,
                    "No EPG channels found in ${source.label}$detail",
                    Toast.LENGTH_LONG
                ).show()
                return@launch
            }
            showEpgChannelSearchDialog(channel, source, channels)
        }
    }

    private fun showEpgChannelSearchDialog(
        channel: Channel,
        source: SecondaryEpgSource,
        channels: List<SecondaryEpgChannel>
    ) {
        val rows = channels.map { epgChannel ->
            EpgPickerRow(
                label = "${epgChannel.name}  (${epgChannel.id})",
                channel = epgChannel
            )
        }
        val container = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(18), dp(8), dp(18), 0)
        }
        val search = EditText(this).apply {
            hint = "Search EPG channels"
            setSingleLine(true)
        }
        val list = ListView(this).apply {
            dividerHeight = 1
        }
        val adapter = ArrayAdapter(
            this,
            android.R.layout.simple_list_item_1,
            rows.toMutableList()
        )
        list.adapter = adapter
        container.addView(search, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            ViewGroup.LayoutParams.WRAP_CONTENT
        ))
        container.addView(list, LinearLayout.LayoutParams(
            ViewGroup.LayoutParams.MATCH_PARENT,
            dp(420)
        ))
        val dialog = AlertDialog.Builder(this)
            .setTitle("Match ${ChannelNameFormatter.format(this, channel.name)} from ${source.label}")
            .setView(container)
            .setNegativeButton("Cancel", null)
            .create()
        search.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) = Unit
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                adapter.filter.filter(s?.toString().orEmpty())
            }
            override fun afterTextChanged(s: Editable?) = Unit
        })
        list.onItemClickListener = AdapterView.OnItemClickListener { _, _, position, _ ->
            val row = adapter.getItem(position) ?: return@OnItemClickListener
            saveSecondaryEpgMapping(channel, source, row.channel)
            dialog.dismiss()
        }
        dialog.show()
    }

    private fun saveSecondaryEpgMapping(
        channel: Channel,
        source: SecondaryEpgSource,
        epgChannel: SecondaryEpgChannel
    ) {
        lifecycleScope.launch {
            db.epgChannelMappingDao().upsert(
                EpgChannelMapping(
                    channelId = channel.id,
                    provider = epgProviderKeyForSource(source.url),
                    epgChannelId = epgChannel.id,
                    displayName = "${source.label}: ${epgChannel.name}"
                )
            )
            clearEpgCacheForChannel(channel)
            Toast.makeText(
                this@MainActivity,
                "EPG matched to ${source.label}: ${epgChannel.name}",
                Toast.LENGTH_SHORT
            ).show()
            fetchRowEpg(channel, forceRefresh = true)
            if (currentChannel?.id == channel.id) {
                updateFocusInfo(channel, null)
            }
        }
    }

    private suspend fun clearEpgCacheForChannel(channel: Channel) {
        val streamId = channel.id.toInt()
        epgCacheByStreamId.remove(streamId)
        pendingEpgUiUpdates.remove(streamId)
        epgAdapter.setEpgData(streamId, emptyList())
        withContext(Dispatchers.IO) {
            db.epgCacheDao().deleteByStreamId(streamId)
        }
    }

    private data class EpgPickerRow(
        val label: String,
        val channel: SecondaryEpgChannel
    ) {
        override fun toString(): String = label
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
                Toast.makeText(this@MainActivity, "${ChannelNameFormatter.format(this@MainActivity, channel.name)} removed from favorites", Toast.LENGTH_SHORT).show()
            } else {
                db.favoriteDao().insert(Favorite(channel.id.toInt(), channel.name, channel.logoUrl, channel.epgId, channel.group))
                Toast.makeText(this@MainActivity, "${ChannelNameFormatter.format(this@MainActivity, channel.name)} added to favorites", Toast.LENGTH_SHORT).show()
            }
            val currentCat = categoryAdapter.getItemAt(lastCategoryPosition)
            if (currentCat?.id == "favorites") {
                fetchContentForCategory(currentCat)
            }
            
            // Instantly fetch and show EPG instead of "Loading..."
            val streamId = channel.id.toInt()
            val cachedListings = epgCacheByStreamId[streamId]
            val currentlyAiring = cachedListings?.firstOrNull { listing ->
                val now = System.currentTimeMillis() / 1000
                now >= listing.startTimestamp && now < listing.stopTimestamp
            }
            updateFocusInfo(channel, currentlyAiring)
        }
    }

    private fun initializePlayer() {
        try {
            val playerPrefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            val tunneledPlaybackEnabled = playerPrefs.getBoolean(KEY_TUNNELED_PLAYBACK, false)
            val renderersFactory = DefaultRenderersFactory(this)
                .setEnableDecoderFallback(true)
                .setExtensionRendererMode(DefaultRenderersFactory.EXTENSION_RENDERER_MODE_ON)
            val trackSelector = DefaultTrackSelector(this).apply {
                parameters = buildUponParameters()
                    .setTunnelingEnabled(tunneledPlaybackEnabled)
                    .build()
            }
            val httpDataSourceFactory = DefaultHttpDataSource.Factory()
                .setAllowCrossProtocolRedirects(true)
                .setConnectTimeoutMs(15_000)
                .setReadTimeoutMs(30_000)
                .setUserAgent(IPTV_PLAYER_USER_AGENT)
                .setDefaultRequestProperties(IPTV_PLAYER_HEADERS)
            val mediaSourceFactory = DefaultMediaSourceFactory(this)
                .setDataSourceFactory(httpDataSourceFactory)
            val bufferPrefSec = playerPrefs.getInt(KEY_BUFFER_SIZE_SEC, 60).coerceIn(0, 120)
            val liveBufferMs = (bufferPrefSec * 1000).coerceAtLeast(1_000)
            val minLiveBufferMs = when {
                bufferPrefSec <= 0 -> 500
                bufferPrefSec < 15 -> liveBufferMs
                else -> 15_000
            }
            val playbackBufferMs = when {
                bufferPrefSec <= 0 -> 250
                bufferPrefSec < 15 -> 500
                else -> 5_000
            }
            val loadControl = DefaultLoadControl.Builder()
                .setBufferDurationsMs(
                    minLiveBufferMs,
                    liveBufferMs,
                    playbackBufferMs,
                    playbackBufferMs
                )
                .build()
            player = ExoPlayer.Builder(this, renderersFactory)
                .setTrackSelector(trackSelector)
                .setMediaSourceFactory(mediaSourceFactory)
                .setLoadControl(loadControl)
                .build()
            val mediaAudioAttributes = AudioAttributes.Builder()
                .setUsage(C.USAGE_MEDIA)
                .setContentType(C.AUDIO_CONTENT_TYPE_MOVIE)
                .build()
            player?.setAudioAttributes(mediaAudioAttributes, true)
            player?.setHandleAudioBecomingNoisy(true)
            player?.setVideoFrameMetadataListener(VideoFrameMetadataListener { _, _, _, _ ->
                if (currentVodResumeKey == null && currentChannel != null) {
                    hasLiveVideoFrameRendered = true
                    lastLiveVideoFrameRenderedAtMs = System.currentTimeMillis()
                }
            })
            playerView.player = player
            playerView.setKeepContentOnPlayerReset(true)
            playerView.setShowBuffering(PlayerView.SHOW_BUFFERING_WHEN_PLAYING)
            previewPlayerView.setKeepContentOnPlayerReset(true)
            previewPlayerView.setShowBuffering(PlayerView.SHOW_BUFFERING_WHEN_PLAYING)
            applyDisplayModeToViews()
            player?.addListener(object : Player.Listener {
                override fun onPlaybackStateChanged(playbackState: Int) {
                    updateKeepScreenAwake()
                    if (playbackState == Player.STATE_READY && currentVodResumeKey == null && currentChannel != null) {
                        currentLivePlaybackUrl?.let { rememberLiveStreamFormatForUrl(it) }
                    }
                    if (playbackState == Player.STATE_ENDED) {
                        if (currentVodResumeKey == null && currentChannel != null && currentLivePlaybackUrl != null) {
                            recoverLivePlayback("ended")
                        } else {
                            handleVodEnded()
                        }
                    }
                    if (movieControlsBar.visibility == View.VISIBLE) refreshMovieControls()
                }

                override fun onIsPlayingChanged(isPlaying: Boolean) {
                    updateKeepScreenAwake()
                    if (movieControlsBar.visibility == View.VISIBLE) refreshMovieControls()
                }

                override fun onPlayerError(error: PlaybackException) {
                    Log.w(TAG, "player error code=${error.errorCodeName}", error)
                    if (currentVodResumeKey == null && currentChannel != null) {
                        recoverLivePlayback("player error ${error.errorCodeName}")
                    }
                }

                override fun onTracksChanged(tracks: Tracks) {
                    val audio = tracks.groups
                        .filter { it.type == C.TRACK_TYPE_AUDIO }
                        .joinToString(" | ") { group ->
                            (0 until group.length).joinToString(",") { idx ->
                                val format = group.getTrackFormat(idx)
                                val selected = if (group.isTrackSelected(idx)) "*" else ""
                                val supported = if (group.isTrackSupported(idx)) "ok" else "bad"
                                "${selected}${format.sampleMimeType ?: "audio"} ${format.language ?: "und"} ${format.channelCount}ch $supported"
                            }
                        }
                    Log.d(TAG, "audio tracks: ${audio.ifBlank { "none" }}")
                    ensureVodAudioTrackSelected(tracks)
                }
            })
        } catch (e: Exception) { e.printStackTrace() }
    }

    private fun ensureVodAudioTrackSelected(tracks: Tracks) {
        val warningKey = currentVodResumeKey ?: return
        val audioGroups = tracks.groups.filter { it.type == C.TRACK_TYPE_AUDIO }
        if (audioGroups.isEmpty()) return
        if (audioGroups.any { group -> (0 until group.length).any { idx -> group.isTrackSelected(idx) } }) return

        val supportedGroup = audioGroups.firstOrNull { group ->
            (0 until group.length).any { idx -> group.isTrackSupported(idx) }
        }
        if (supportedGroup == null) {
            if (lastVodAudioWarningKey != warningKey) {
                lastVodAudioWarningKey = warningKey
                lastUnsupportedVodAudioSummary = describeAudioTracks(audioGroups)
                showUnsupportedMovieAudioMessage()
            }
            return
        }

        val supportedTrackIndex = (0 until supportedGroup.length)
            .firstOrNull { idx -> supportedGroup.isTrackSupported(idx) }
            ?: return
        player?.trackSelectionParameters = (player?.trackSelectionParameters ?: return)
            .buildUpon()
            .clearOverridesOfType(C.TRACK_TYPE_AUDIO)
            .setTrackTypeDisabled(C.TRACK_TYPE_AUDIO, false)
            .addOverride(TrackSelectionOverride(supportedGroup.mediaTrackGroup, listOf(supportedTrackIndex)))
            .build()
        Log.d(TAG, "forced supported VOD audio track index=$supportedTrackIndex")
    }

    private fun describeAudioTracks(audioGroups: List<Tracks.Group>): String {
        return audioGroups.flatMap { group ->
            (0 until group.length).map { idx ->
                val format = group.getTrackFormat(idx)
                val codec = format.sampleMimeType ?: format.codecs ?: "unknown audio"
                val language = format.language?.takeIf { it.isNotBlank() } ?: "und"
                val channels = if (format.channelCount > 0) "${format.channelCount}ch" else "unknown channels"
                val support = if (group.isTrackSupported(idx)) "supported" else "not supported"
                "$codec, $language, $channels, $support"
            }
        }.joinToString("\n").ifBlank { "No audio track details available" }
    }

    private fun showUnsupportedMovieAudioMessage() {
        AlertDialog.Builder(this)
            .setTitle("Movie Audio Codec Not Supported")
            .setMessage("The built-in player cannot decode this movie audio:\n\n$lastUnsupportedVodAudioSummary\n\nTry Settings > Playback > Audio passthrough: On, then restart the app. If it still fails, this Shield/TV audio path is not exposing Dolby Digital Plus to ExoPlayer.")
            .setPositiveButton("OK", null)
            .show()
    }

    private fun setupMovieControls() {
        btnMoviePlayPause.setOnClickListener {
            toggleMoviePlayPause()
        }
        findViewById<TextView>(R.id.btnMovieAudio)?.setOnClickListener {
            keepMovieControlsVisible()
            showAudioTrackDialog()
        }
        findViewById<TextView>(R.id.btnMovieSubtitles)?.setOnClickListener {
            keepMovieControlsVisible()
            showSubtitleTrackDialog()
        }
        findViewById<TextView>(R.id.btnMovieAspect)?.setOnClickListener {
            keepMovieControlsVisible()
            showDisplayModeDialog()
        }
        findViewById<TextView>(R.id.btnMovieOffset)?.setOnClickListener {
            keepMovieControlsVisible()
            showMovieAudioOffsetDialog()
        }
        findViewById<TextView>(R.id.btnMovieSleep)?.setOnClickListener {
            keepMovieControlsVisible()
            showSleepTimerDialog()
        }
        findViewById<TextView>(R.id.btnMovieSettings)?.setOnClickListener {
            hideMovieControls()
            launchInternalActivity(Intent(this, PlaybackSettingsActivity::class.java))
        }
    }

    private fun setupPhoneMovieTouchControls() {
        if (isTvUiMode()) return
        playerView.isClickable = true
        playerView.setOnClickListener {
            handlePhoneMovieTap()
        }
        playerContainer.isClickable = true
        playerContainer.setOnClickListener {
            handlePhoneMovieTap()
        }
    }

    private fun handlePhoneMovieTap(): Boolean {
        if (isTvUiMode()) return false
        if (currentState != UiState.FULL_SCREEN || currentMode == ContentMode.LIVE_TV || currentVodResumeKey == null) {
            return false
        }
        if (movieControlsBar.visibility == View.VISIBLE && movieControlsButtons.visibility != View.VISIBLE) {
            toggleMoviePlayPause()
        } else {
            showMovieControls(focusControls = false, showExtras = false)
        }
        return true
    }

    private fun setupNextEpisodePrompt() {
        btnNextEpisodeStart.setOnClickListener {
            playNextSeriesEpisode()
        }
        btnNextEpisodeAuto.setOnClickListener {
            val next = !isAutoNextEpisodeEnabled()
            getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
                .edit()
                .putBoolean(KEY_AUTO_NEXT_EPISODE, next)
                .apply()
            updateNextEpisodePrompt()
        }
    }

    private fun isAutoNextEpisodeEnabled(): Boolean {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getBoolean(KEY_AUTO_NEXT_EPISODE, true)
    }

    private fun hasNextSeriesEpisode(): Boolean {
        return seriesEpisodeIndex >= 0 && seriesEpisodeIndex + 1 < seriesEpisodeUrls.size
    }

    private fun updateNextEpisodePrompt() {
        val nextTitle = seriesEpisodeTitles.getOrNull(seriesEpisodeIndex + 1)
        tvNextEpisodeTitle.text = "Next: ${nextTitle ?: "Next episode"}"
        val currentPlayer = player
        val duration = currentPlayer?.duration?.takeIf { it > 0L && it != C.TIME_UNSET } ?: 0L
        val remaining = if (duration > 0L) (duration - (currentPlayer?.currentPosition ?: 0L)).coerceAtLeast(0L) else 0L
        tvNextEpisodeCountdown.text = if (isAutoNextEpisodeEnabled()) {
            "Auto next in ${remaining / 1000L} sec"
        } else {
            "Auto next is off"
        }
        btnNextEpisodeAuto.text = if (isAutoNextEpisodeEnabled()) "Auto On" else "Auto Off"
    }

    private fun maybeShowNextEpisodePrompt() {
        val resumeKey = currentVodResumeKey
        if (currentState != UiState.FULL_SCREEN || resumeKey == null || !hasNextSeriesEpisode()) {
            hideNextEpisodePrompt()
            return
        }
        val currentPlayer = player ?: return
        val duration = currentPlayer.duration.takeIf { it > 0L && it != C.TIME_UNSET } ?: return
        val remaining = duration - currentPlayer.currentPosition
        val shouldKeepShown = nextEpisodePromptShownForKey == resumeKey &&
            currentPlayer.playbackState != Player.STATE_ENDED
        if (remaining <= NEXT_EPISODE_PROMPT_REMAINING_MS || shouldKeepShown) {
            val firstShow = nextEpisodePrompt.visibility != View.VISIBLE
            nextEpisodePromptShownForKey = resumeKey
            showNextEpisodePrompt(focusStart = firstShow)
        } else {
            hideNextEpisodePrompt()
        }
    }

    private fun showNextEpisodePrompt(focusStart: Boolean = false) {
        updateNextEpisodePrompt()
        nextEpisodePrompt.visibility = View.VISIBLE
        if (focusStart) {
            btnNextEpisodeStart.requestFocus()
        }
    }

    private fun hideNextEpisodePrompt() {
        if (::nextEpisodePrompt.isInitialized) {
            nextEpisodePrompt.visibility = View.GONE
        }
    }

    private fun handleVodEnded() {
        currentVodResumeKey?.let { key ->
            markVodWatched(key)
            clearVodResumeByKey(key)
        }
        if (hasNextSeriesEpisode()) {
            if (isAutoNextEpisodeEnabled()) {
                playNextSeriesEpisode()
            } else {
                showNextEpisodePrompt(focusStart = true)
            }
        } else {
            hideNextEpisodePrompt()
        }
    }

    private fun playNextSeriesEpisode(): Boolean {
        if (!hasNextSeriesEpisode()) return false
        currentVodResumeKey?.let { key ->
            markVodWatched(key)
            clearVodResumeByKey(key)
        }
        currentVodResumeKey = null
        val nextIndex = seriesEpisodeIndex + 1
        val url = seriesEpisodeUrls.getOrNull(nextIndex) ?: return false
        val title = seriesEpisodeTitles.getOrNull(nextIndex) ?: "Next episode"
        val resumeKey = seriesEpisodeResumeKeys.getOrNull(nextIndex) ?: return false
        seriesEpisodeIndex = nextIndex
        hideNextEpisodePrompt()
        startVodPlayback(url, title, resumeKey, getVodResumeMs(resumeKey))
        return true
    }

    private fun showMovieControls(focusControls: Boolean = true, showExtras: Boolean = true): Boolean {
        if (currentState != UiState.FULL_SCREEN) return false
        refreshMovieControls()
        movieControlsBar.visibility = View.VISIBLE
        movieControlsButtons.visibility = if (showExtras) View.VISIBLE else View.GONE
        movieControlsBar.alpha = 1f
        startMovieControlsTicker()
        scheduleMovieControlsHide()
        if (focusControls && showExtras) {
            btnMoviePlayPause.requestFocus()
        }
        return true
    }

    private fun hideMovieControls() {
        movieControlsHideRunnable?.let { movieControlsHandler.removeCallbacks(it) }
        movieControlsTickRunnable?.let { movieControlsHandler.removeCallbacks(it) }
        movieControlsBar.visibility = View.GONE
        movieControlsButtons.visibility = View.GONE
    }

    private fun showPlaybackExtras(): Boolean {
        if (!showMovieControls(focusControls = true, showExtras = true)) return false
        return true
    }

    private fun keepMovieControlsVisible() {
        movieControlsHideRunnable?.let { movieControlsHandler.removeCallbacks(it) }
    }

    private fun scheduleMovieControlsHide() {
        movieControlsHideRunnable?.let { movieControlsHandler.removeCallbacks(it) }
        movieControlsHideRunnable = Runnable {
            if (currentState == UiState.FULL_SCREEN) hideMovieControls()
        }
        movieControlsHandler.postDelayed(movieControlsHideRunnable!!, movieControlsTimeoutMs)
    }

    private fun startMovieControlsTicker() {
        movieControlsTickRunnable?.let { movieControlsHandler.removeCallbacks(it) }
        movieControlsTickRunnable = Runnable {
            if (movieControlsBar.visibility == View.VISIBLE) {
                refreshMovieControls()
                movieControlsHandler.postDelayed(movieControlsTickRunnable!!, 1000L)
            }
        }
        movieControlsHandler.postDelayed(movieControlsTickRunnable!!, 1000L)
    }

    private fun refreshMovieControls() {
        val currentPlayer = player
        tvMovieControlsTitle.text = currentVodTitle ?: currentChannel?.name ?: "Playback"
        btnMoviePlayPause.text = if (currentPlayer?.isPlaying == true) "Pause" else "Play"
        val position = currentPlayer?.currentPosition?.coerceAtLeast(0L) ?: 0L
        val duration = currentPlayer?.duration?.takeIf { it > 0L && it != C.TIME_UNSET } ?: 0L
        updateMovieProgress(position, duration)
    }

    private fun updateMovieProgress(position: Long, duration: Long) {
        tvMovieControlsPosition.text = formatPosition(position)
        pbMovieControlsProgress.progress = if (duration > 0L) {
            ((position.toFloat() / duration.toFloat()) * pbMovieControlsProgress.max)
                .toInt()
                .coerceIn(0, pbMovieControlsProgress.max)
        } else {
            0
        }
        if (duration > 0L) {
            val remaining = (duration - position).coerceAtLeast(0L)
            tvMovieProgressStart.text = formatPosition(duration)
            tvMovieProgressEnd.text = "-${formatPosition(remaining)}"
        } else {
            tvMovieProgressStart.text = "--:--"
            tvMovieProgressEnd.text = "--:--"
        }
    }

    private fun toggleMoviePlayPause() {
        val currentPlayer = player ?: return
        if (currentPlayer.isPlaying) {
            currentPlayer.pause()
            showMovieControls(focusControls = false)
        } else {
            currentPlayer.play()
            hideMovieControls()
        }
    }

    private fun seekMovieBy(deltaMs: Long, focusControls: Boolean = false) {
        val currentPlayer = player ?: return
        val duration = currentPlayer.duration.takeIf { it > 0L && it != C.TIME_UNSET }
        val target = (currentPlayer.currentPosition + deltaMs).let { pos ->
            if (duration != null) pos.coerceIn(0L, duration) else pos.coerceAtLeast(0L)
        }
        currentPlayer.seekTo(target)
        showMovieControls(focusControls = focusControls, showExtras = false)
        updateMovieProgress(target, duration ?: 0L)
    }

    private fun seekMovieFromRemote(
        deltaMs: Long,
        focusControls: Boolean = true,
        allowWhenControlsVisible: Boolean = false
    ): Boolean {
        if (currentState != UiState.FULL_SCREEN || currentMode == ContentMode.LIVE_TV || currentVodResumeKey == null) {
            return false
        }
        if (!allowWhenControlsVisible && isPlaybackOverlayOpen()) {
            return false
        }
        seekMovieBy(deltaMs, focusControls)
        return true
    }

    private fun isPlaybackOverlayOpen(): Boolean {
        val controlsOpen = ::movieControlsButtons.isInitialized && movieControlsButtons.visibility == View.VISIBLE
        val nextPromptOpen = ::nextEpisodePrompt.isInitialized && nextEpisodePrompt.visibility == View.VISIBLE
        return controlsOpen || nextPromptOpen
    }

    private fun showMovieAudioOffsetDialog() {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val options = listOf(
            "-2000 ms" to -2000,
            "-1000 ms" to -1000,
            "-500 ms" to -500,
            "0 ms" to 0,
            "+500 ms" to 500,
            "+1000 ms" to 1000,
            "+2000 ms" to 2000
        )
        val current = prefs.getInt(KEY_AUDIO_OFFSET_MS, 0)
        val currentIndex = options.indexOfFirst { it.second == current }.takeIf { it >= 0 } ?: 3
        AlertDialog.Builder(this)
            .setTitle("Audio offset")
            .setSingleChoiceItems(options.map { it.first }.toTypedArray(), currentIndex) { dialog, which ->
                prefs.edit().putInt(KEY_AUDIO_OFFSET_MS, options[which].second).apply()
                dialog.dismiss()
                Toast.makeText(this, "Audio offset: ${options[which].first}", Toast.LENGTH_SHORT).show()
                showMovieControls(focusControls = false)
            }
            .show()
    }

    private fun openVodInExternalPlayer(url: String, title: String) {
        val intent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(Uri.parse(url), "video/*")
            putExtra(Intent.EXTRA_TITLE, title)
            putExtra("title", title)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        try {
            startActivity(Intent.createChooser(intent, "Open movie with"))
        } catch (e: Exception) {
            Toast.makeText(this, "No external video player found", Toast.LENGTH_LONG).show()
        }
    }

    private fun setupNavRail() {
        findViewById<View>(R.id.navSearch)?.setOnClickListener { launchInternalActivity(Intent(this, SearchActivity::class.java)) }
        findViewById<View>(R.id.navTv)?.setOnClickListener {
            if (currentMode == ContentMode.LIVE_TV) {
                enterLiveGuideAtCurrentChannel()
            } else {
                switchMode(ContentMode.LIVE_TV)
            }
        }
        findViewById<View>(R.id.navMovies)?.setOnClickListener { switchMode(ContentMode.MOVIES) }
        findViewById<View>(R.id.navSeries)?.setOnClickListener { switchMode(ContentMode.SERIES) }
        findViewById<View>(R.id.navSettings)?.setOnClickListener { launchInternalActivity(Intent(this, SettingsActivity::class.java)) }
        findViewById<View>(R.id.navExit)?.setOnClickListener { finishAffinity() }
    }

    private fun launchInternalActivity(intent: Intent) {
        suppressExitOnUserLeaveHint = true
        muteForInternalActivity()
        postInternalActivityMutePasses()
        startActivity(intent)
    }

    private fun muteForInternalActivity() {
        val currentPlayer = player ?: return
        if (!mutedForInternalActivity) {
            volumeBeforeInternalActivity = currentPlayer.volume
            trackSelectionBeforeInternalActivity = currentPlayer.trackSelectionParameters
        }
        mutedForInternalActivity = true
        currentPlayer.volume = 0f
        currentPlayer.trackSelectionParameters = currentPlayer.trackSelectionParameters
            .buildUpon()
            .setTrackTypeDisabled(C.TRACK_TYPE_AUDIO, true)
            .build()
    }

    private fun postInternalActivityMutePasses() {
        hoverHandler.postDelayed({
            if (suppressExitOnUserLeaveHint) muteForInternalActivity()
        }, 120L)
        hoverHandler.postDelayed({
            if (suppressExitOnUserLeaveHint) muteForInternalActivity()
        }, 500L)
    }

    private fun restoreVolumeAfterInternalActivity() {
        if (!mutedForInternalActivity) return
        player?.let { currentPlayer ->
            trackSelectionBeforeInternalActivity?.let { params ->
                currentPlayer.trackSelectionParameters = params
            }
            currentPlayer.volume = volumeBeforeInternalActivity.coerceIn(0f, 1f)
        }
        mutedForInternalActivity = false
        trackSelectionBeforeInternalActivity = null
    }

    private fun scheduleInitialStartupWork(autoSelectFirst: Boolean, shouldDefer: Boolean) {
        startupWorkRunnable?.let { startupWorkHandler.removeCallbacks(it) }
        initialStartupWorkDeferred = shouldDefer
        startupWorkRunnable = Runnable {
            initialStartupWorkDeferred = false
            fetchCategories(autoSelectFirst = autoSelectFirst, shouldScrollToActive = true)
            refreshRecentChannelsRow()
            if (getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
                    .getBoolean(KEY_PLAYLIST_UPDATE_ON_START, true)
            ) {
                preloadAllStreams()
            }
            lifecycleScope.launch { AppUpdater.maybeAutoCheck(this@MainActivity) }
        }
        startupWorkHandler.postDelayed(startupWorkRunnable!!, if (shouldDefer) 650L else 0L)
    }

    private fun setupDynamicTimeRuler() {
        renderDynamicTimeRuler()
        uiTickRunnable?.let { uiTickHandler.removeCallbacks(it) }
        uiTickRunnable = Runnable {
            renderDynamicTimeRuler()
            updateGuideClock()
            updateNowTimeLine()
            refreshLiveGuideForClockTick()
            uiTickHandler.postDelayed(uiTickRunnable!!, 10_000L)
        }
        updateGuideClock()
        updateNowTimeLine()
        refreshLiveGuideForClockTick(force = true)
        uiTickHandler.postDelayed(uiTickRunnable!!, 10_000L)
    }

    private fun updateGuideClock() {
        if (!::tvGuideClock.isInitialized) return
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val shouldShow = currentMode == ContentMode.LIVE_TV &&
            (currentState == UiState.EPG_GRID || currentState == UiState.CATEGORIES) &&
            prefs.getBoolean(KEY_SHOW_CLOCK, true)
        if (!shouldShow) {
            tvGuideClock.visibility = View.GONE
            return
        }
        val use24Hour = prefs.getInt(KEY_TIME_FORMAT, 0) == 1
        val showDate = prefs.getBoolean(KEY_SHOW_DATE_CLOCK, false)
        val pattern = when {
            showDate && use24Hour -> "EEE, MMM d, HH:mm"
            showDate -> "EEE, MMM d, h:mm a"
            use24Hour -> "HH:mm"
            else -> "h:mm a"
        }
        tvGuideClock.text = SimpleDateFormat(pattern, Locale.getDefault()).format(Date())
        tvGuideClock.bringToFront()
        tvGuideClock.visibility = View.VISIBLE
    }

    private fun refreshLiveGuideForClockTick(force: Boolean = false) {
        if (currentMode != ContentMode.LIVE_TV) return
        val minute = System.currentTimeMillis() / 60_000L
        if (!force && minute == lastEpgClockRefreshMinute) return
        lastEpgClockRefreshMinute = minute

        if (::epgAdapter.isInitialized &&
            (currentState == UiState.EPG_GRID || currentState == UiState.CATEGORIES)
        ) {
            epgAdapter.refreshGuideClock()
        }
        currentChannel?.let { channel ->
            updateFocusInfo(
                channel,
                resolveCurrentlyAiringListing(channel.id.toInt()),
                respectSuppressWindow = false
            )
        }
    }

    private fun startLivePlaybackWatchdog() {
        livePlaybackWatchdogRunnable?.let { livePlaybackHandler.removeCallbacks(it) }
        resetLivePlaybackWatchdog()
        livePlaybackWatchdogRunnable = Runnable {
            checkLivePlaybackStall()
            livePlaybackHandler.postDelayed(livePlaybackWatchdogRunnable!!, 10_000L)
        }
        livePlaybackHandler.postDelayed(livePlaybackWatchdogRunnable!!, 10_000L)
    }

    private fun resetLivePlaybackWatchdog() {
        lastLivePlaybackPositionMs = -1L
        lastLivePlaybackAdvancedAtMs = System.currentTimeMillis()
        lastLiveVideoFrameRenderedAtMs = lastLivePlaybackAdvancedAtMs
        hasLiveVideoFrameRendered = false
    }

    private fun updateKeepScreenAwake() {
        val shouldKeepAwake = player?.isPlaying == true
        if (shouldKeepAwake == isKeepingScreenAwake) return
        isKeepingScreenAwake = shouldKeepAwake
        if (shouldKeepAwake) {
            window.addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        } else {
            window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        }
    }

    private fun checkLivePlaybackStall() {
        val currentPlayer = player ?: return
        currentLivePlaybackUrl ?: return
        if (currentVodResumeKey != null || currentChannel == null) return
        if (currentPlayer.playbackState == Player.STATE_IDLE) return
        if (currentPlayer.playbackState == Player.STATE_ENDED) {
            recoverLivePlayback("watchdog ended")
            return
        }

        val now = System.currentTimeMillis()
        val position = currentPlayer.currentPosition
        if (position > lastLivePlaybackPositionMs + 500L) {
            lastLivePlaybackPositionMs = position
            lastLivePlaybackAdvancedAtMs = now
            return
        }

        val stuckMs = now - lastLivePlaybackAdvancedAtMs
        val reconnectCooldownMs = now - lastLivePlaybackReconnectAtMs
        val isBufferingTooLong = currentPlayer.playbackState == Player.STATE_BUFFERING && stuckMs > 12_000L
        val frameStuckMs = now - lastLiveVideoFrameRenderedAtMs
        val isVideoFrameFrozen = currentPlayer.playbackState == Player.STATE_READY &&
            currentPlayer.playWhenReady &&
            hasLiveVideoFrameRendered &&
            frameStuckMs > 8_000L
        if (!isBufferingTooLong && !isVideoFrameFrozen) return
        val reconnectCooldownLimitMs = if (isBufferingTooLong) 15_000L else 30_000L
        if (reconnectCooldownMs < reconnectCooldownLimitMs) return

        if (isBufferingTooLong) {
            recoverLivePlayback("buffering state=${currentPlayer.playbackState} stuckMs=$stuckMs frameStuckMs=$frameStuckMs")
            return
        }
        recoverLivePlayback("stall state=${currentPlayer.playbackState} stuckMs=$stuckMs frameStuckMs=$frameStuckMs")
    }

    private fun renderDynamicTimeRuler() {
        timeRulerContainer.removeAllViews()
        val sdf = SimpleDateFormat("hh:mm a", Locale.getDefault())
        val startMs = currentGuideTimelineStartMs()
        val halfHourWidthPx = epgPxPerMinute * 30
        val gridStartPx = dp(220)
        timeRulerContainer.setPadding(
            (gridStartPx - (halfHourWidthPx / 2)).coerceAtLeast(0),
            0,
            0,
            0
        )
        if (::epgAdapter.isInitialized) {
            epgAdapter.setTimelineStartTimestamp(startMs / 1000L)
        }
        val cal = Calendar.getInstance().apply { timeInMillis = startMs }
        repeat(8) {
            val tv = TextView(this).apply {
                layoutParams = LinearLayout.LayoutParams(halfHourWidthPx, ViewGroup.LayoutParams.WRAP_CONTENT)
                text = sdf.format(cal.time)
                setTextColor(resources.getColor(R.color.tivimate_text_primary, theme))
                gravity = android.view.Gravity.CENTER
                textSize = 10f
            }
            timeRulerContainer.addView(tv)
            cal.add(Calendar.MINUTE, 30)
        }
        updateNowTimeLine()
        updateGuideClock()
    }

    private fun updateNowTimeLine() {
        if (!::nowTimeLine.isInitialized) return
        updateNowTimeLinePosition(epgScrollSync.getCurrentX())
    }

    private fun shouldShowNowTimeLine(): Boolean {
        return currentMode == ContentMode.LIVE_TV &&
            (currentState == UiState.EPG_GRID || currentState == UiState.CATEGORIES)
    }

    private fun updateNowTimeLinePosition(scrollX: Int) {
        if (!::nowTimeLine.isInitialized) return
        if (!shouldShowNowTimeLine()) {
            nowTimeLine.visibility = View.GONE
            return
        }
        val nowMs = System.currentTimeMillis()
        val minutesFromHeaderStart = ((nowMs - currentGuideTimelineStartMs()) / 60000f).coerceAtLeast(0f)
        val leftInsetPx = dp(220)
        val x = leftInsetPx + (minutesFromHeaderStart * epgPxPerMinute) - scrollX
        nowTimeLine.translationX = x
        val panelWidth = if (::rightPanel.isInitialized) rightPanel.width else 0
        val minVisibleX = -nowTimeLine.width.toFloat()
        val maxVisibleX = panelWidth.toFloat()
        nowTimeLine.visibility = if (panelWidth <= 0 || (x >= minVisibleX && x <= maxVisibleX)) {
            View.VISIBLE
        } else {
            View.GONE
        }
    }

    private fun switchMode(mode: ContentMode) {
        val wasLibraryMode = currentMode != ContentMode.LIVE_TV
        closeVodActionPanelForModeSwitch()
        if (mode != ContentMode.LIVE_TV && currentVodResumeKey == null) {
            player?.pause()
        }
        currentMode = mode
        if (mode != ContentMode.LIVE_TV) {
            lastCategoryPosition = 0
        } else if (wasLibraryMode) {
            resetLiveCategoriesToTopOnNextLoad = true
            restorePlayingChannelFocusOnNextGuideOpen = false
            suppressPlayingIndicatorUpdatesUntilMs = 0L
            epgAdapter.suppressPlayingIndicatorUpdatesUntilMs = 0L
            epgAdapter.setCurrentPlayingChannelId(currentChannel?.id)
            epgAdapter.refreshPlayingIndicatorRows(currentChannel?.id)
        }
        saveCurrentMode(mode)
        updateLibraryHeaderChrome()
        refreshRecentChannelsRow()
        fetchCategories(autoSelectFirst = true)
        updateUiState(UiState.CATEGORIES)
        if (mode == ContentMode.LIVE_TV) {
            resumeCurrentLivePlaybackAfterModeSwitch()
        }
    }

    private fun resumeCurrentLivePlaybackAfterModeSwitch() {
        val currentPlayer = player ?: return
        if (currentVodResumeKey != null || currentChannel == null) return
        if (currentLivePlaybackUrl.isNullOrBlank()) return

        if (currentPlayer.playbackState == Player.STATE_IDLE) {
            currentPlayer.setMediaItem(createLiveMediaItem(currentLivePlaybackUrl!!))
            currentPlayer.prepare()
        }
        currentPlayer.play()
    }

    private fun closeVodActionPanelForModeSwitch() {
        vodInlineActionsActive = false
        selectedPosterKey = null
        if (::vodTopActionsScroller.isInitialized) {
            vodTopActionsScroller.visibility = View.GONE
            vodTopActionsBar.removeAllViews()
        }
        if (::vodInlineActionsScroller.isInitialized) {
            vodInlineActionsScroller.visibility = View.GONE
            vodInlineActionsBar.removeAllViews()
        }
    }

    private fun updateLibraryHeaderChrome() {
        val libraryMode = currentMode != ContentMode.LIVE_TV
        val compactLibraryMode = libraryMode && !isTvUiMode()
        val categoryWidth = dp(300)
        val topHeight = if (libraryMode && vodInlineActionsActive) {
            (resources.displayMetrics.heightPixels - dp(28)).coerceAtLeast(dp(420))
        } else if (libraryMode) {
        if (compactLibraryMode) {
            if (currentState == UiState.EPG_GRID) {
                (resources.displayMetrics.heightPixels * 0.31f).toInt().coerceIn(dp(150), dp(210))
            } else {
                (resources.displayMetrics.heightPixels * 0.36f).toInt().coerceIn(dp(170), dp(240))
            }
            } else if (currentState == UiState.EPG_GRID) {
                (resources.displayMetrics.heightPixels * 0.44f).toInt().coerceIn(dp(360), dp(480))
            } else {
                (resources.displayMetrics.heightPixels * 0.43f).toInt().coerceIn(dp(360), dp(480))
            }
        } else if (currentState == UiState.EPG_GRID || currentState == UiState.CATEGORIES) {
            if (currentState == UiState.EPG_GRID) {
                if (isTvUiMode()) dp(200) else dp(170)
            } else {
                if (isTvUiMode()) dp(180) else dp(160)
            }
        } else {
            topInfoDefaultHeightPx.takeIf { it > 0 } ?: dp(160)
        }
        applyInfoPanelConstraints(libraryMode)
        videoPreviewBox.visibility = if (libraryMode) View.GONE else View.VISIBLE
        previewPlayerView.visibility = if (libraryMode) View.GONE else View.VISIBLE
        ivVodPoster.visibility = View.GONE
        ivVodBackdrop.visibility = if (libraryMode) View.VISIBLE else View.GONE
        ivVodBackdrop.scaleType = if (compactLibraryMode) ImageView.ScaleType.FIT_XY else ImageView.ScaleType.CENTER_CROP
        vVodBackdropFeather.visibility = if (libraryMode) View.VISIBLE else View.GONE
        vVodBackdropShade.visibility = if (libraryMode) View.VISIBLE else View.GONE
        tvProgramDescription.maxLines = if (libraryMode) {
        if (compactLibraryMode) {
            if (currentState == UiState.EPG_GRID) 5 else 7
        } else if (currentState == UiState.EPG_GRID) {
                32
            } else {
                26
            }
        } else {
            if (currentState == UiState.EPG_GRID || currentState == UiState.CATEGORIES) {
                if (currentState == UiState.EPG_GRID) {
                    if (isTvUiMode()) 7 else 5
                } else {
                    if (isTvUiMode()) 6 else 4
                }
            } else {
                5
            }
        }
        pbProgramProgress?.visibility = View.GONE
        topInfo.layoutParams = (topInfo.layoutParams as ConstraintLayout.LayoutParams).apply {
            height = topHeight
            marginStart = if (libraryMode && currentState == UiState.CATEGORIES) categoryWidth else 0
        }
        rvCategories.layoutParams = rvCategories.layoutParams.apply {
            width = if (libraryMode) categoryWidth else categoryDefaultWidthPx.takeIf { it > 0 } ?: dp(180)
        }
        mainContentArea.layoutParams = (mainContentArea.layoutParams as ConstraintLayout.LayoutParams).apply {
            if (libraryMode && !vodInlineActionsActive) {
                topToTop = ConstraintLayout.LayoutParams.PARENT_ID
                topToBottom = ConstraintLayout.LayoutParams.UNSET
            } else {
                topToTop = ConstraintLayout.LayoutParams.UNSET
                topToBottom = R.id.rvRecentChannels
            }
        }
        mainContentArea.visibility = if (libraryMode && vodInlineActionsActive) View.GONE else View.VISIBLE
        libraryGridRestTopPx = if (libraryMode && !vodInlineActionsActive) {
            (topHeight - dp(96)).coerceAtLeast(0)
        } else {
            0
        }
        rightPanel.setPadding(0, libraryGridRestTopPx, 0, 0)
        rvCategories.setPadding(
            rvCategories.paddingLeft,
            if (libraryMode) dp(88) else dp(8),
            rvCategories.paddingRight,
            rvCategories.paddingBottom
        )
        hsvTimeRuler.visibility = if (libraryMode) View.GONE else View.VISIBLE
        nowTimeLine.visibility = if (libraryMode) View.GONE else nowTimeLine.visibility
        if (!libraryMode) {
            vodInlineActionsActive = false
            if (::vodTopActionsScroller.isInitialized) {
                vodTopActionsScroller.visibility = View.GONE
                vodTopActionsBar.removeAllViews()
            }
            if (::vodInlineActionsScroller.isInitialized) {
                vodInlineActionsScroller.visibility = View.GONE
                vodInlineActionsBar.removeAllViews()
            }
            Glide.with(this).clear(ivVodPoster)
            Glide.with(this).clear(ivVodBackdrop)
        }
    }

    private fun applyInfoPanelConstraints(libraryMode: Boolean) {
        libraryInfoPanel.layoutParams = (libraryInfoPanel.layoutParams as ConstraintLayout.LayoutParams).apply {
            if (libraryMode) {
                startToEnd = R.id.videoPreviewBox
                endToStart = R.id.vodBackdropGuide
                endToEnd = ConstraintLayout.LayoutParams.UNSET
                marginStart = dp(14)
                marginEnd = dp(18)
            } else {
                startToEnd = R.id.videoPreviewBox
                endToStart = ConstraintLayout.LayoutParams.UNSET
                endToEnd = ConstraintLayout.LayoutParams.PARENT_ID
                marginStart = dp(16)
                marginEnd = dp(18)
            }
        }
    }

    private fun dp(value: Int): Int =
        (value * resources.displayMetrics.density).toInt()

    private fun fetchCategories(autoSelectFirst: Boolean = false, shouldScrollToActive: Boolean = false) {
        didInitialCategoryLoad = true
        val generation = ++categoryFetchGeneration
        val requestedMode = currentMode
        if (!isPlaylistEnabled()) {
            categoryAdapter.submitList(emptyList())
            return
        }
        if (isM3uPlaylist()) {
            lifecycleScope.launch {
                if (generation != categoryFetchGeneration) return@launch
                if (requestedMode != currentMode) return@launch
                val channels = loadM3uChannelsForMode(requestedMode)
                val hiddenIds = if (requestedMode == ContentMode.LIVE_TV && ProEntitlement.isProUnlocked(this@MainActivity)) {
                    db.groupDao().getAllHidden().first().map { it.groupId }.toSet()
                } else {
                    emptySet()
                }
                val categories = channels
                    .map { m3uDisplayGroup(it) }
                    .distinct()
                    .filter { it !in hiddenIds }
                    .mapIndexed { index, group -> XtreamCategory(group, group, index) }
                    .toMutableList()
                if (requestedMode == ContentMode.LIVE_TV) {
                    categories.add(0, XtreamCategory("favorites", "Favorites", 0))
                } else if (requestedMode == ContentMode.MOVIES) {
                    categories.add(0, XtreamCategory(ALL_MOVIES_ID, "All movies", 0))
                    categories.add(0, XtreamCategory(MY_LIST_MOVIES_ID, "My List", 0))
                } else if (requestedMode == ContentMode.SERIES) {
                    categories.add(0, XtreamCategory(ALL_SERIES_ID, "All series", 0))
                    categories.add(0, XtreamCategory(MY_LIST_SERIES_ID, "My List", 0))
                }
                val rows = buildPlaylistCategoryRows(categories)
                categoryAdapter.submitList(rows)
                val restoreCategoryId = if (requestedMode == ContentMode.LIVE_TV) {
                    resolveLiveCategoryId(currentChannel)
                        ?: getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE).getString("last_category_id", null)
                } else {
                    null
                }
                val restoredPos = rows.indexOfFirst { it.id == restoreCategoryId }
                val shouldResetLiveCategoriesToTop =
                    requestedMode == ContentMode.LIVE_TV && resetLiveCategoriesToTopOnNextLoad
                lastCategoryPosition = when {
                    shouldResetLiveCategoriesToTop -> firstCategoryRowIndex(rows)
                    requestedMode == ContentMode.LIVE_TV && restoredPos != -1 -> restoredPos
                    else -> firstCategoryRowIndex(rows)
                }
                if (requestedMode != ContentMode.LIVE_TV) {
                    scrollCategoryPositionToTop(lastCategoryPosition, requestFocus = currentState == UiState.CATEGORIES)
                } else if (shouldResetLiveCategoriesToTop) {
                    resetLiveCategoriesToTopOnNextLoad = false
                    scrollCategoryPositionToTop(lastCategoryPosition, requestFocus = currentState == UiState.CATEGORIES)
                } else if (shouldScrollToActive) {
                    rvCategories.post { centerRecyclerPosition(rvCategories, lastCategoryPosition, 56) }
                }
                if (autoSelectFirst && rows.isNotEmpty()) {
                    val idx = lastCategoryPosition.takeIf {
                        it in rows.indices && rows[it].isAutoSelectableStartupCategory(requestedMode)
                    } ?: firstStartupCategoryRowIndex(rows, requestedMode)
                    rows.getOrNull(idx)
                        ?.takeIf { it.isAutoSelectableStartupCategory(requestedMode) }
                        ?.let { fetchContentForCategory(it) }
                } else if (shouldLoadLiveCategoryForStartupEpg(requestedMode, autoSelectFirst)) {
                    liveCategoryForStartupEpg(rows)?.let { fetchContentForCategory(it) }
                }
            }
            return
        }
        val service = XtreamManager.getService() ?: return
        val call = when (requestedMode) {
            ContentMode.LIVE_TV -> service.getLiveCategories(XtreamManager.username, XtreamManager.password)
            ContentMode.MOVIES -> service.getVodCategories(XtreamManager.username, XtreamManager.password)
            ContentMode.SERIES -> service.getSeriesCategories(XtreamManager.username, XtreamManager.password)
        }
        
        call.enqueue(object : Callback<List<XtreamCategory>> {
            override fun onResponse(call: Call<List<XtreamCategory>>, response: Response<List<XtreamCategory>>) {
                if (generation != categoryFetchGeneration) return
                if (requestedMode != currentMode) return
                if (response.isSuccessful) {
                    val rawCategories = response.body() ?: emptyList()
                    cachedRawCategories = rawCategories
                    lifecycleScope.launch {
                        if (generation != categoryFetchGeneration) return@launch
                        if (requestedMode != currentMode) return@launch
                        val proUnlocked = ProEntitlement.isProUnlocked(this@MainActivity)
                        val hiddenIds = if (requestedMode == ContentMode.LIVE_TV && proUnlocked) {
                            db.groupDao().getAllHidden().first().map { it.groupId }.toSet()
                        } else {
                            emptySet()
                        }
                        val savedOrder = if (proUnlocked) {
                            db.groupOrderDao().getAllOrder().first().associateBy({ it.groupId }, { it.position })
                        } else {
                            emptyMap()
                        }
                        
                        val providerCategories = buildProviderCategoriesForMode(rawCategories, requestedMode)
                        val filtered = sortLibraryCategories(
                            providerCategories.filter { it.id !in hiddenIds },
                            requestedMode,
                            savedOrder,
                            proUnlocked
                        ).toMutableList()

                        if (requestedMode == ContentMode.LIVE_TV) {
                            filtered.add(0, XtreamCategory("favorites", "Favorites", 0))
                        } else if (requestedMode == ContentMode.MOVIES) {
                            filtered.add(0, XtreamCategory(ALL_MOVIES_ID, "All movies", 0))
                            filtered.add(0, XtreamCategory(MY_LIST_MOVIES_ID, "My List", 0))
                        } else if (requestedMode == ContentMode.SERIES) {
                            filtered.add(0, XtreamCategory(ALL_SERIES_ID, "All series", 0))
                            filtered.add(0, XtreamCategory(MY_LIST_SERIES_ID, "My List", 0))
                        }

                        val rows = buildPlaylistCategoryRows(filtered)
                        categoryAdapter.submitList(rows)
                        logLibraryCategorySnapshot(rawCategories, rows, requestedMode)
                        ensureLibraryCategoryBackfill(rawCategories, generation, requestedMode)

                        val restoreCategoryId = if (requestedMode == ContentMode.LIVE_TV) {
                            resolveLiveCategoryId(currentChannel)
                                ?: getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE).getString("last_category_id", null)
                                ?: getLastCategoryIdForMode(requestedMode)
                        } else {
                            null
                        }
                        val restoredPos = rows.indexOfFirst { it.id == restoreCategoryId }
                        val shouldResetLiveCategoriesToTop =
                            requestedMode == ContentMode.LIVE_TV && resetLiveCategoriesToTopOnNextLoad
                        lastCategoryPosition = when {
                            shouldResetLiveCategoriesToTop -> firstCategoryRowIndex(rows)
                            requestedMode == ContentMode.LIVE_TV && restoredPos != -1 -> restoredPos
                            requestedMode != ContentMode.LIVE_TV -> firstCategoryRowIndex(rows)
                            lastCategoryPosition < rows.size && !isPlaylistHeader(rows[lastCategoryPosition]) -> lastCategoryPosition
                            else -> firstCategoryRowIndex(rows)
                        }
                        
                        if (requestedMode != ContentMode.LIVE_TV) {
                            scrollCategoryPositionToTop(lastCategoryPosition, requestFocus = currentState == UiState.CATEGORIES)
                        } else if (shouldResetLiveCategoriesToTop) {
                            resetLiveCategoriesToTopOnNextLoad = false
                            scrollCategoryPositionToTop(lastCategoryPosition, requestFocus = currentState == UiState.CATEGORIES)
                        } else if (shouldScrollToActive) {
                            rvCategories.post {
                                val idx = if (lastCategoryPosition < rows.size) lastCategoryPosition else 0
                                centerRecyclerPosition(rvCategories, idx, 56)
                            }
                        }
                        
                        if (autoSelectFirst && rows.isNotEmpty()) {
                            val idx = lastCategoryPosition.takeIf {
                                it in rows.indices && rows[it].isAutoSelectableStartupCategory(requestedMode)
                            } ?: firstStartupCategoryRowIndex(rows, requestedMode)
                            rows.getOrNull(idx)
                                ?.takeIf { it.isAutoSelectableStartupCategory(requestedMode) }
                                ?.let { fetchContentForCategory(it) }
                        } else if (shouldLoadLiveCategoryForStartupEpg(requestedMode, autoSelectFirst)) {
                            liveCategoryForStartupEpg(rows)?.let { fetchContentForCategory(it) }
                        }
                    }
                }
            }
            override fun onFailure(call: Call<List<XtreamCategory>>, t: Throwable) {}
        })
    }

    private fun shouldLoadLiveCategoryForStartupEpg(mode: ContentMode, autoSelectFirst: Boolean): Boolean {
        if (mode != ContentMode.LIVE_TV || autoSelectFirst) return false
        val needsPlayingChannelHydrated =
            currentChannel != null &&
                (currentLiveChannels.isEmpty() || currentChannel?.name == "Resuming...")
        return pendingEpgRefresh || needsPlayingChannelHydrated
    }

    private fun currentGuideTimelineStartMs(): Long {
        return Calendar.getInstance().apply {
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            set(Calendar.MINUTE, 0)
        }.timeInMillis
    }

    private fun liveCategoryForStartupEpg(rows: List<XtreamCategory>): XtreamCategory? {
        val preferred = rows.getOrNull(lastCategoryPosition)
        if (preferred != null && !isPlaylistHeader(preferred) && !preferred.id.isVirtualLiveCategoryId()) {
            return preferred
        }
        return rows.firstOrNull { !isPlaylistHeader(it) && !it.id.isVirtualLiveCategoryId() }
    }

    private fun buildPlaylistCategoryRows(categories: List<XtreamCategory>): List<XtreamCategory> {
        val profiles = PlaylistProfilesManager.loadProfiles(this)
        if (profiles.isEmpty()) return categories
        val profileIds = profiles.map { it.id }
        if (!playlistExpansionInitialized || (expandedPlaylistProfileId != null && expandedPlaylistProfileId !in profileIds)) {
            expandedPlaylistProfileId = PlaylistProfilesManager.getActiveProfileId(this)
                ?.takeIf { activeId -> activeId in profileIds }
                ?: profiles.first().id
            playlistExpansionInitialized = true
        }
        return buildList {
            profiles.forEach { profile ->
                val expanded = profile.id == expandedPlaylistProfileId
                val arrow = if (expanded) "v" else ">"
                add(
                    XtreamCategory(
                        id = playlistHeaderId(profile.id),
                        name = "$arrow ${profile.name}",
                        parentId = -1
                    )
                )
                if (expanded) {
                    addAll(categories)
                }
            }
        }
    }

    private fun buildProviderCategoriesForMode(rawCategories: List<XtreamCategory>, mode: ContentMode): List<XtreamCategory> {
        val byId = LinkedHashMap<String, XtreamCategory>()
        rawCategories.forEach { category ->
            val id = cleanProviderCategoryId(category.id)
            if (id.isBlank() || id.isVirtualCategoryId()) return@forEach
            val name = category.name.trim().ifBlank { categoryDisplayNameFromId(id) }
            byId.putIfAbsent(id, XtreamCategory(id, name, category.parentId))
        }

        providerStreamCategoryIdsForMode(mode).forEach { id ->
            if (id.isBlank() || id.isVirtualCategoryId()) return@forEach
            byId.putIfAbsent(id, XtreamCategory(id, categoryDisplayNameFromId(id), 0))
        }

        return byId.values.toList()
    }

    private fun providerStreamCategoryIdsForCurrentMode(): List<String> =
        providerStreamCategoryIdsForMode(currentMode)

    private fun providerStreamCategoryIdsForMode(mode: ContentMode): List<String> {
        val keys = when (mode) {
            ContentMode.LIVE_TV -> cachedLiveStreams?.keys.orEmpty()
            ContentMode.MOVIES -> cachedVodStreams?.keys.orEmpty()
            ContentMode.SERIES -> cachedSeries?.keys.orEmpty()
        }
        return keys
            .flatMap { splitProviderCategoryIds(it) }
            .map { cleanProviderCategoryId(it) }
            .filter { it.isNotBlank() }
            .distinct()
    }

    private fun ensureLibraryCategoryBackfill(rawCategories: List<XtreamCategory>, generation: Int, mode: ContentMode) {
        if (mode == ContentMode.MOVIES && cachedVodStreams == null) {
            val service = XtreamManager.getService() ?: return
            service.getVodStreams(XtreamManager.username, XtreamManager.password, null)
                .enqueue(object : Callback<List<XtreamVodStream>> {
                    override fun onResponse(call: Call<List<XtreamVodStream>>, response: Response<List<XtreamVodStream>>) {
                        if (generation != categoryFetchGeneration || mode != currentMode || !response.isSuccessful) return
                        cachedVodStreams = groupVodStreamsByCategory(response.body().orEmpty())
                        rebuildLibraryCategoryRows(rawCategories, generation, mode)
                    }

                    override fun onFailure(call: Call<List<XtreamVodStream>>, t: Throwable) {}
                })
        } else if (mode == ContentMode.SERIES && cachedSeries == null) {
            val service = XtreamManager.getService() ?: return
            service.getSeries(XtreamManager.username, XtreamManager.password, null)
                .enqueue(object : Callback<List<XtreamSeries>> {
                    override fun onResponse(call: Call<List<XtreamSeries>>, response: Response<List<XtreamSeries>>) {
                        if (generation != categoryFetchGeneration || mode != currentMode || !response.isSuccessful) return
                        cachedSeries = groupSeriesByCategory(response.body().orEmpty())
                        rebuildLibraryCategoryRows(rawCategories, generation, mode)
                    }

                    override fun onFailure(call: Call<List<XtreamSeries>>, t: Throwable) {}
                })
        }
    }

    private fun rebuildLibraryCategoryRows(rawCategories: List<XtreamCategory>, generation: Int, mode: ContentMode) {
        if (generation != categoryFetchGeneration || mode != currentMode || mode == ContentMode.LIVE_TV) return
        lifecycleScope.launch {
            if (generation != categoryFetchGeneration || mode != currentMode) return@launch
            val proUnlocked = ProEntitlement.isProUnlocked(this@MainActivity)
            val savedOrder = if (proUnlocked) {
                db.groupOrderDao().getAllOrder().first().associateBy({ it.groupId }, { it.position })
            } else {
                emptyMap()
            }
            val categories = buildProviderCategoriesForMode(rawCategories, mode)
            val filtered = sortLibraryCategories(categories, mode, savedOrder, proUnlocked).toMutableList()
            if (mode == ContentMode.MOVIES) {
                filtered.add(0, XtreamCategory(ALL_MOVIES_ID, "All movies", 0))
                filtered.add(0, XtreamCategory(MY_LIST_MOVIES_ID, "My List", 0))
            } else if (mode == ContentMode.SERIES) {
                filtered.add(0, XtreamCategory(ALL_SERIES_ID, "All series", 0))
                filtered.add(0, XtreamCategory(MY_LIST_SERIES_ID, "My List", 0))
            }
            val rows = buildPlaylistCategoryRows(filtered)
            categoryAdapter.submitList(rows)
            logLibraryCategorySnapshot(rawCategories, rows, mode)
        }
    }

    private fun sortLibraryCategories(
        categories: List<XtreamCategory>,
        mode: ContentMode,
        savedOrder: Map<String, Int>,
        proUnlocked: Boolean
    ): List<XtreamCategory> {
        if (mode == ContentMode.LIVE_TV) {
            return if (proUnlocked) {
                categories.sortedWith(compareBy<XtreamCategory> { savedOrder[it.id] ?: Int.MAX_VALUE }.thenBy { it.name })
            } else {
                categories
            }
        }
        val honorsManualOrder = proUnlocked && savedOrder.isNotEmpty()
        return categories.sortedWith(
            compareBy<XtreamCategory> { if (honorsManualOrder) savedOrder[it.id] ?: Int.MAX_VALUE else 0 }
                .thenBy { libraryCategoryPriority(it.name) }
                .thenBy { it.name.lowercase(Locale.getDefault()) }
        )
    }

    private fun libraryCategoryPriority(name: String): Int {
        val normalized = name.lowercase(Locale.getDefault())
        return when {
            "current most popular" in normalized -> 0
            "top 100" in normalized -> 1
            Regex("""\b20\d{2}\b""").containsMatchIn(normalized) -> 2
            normalized.contains("4k") || normalized.contains("uhd") -> 3
            normalized.contains("new") || normalized.contains("recent") -> 4
            else -> 10
        }
    }

    private fun logLibraryCategorySnapshot(rawCategories: List<XtreamCategory>, rows: List<XtreamCategory>, mode: ContentMode) {
        if (mode == ContentMode.LIVE_TV) return
        val visible = rows
            .filterNot { isPlaylistHeader(it) }
            .filterNot { it.id.isVirtualCategoryId() }
        val streamKeys = providerStreamCategoryIdsForMode(mode)
        val rawIds = rawCategories.map { cleanProviderCategoryId(it.id) }.filter { it.isNotBlank() }.toSet()
        val visibleIds = visible.map { it.id }.toSet()
        val visibleSample = visible.joinToString(", ") { "${it.name}(${it.id})" }.ifBlank { "none" }
        val missingRaw = rawCategories
            .filterNot { cleanProviderCategoryId(it.id) in visibleIds }
            .take(24)
            .joinToString(", ") { "${it.name}(${it.id})" }
            .ifBlank { "none" }
        val streamOnly = streamKeys
            .filterNot { it in rawIds }
            .filterNot { it in visibleIds }
            .take(24)
            .joinToString(", ")
            .ifBlank { "none" }
        Log.i(
            TAG,
            "${mode.label()} category snapshot: provider=${rawCategories.size}, " +
                "streamKeys=${streamKeys.size}, visible=${visible.size}, " +
                "visibleSample=$visibleSample, missingProvider=$missingRaw, streamOnly=$streamOnly"
        )
    }

    private fun groupVodStreamsByCategory(streams: List<XtreamVodStream>): Map<String, List<XtreamVodStream>> {
        val map = LinkedHashMap<String, MutableList<XtreamVodStream>>()
        streams.forEach { stream ->
            val ids = splitProviderCategoryIds(stream.categoryId.orEmpty())
                .map { cleanProviderCategoryId(it) }
                .filter { it.isNotBlank() }
                .ifEmpty { listOf("") }
            ids.forEach { id -> map.getOrPut(id) { mutableListOf() }.add(stream) }
        }
        return map
    }

    private fun groupSeriesByCategory(series: List<XtreamSeries>): Map<String, List<XtreamSeries>> {
        val map = LinkedHashMap<String, MutableList<XtreamSeries>>()
        series.forEach { item ->
            val ids = splitProviderCategoryIds(item.categoryId.orEmpty())
                .map { cleanProviderCategoryId(it) }
                .filter { it.isNotBlank() }
                .ifEmpty { listOf("") }
            ids.forEach { id -> map.getOrPut(id) { mutableListOf() }.add(item) }
        }
        return map
    }

    private fun splitProviderCategoryIds(raw: String): List<String> {
        val trimmed = raw.trim()
        if (trimmed.isBlank()) return emptyList()
        val withoutBrackets = trimmed.trim('[', ']')
        return withoutBrackets
            .split(',', '|', ';')
            .map { it.trim().trim('"', '\'') }
            .filter { it.isNotBlank() }
            .ifEmpty { listOf(trimmed) }
    }

    private fun cleanProviderCategoryId(raw: String?): String {
        return raw
            ?.trim()
            ?.trim('"', '\'')
            ?.takeIf { !it.equals("null", ignoreCase = true) }
            .orEmpty()
    }

    private fun categoryDisplayNameFromId(id: String): String {
        return when {
            id.equals("0", ignoreCase = true) -> "Uncategorized"
            id.all { it.isDigit() } -> "Category $id"
            else -> id
        }
    }

    private fun handlePlaylistHeaderClick(category: XtreamCategory) {
        val profileId = category.id.removePrefix(CategoryAdapter.PLAYLIST_HEADER_PREFIX)
        val samePlaylist = expandedPlaylistProfileId == profileId
        categoryFetchGeneration++
        contentFetchGeneration++
        expandedPlaylistProfileId = if (samePlaylist) null else profileId
        playlistExpansionInitialized = true
        if (samePlaylist) {
            fetchCategories(autoSelectFirst = false, shouldScrollToActive = true)
            return
        }
        if (!samePlaylist) {
            PlaylistProfilesManager.setActiveProfile(this, profileId)
            XtreamManager.initFromPrefs(this)
            currentContentCall?.cancel()
            currentContentCall = null
            cachedRawCategories = null
            cachedLiveStreams = null
            cachedVodStreams = null
            cachedSeries = null
            cachedM3uChannels = null
            cachedXtreamM3uPlusChannels = null
            currentLiveChannels = emptyList()
            currentLiveCategoryId = null
            liveStreamsPrefetchInFlight.clear()
            pendingEpgCalls.forEach { it.cancel() }
            pendingEpgCalls.clear()
            epgInFlightStreamIds.clear()
            epgQueuedStreamIds.clear()
            epgFetchQueue.clear()
            epgActiveFetchCount = 0
            epgCacheByStreamId.clear()
            epgAdapter.setData(emptyList())
        }
        fetchCategories(autoSelectFirst = !samePlaylist, shouldScrollToActive = true)
    }

    private fun playlistHeaderId(profileId: String): String =
        CategoryAdapter.PLAYLIST_HEADER_PREFIX + profileId

    private fun isPlaylistHeader(category: XtreamCategory): Boolean =
        category.id.startsWith(CategoryAdapter.PLAYLIST_HEADER_PREFIX)

    private fun firstCategoryRowIndex(rows: List<XtreamCategory>): Int =
        rows.indexOfFirst { !isPlaylistHeader(it) }.takeIf { it >= 0 } ?: 0

    private fun firstStartupCategoryRowIndex(rows: List<XtreamCategory>, mode: ContentMode): Int =
        rows.indexOfFirst { it.isAutoSelectableStartupCategory(mode) }
            .takeIf { it >= 0 }
            ?: firstCategoryRowIndex(rows)

    private fun XtreamCategory.isAutoSelectableStartupCategory(mode: ContentMode): Boolean {
        if (isPlaylistHeader(this)) return false
        return mode != ContentMode.LIVE_TV || !id.isVirtualLiveCategoryId()
    }

    private fun preloadAllStreams() {
        if (!isPlaylistEnabled()) return
        if (isM3uPlaylist()) {
            lifecycleScope.launch {
                loadM3uChannels()
                refreshRecentChannelsRow()
            }
            return
        }
        val service = XtreamManager.getService() ?: return
        service.getLiveStreams(XtreamManager.username, XtreamManager.password, null)
            .enqueue(object : Callback<List<XtreamLiveStream>> {
                override fun onResponse(call: Call<List<XtreamLiveStream>>, response: Response<List<XtreamLiveStream>>) {
                    if (response.isSuccessful) {
                        cachedLiveStreams = (response.body() ?: emptyList()).groupBy { it.categoryId ?: "" }
                        runOnUiThread {
                            syncCurrentLiveChannelFromCachedStreams()
                            refreshRecentChannelsRow()
                        }
                    }
                }
                override fun onFailure(call: Call<List<XtreamLiveStream>>, t: Throwable) {}
            })
        service.getVodStreams(XtreamManager.username, XtreamManager.password, null)
            .enqueue(object : Callback<List<XtreamVodStream>> {
                override fun onResponse(call: Call<List<XtreamVodStream>>, response: Response<List<XtreamVodStream>>) {
                    if (response.isSuccessful) {
                        cachedVodStreams = groupVodStreamsByCategory(response.body().orEmpty())
                        if (currentMode == ContentMode.MOVIES) {
                            runOnUiThread { fetchCategories(autoSelectFirst = false, shouldScrollToActive = true) }
                        }
                    }
                }
                override fun onFailure(call: Call<List<XtreamVodStream>>, t: Throwable) {}
            })
        service.getSeries(XtreamManager.username, XtreamManager.password, null)
            .enqueue(object : Callback<List<XtreamSeries>> {
                override fun onResponse(call: Call<List<XtreamSeries>>, response: Response<List<XtreamSeries>>) {
                    if (response.isSuccessful) {
                        cachedSeries = groupSeriesByCategory(response.body().orEmpty())
                        if (currentMode == ContentMode.SERIES) {
                            runOnUiThread { fetchCategories(autoSelectFirst = false, shouldScrollToActive = true) }
                        }
                    }
                }
                override fun onFailure(call: Call<List<XtreamSeries>>, t: Throwable) {}
            })
    }

    private fun fetchContentForCategory(category: XtreamCategory) {
        if (isPlaylistHeader(category)) return
        if (currentMode != ContentMode.LIVE_TV) {
            currentLibraryCategoryName = category.name
        }
        val generation = ++contentFetchGeneration
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
                if (generation != contentFetchGeneration) return@launch
                val favs = db.favoriteDao().getAll().first()
                val m3uById = if (isM3uPlaylist()) loadM3uChannels().associateBy { it.id } else emptyMap()
                if (generation != contentFetchGeneration) return@launch
                val channels = favs.map { fav ->
                    m3uById[fav.streamId.toLong()]?.copy(group = "favorites")
                        ?: Channel(id = fav.streamId.toLong(), name = fav.name, group = "favorites", logoUrl = fav.streamIcon, streamUrl = "", epgId = fav.epgId)
                }
                if (rvContent.adapter != epgAdapter) {
                    rvContent.layoutManager = LinearLayoutManager(this@MainActivity)
                    rvContent.adapter = epgAdapter
                    rvContent.itemAnimator = null
                }
                currentLiveChannels = channels
                currentLiveCategoryId = category.id
                currentLiveChannelIndex = channels.indexOfFirst { it.id == currentChannel?.id }
                if (currentLiveChannelIndex != -1) {
                    rememberLivePlaybackLaunchCategory(currentChannel!!.id, category.id)
                }
                epgAdapter.setData(channels)
                hydrateEpgCacheFromDisk(channels)
                enqueueInitialEpgForChannels(channels)
                refreshRecentChannelsRow()
                maybeRunPendingEpgRefresh()
            }
            return
        }

        if (category.id == "recent") {
            lifecycleScope.launch {
                if (generation != contentFetchGeneration) return@launch
                val channels = buildRecentChannels()
                if (generation != contentFetchGeneration) return@launch
                if (rvContent.adapter != epgAdapter) {
                    rvContent.layoutManager = LinearLayoutManager(this@MainActivity)
                    rvContent.adapter = epgAdapter
                    rvContent.itemAnimator = null
                }
                currentLiveChannels = channels
                currentLiveCategoryId = category.id
                currentLiveChannelIndex = channels.indexOfFirst { it.id == currentChannel?.id }
                if (currentLiveChannelIndex != -1) {
                    rememberLivePlaybackLaunchCategory(currentChannel!!.id, category.id)
                }
                epgAdapter.setData(channels)
                hydrateEpgCacheFromDisk(channels)
                enqueueInitialEpgForChannels(channels)
                refreshRecentChannelsRow()
                maybeRunPendingEpgRefresh()
            }
            return
        }

        if (isM3uPlaylist()) {
            lifecycleScope.launch {
                if (generation != contentFetchGeneration) return@launch
                val modeChannels = loadM3uChannelsForMode(currentMode)
                if (generation != contentFetchGeneration) return@launch
                if (currentMode == ContentMode.LIVE_TV) {
                    val channels = modeChannels.filter { m3uDisplayGroup(it) == category.id }
                    showM3uLiveStreams(channels, category.id, prefs, lastChanId, generation)
                } else {
                    val items = if (category.id == MY_LIST_MOVIES_ID || category.id == MY_LIST_SERIES_ID) {
                        val ids = if (currentMode == ContentMode.MOVIES) getMyListMovieIds() else getMyListSeriesIds()
                        modeChannels.filter { it.id.toInt() in ids }
                    } else if (category.id == ALL_MOVIES_ID || category.id == ALL_SERIES_ID) {
                        modeChannels
                    } else {
                        modeChannels.filter { m3uDisplayGroup(it) == category.id }
                    }
                    showPosterItems(items.map { it.toM3uVodStream() }, lastGridPosition)
                }
            }
            return
        }

        if (category.id == MY_LIST_MOVIES_ID) {
            val allMovies = cachedVodStreams?.values?.flatten().orEmpty().distinctBy { it.streamId }
            val ids = getMyListMovieIds()
            showPosterItems(allMovies.filter { it.streamId in ids }, 0)
            return
        }

        if (category.id == ALL_MOVIES_ID) {
            val allMovies = cachedVodStreams?.values?.flatten().orEmpty().distinctBy { it.streamId }
            showPosterItems(allMovies, 0)
            return
        }

        if (category.id == MY_LIST_SERIES_ID) {
            val allSeries = cachedSeries?.values?.flatten().orEmpty().distinctBy { it.seriesId }
            val ids = getMyListSeriesIds()
            showPosterItems(allSeries.filter { it.seriesId in ids }, 0)
            return
        }

        if (category.id == ALL_SERIES_ID) {
            val allSeries = cachedSeries?.values?.flatten().orEmpty().distinctBy { it.seriesId }
            showPosterItems(allSeries, 0)
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
                    showLiveStreams(cached, category.id, prefs, lastChanId, generation)
                } else {
                    val service = XtreamManager.getService() ?: return
                    val call = service.getLiveStreams(XtreamManager.username, XtreamManager.password, category.id)
                    currentContentCall = call
                    call.enqueue(object : Callback<List<XtreamLiveStream>> {
                        override fun onResponse(call: Call<List<XtreamLiveStream>>, response: Response<List<XtreamLiveStream>>) {
                            if (generation != contentFetchGeneration || call.isCanceled) return
                            if (response.isSuccessful) {
                                val body = response.body() ?: emptyList()
                                val map = (cachedLiveStreams ?: emptyMap()).toMutableMap()
                                map[category.id] = body
                                cachedLiveStreams = map
                                showLiveStreams(body, category.id, prefs, lastChanId, generation)
                            }
                        }
                        override fun onFailure(call: Call<List<XtreamLiveStream>>, t: Throwable) {}
                    })
                }
            }
            ContentMode.MOVIES -> {
                lastGridPosition = 0
                val cached = cachedVodStreams?.get(category.id)
                if (cached != null) {
                    showPosterItems(cached, lastGridPosition)
                } else {
                    val service = XtreamManager.getService() ?: return
                    val call = service.getVodStreams(XtreamManager.username, XtreamManager.password, category.id)
                    currentContentCall = call
                    call.enqueue(object : Callback<List<XtreamVodStream>> {
                        override fun onResponse(call: Call<List<XtreamVodStream>>, response: Response<List<XtreamVodStream>>) {
                            if (generation != contentFetchGeneration || call.isCanceled) return
                            if (currentMode != ContentMode.MOVIES) return
                            if (response.isSuccessful) {
                                showPosterItems(response.body()?.toList() ?: emptyList(), lastGridPosition)
                            }
                        }
                        override fun onFailure(call: Call<List<XtreamVodStream>>, t: Throwable) {}
                    })
                }
            }
            ContentMode.SERIES -> {
                lastGridPosition = 0
                val cached = cachedSeries?.get(category.id)
                if (cached != null) {
                    showPosterItems(cached, lastGridPosition)
                } else {
                    val service = XtreamManager.getService() ?: return
                    val call = service.getSeries(XtreamManager.username, XtreamManager.password, category.id)
                    currentContentCall = call
                    call.enqueue(object : Callback<List<XtreamSeries>> {
                        override fun onResponse(call: Call<List<XtreamSeries>>, response: Response<List<XtreamSeries>>) {
                            if (generation != contentFetchGeneration || call.isCanceled) return
                            if (currentMode != ContentMode.SERIES) return
                            if (response.isSuccessful) {
                                showPosterItems(response.body()?.toList() ?: emptyList(), lastGridPosition)
                            }
                        }
                        override fun onFailure(call: Call<List<XtreamSeries>>, t: Throwable) {}
                    })
                }
            }
        }
    }

    private fun showLiveStreams(
        streams: List<XtreamLiveStream>,
        categoryId: String,
        prefs: android.content.SharedPreferences,
        lastChanId: Long,
        generation: Int = contentFetchGeneration
    ) {
        lifecycleScope.launch {
            if (generation != contentFetchGeneration) return@launch
            val hiddenChannels = db.hiddenChannelDao().getAllHidden().first().map { it.channelId }.toSet()
            if (generation != contentFetchGeneration) return@launch
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
            if (currentChannel?.name == "Resuming..." || sortedChannels.any { it.id == currentChannel?.id }) {
                syncCurrentLiveChannelFromCachedStreams()
            }
            currentLiveChannelIndex = sortedChannels.indexOfFirst { it.id == currentChannel?.id }
            epgAdapter.setData(sortedChannels)
            hydrateEpgCacheFromDisk(sortedChannels)
            // Paint cached EPG immediately so rows fill instantly while network refresh runs.
            sortedChannels.forEach { ch ->
                val cached = epgCacheByStreamId[ch.id.toInt()]
                if (!cached.isNullOrEmpty()) {
                    setEpgDataBuffered(ch.id.toInt(), cached.orEmpty())
                }
            }
            val playingIdx = sortedChannels.indexOfFirst { it.id == currentChannel?.id }
            currentChannel
                ?.takeIf { playingIdx in sortedChannels.indices }
                ?.let { channel ->
                    updateFocusInfo(
                        channel,
                        epgCacheByStreamId[channel.id.toInt()]
                            ?.firstOrNull { listing ->
                                val now = System.currentTimeMillis() / 1000
                                now >= listing.startTimestamp && now < listing.stopTimestamp
                            },
                        respectSuppressWindow = false
                    )
                }
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
            epgAdapter.suppressPlayingIndicatorUpdatesUntilMs = 0L
            epgAdapter.setCurrentPlayingChannelId(currentChannel?.id)
            epgAdapter.refreshPlayingIndicatorRows(currentChannel?.id)
            centerRecyclerPosition(rvContent, targetRow, 34)
            if (currentState == UiState.EPG_GRID && currentLiveCategoryId == categoryId) {
                rvContent.post { focusEpgRowAt(targetRow) }
            }
            enqueueInitialEpgForChannels(sortedChannels)
            prefetchAdjacentLiveGroups(categoryId)
            refreshRecentChannelsRow()
            maybeRunPendingEpgRefresh()
        }
    }

    private fun maybeRunPendingEpgRefresh() {
        if (!pendingEpgRefresh) return
        if (currentMode != ContentMode.LIVE_TV) return
        if (currentLiveChannels.isEmpty()) {
            fetchCategories(autoSelectFirst = false, shouldScrollToActive = true)
            return
        }
        markEpgRefreshInProgress()
        resetEpgFetchQueue(cancelInFlight = true)
        enqueueEpgForChannels(currentLiveChannels, forceRefresh = true)
        pendingEpgRefresh = false
        processEpgFetchQueue()
    }

    private fun markEpgRefreshInProgress() {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putBoolean(KEY_EPG_UPDATE_IN_PROGRESS, true)
            .putLong(KEY_EPG_UPDATE_STARTED_AT, System.currentTimeMillis())
            .apply()
    }

    private fun markEpgRefreshFinished() {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val wasUpdating = prefs.getBoolean(KEY_EPG_UPDATE_IN_PROGRESS, false)
        if (!wasUpdating) return
        prefs.edit()
            .putBoolean(KEY_EPG_UPDATE_IN_PROGRESS, false)
            .remove(KEY_EPG_UPDATE_STARTED_AT)
            .putLong(KEY_EPG_LAST_REFRESHED_AT, System.currentTimeMillis())
            .apply()
        if (pendingEpgRefreshUserRequested) {
            Toast.makeText(this, "EPG updated", Toast.LENGTH_SHORT).show()
            pendingEpgRefreshUserRequested = false
        }
    }

    private fun shouldRefreshEpgOnStartup(prefs: android.content.SharedPreferences): Boolean {
        if (!prefs.getBoolean(KEY_EPG_UPDATE_ON_START, true)) return false
        if (!prefs.getBoolean(KEY_EPG_AUTO_UPDATE, true)) return false
        val lastRefresh = prefs.getLong(KEY_EPG_LAST_REFRESHED_AT, 0L)
        if (lastRefresh <= 0L) return true
        return System.currentTimeMillis() - lastRefresh >= epgAutoUpdateIntervalMs(prefs)
    }

    private fun epgAutoUpdateIntervalMs(prefs: android.content.SharedPreferences): Long {
        return when (prefs.getInt(KEY_EPG_UPDATE_INTERVAL, 2).coerceIn(0, 3)) {
            0 -> 2L
            1 -> 6L
            2 -> 12L
            else -> 24L
        } * 60L * 60L * 1000L
    }

    private fun handleEpgSettingsInvalidation(
        prefs: android.content.SharedPreferences,
        forceRefreshRequested: Boolean = false
    ): Boolean {
        val signature = currentEpgSettingsSignature(prefs)
        val previous = prefs.getString(KEY_EPG_SETTINGS_SIGNATURE, null)
        val clearRequested = prefs.getBoolean(KEY_EPG_CLEAR_REQUESTED, false)
        val settingsChanged = previous != null && previous != signature
        if (previous == null && !forceRefreshRequested && !clearRequested) {
            prefs.edit()
                .putString(KEY_EPG_SETTINGS_SIGNATURE, signature)
                .apply()
            return false
        }
        if (!forceRefreshRequested && !clearRequested && !settingsChanged && previous == signature) return false

        prefs.edit()
            .putString(KEY_EPG_SETTINGS_SIGNATURE, signature)
            .putBoolean(KEY_EPG_CLEAR_REQUESTED, false)
            .apply()

        pendingEpgRefresh = true
        if (forceRefreshRequested && !clearRequested && !settingsChanged) {
            maybeRunPendingEpgRefresh()
            return true
        }

        lifecycleScope.launch {
            if (clearRequested) {
                resetEpgFetchQueue(cancelInFlight = true)
                withContext(Dispatchers.IO) {
                    db.epgCacheDao().clearAll()
                    db.epgChannelMappingDao().clearAll()
                }
                epgCacheByStreamId.clear()
                pendingEpgUiUpdates.clear()
                if (::epgAdapter.isInitialized) {
                    epgAdapter.clearEpgData()
                }
            }
            SecondaryEpgProvider.clearCache()
            Toast.makeText(
                this@MainActivity,
                when {
                    clearRequested -> "EPG cleared"
                    forceRefreshRequested -> "Reloading guide."
                    else -> "EPG settings changed. Reloading guide."
                },
                Toast.LENGTH_SHORT
            ).show()
            maybeRunPendingEpgRefresh()
        }
        return true
    }

    private fun currentEpgSettingsSignature(prefs: android.content.SharedPreferences): String {
        val urls = prefs.getString("secondary_epg_urls", "").orEmpty().trim()
        val legacyUrl = prefs.getString("secondary_epg_url", "").orEmpty().trim()
        return listOf(
            prefs.getBoolean(KEY_SECONDARY_EPG_ENABLED, false).toString(),
            prefs.getInt(KEY_SECONDARY_EPG_MODE, SECONDARY_EPG_MODE_FILL_MISSING).toString(),
            prefs.getInt(KEY_EPG_DAYS, 2).toString(),
            urls,
            legacyUrl
        ).joinToString("|")
    }

    private fun enqueueInitialEpgForChannels(channels: List<Channel>) {
        if (!pendingEpgRefresh) {
            enqueueEpgForChannels(channels)
        }
    }

    private fun resetEpgFetchQueue(cancelInFlight: Boolean) {
        if (cancelInFlight) {
            pendingEpgCalls.forEach { it.cancel() }
            pendingEpgCalls.clear()
        }
        epgInFlightStreamIds.clear()
        epgQueuedStreamIds.clear()
        epgFetchQueue.clear()
        epgActiveFetchCount = 0
    }

    private suspend fun applyLiveChannelSort(channels: List<Channel>, categoryId: String): List<Channel> {
        if (!ProEntitlement.isProUnlocked(this)) return channels
        val sortMode = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString("sort_mode", "Default")
            ?: "Default"
        return when (sortMode) {
            "Alphabetical" -> channels.sortedBy { it.name.lowercase(Locale.getDefault()) }
            "Numerical" -> channels.sortedWith(compareBy<Channel> { it.number }.thenBy { it.name.lowercase(Locale.getDefault()) })
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
                setEpgDataBuffered(streamId, cached)
            }
            if (cached.hasCurrentGuideWindowListings()) {
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
        if (shouldUseOnlySecondaryEpg()) {
            enqueueEpgWindowForChannels(channels, anchorIndex, forceRefresh)
            return
        }
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

    private fun enqueueEpgWindowForChannels(
        channels: List<Channel>,
        anchorIndex: Int,
        forceRefresh: Boolean = false,
        clearPending: Boolean = false
    ) {
        if (channels.isEmpty()) return
        if (clearPending) {
            epgFetchQueue.clear()
            epgQueuedStreamIds.clear()
        }
        val anchor = anchorIndex.coerceIn(0, channels.lastIndex)
        val ordered = ArrayList<Channel>((xmlOnlyEpgWindowRadius * 2) + 1)
        ordered.add(channels[anchor])
        for (delta in 1..xmlOnlyEpgWindowRadius) {
            val down = anchor + delta
            if (down < channels.size) ordered.add(channels[down])
            val up = anchor - delta
            if (up >= 0) ordered.add(channels[up])
        }
        ordered.forEach { fetchRowEpg(it, forceRefresh) }
    }

    private fun processEpgFetchQueue() {
        if (epgFetchQueue.isEmpty() && epgActiveFetchCount == 0) {
            markEpgRefreshFinished()
            return
        }
        val concurrencyLimit = if (shouldUseOnlySecondaryEpg()) 2 else maxConcurrentEpgFetches
        while (epgActiveFetchCount < concurrencyLimit && epgFetchQueue.isNotEmpty()) {
            val (channel, forceRefresh) = epgFetchQueue.removeFirst()
            val streamId = channel.id.toInt()
            epgQueuedStreamIds.remove(streamId)
            if (epgInFlightStreamIds.contains(streamId)) continue
            if (!forceRefresh) {
                val cached = epgCacheByStreamId[streamId]
                if (!cached.isNullOrEmpty()) {
                    setEpgDataBuffered(streamId, cached)
                }
                if (cached.hasCurrentGuideWindowListings()) {
                    continue
                }
            }
            if (!epgInFlightStreamIds.add(streamId)) continue
            if (shouldUseOnlySecondaryEpg()) {
                epgActiveFetchCount++
                lifecycleScope.launch {
                    val secondary = applySecondaryEpgFallback(channel, emptyList())
                    keepExistingEpgWhenRefreshIsEmpty(streamId, secondary)
                    finishEpgFetch(streamId)
                }
                continue
            }
            val service = XtreamManager.getService() ?: run {
                keepExistingEpgWhenRefreshIsEmpty(streamId, emptyList())
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
                    if (!response.isSuccessful) {
                        keepExistingEpgWhenRefreshIsEmpty(streamId, emptyList())
                        finishEpgFetch(streamId)
                        return
                    }
                    val primary = response.body()?.listings.orEmpty()
                    lifecycleScope.launch {
                        val merged = applySecondaryEpgFallback(channel, primary)
                        keepExistingEpgWhenRefreshIsEmpty(streamId, merged)
                        finishEpgFetch(streamId)
                    }
                }
                override fun onFailure(call: Call<XtreamEpgResponse>, t: Throwable) {
                    pendingEpgCalls.remove(call)
                    lifecycleScope.launch {
                        val merged = applySecondaryEpgFallback(channel, emptyList())
                        keepExistingEpgWhenRefreshIsEmpty(streamId, merged)
                        finishEpgFetch(streamId)
                    }
                }
            })
        }
        if (epgFetchQueue.isEmpty() && epgActiveFetchCount == 0) {
            markEpgRefreshFinished()
        }
    }

    private fun finishEpgFetch(streamId: Int) {
        epgInFlightStreamIds.remove(streamId)
        epgActiveFetchCount = (epgActiveFetchCount - 1).coerceAtLeast(0)
        processEpgFetchQueue()
    }

    private fun shouldUseOnlySecondaryEpg(): Boolean {
        if (!ProEntitlement.isProUnlocked(this)) return false
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        return prefs.getBoolean(KEY_SECONDARY_EPG_ENABLED, false) &&
            prefs.getInt(KEY_SECONDARY_EPG_MODE, SECONDARY_EPG_MODE_FILL_MISSING) == SECONDARY_EPG_MODE_SECONDARY_ONLY
    }

    private fun setEpgDataBuffered(streamId: Int, listings: List<XtreamEpgListing>) {
        val now = System.currentTimeMillis()
        val shouldDefer = currentMode == ContentMode.LIVE_TV &&
            currentState == UiState.EPG_GRID &&
            (isRvContentScrolling || now < epgUiSuppressUntilMs)
        if (!shouldDefer) {
            epgAdapter.setEpgData(streamId, listings)
            refreshLiveProgramInfoIfCurrent(streamId, listings)
            return
        }
        pendingEpgUiUpdates[streamId] = listings
        schedulePendingEpgUiFlush()
    }

    private fun keepExistingEpgWhenRefreshIsEmpty(streamId: Int, refreshed: List<XtreamEpgListing>) {
        if (refreshed.isNotEmpty()) {
            cacheEpg(streamId, refreshed)
            setEpgDataBuffered(streamId, refreshed)
            return
        }
        val existing = epgCacheByStreamId[streamId]
        if (!existing.isNullOrEmpty()) {
            setEpgDataBuffered(streamId, existing)
        }
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
            refreshLiveProgramInfoIfCurrent(streamId, listings)
        }
    }

    private fun showM3uLiveStreams(
        channels: List<Channel>,
        categoryId: String,
        prefs: android.content.SharedPreferences,
        lastChanId: Long,
        generation: Int = contentFetchGeneration
    ) {
        lifecycleScope.launch {
            if (generation != contentFetchGeneration) return@launch
            if (rvContent.adapter != epgAdapter) {
                rvContent.layoutManager = LinearLayoutManager(this@MainActivity)
                rvContent.adapter = epgAdapter
                rvContent.itemAnimator = null
            }
            val hiddenChannels = db.hiddenChannelDao().getAllHidden().first().map { it.channelId }.toSet()
            if (generation != contentFetchGeneration) return@launch
            val sortedChannels = applyLiveChannelSort(
                channels.filter { it.id !in hiddenChannels },
                categoryId
            )
            currentLiveCategoryId = categoryId
            currentLiveChannels = sortedChannels
            currentLiveChannelIndex = sortedChannels.indexOfFirst { it.id == currentChannel?.id }
            epgAdapter.setData(sortedChannels)
            hydrateEpgCacheFromDisk(sortedChannels)
            sortedChannels.forEach { ch ->
                val cached = epgCacheByStreamId[ch.id.toInt()]
                if (!cached.isNullOrEmpty()) {
                    setEpgDataBuffered(ch.id.toInt(), cached.orEmpty())
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
            epgAdapter.suppressPlayingIndicatorUpdatesUntilMs = 0L
            epgAdapter.setCurrentPlayingChannelId(currentChannel?.id)
            epgAdapter.refreshPlayingIndicatorRows(currentChannel?.id)
            centerRecyclerPosition(rvContent, targetRow, 34)
            if (currentState == UiState.EPG_GRID && currentLiveCategoryId == categoryId) {
                rvContent.post { focusEpgRowAt(targetRow) }
            }
            enqueueInitialEpgForChannels(sortedChannels)
            refreshRecentChannelsRow()
            maybeRunPendingEpgRefresh()
        }
    }

    private fun refreshLiveProgramInfoIfCurrent(streamId: Int, listings: List<XtreamEpgListing>) {
        if (currentMode != ContentMode.LIVE_TV) return
        val channel = currentChannel?.takeIf { it.id.toInt() == streamId }
            ?: currentLiveChannels.firstOrNull { it.id.toInt() == streamId }
            ?: return
        if (currentChannel?.id != channel.id) return
        val now = System.currentTimeMillis() / 1000
        val currentlyAiring = listings.firstOrNull { listing ->
            now >= listing.startTimestamp && now < listing.stopTimestamp
        }
        updateFocusInfo(channel, currentlyAiring)
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
        clearEpgCacheIfRequested()
        if (channels.isEmpty()) return
        val now = System.currentTimeMillis()
        val cutoff = now - epgDiskCacheTtlMs
        val ids = channels.map { it.id.toInt() }.distinct()
        val entries = withContext(Dispatchers.IO) {
            db.epgCacheDao().deleteOlderThan(cutoff)
            ids.chunked(400).flatMap { chunk ->
                db.epgCacheDao().getByStreamIds(chunk)
            }
        }
        val hydratedIds = mutableSetOf<Int>()
        entries.forEach { entry ->
            if (entry.updatedAtMs < cutoff) return@forEach
            val parsed = parseEpgListingsJson(entry.listingsJson)
            if (parsed.isNotEmpty()) {
                epgCacheByStreamId[entry.streamId] = parsed
                setEpgDataBuffered(entry.streamId, parsed)
            }
            if (parsed.hasCurrentGuideWindowListings()) {
                hydratedIds.add(entry.streamId)
            }
        }
        hydrateMissingRowsFromSecondaryIndex(channels, hydratedIds)
    }

    private suspend fun hydrateMissingRowsFromSecondaryIndex(
        channels: List<Channel>,
        hydratedIds: Set<Int>
    ) {
        if (!ProEntitlement.isProUnlocked(this)) return
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        if (!prefs.getBoolean(KEY_SECONDARY_EPG_ENABLED, false)) return
        val secondaryMode = prefs.getInt(KEY_SECONDARY_EPG_MODE, SECONDARY_EPG_MODE_FILL_MISSING)
            .coerceIn(SECONDARY_EPG_MODE_FILL_MISSING, SECONDARY_EPG_MODE_PROVIDER_ONLY)
        if (secondaryMode == SECONDARY_EPG_MODE_PROVIDER_ONLY) return

        channels.forEach { channel ->
            val streamId = channel.id.toInt()
            if (streamId in hydratedIds || epgCacheByStreamId[streamId].hasCurrentGuideWindowListings()) return@forEach
            val cachedSecondary = SecondaryEpgProvider.getCachedListingsForChannelCandidates(
                this,
                secondaryLookupCandidates(channel)
            )
            val secondary = cachedSecondary.ifEmpty {
                applySecondaryEpgFallback(channel, emptyList())
            }
            if (secondary.isNotEmpty()) {
                cacheEpg(streamId, secondary)
                setEpgDataBuffered(streamId, secondary)
            }
        }
    }

    private fun parseEpgListingsJson(raw: String): List<XtreamEpgListing> {
        return runCatching {
            gson.fromJson(raw, Array<XtreamEpgListing>::class.java)?.toList().orEmpty()
        }.getOrDefault(emptyList())
    }

    private fun List<XtreamEpgListing>?.hasCurrentGuideWindowListings(): Boolean {
        if (isNullOrEmpty()) return false
        val now = System.currentTimeMillis() / 1000L
        val windowStart = now - (30L * 60L)
        val windowEnd = now + (8L * 60L * 60L)
        return any { listing ->
            listing.stopTimestamp > windowStart && listing.startTimestamp < windowEnd
        }
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
        if (!ProEntitlement.isProUnlocked(this)) return primary
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val secondaryMode = prefs.getInt(KEY_SECONDARY_EPG_MODE, SECONDARY_EPG_MODE_FILL_MISSING)
            .coerceIn(SECONDARY_EPG_MODE_FILL_MISSING, SECONDARY_EPG_MODE_PROVIDER_ONLY)
        if (secondaryMode == SECONDARY_EPG_MODE_PROVIDER_ONLY) return primary
        if (!prefs.getBoolean(KEY_SECONDARY_EPG_ENABLED, false)) return primary

        val manualMapping = db.epgChannelMappingDao().getMapping(channel.id)
        val manualSourceUrl = manualMapping?.provider?.removePrefix(EPG_PROVIDER_SECONDARY_PREFIX)
            ?.takeIf { manualMapping.provider.startsWith(EPG_PROVIDER_SECONDARY_PREFIX) }
        if (!manualSourceUrl.isNullOrBlank()) {
            val manual = SecondaryEpgProvider.getListingsForChannel(this, manualMapping.epgChannelId, manualSourceUrl)
            if (manual.isNotEmpty()) {
                return manual
            }
            if (secondaryMode == SECONDARY_EPG_MODE_SECONDARY_ONLY) return emptyList()
        }

        val candidates = secondaryLookupCandidates(channel)
        if (candidates.isEmpty()) {
            return if (secondaryMode == SECONDARY_EPG_MODE_SECONDARY_ONLY) emptyList() else primary
        }
        val secondary = SecondaryEpgProvider.getListingsForChannelCandidates(this, candidates)
        return when (secondaryMode) {
            SECONDARY_EPG_MODE_SECONDARY_FIRST -> secondary.ifEmpty { primary }
            SECONDARY_EPG_MODE_SECONDARY_ONLY -> secondary
            else -> {
                if (secondary.isEmpty()) return primary
                if (primary.isEmpty()) return secondary
                mergeNoInfoListings(primary, secondary)
            }
        }
    }

    private fun secondaryLookupCandidates(channel: Channel): List<String> {
        return listOfNotNull(
            channel.epgId?.takeIf { it.isNotBlank() },
            channel.name.takeIf { it.isNotBlank() }
        ).distinct()
    }

    private fun epgProviderKeyForSource(url: String): String =
        EPG_PROVIDER_SECONDARY_PREFIX + url.trim()

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
        if (!ProEntitlement.isProUnlocked(this)) return 48
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val idx = if (prefs.contains(KEY_EPG_DAYS)) {
            prefs.getInt(KEY_EPG_DAYS, 2)
        } else {
            prefs.getInt(KEY_EPG_DAYS_LEGACY, 2)
        }.coerceIn(0, 3)
        // Approximate half-hour blocks per day; request enough entries for selected range.
        return when (idx) {
            0 -> 48
            1 -> 96
            2 -> 144
            else -> 336
        }
    }

    private fun handleVodClick(item: Any, position: Int) {
        val key = posterItemKey(item)
        val wasSelected = selectedPosterKey == key
        lastGridPosition = position
        updateVodInfo(item)
        selectedPosterKey = key
        scrollPosterRowTo(position, requestFocus = false)
        if (!isTvUiMode() && !wasSelected) {
            return
        }
        showVodActionPanel(item)
    }

    private fun posterItemKey(item: Any): String = when (item) {
        is XtreamVodStream -> "movie:${item.streamId}"
        is XtreamSeries -> "series:${item.seriesId}"
        else -> item.hashCode().toString()
    }

    private fun showVodOptions(item: Any) {
        showVodActionPanel(item)
    }

    private fun showVodActionPanel(item: Any) {
        currentActionDialog?.dismiss()

        val dialog = Dialog(this, android.R.style.Theme_Black_NoTitleBar_Fullscreen)
        currentActionDialog = dialog

        val root = FrameLayout(this).apply {
            setBackgroundColor(Color.BLACK)
        }
        val backdrop = ImageView(this).apply {
            scaleType = ImageView.ScaleType.CENTER_CROP
            alpha = 0.9f
        }
        root.addView(
            backdrop,
            FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
        )
        root.addView(
            View(this).apply { setBackgroundColor(Color.argb(168, 8, 11, 16)) },
            FrameLayout.LayoutParams(
                FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT
            )
        )

        val content = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(dp(28), dp(24), dp(28), dp(22))
        }
        root.addView(
            content,
            FrameLayout.LayoutParams(
                if (isTvUiMode()) (resources.displayMetrics.widthPixels * 0.78f).toInt() else FrameLayout.LayoutParams.MATCH_PARENT,
                FrameLayout.LayoutParams.MATCH_PARENT,
                Gravity.START or Gravity.TOP
            )
        )

        val title = when (item) {
            is XtreamVodStream -> item.name
            is XtreamSeries -> item.name
            else -> "Details"
        }
        content.addView(actionPanelTitle(title))

        val metaView = TextView(this).apply {
            text = if (item is XtreamSeries) "Series" else "Movie"
            setTextColor(Color.rgb(220, 228, 238))
            textSize = if (isTvUiMode()) 18f else 14f
            maxLines = 2
        }
        content.addView(metaView)

        val descriptionView = TextView(this).apply {
            text = "Loading details..."
            setTextColor(Color.WHITE)
            textSize = if (isTvUiMode()) 18f else 14f
            setPadding(0, dp(14), 0, dp(14))
            maxLines = if (isTvUiMode()) 12 else 9
        }
        content.addView(
            descriptionView,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                0,
                1f
            )
        )

        val buttons = LinearLayout(this).apply {
            orientation = LinearLayout.HORIZONTAL
            gravity = Gravity.CENTER_VERTICAL
        }
        content.addView(
            buttons,
            LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            )
        )

        val previewImage = when (item) {
            is XtreamVodStream -> item.streamIcon
            is XtreamSeries -> item.cover
            else -> null
        }
        Glide.with(this).load(previewImage).centerCrop().into(backdrop)
        populateVodDetailWindow(item, backdrop, metaView, descriptionView)

        if (item is XtreamVodStream) {
            buttons.addView(compactVodActionButton("Play") {
                val url = item.directUrl ?: buildVodUrl(item.streamId, item.containerExtension)
                dialog.dismiss()
                playVodWithResume(url, item.name, movieResumeKey(item.streamId))
            })
            buttons.addView(compactVodActionButton("External player") {
                val url = item.directUrl ?: buildVodUrl(item.streamId, item.containerExtension)
                dialog.dismiss()
                openVodInExternalPlayer(url, item.name)
            })
            buttons.addView(compactVodActionButton("Download") {
                val url = item.directUrl ?: buildVodUrl(item.streamId, item.containerExtension)
                downloadMovie(url, item.name, item.containerExtension)
            })
        } else if (item is XtreamSeries) {
            buttons.addView(compactVodActionButton("Open") {
                val intent = Intent(this, SeriesDetailsActivity::class.java).apply {
                    putExtra("series_id", item.seriesId)
                    putExtra("series_name", item.name)
                    putExtra("series_cover", item.cover)
                }
                dialog.dismiss()
                launchInternalActivity(intent)
            })
        }

        val toggleLabel = if (isInMyList(item)) "Remove List" else "My List"
        buttons.addView(compactVodActionButton(toggleLabel) {
            toggleMyList(item)
        })
        buttons.addView(compactVodActionButton("Close") {
            dialog.dismiss()
        })

        dialog.setOnDismissListener {
            if (currentActionDialog === dialog) {
                currentActionDialog = null
            }
        }
        dialog.setContentView(root)
        dialog.show()
        buttons.post { buttons.getChildAt(0)?.requestFocus() }
    }

    private fun showInlineVodActions(item: Any) {
        val inMyList = isInMyList(item)
        val toggleLabel = if (inMyList) "Remove from My List" else "Add to My List"
        updateVodInfo(item)
        vodInlineActionsActive = true
        updateLibraryHeaderChrome()
        tvLibraryCategoryCount.visibility = View.GONE
        vodInlineActionsScroller.visibility = View.GONE
        vodInlineActionsBar.removeAllViews()
        vodTopActionsBar.removeAllViews()
        vodTopActionsScroller.visibility = View.VISIBLE

        if (item is XtreamVodStream) {
            vodTopActionsBar.addView(compactVodActionButton("Play") {
                val url = item.directUrl ?: buildVodUrl(item.streamId, item.containerExtension)
                hideInlineVodActions(restoreGrid = false)
                playVodWithResume(url, item.name, movieResumeKey(item.streamId))
            })
            vodTopActionsBar.addView(compactVodActionButton("External player") {
                val url = item.directUrl ?: buildVodUrl(item.streamId, item.containerExtension)
                hideInlineVodActions(restoreGrid = false)
                openVodInExternalPlayer(url, item.name)
            })
            vodTopActionsBar.addView(compactVodActionButton("Download") {
                val url = item.directUrl ?: buildVodUrl(item.streamId, item.containerExtension)
                downloadMovie(url, item.name, item.containerExtension)
            })
        } else if (item is XtreamSeries) {
            vodTopActionsBar.addView(compactVodActionButton("Open") {
                val intent = Intent(this, SeriesDetailsActivity::class.java).apply {
                    putExtra("series_id", item.seriesId)
                    putExtra("series_name", item.name)
                    putExtra("series_cover", item.cover)
                }
                hideInlineVodActions(restoreGrid = false)
                launchInternalActivity(intent)
            })
        }
        val compactToggleLabel = if (inMyList) "Remove List" else "My List"
        vodTopActionsBar.addView(compactVodActionButton(compactToggleLabel) {
            toggleMyList(item)
        })
        vodTopActionsBar.addView(compactVodActionButton("Back") {
            hideInlineVodActions(restoreGrid = true)
        })
        vodTopActionsScroller.post {
            vodTopActionsBar.getChildAt(0)?.requestFocus()
        }
    }

    private fun hideInlineVodActions(restoreGrid: Boolean) {
        if (!::vodTopActionsScroller.isInitialized) return
        vodInlineActionsActive = false
        vodTopActionsScroller.visibility = View.GONE
        vodTopActionsBar.removeAllViews()
        if (::vodInlineActionsScroller.isInitialized) {
            vodInlineActionsScroller.visibility = View.GONE
            vodInlineActionsBar.removeAllViews()
        }
        updateLibraryHeaderChrome()
        if (restoreGrid && currentMode != ContentMode.LIVE_TV && currentState == UiState.EPG_GRID) {
            mainContentArea.visibility = View.VISIBLE
            rvContent.visibility = View.VISIBLE
            updateLibraryCategoryCount(posterAdapter.itemCount)
            restoreVodGridFocus()
        }
    }

    private fun populateVodDetailWindow(
        item: Any,
        backdrop: ImageView,
        metaView: TextView,
        descriptionView: TextView
    ) {
        when (item) {
            is XtreamVodStream -> {
                if (item.directUrl != null) {
                    metaView.text = listOfNotNull(
                        item.categoryId?.takeIf { it.isNotBlank() },
                        item.containerExtension?.uppercase(Locale.getDefault())?.takeIf { it.isNotBlank() }
                    ).joinToString("  •  ").ifBlank { "Movie" }
                    descriptionView.text = "M3U video"
                    return
                }
                val service = XtreamManager.getService() ?: return
                val call = service.getVodInfo(XtreamManager.username, XtreamManager.password, item.streamId)
                call.enqueue(object : Callback<XtreamVodInfoResponse> {
                    override fun onResponse(call: Call<XtreamVodInfoResponse>, response: Response<XtreamVodInfoResponse>) {
                        if (!response.isSuccessful || currentActionDialog == null) return
                        val info = response.body()?.info ?: return
                        val backdropUrl = firstArtworkUrl(info.backdropPath) ?: info.movieIcon ?: item.streamIcon
                        Glide.with(this@MainActivity)
                            .load(backdropUrl)
                            .placeholder(backdrop.drawable)
                            .centerCrop()
                            .into(backdrop)
                        metaView.text = buildLibraryMetaLine(
                            rating = info.rating,
                            releaseDate = info.releaseDate,
                            duration = info.duration,
                            genre = info.genre
                        ).ifBlank { "Movie" }
                        descriptionView.text = buildLibraryDescription(
                            plot = info.plot,
                            cast = info.cast,
                            director = info.director
                        )
                    }

                    override fun onFailure(call: Call<XtreamVodInfoResponse>, t: Throwable) {
                        if (descriptionView.text.toString() == "Loading details...") {
                            descriptionView.text = "Movie details unavailable"
                        }
                    }
                })
            }
            is XtreamSeries -> {
                val service = XtreamManager.getService() ?: return
                val call = service.getSeriesInfo(XtreamManager.username, XtreamManager.password, item.seriesId)
                call.enqueue(object : Callback<XtreamSeriesInfoResponse> {
                    override fun onResponse(call: Call<XtreamSeriesInfoResponse>, response: Response<XtreamSeriesInfoResponse>) {
                        if (!response.isSuccessful || currentActionDialog == null) return
                        val info = response.body()?.info ?: return
                        val backdropUrl = firstArtworkUrl(info.backdropPath) ?: info.cover ?: item.cover
                        Glide.with(this@MainActivity)
                            .load(backdropUrl)
                            .placeholder(backdrop.drawable)
                            .centerCrop()
                            .into(backdrop)
                        metaView.text = buildLibraryMetaLine(
                            rating = info.rating,
                            releaseDate = info.releaseDate,
                            duration = null,
                            genre = info.genre
                        ).ifBlank { "Series" }
                        descriptionView.text = buildLibraryDescription(
                            plot = info.plot,
                            cast = info.cast,
                            director = info.director
                        )
                    }

                    override fun onFailure(call: Call<XtreamSeriesInfoResponse>, t: Throwable) {
                        if (descriptionView.text.toString() == "Loading details...") {
                            descriptionView.text = "Series details unavailable"
                        }
                    }
                })
            }
        }
    }

    private fun actionPanelTitle(title: String): TextView {
        return TextView(this).apply {
            text = title
            setTextColor(Color.WHITE)
            textSize = if (isTvUiMode()) 22f else 18f
            typeface = android.graphics.Typeface.DEFAULT_BOLD
            maxLines = 3
            setPadding(0, 0, 0, dp(10))
        }
    }

    private fun actionPanelButton(label: String, action: () -> Unit): TextView {
        return TextView(this).apply {
            text = label
            setTextColor(Color.WHITE)
            textSize = if (isTvUiMode()) 18f else 16f
            gravity = Gravity.CENTER_VERTICAL
            isFocusable = true
            background = AppearanceTheme.buttonBackground(this@MainActivity)
            setPadding(dp(18), dp(12), dp(18), dp(12))
            val margins = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                topMargin = dp(6)
            }
            layoutParams = margins
            setOnClickListener {
                action()
            }
        }
    }

    private fun detailWindowButton(label: String, action: () -> Unit): TextView {
        return TextView(this).apply {
            text = label
            setTextColor(Color.WHITE)
            textSize = if (isTvUiMode()) 15f else 14f
            gravity = Gravity.CENTER
            isSingleLine = true
            includeFontPadding = false
            ellipsize = null
            isFocusable = true
            isClickable = true
            background = AppearanceTheme.buttonBackground(this@MainActivity)
            val horizontalPadding = if (isTvUiMode()) dp(12) else dp(10)
            setPadding(horizontalPadding, dp(10), horizontalPadding, dp(10))
            minWidth = when {
                !isTvUiMode() -> dp(86)
                label == "Open in external player" -> dp(230)
                label == "External player" -> dp(168)
                label == "Download movie" -> dp(176)
                label == "Download" -> dp(128)
                label.contains("My List") || label.contains("List") -> dp(126)
                else -> dp(104)
            }
            layoutParams = LinearLayout.LayoutParams(
                minWidth,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                rightMargin = dp(12)
            }
            setOnClickListener { action() }
        }
    }

    private fun compactVodActionButton(label: String, action: () -> Unit): TextView {
        return TextView(this).apply {
            text = label
            setTextColor(Color.WHITE)
            textSize = if (isTvUiMode()) 13f else 12f
            gravity = Gravity.CENTER
            isSingleLine = true
            includeFontPadding = false
            isFocusable = true
            isClickable = true
            background = AppearanceTheme.buttonBackground(this@MainActivity)
            setPadding(dp(6), dp(8), dp(6), dp(8))
            minWidth = when {
                !isTvUiMode() -> dp(86)
                label == "External player" -> dp(164)
                label == "Download" -> dp(126)
                label.contains("List") -> dp(126)
                label == "Close" || label == "Back" -> dp(92)
                else -> dp(96)
            }
            layoutParams = LinearLayout.LayoutParams(
                minWidth,
                LinearLayout.LayoutParams.WRAP_CONTENT
            ).apply {
                leftMargin = dp(3)
                rightMargin = dp(3)
            }
            setOnClickListener { action() }
        }
    }

    private fun dismissCurrentActionDialog() {
        currentActionDialog?.let { dialog ->
            runCatching {
                if (dialog.isShowing) dialog.dismiss()
            }
        }
        currentActionDialog = null
    }

    private fun downloadMovie(url: String, title: String, extension: String?) {
        val prefs = getSharedPreferences(DownloadPrefs.PREFS_NAME, MODE_PRIVATE)
        val smbServer = prefs.getString(DownloadPrefs.KEY_SMB_SERVER, "").orEmpty()
        val smbShare = prefs.getString(DownloadPrefs.KEY_SMB_SHARE, "").orEmpty()
        if (smbServer.isNotBlank() && smbShare.isNotBlank()) {
            downloadMovieToSmb(url, title, extension, prefs)
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
        val request = DownloadManager.Request(Uri.parse(url))
            .setTitle(safeTitle)
            .setDescription("GreenStreem movie download to ${DownloadPrefs.locationLabel(location)}")
            .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE_NOTIFY_COMPLETED)
            .setDestinationInExternalPublicDir(DownloadPrefs.publicDirectory(location), destinationName)
            .setAllowedOverMetered(true)
            .setAllowedOverRoaming(true)
        runCatching {
            manager.enqueue(request)
            updateDownloadStatus(
                prefs,
                DownloadPrefs.STATUS_RUNNING,
                safeTitle,
                "${DownloadPrefs.locationLabel(location)}/$destinationName",
                0
            )
            Toast.makeText(this, "Download started", Toast.LENGTH_SHORT).show()
        }.onFailure {
            updateDownloadStatus(
                prefs,
                DownloadPrefs.STATUS_FAILED,
                safeTitle,
                it.message ?: "Download failed",
                0
            )
            Toast.makeText(this, "Download failed: ${it.message}", Toast.LENGTH_LONG).show()
        }
    }

    private fun downloadMovieToSmb(
        url: String,
        title: String,
        extension: String?,
        prefs: android.content.SharedPreferences
    ) {
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

        updateDownloadStatus(prefs, DownloadPrefs.STATUS_RUNNING, safeTitle, target, 0)
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
                                        updateDownloadStatus(prefs, DownloadPrefs.STATUS_RUNNING, safeTitle, target, progress)
                                    }
                                }
                            }
                        }
                    }
                }
            }
            result.onSuccess {
                updateDownloadStatus(prefs, DownloadPrefs.STATUS_DONE, safeTitle, target, 100)
                scheduleFinishedDownloadStatusClear(prefs, safeTitle)
                Toast.makeText(this@MainActivity, "Saved to $target", Toast.LENGTH_LONG).show()
            }.onFailure { error ->
                updateDownloadStatus(
                    prefs,
                    DownloadPrefs.STATUS_FAILED,
                    safeTitle,
                    error.message ?: error.javaClass.simpleName,
                    prefs.getInt(DownloadPrefs.KEY_DOWNLOAD_PROGRESS, 0)
                )
                Toast.makeText(
                    this@MainActivity,
                    "Network download failed: ${error.message ?: error.javaClass.simpleName}",
                    Toast.LENGTH_LONG
                ).show()
            }
        }
    }

    private fun scheduleFinishedDownloadStatusClear(
        prefs: android.content.SharedPreferences,
        title: String
    ) {
        Handler(Looper.getMainLooper()).postDelayed({
            val currentStatus = prefs.getString(DownloadPrefs.KEY_DOWNLOAD_STATUS, DownloadPrefs.STATUS_IDLE)
            val currentTitle = prefs.getString(DownloadPrefs.KEY_DOWNLOAD_TITLE, "").orEmpty()
            if (currentStatus == DownloadPrefs.STATUS_DONE && currentTitle == title) {
                prefs.edit()
                    .putString(DownloadPrefs.KEY_DOWNLOAD_STATUS, DownloadPrefs.STATUS_IDLE)
                    .remove(DownloadPrefs.KEY_DOWNLOAD_TITLE)
                    .remove(DownloadPrefs.KEY_DOWNLOAD_TARGET)
                    .putInt(DownloadPrefs.KEY_DOWNLOAD_PROGRESS, 0)
                    .putLong(DownloadPrefs.KEY_DOWNLOAD_UPDATED_AT, System.currentTimeMillis())
                    .apply()
            }
        }, 12000L)
    }

    private fun updateDownloadStatus(
        prefs: android.content.SharedPreferences,
        status: String,
        title: String,
        target: String,
        progress: Int
    ) {
        prefs.edit()
            .putString(DownloadPrefs.KEY_DOWNLOAD_STATUS, status)
            .putString(DownloadPrefs.KEY_DOWNLOAD_TITLE, title)
            .putString(DownloadPrefs.KEY_DOWNLOAD_TARGET, target)
            .putInt(DownloadPrefs.KEY_DOWNLOAD_PROGRESS, progress.coerceIn(0, 100))
            .putLong(DownloadPrefs.KEY_DOWNLOAD_UPDATED_AT, System.currentTimeMillis())
            .apply()
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
        vodInfoStartRunnable?.let { vodInfoHandler.removeCallbacks(it) }
        vodInfoStartRunnable = null
        vodInfoRunnable?.let { vodInfoHandler.removeCallbacks(it) }
        currentVodInfoCall?.cancel()
        currentVodInfoCall = null
        val token = ++vodInfoRequestToken
        tvProgramTitleLarge.text = ""
        tvProgramDescription.text = "Loading details..."
        tvProgramTimeRange.text = ""
        tvProgramDuration.text = ""
        updateLibraryPositionCount()

        when (item) {
            is XtreamVodStream -> {
                tvProgramTitleLarge.text = item.name
                tvProgramDescription.text = "Movie"
                tvProgramTimeRange.text = item.containerExtension?.uppercase(Locale.getDefault()).orEmpty()
                vodInfoHandler.postDelayed({
                    if (token == vodInfoRequestToken && tvProgramDescription.text.toString() == "Movie") {
                        loadLibraryArtwork(item.streamIcon)
                    }
                }, 250L)
                if (item.directUrl != null) {
                    tvProgramDescription.text = "M3U video"
                    tvProgramTimeRange.text = item.categoryId ?: ""
                    tvProgramDuration.text = item.containerExtension?.uppercase(Locale.getDefault()).orEmpty()
                    updateLibraryPositionCount()
                    vodInfoRunnable = Runnable {
                        if (token == vodInfoRequestToken) loadLibraryArtwork(item.streamIcon)
                    }
                    vodInfoHandler.postDelayed(vodInfoRunnable!!, 650L)
                    return
                }
                val service = XtreamManager.getService() ?: run {
                    vodInfoRunnable = Runnable {
                        if (token == vodInfoRequestToken) loadLibraryArtwork(item.streamIcon)
                    }
                    vodInfoHandler.postDelayed(vodInfoRunnable!!, 650L)
                    return
                }
                vodInfoRunnable = Runnable {
                    if (token != vodInfoRequestToken) return@Runnable
                    tvProgramDescription.text = "Loading details..."
                    val call = service.getVodInfo(XtreamManager.username, XtreamManager.password, item.streamId)
                    currentVodInfoCall = call
                    call.enqueue(object : Callback<XtreamVodInfoResponse> {
                        override fun onResponse(call: Call<XtreamVodInfoResponse>, response: Response<XtreamVodInfoResponse>) {
                            if (token != vodInfoRequestToken || call.isCanceled) return
                            if (response.isSuccessful) {
                                val info = response.body()?.info
                                loadLibraryArtwork(
                                    posterUrl = info?.movieIcon ?: item.streamIcon,
                                    backdropUrl = firstArtworkUrl(info?.backdropPath) ?: info?.movieIcon ?: item.streamIcon
                                )
                                tvProgramDescription.text = buildLibraryDescription(
                                    plot = info?.plot,
                                    cast = info?.cast,
                                    director = info?.director
                                )
                                tvProgramTimeRange.text = buildLibraryMetaLine(
                                    rating = info?.rating,
                                    releaseDate = info?.releaseDate,
                                    duration = info?.duration,
                                    genre = info?.genre
                                )
                                tvProgramDuration.text = ""
                                updateLibraryPositionCount()
                            } else {
                                tvProgramDescription.text = "Movie details unavailable"
                            }
                        }
                        override fun onFailure(call: Call<XtreamVodInfoResponse>, t: Throwable) {
                            if (token != vodInfoRequestToken || call.isCanceled) return
                            tvProgramDescription.text = "Movie details unavailable"
                        }
                    })
                }
                vodInfoHandler.postDelayed(vodInfoRunnable!!, 650L)
                vodInfoHandler.postDelayed({
                    if (token == vodInfoRequestToken && tvProgramDescription.text.toString() == "Loading details...") {
                        tvProgramDescription.text = "Movie details unavailable"
                    }
                }, 5000L)
            }
            is XtreamSeries -> {
                tvProgramTitleLarge.text = item.name
                tvProgramDescription.text = "Series"
                vodInfoHandler.postDelayed({
                    if (token == vodInfoRequestToken && tvProgramDescription.text.toString() == "Series") {
                        loadLibraryArtwork(item.cover)
                    }
                }, 250L)
                val service = XtreamManager.getService() ?: run {
                    vodInfoRunnable = Runnable {
                        if (token == vodInfoRequestToken) loadLibraryArtwork(item.cover)
                    }
                    vodInfoHandler.postDelayed(vodInfoRunnable!!, 650L)
                    return
                }
                vodInfoRunnable = Runnable {
                    if (token != vodInfoRequestToken) return@Runnable
                    tvProgramDescription.text = "Loading details..."
                    val call = service.getSeriesInfo(XtreamManager.username, XtreamManager.password, item.seriesId)
                    currentVodInfoCall = call
                    call.enqueue(object : Callback<XtreamSeriesInfoResponse> {
                        override fun onResponse(call: Call<XtreamSeriesInfoResponse>, response: Response<XtreamSeriesInfoResponse>) {
                            if (token != vodInfoRequestToken || call.isCanceled) return
                            if (response.isSuccessful) {
                                val info = response.body()?.info
                                loadLibraryArtwork(
                                    posterUrl = info?.cover ?: item.cover,
                                    backdropUrl = firstArtworkUrl(info?.backdropPath) ?: info?.cover ?: item.cover
                                )
                                tvProgramDescription.text = buildLibraryDescription(
                                    plot = info?.plot,
                                    cast = info?.cast,
                                    director = info?.director
                                )
                                tvProgramTimeRange.text = buildLibraryMetaLine(
                                    rating = info?.rating,
                                    releaseDate = info?.releaseDate,
                                    duration = null,
                                    genre = info?.genre
                                )
                                tvProgramDuration.text = ""
                                updateLibraryPositionCount()
                            } else {
                                tvProgramDescription.text = "Series details unavailable"
                            }
                        }
                        override fun onFailure(call: Call<XtreamSeriesInfoResponse>, t: Throwable) {
                            if (token != vodInfoRequestToken || call.isCanceled) return
                            tvProgramDescription.text = "Series details unavailable"
                        }
                    })
                }
                vodInfoHandler.postDelayed(vodInfoRunnable!!, 650L)
                vodInfoHandler.postDelayed({
                    if (token == vodInfoRequestToken && tvProgramDescription.text.toString() == "Loading details...") {
                        tvProgramDescription.text = "Series details unavailable"
                    }
                }, 5000L)
            }
        }
    }

    private fun requestVodInfoUpdate(item: Any, delayMs: Long = 320L) {
        vodInfoStartRunnable?.let { vodInfoHandler.removeCallbacks(it) }
        vodInfoRunnable?.let { vodInfoHandler.removeCallbacks(it) }
        currentVodInfoCall?.cancel()
        currentVodInfoCall = null
        val token = ++vodInfoRequestToken
        showBasicVodInfo(item)
        vodInfoStartRunnable = Runnable {
            if (token == vodInfoRequestToken) {
                updateVodInfo(item)
            }
        }
        vodInfoHandler.postDelayed(vodInfoStartRunnable!!, delayMs)
    }

    private fun showBasicVodInfo(item: Any) {
        tvProgramDuration.text = ""
        updateLibraryPositionCount()
        when (item) {
            is XtreamVodStream -> {
                tvProgramTitleLarge.text = item.name
                tvProgramDescription.text = if (item.directUrl != null) "M3U video" else "Movie"
                tvProgramTimeRange.text = item.containerExtension?.uppercase(Locale.getDefault()).orEmpty()
            }
            is XtreamSeries -> {
                tvProgramTitleLarge.text = item.name
                tvProgramDescription.text = "Series"
                tvProgramTimeRange.text = ""
            }
        }
    }

    private fun updateLibraryPositionCount() {
        if (currentMode == ContentMode.LIVE_TV || !::tvLibraryCategoryCount.isInitialized) {
            return
        }
        val total = posterAdapter.itemCount
        if (total > 0 && currentState == UiState.EPG_GRID) {
            val title = currentLibraryCategoryName.ifBlank {
                if (currentMode == ContentMode.MOVIES) "Movies" else "Series"
            }
            val position = lastGridPosition.coerceIn(0, total - 1) + 1
            tvLibraryCategoryCount.text = "$title     $position/$total"
            tvLibraryCategoryCount.visibility = View.VISIBLE
        } else {
            tvLibraryCategoryCount.text = ""
            tvLibraryCategoryCount.visibility = View.GONE
        }
    }

    private fun buildLibraryMetaLine(
        rating: String?,
        releaseDate: String?,
        duration: String?,
        genre: String?
    ): String {
        val year = releaseDate.orEmpty().take(4).takeIf { it.all(Char::isDigit) }
        return listOfNotNull(
            rating?.takeIf { it.isNotBlank() }?.let { "Rating $it" },
            year,
            duration?.takeIf { it.isNotBlank() },
            genre?.takeIf { it.isNotBlank() }
        ).joinToString("  •  ")
    }

    private fun buildLibraryDescription(plot: String?, cast: String?, director: String?): String {
        val credits = mutableListOf<String>()
        cast?.takeIf { it.isNotBlank() }?.let { credits.add("Cast: $it") }
        director?.takeIf { it.isNotBlank() }?.let { credits.add("Director: $it") }
        val plotText = plot?.takeIf { it.isNotBlank() }
        return listOfNotNull(
            credits.joinToString("\n").takeIf { it.isNotBlank() },
            plotText
        ).joinToString("\n\n").ifBlank { "No plot available" }
    }

    private suspend fun clearEpgCacheIfRequested() {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        if (!prefs.getBoolean(KEY_EPG_CLEAR_REQUESTED, false)) return
        withContext(Dispatchers.IO) {
            db.epgCacheDao().clearAll()
        }
        prefs.edit().putBoolean(KEY_EPG_CLEAR_REQUESTED, false).apply()
        epgCacheByStreamId.clear()
        pendingEpgUiUpdates.clear()
        pendingEpgRefresh = true
    }

    private fun firstArtworkUrl(raw: Any?): String? {
        return when (raw) {
            is String -> raw.takeIf { it.isNotBlank() }
            is List<*> -> raw.firstOrNull { it is String && it.isNotBlank() } as? String
            else -> null
        }
    }

    private fun requestMoviePosterForGrid(item: XtreamVodStream) {
        if (!item.streamIcon.isNullOrBlank()) return
        val service = XtreamManager.getService() ?: return
        service.getVodInfo(XtreamManager.username, XtreamManager.password, item.streamId)
            .enqueue(object : Callback<XtreamVodInfoResponse> {
                override fun onResponse(
                    call: Call<XtreamVodInfoResponse>,
                    response: Response<XtreamVodInfoResponse>
                ) {
                    if (!response.isSuccessful) return
                    val info = response.body()?.info ?: return
                    val posterUrl = info.movieIcon?.takeIf { it.isNotBlank() }
                        ?: firstArtworkUrl(info.backdropPath)
                    posterAdapter.updateVodPoster(item.streamId, posterUrl)
                }

                override fun onFailure(call: Call<XtreamVodInfoResponse>, t: Throwable) = Unit
            })
    }

    private fun loadLibraryArtwork(imageUrl: String?) {
        loadLibraryArtwork(posterUrl = imageUrl, backdropUrl = imageUrl)
    }

    private fun loadLibraryArtwork(posterUrl: String?, backdropUrl: String?) {
        val artwork = findViewById<ImageView>(R.id.ivFavoriteStar) ?: return
        Glide.with(this).clear(artwork)
        Glide.with(this).clear(ivVodPoster)
        Glide.with(this).clear(ivVodBackdrop)
        Glide.with(this)
            .load(posterUrl)
            .placeholder(android.R.drawable.ic_menu_report_image)
            .error(android.R.drawable.ic_menu_report_image)
            .apply(libraryIconOptions)
            .into(artwork)
        Glide.with(this)
            .load(posterUrl)
            .placeholder(android.R.drawable.ic_menu_report_image)
            .error(android.R.drawable.ic_menu_report_image)
            .apply(libraryPosterOptions)
            .into(ivVodPoster)
        Glide.with(this)
            .load(backdropUrl)
            .placeholder(android.R.drawable.ic_menu_report_image)
            .error(android.R.drawable.ic_menu_report_image)
            .apply(libraryBackdropOptions)
            .let { request ->
                if (isTvUiMode()) request.centerCrop() else request.dontTransform()
            }
            .into(ivVodBackdrop)
    }

    private fun playMedia(url: String, title: String, targetState: UiState? = UiState.FULL_SCREEN) {
        saveVodResumeProgress()
        stopVodResumeTicker()
        clearSeriesQueue()
        currentVodResumeKey = null
        currentVodUrl = null
        currentVodTitle = null
        currentLivePlaybackUrls = listOf(url)
        currentLivePlaybackUrlIndex = 0
        currentLivePlaybackUrl = url
        resetLivePlaybackWatchdog()
        try {
            resetAudioSelectionForNewMedia()
            player?.setMediaItem(createLiveMediaItem(url))
            player?.prepare(); player?.play()
            targetState?.let { updateUiState(it) }
        } catch (e: Exception) { e.printStackTrace() }
    }

    private fun playLiveMedia(urls: List<String>, title: String, targetState: UiState? = UiState.FULL_SCREEN) {
        val primaryUrl = urls.firstOrNull()?.trim().orEmpty()
        if (primaryUrl.isBlank()) {
            Toast.makeText(this, "Channel has no playable stream URL", Toast.LENGTH_SHORT).show()
            return
        }
        val uniqueUrls = urls.map { it.trim() }.filter { it.isNotBlank() }.distinct()
        saveVodResumeProgress()
        stopVodResumeTicker()
        clearSeriesQueue()
        currentVodResumeKey = null
        currentVodUrl = null
        currentVodTitle = null
        currentLivePlaybackUrls = uniqueUrls
        currentLivePlaybackUrlIndex = 0
        currentLivePlaybackUrl = uniqueUrls.first()
        rejectedLivePlaybackUrls.clear()
        resetLivePlaybackWatchdog()
        Log.i(TAG, "starting live channel=$title ${livePlaybackDebugSummary(uniqueUrls.first())} alternates=${uniqueUrls.drop(1).joinToString { livePlaybackDebugSummary(it) }}")
        try {
            resetAudioSelectionForNewMedia()
            player?.setMediaItem(createLiveMediaItem(uniqueUrls.first()))
            player?.prepare()
            player?.play()
            targetState?.let { updateUiState(it) }
        } catch (e: Exception) {
            Log.w(TAG, "failed to start live media url=${safePlaybackUrl(uniqueUrls.first())}", e)
        }
    }

    private fun playVodWithResume(url: String, title: String, resumeKey: String) {
        if (!resumeKey.startsWith("series_")) clearSeriesQueue()
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

    private fun startVodPlayback(
        url: String,
        title: String,
        resumeKey: String,
        startPositionMs: Long
    ) {
        saveVodResumeProgress()
        nextEpisodePromptShownForKey = null
        hideNextEpisodePrompt()
        currentChannel = null
        currentVodResumeKey = resumeKey
        lastVodAudioWarningKey = null
        currentVodUrl = url
        currentVodTitle = title
        currentLivePlaybackUrl = null
        val playbackType = if (resumeKey.startsWith("series_")) LAST_PLAYBACK_SERIES else LAST_PLAYBACK_MOVIE
        saveLastPlayback(
            type = playbackType,
            title = title,
            url = url,
            resumeKey = resumeKey,
            channelId = -1L
        )
        tvProgramTitleLarge.text = title
        try {
            resetAudioSelectionForNewMedia()
            player?.setMediaItem(MediaItem.fromUri(url))
            player?.prepare()
            if (startPositionMs > 0L) player?.seekTo(startPositionMs)
            player?.play()
            startVodResumeTicker()
            updateUiState(UiState.FULL_SCREEN)
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    private fun startVodResumeTicker() {
        vodResumeRunnable?.let { vodResumeHandler.removeCallbacks(it) }
        vodResumeRunnable = object : Runnable {
            override fun run() {
                if (currentVodResumeKey != null) {
                    maybeShowNextEpisodePrompt()
                    saveVodResumeProgress()
                    vodResumeHandler.postDelayed(this, VOD_RESUME_TICK_MS)
                }
            }
        }
        vodResumeHandler.postDelayed(vodResumeRunnable!!, VOD_RESUME_TICK_MS)
    }

    private fun stopVodResumeTicker() {
        vodResumeRunnable?.let { vodResumeHandler.removeCallbacks(it) }
        vodResumeRunnable = null
    }

    private fun resetAudioSelectionForNewMedia() {
        val currentPlayer = player ?: return
        currentPlayer.volume = 1f
        currentPlayer.trackSelectionParameters = currentPlayer.trackSelectionParameters
            .buildUpon()
            .clearOverridesOfType(C.TRACK_TYPE_AUDIO)
            .clearOverridesOfType(C.TRACK_TYPE_TEXT)
            .setTrackTypeDisabled(C.TRACK_TYPE_AUDIO, false)
            .setTrackTypeDisabled(C.TRACK_TYPE_TEXT, true)
            .build()
    }

    private fun saveVodResumeProgress() {
        val key = currentVodResumeKey ?: return
        val pos = player?.currentPosition ?: 0L
        val duration = player?.duration ?: 0L
        if (duration > 0L && pos >= duration - VOD_WATCHED_REMAINING_MS) {
            markVodWatched(key)
            clearVodResumeByKey(key)
            return
        }
        if (pos < 1_000L) return
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        prefs.edit().putLong(vodResumePrefsKey(key), pos).apply()
    }

    private fun saveLastPlayback(
        type: String,
        title: String,
        url: String,
        resumeKey: String?,
        channelId: Long
    ) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_LAST_PLAYBACK_TYPE, type)
            .putString(KEY_LAST_PLAYBACK_TITLE, title)
            .putString(KEY_LAST_PLAYBACK_URL, url)
            .putString(KEY_LAST_PLAYBACK_RESUME_KEY, resumeKey.orEmpty())
            .putLong(KEY_LAST_PLAYBACK_CHANNEL_ID, channelId)
            .apply()
    }

    private fun resumeLastPlayback(): Boolean {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        return when (prefs.getString(KEY_LAST_PLAYBACK_TYPE, LAST_PLAYBACK_LIVE)) {
            LAST_PLAYBACK_MOVIE, LAST_PLAYBACK_SERIES -> {
                val url = prefs.getString(KEY_LAST_PLAYBACK_URL, "").orEmpty()
                val title = prefs.getString(KEY_LAST_PLAYBACK_TITLE, "Playback").orEmpty().ifBlank { "Playback" }
                val resumeKey = prefs.getString(KEY_LAST_PLAYBACK_RESUME_KEY, "").orEmpty()
                if (url.isBlank() || resumeKey.isBlank()) return false
                currentMode = if (prefs.getString(KEY_LAST_PLAYBACK_TYPE, "") == LAST_PLAYBACK_SERIES) {
                    ContentMode.SERIES
                } else {
                    ContentMode.MOVIES
                }
                startVodPlayback(url, title, resumeKey, getVodResumeMs(resumeKey))
                true
            }
            else -> {
                val channelId = prefs.getLong(KEY_LAST_PLAYBACK_CHANNEL_ID, -1L)
                    .takeIf { it > 0L }
                    ?: prefs.getLong("last_channel_id", -1L).takeIf { it > 0L }
                    ?: return false
                resumeLastChannel(channelId)
                true
            }
        }
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

    private fun markVodWatched(key: String) {
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putBoolean(vodWatchedPrefsKey(key), true)
            .apply()
    }

    private fun getVodResumeMs(key: String): Long {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getLong(vodResumePrefsKey(key), 0L)
            .coerceAtLeast(0L)
    }

    private fun vodResumePrefsKey(key: String): String = "vod_resume_$key"

    private fun vodWatchedPrefsKey(key: String): String = "$KEY_VOD_WATCHED_PREFIX$key"

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
        configureSeriesQueue(intent, resumeKey)
        playVodWithResume(playUrl, title, resumeKey)
        return true
    }

    private fun configureSeriesQueue(intent: Intent?, resumeKey: String) {
        val urls = intent?.getStringArrayListExtra(EXTRA_SERIES_EPISODE_URLS).orEmpty()
        val titles = intent?.getStringArrayListExtra(EXTRA_SERIES_EPISODE_TITLES).orEmpty()
        val keys = intent?.getStringArrayListExtra(EXTRA_SERIES_EPISODE_KEYS).orEmpty()
        val index = intent?.getIntExtra(EXTRA_SERIES_EPISODE_INDEX, -1) ?: -1
        if (resumeKey.startsWith("series_") &&
            urls.isNotEmpty() &&
            urls.size == titles.size &&
            urls.size == keys.size &&
            index in urls.indices
        ) {
            seriesEpisodeUrls = urls
            seriesEpisodeTitles = titles
            seriesEpisodeResumeKeys = keys
            seriesEpisodeIndex = index
        } else {
            clearSeriesQueue()
        }
    }

    private fun clearSeriesQueue() {
        seriesEpisodeUrls = emptyList()
        seriesEpisodeTitles = emptyList()
        seriesEpisodeResumeKeys = emptyList()
        seriesEpisodeIndex = -1
        hideNextEpisodePrompt()
    }

    private fun updateUiState(newState: UiState) {
        val previousState = currentState
        if (::vodTopActionsScroller.isInitialized && vodTopActionsScroller.visibility == View.VISIBLE) {
            hideInlineVodActions(restoreGrid = false)
        }
        currentState = newState
        saveCurrentUiState(newState)
        updateLibraryHeaderChrome()
        if (newState != UiState.FULL_SCREEN) {
            miniInfoRunnable?.let { miniInfoHandler.removeCallbacks(it) }
            if (currentMode != ContentMode.LIVE_TV) {
                player?.pause()
            }
            mainContentArea.visibility = View.VISIBLE
            pbProgramProgress?.visibility = View.GONE
            zapBar.visibility = View.GONE
            hideMovieControls()
        }
        when (newState) {
            UiState.FULL_SCREEN -> {
                movePlayerToContainer(playerContainer)
                epgOverlay.visibility = View.GONE
                rvRecentChannels.visibility = View.GONE
                if (currentVodResumeKey == null) hideMovieControls()
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
                refreshLiveGuideForClockTick(force = true)
                
                rvContent.postDelayed({
                    if (currentMode == ContentMode.LIVE_TV) {
                        val restorePlayingChannel = restorePlayingChannelFocusOnNextGuideOpen ||
                            previousState == UiState.FULL_SCREEN
                        restorePlayingChannelFocusOnNextGuideOpen = false
                        val playingRow = currentChannel?.id?.let { epgAdapter.getPositionForChannelId(it) }
                            ?: RecyclerView.NO_POSITION
                        val targetPos = if (restorePlayingChannel && playingRow != RecyclerView.NO_POSITION) {
                            playingRow
                        } else {
                            resolveFocusedEpgRowPosition()
                        }
                        focusEpgRowAt(targetPos)
                        currentChannel?.let { channel ->
                            updateFocusInfo(
                                channel,
                                resolveCurrentlyAiringListing(channel.id.toInt()),
                                respectSuppressWindow = false
                            )
                        }
                    } else {
                        ensurePosterLayout()
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
                    if (currentMode == ContentMode.LIVE_TV) {
                        centerRecyclerPosition(rvCategories, lastCategoryPosition, 56)
                    } else {
                        scrollCategoryPositionToTop(lastCategoryPosition, requestFocus = true)
                        return@post
                    }
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
        updateNowTimeLine()
        updateGuideClock()
    }

    private fun returnToCategoriesOnly() {
        suppressCategoriesToNavUntilMs = 0L
        updateUiState(UiState.CATEGORIES)
    }

    private fun movePlayerToContainer(newContainer: ViewGroup) {
        val parent = playerView.parent as? ViewGroup
        if (parent === newContainer) return
        parent?.removeView(playerView)
        newContainer.addView(playerView)
    }

    override fun dispatchKeyEvent(event: KeyEvent): Boolean {
        if (event.action == KeyEvent.ACTION_DOWN) {
            if (handleFullscreenMovieControlsKey(event.keyCode)) return true
            when (event.keyCode) {
                KeyEvent.KEYCODE_MEDIA_REWIND -> {
                    if (seekMovieFromRemote(-30_000L, allowWhenControlsVisible = true)) return true
                }
                KeyEvent.KEYCODE_MEDIA_FAST_FORWARD -> {
                    if (seekMovieFromRemote(30_000L, allowWhenControlsVisible = true)) return true
                }
                KeyEvent.KEYCODE_DPAD_LEFT -> {
                    if (seekMovieFromRemote(-30_000L, focusControls = false)) return true
                }
                KeyEvent.KEYCODE_DPAD_RIGHT -> {
                    if (seekMovieFromRemote(30_000L, focusControls = false)) return true
                }
            }
        }
        return super.dispatchKeyEvent(event)
    }

    private fun handleFullscreenMovieControlsKey(keyCode: Int): Boolean {
        if (currentState != UiState.FULL_SCREEN || movieControlsButtons.visibility == View.VISIBLE) return false
        return when (keyCode) {
            KeyEvent.KEYCODE_MENU,
            KeyEvent.KEYCODE_DPAD_CENTER,
            KeyEvent.KEYCODE_ENTER -> {
                if (currentMode == ContentMode.LIVE_TV || currentVodResumeKey != null) {
                    showPlaybackExtras()
                } else {
                    updateUiState(UiState.EPG_GRID)
                }
                true
            }
            KeyEvent.KEYCODE_DPAD_DOWN -> {
                movieControlsBar.visibility == View.VISIBLE &&
                    movieControlsButtons.visibility != View.VISIBLE &&
                    showPlaybackExtras()
            }
            else -> false
        }
    }

    override fun onKeyDown(keyCode: Int, event: KeyEvent?): Boolean {
        when (keyCode) {
            KeyEvent.KEYCODE_MEDIA_REWIND -> {
                if (seekMovieFromRemote(-30_000L, allowWhenControlsVisible = true)) return true
            }
            KeyEvent.KEYCODE_MEDIA_FAST_FORWARD -> {
                if (seekMovieFromRemote(30_000L, allowWhenControlsVisible = true)) return true
            }
            KeyEvent.KEYCODE_DPAD_LEFT -> {
                if (seekMovieFromRemote(-30_000L, focusControls = false)) return true
            }
            KeyEvent.KEYCODE_DPAD_RIGHT -> {
                if (seekMovieFromRemote(30_000L, focusControls = false)) return true
            }
            KeyEvent.KEYCODE_DPAD_DOWN -> {
                if (movieControlsBar.visibility == View.VISIBLE &&
                    movieControlsButtons.visibility != View.VISIBLE &&
                    showPlaybackExtras()
                ) return true
            }
        }
        if (movieControlsButtons.visibility == View.VISIBLE) {
            when (keyCode) {
                KeyEvent.KEYCODE_DPAD_LEFT,
                KeyEvent.KEYCODE_DPAD_RIGHT,
                KeyEvent.KEYCODE_DPAD_UP,
                KeyEvent.KEYCODE_DPAD_DOWN,
                KeyEvent.KEYCODE_DPAD_CENTER,
                KeyEvent.KEYCODE_ENTER -> {
                    scheduleMovieControlsHide()
                    return super.onKeyDown(keyCode, event)
                }
            }
        }
        when (keyCode) {
            KeyEvent.KEYCODE_GUIDE -> {
                when (currentState) {
                    UiState.FULL_SCREEN -> enterLiveGuideAtCurrentChannel()
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
                if (currentState == UiState.FULL_SCREEN) {
                    showPlaybackExtras()
                    return true
                } else if (currentMode == ContentMode.LIVE_TV) {
                    showQuickPanel()
                    return true
                }
            }
            KeyEvent.KEYCODE_MEDIA_PREVIOUS -> {
                if (playPreviousChannel()) return true
            }
            KeyEvent.KEYCODE_INFO -> {
                cycleAspectRatio()
                return true
            }
            KeyEvent.KEYCODE_MEDIA_AUDIO_TRACK -> {
                showAudioTrackDialog()
                return true
            }
            KeyEvent.KEYCODE_BACK -> {
                if (movieControlsBar.visibility == View.VISIBLE) {
                    hideMovieControls()
                    return true
                }
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
                        if (guideFullscreenReturnChannelId != null ||
                            System.currentTimeMillis() < suppressBackToCategoriesUntilMs
                        ) {
                            currentChannel?.id
                                ?.let { epgAdapter.getPositionForChannelId(it) }
                                ?.takeIf { it != RecyclerView.NO_POSITION }
                                ?.let { focusEpgRowAt(it) }
                            return true
                        }
                        persistCurrentLiveFocusedRowForCurrentCategory()
                        returnToCategoriesOnly()
                        return true
                    } else {
                        if (isFocusedPosterInLeftmostColumn()) {
                            returnToCategoriesOnly(); return true
                        }
                    }
                } else if (currentState == UiState.CATEGORIES) {
                    if (System.currentTimeMillis() < suppressCategoriesToNavUntilMs) return true
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
                if (currentState == UiState.CATEGORIES) {
                    if ((event?.repeatCount ?: 0) > 0) {
                        if (categoryCenterLongPressHandled || categoryActionMenuShowing) return true
                        categoryCenterLongPressHandled = true
                        showFocusedCategoryActionMenu()
                        return true
                    }
                    categoryCenterPressTracking = true
                    categoryCenterLongPressHandled = false
                    event?.startTracking()
                    return true
                }
                if (currentState == UiState.FULL_SCREEN) {
                    if (currentMode == ContentMode.LIVE_TV) {
                        showPlaybackExtras()
                    } else if (currentVodResumeKey != null) {
                        showPlaybackExtras()
                    } else {
                        updateUiState(UiState.EPG_GRID)
                    }
                    return true
                }
            }
        }
        return super.onKeyDown(keyCode, event)
    }

    override fun onKeyUp(keyCode: Int, event: KeyEvent?): Boolean {
        if ((keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER) &&
            categoryCenterPressTracking
        ) {
            categoryCenterPressTracking = false
            if (categoryCenterLongPressHandled || event?.isCanceled == true) {
                categoryCenterLongPressHandled = false
                return true
            }
            categoryCenterLongPressHandled = false
            if (currentState == UiState.CATEGORIES) {
                openFocusedCategory()
                return true
            }
        }
        return super.onKeyUp(keyCode, event)
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

        if (::vodTopActionsScroller.isInitialized &&
            vodTopActionsScroller.visibility == View.VISIBLE
        ) {
            hideInlineVodActions(restoreGrid = true)
            return true
        }

        if (currentMode != ContentMode.LIVE_TV && currentState == UiState.FULL_SCREEN) {
            saveVodResumeProgress()
            updateUiState(UiState.EPG_GRID)
            restoreVodGridFocus()
            return true
        }

        if (currentMode == ContentMode.LIVE_TV && currentState == UiState.FULL_SCREEN) {
            enterLiveGuideAtCurrentChannel()
            return true
        }

        val now = System.currentTimeMillis()
        if (currentMode == ContentMode.LIVE_TV && currentState == UiState.EPG_GRID) {
            if (now < suppressBackToCategoriesUntilMs) {
                currentChannel?.id
                    ?.let { epgAdapter.getPositionForChannelId(it) }
                    ?.takeIf { it != RecyclerView.NO_POSITION }
                    ?.let { focusEpgRowAt(it) }
                return true
            }
            if (guideFullscreenReturnChannelId != null) {
                guideFullscreenReturnChannelId
                    ?.let { epgAdapter.getPositionForChannelId(it) }
                    ?.takeIf { it != RecyclerView.NO_POSITION }
                    ?.let { focusEpgRowAt(it) }
                rvContent.postDelayed({
                    if (currentState == UiState.EPG_GRID) {
                        guideFullscreenReturnChannelId = null
                    }
                }, 1500L)
                return true
            }
        }

        if (isTvUiMode()) {
            if (currentMode == ContentMode.LIVE_TV &&
                currentState == UiState.FULL_SCREEN &&
                now - lastBackPressTs <= doubleBackWindowMs &&
                playPreviousChannel()
            ) {
                lastBackPressTs = 0L
                return true
            }
            lastBackPressTs = now
            when (currentState) {
                UiState.NAV_RAIL -> returnToCurrentPlayback()
                UiState.CATEGORIES -> updateUiState(UiState.NAV_RAIL)
                UiState.EPG_GRID -> {
                    persistCurrentLiveFocusedRowForCurrentCategory()
                    returnToCategoriesOnly()
                }
                UiState.FULL_SCREEN -> enterLiveGuideAtCurrentChannel()
            }
            return true
        }

        // Phone/tablet back flow: Full screen -> Groups -> Nav rail -> playback.
        when (currentState) {
            UiState.FULL_SCREEN -> updateUiState(UiState.CATEGORIES)
            UiState.EPG_GRID -> {
                persistCurrentLiveFocusedRowForCurrentCategory()
                returnToCategoriesOnly()
            }
            UiState.CATEGORIES -> {
                if (System.currentTimeMillis() < suppressCategoriesToNavUntilMs) return true
                updateUiState(UiState.NAV_RAIL)
            }
            UiState.NAV_RAIL -> returnToCurrentPlayback()
        }
        return true
    }

    private fun returnToCurrentPlayback() {
        if (currentMode == ContentMode.LIVE_TV) {
            val channel = currentChannel
            if (channel != null) {
                playChannel(channel)
            } else {
                val lastId = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
                    .getLong("last_channel_id", -1L)
                if (lastId > 0L) {
                    resumeLastChannel(lastId)
                }
            }
        }
        updateUiState(UiState.FULL_SCREEN)
    }

    private fun restoreVodGridFocus() {
        rvContent.postDelayed({
            if (currentMode == ContentMode.LIVE_TV || currentState != UiState.EPG_GRID) return@postDelayed
            val target = lastGridPosition.coerceAtLeast(0)
            centerRecyclerPosition(rvContent, target, 220)
            rvContent.post {
                rvContent.findViewHolderForAdapterPosition(target)?.itemView?.requestFocus()
                    ?: rvContent.requestFocus()
            }
        }, 120L)
    }

    override fun onKeyLongPress(keyCode: Int, event: KeyEvent?): Boolean {
        if (currentState == UiState.CATEGORIES &&
            (keyCode == KeyEvent.KEYCODE_DPAD_CENTER || keyCode == KeyEvent.KEYCODE_ENTER)
        ) {
            categoryCenterLongPressHandled = true
            if (showFocusedCategoryActionMenu()) return true
        }
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

    private fun isFocusedPosterInLeftmostColumn(): Boolean {
        if (currentMode == ContentMode.LIVE_TV || currentState != UiState.EPG_GRID) return false
        val focused = currentFocus ?: return false
        val view = rvContent.findContainingItemView(focused) ?: return false
        val pos = rvContent.getChildAdapterPosition(view)
        if (pos == RecyclerView.NO_POSITION) return false
        val layout = rvContent.layoutManager as? GridLayoutManager ?: return pos == 0
        val spanSizeLookup = layout.spanSizeLookup
        val spanIndex = spanSizeLookup.getSpanIndex(pos, layout.spanCount)
        return spanIndex == 0
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

    private fun focusEpgRowAt(
        position: Int,
        attempt: Int = 0,
        requestToken: Int = -1,
        alignTop: Boolean = false
    ) {
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
        scheduleLiveFocusedRowSave(targetPos)
        if (shouldUseOnlySecondaryEpg() && currentLiveChannels.isNotEmpty()) {
            enqueueEpgWindowForChannels(
                channels = currentLiveChannels,
                anchorIndex = targetPos,
                clearPending = true
            )
        }

        // Scroll and focus in ONE post to avoid focus jumping between two separate async calls
        rvContent.post {
            if (token != epgFocusRequestToken) return@post
            val lm = rvContent.layoutManager as? LinearLayoutManager
            if (lm != null) {
                val itemHeight = rvContent.findViewHolderForAdapterPosition(targetPos)?.itemView?.height
                    ?: rvContent.getChildAt(0)?.height
                    ?: 34
                val offset = if (alignTop) 0 else ((rvContent.height - itemHeight) / 2).coerceAtLeast(0)
                lm.scrollToPositionWithOffset(targetPos, offset)
            }
            val holder = rvContent.findViewHolderForAdapterPosition(targetPos) as? EpgRowAdapter.VH
            if (holder == null) {
                if (attempt < 6) {
                    rvContent.postDelayed({
                        if (token == epgFocusRequestToken) {
                            focusEpgRowAt(targetPos, attempt + 1, token, alignTop)
                        }
                    }, 50)
                }
                return@post
            }
            val timelineX = currentTimeContentX()
            val timelineIndex = findProgramIndexForTimelineX(holder.container, timelineX)
            val focusTarget = holder.container.getChildAt(timelineIndex)
                ?: holder.container.getChildAt(0)
                ?: holder.itemView
            if (token == epgFocusRequestToken) {
                focusTarget.requestFocus()
            }
        }
    }

    private fun currentTimeContentX(): Int {
        val minutesFromHeaderStart =
            ((System.currentTimeMillis() - currentGuideTimelineStartMs()) / 60000f).coerceAtLeast(0f)
        return (minutesFromHeaderStart * epgPxPerMinute).toInt().coerceAtLeast(0)
    }

    private fun findProgramIndexForTimelineX(container: LinearLayout, timelineX: Int): Int {
        val childCount = container.childCount
        if (childCount <= 0) return 0
        val anchorX = timelineX.coerceAtLeast(0)
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

    private fun scrollCategoryPositionToTop(position: Int, requestFocus: Boolean = false) {
        rvCategories.post {
            val adapter = rvCategories.adapter ?: return@post
            if (adapter.itemCount == 0) return@post
            val target = position.coerceIn(0, adapter.itemCount - 1)
            (rvCategories.layoutManager as? LinearLayoutManager)
                ?.scrollToPositionWithOffset(target, 0)
            if (!requestFocus) return@post
            rvCategories.post {
                rvCategories.findViewHolderForAdapterPosition(target)?.itemView?.requestFocus()
                    ?: rvCategories.requestFocus()
            }
        }
    }

    private fun calculatePosterSpanCount(): Int {
        val widthDp = resources.displayMetrics.widthPixels / resources.displayMetrics.density
        return (widthDp / 150f).toInt().coerceIn(5, 8)
    }

    private fun ensurePosterLayout() {
        val shouldUseGrid = currentMode != ContentMode.LIVE_TV && currentState == UiState.EPG_GRID
        val currentLayout = rvContent.layoutManager
        val layoutMatches = if (shouldUseGrid) {
            currentLayout is GridLayoutManager
        } else {
            currentLayout is LinearLayoutManager && currentLayout !is GridLayoutManager
        }
        if (rvContent.adapter != posterAdapter || !layoutMatches) {
            rvContent.layoutManager = if (shouldUseGrid) {
                GridLayoutManager(this, calculatePosterSpanCount()).apply {
                    initialPrefetchItemCount = 6
                }
            } else {
                LinearLayoutManager(this, RecyclerView.HORIZONTAL, false)
            }
            rvContent.adapter = posterAdapter
            rvContent.itemAnimator = null
            rvContent.setHasFixedSize(shouldUseGrid)
            rvContent.setItemViewCacheSize(if (shouldUseGrid) 6 else 2)
            rvContent.recycledViewPool.setMaxRecycledViews(0, if (shouldUseGrid) 12 else 8)
        }
    }

    private fun showPosterItems(items: List<Any>, preferredPosition: Int) {
        runCatching {
            hideInlineVodActions(restoreGrid = false)
            rvContent.visibility = View.VISIBLE
            ensurePosterLayout()
            posterAdapter.submitList(items)
            selectedPosterKey = null
            updateLibraryCategoryCount(items.size)
            if (items.isEmpty()) {
                tvProgramTitleLarge.text = ""
                tvProgramTimeRange.text = ""
                tvProgramDuration.text = ""
                tvProgramDescription.text = "No titles in this category"
                return
            }
            val target = preferredPosition.coerceIn(0, items.size - 1)
            lastGridPosition = target
            updateLibraryPositionCount()
            requestVodInfoUpdate(items[target], delayMs = 220L)
            scrollPosterRowTo(target, requestFocus = currentState != UiState.CATEGORIES)
        }.onFailure { error ->
            Log.e(TAG, "Failed to show poster items count=${items.size}", error)
            Toast.makeText(this, "Could not open this category", Toast.LENGTH_SHORT).show()
        }
    }

    private fun updateLibraryCategoryCount(count: Int) {
        if (currentMode == ContentMode.LIVE_TV) {
            tvLibraryCategoryCount.visibility = View.GONE
            tvLibraryCategoryCount.text = ""
            return
        }
        updateLibraryPositionCount()
    }

    private fun scrollPosterRowTo(position: Int, requestFocus: Boolean = true) {
        rvContent.post {
            val adapter = rvContent.adapter ?: return@post
            if (adapter.itemCount == 0) return@post
            val target = position.coerceIn(0, adapter.itemCount - 1)
            val layout = rvContent.layoutManager
            if (layout is GridLayoutManager) {
                layout.scrollToPositionWithOffset(target, dp(14))
            } else {
                (layout as? LinearLayoutManager)?.scrollToPositionWithOffset(target, dp(18))
            }
            if (!requestFocus) return@post
            rvContent.post {
                rvContent.findViewHolderForAdapterPosition(target)?.itemView?.requestFocus()
            }
        }
    }

    private fun onCategoryFocused(category: XtreamCategory) {
        hoverRunnable?.let { hoverHandler.removeCallbacks(it) }
        hoverRunnable = Runnable { fetchContentForCategory(category) }
        hoverHandler.postDelayed(
            hoverRunnable!!,
            if (currentMode == ContentMode.LIVE_TV) 70L else 260L
        )
    }

    private fun openFocusedCategory() {
        loadFocusedCategoryIfApplicable()
        if (currentMode == ContentMode.LIVE_TV) {
            restoreLiveFocusForSelectedCategory()
        }
        updateUiState(UiState.EPG_GRID)
    }

    private fun showFocusedCategoryActionMenu(): Boolean {
        val focused = currentFocus ?: return false
        val view = rvCategories.findContainingItemView(focused) ?: return false
        val pos = rvCategories.getChildAdapterPosition(view)
        if (pos == RecyclerView.NO_POSITION) return false
        val category = categoryAdapter.getItemAt(pos) ?: return false
        showCategoryActionMenu(category, pos, view)
        return true
    }

    private fun showCategoryActionMenu(category: XtreamCategory, position: Int, anchor: View) {
        if (isPlaylistHeader(category)) return
        if (categoryActionMenuShowing) return
        lastCategoryPosition = position
        saveLastCategoryForCurrentMode(category.id, position)
        categoryActionMenuShowing = true
        val popup = PopupMenu(this, anchor)
        val isVirtual = category.id.isVirtualCategoryId()
        popup.menu.add("Refresh category")
        if (!isVirtual) {
            popup.menu.add("Hide category")
            popup.menu.add("Keep only this category")
        }
        popup.menu.add("Show all categories")
        if (currentMode != ContentMode.LIVE_TV) {
            popup.menu.add("Category report")
        }
        popup.menu.add("Manage groups")
        popup.setOnMenuItemClickListener { item ->
            when (item.title.toString()) {
                "Refresh category" -> {
                    fetchContentForCategory(category)
                    Toast.makeText(this, "Refreshing ${category.name}", Toast.LENGTH_SHORT).show()
                    true
                }
                "Hide category" -> {
                    confirmHideCategory(category)
                    true
                }
                "Keep only this category" -> {
                    confirmKeepOnlyCategory(category)
                    true
                }
                "Show all categories" -> {
                    showAllCategories()
                    true
                }
                "Category report" -> {
                    showCategoryCoverageReport()
                    true
                }
                "Manage groups" -> {
                    startActivity(Intent(this, ManageGroupsActivity::class.java))
                    true
                }
                else -> false
            }
        }
        popup.setOnDismissListener {
            categoryActionMenuShowing = false
        }
        popup.show()
    }

    private fun showCategoryCoverageReport() {
        if (isM3uPlaylist()) {
            lifecycleScope.launch {
                val channels = loadM3uChannelsForMode(currentMode)
                val groups = channels.map { m3uDisplayGroup(it) }.distinct()
                val visible = visibleCategoryRowsForReport()
                showCategoryCoverageDialog(
                    title = "${currentMode.label()} category report",
                    rawCategoryCount = groups.size,
                    streamCategoryCount = groups.size,
                    visibleRows = visible,
                    totalTitles = channels.size,
                    missingProviderCategories = groups.filterNot { group -> visible.any { it.id == group || it.name == group } },
                    streamOnlyCategories = emptyList()
                )
            }
            return
        }

        val service = XtreamManager.getService() ?: run {
            Toast.makeText(this, "Provider connection is not ready", Toast.LENGTH_SHORT).show()
            return
        }
        Toast.makeText(this, "Checking provider categories...", Toast.LENGTH_SHORT).show()
        when (currentMode) {
            ContentMode.MOVIES -> service.getVodCategories(XtreamManager.username, XtreamManager.password)
                .enqueue(object : Callback<List<XtreamCategory>> {
                    override fun onResponse(call: Call<List<XtreamCategory>>, response: Response<List<XtreamCategory>>) {
                        val rawCategories = response.body().orEmpty()
                        service.getVodStreams(XtreamManager.username, XtreamManager.password, null)
                            .enqueue(object : Callback<List<XtreamVodStream>> {
                                override fun onResponse(call: Call<List<XtreamVodStream>>, response: Response<List<XtreamVodStream>>) {
                                    val streams = response.body().orEmpty()
                                    val streamCategories = streams.flatMap { splitProviderCategoryIds(it.categoryId.orEmpty()) }
                                        .map { cleanProviderCategoryId(it) }
                                        .filter { it.isNotBlank() }
                                        .distinct()
                                    val rawIds = rawCategories.map { cleanProviderCategoryId(it.id) }.filter { it.isNotBlank() }.toSet()
                                    val visible = visibleCategoryRowsForReport()
                                    val visibleIds = visible.map { it.id }.toSet()
                                    showCategoryCoverageDialog(
                                        title = "Movies category report",
                                        rawCategoryCount = rawCategories.size,
                                        streamCategoryCount = streamCategories.size,
                                        visibleRows = visible,
                                        totalTitles = streams.size,
                                        missingProviderCategories = rawCategories
                                            .filterNot { cleanProviderCategoryId(it.id) in visibleIds }
                                            .map { "${it.name} (${it.id})" },
                                        streamOnlyCategories = streamCategories
                                            .filterNot { it in rawIds }
                                            .filterNot { it in visibleIds }
                                    )
                                }

                                override fun onFailure(call: Call<List<XtreamVodStream>>, t: Throwable) {
                                    Toast.makeText(this@MainActivity, "Movie list check failed: ${t.message}", Toast.LENGTH_LONG).show()
                                }
                            })
                    }

                    override fun onFailure(call: Call<List<XtreamCategory>>, t: Throwable) {
                        Toast.makeText(this@MainActivity, "Category check failed: ${t.message}", Toast.LENGTH_LONG).show()
                    }
                })
            ContentMode.SERIES -> service.getSeriesCategories(XtreamManager.username, XtreamManager.password)
                .enqueue(object : Callback<List<XtreamCategory>> {
                    override fun onResponse(call: Call<List<XtreamCategory>>, response: Response<List<XtreamCategory>>) {
                        val rawCategories = response.body().orEmpty()
                        service.getSeries(XtreamManager.username, XtreamManager.password, null)
                            .enqueue(object : Callback<List<XtreamSeries>> {
                                override fun onResponse(call: Call<List<XtreamSeries>>, response: Response<List<XtreamSeries>>) {
                                    val series = response.body().orEmpty()
                                    val streamCategories = series.flatMap { splitProviderCategoryIds(it.categoryId.orEmpty()) }
                                        .map { cleanProviderCategoryId(it) }
                                        .filter { it.isNotBlank() }
                                        .distinct()
                                    val rawIds = rawCategories.map { cleanProviderCategoryId(it.id) }.filter { it.isNotBlank() }.toSet()
                                    val visible = visibleCategoryRowsForReport()
                                    val visibleIds = visible.map { it.id }.toSet()
                                    showCategoryCoverageDialog(
                                        title = "Series category report",
                                        rawCategoryCount = rawCategories.size,
                                        streamCategoryCount = streamCategories.size,
                                        visibleRows = visible,
                                        totalTitles = series.size,
                                        missingProviderCategories = rawCategories
                                            .filterNot { cleanProviderCategoryId(it.id) in visibleIds }
                                            .map { "${it.name} (${it.id})" },
                                        streamOnlyCategories = streamCategories
                                            .filterNot { it in rawIds }
                                            .filterNot { it in visibleIds }
                                    )
                                }

                                override fun onFailure(call: Call<List<XtreamSeries>>, t: Throwable) {
                                    Toast.makeText(this@MainActivity, "Series list check failed: ${t.message}", Toast.LENGTH_LONG).show()
                                }
                            })
                    }

                    override fun onFailure(call: Call<List<XtreamCategory>>, t: Throwable) {
                        Toast.makeText(this@MainActivity, "Category check failed: ${t.message}", Toast.LENGTH_LONG).show()
                    }
                })
            ContentMode.LIVE_TV -> Unit
        }
    }

    private fun visibleCategoryRowsForReport(): List<XtreamCategory> {
        return currentCategoryRows()
            .filterNot { isPlaylistHeader(it) }
            .filterNot { it.id.isVirtualCategoryId() }
    }

    private fun ContentMode.label(): String = when (this) {
        ContentMode.LIVE_TV -> "Live TV"
        ContentMode.MOVIES -> "Movies"
        ContentMode.SERIES -> "Series"
    }

    private fun showCategoryCoverageDialog(
        title: String,
        rawCategoryCount: Int,
        streamCategoryCount: Int,
        visibleRows: List<XtreamCategory>,
        totalTitles: Int,
        missingProviderCategories: List<String>,
        streamOnlyCategories: List<String>
    ) {
        val visibleSummary = visibleRows.take(18).joinToString("\n") { "- ${it.name} (${it.id})" }
            .ifBlank { "None" }
        val missingSummary = missingProviderCategories.take(18).joinToString("\n") { "- $it" }
            .ifBlank { "None" }
        val streamOnlySummary = streamOnlyCategories.take(18).joinToString("\n") { "- $it" }
            .ifBlank { "None" }
        val reportMessage =
            "Provider category rows: $rawCategoryCount\n" +
                "Category ids found on titles: $streamCategoryCount\n" +
                "Titles checked: $totalTitles\n" +
                "Visible provider rows: ${visibleRows.size}\n\n" +
                "Visible sample:\n$visibleSummary\n\n" +
                "Provider categories not visible:\n$missingSummary\n\n" +
                "Title categories not in provider list:\n$streamOnlySummary"
        Log.i(TAG, "$title\n$reportMessage")
        AlertDialog.Builder(this)
            .setTitle(title)
            .setMessage(reportMessage)
            .setPositiveButton("OK", null)
            .show()
    }

    private fun confirmHideCategory(category: XtreamCategory) {
        if (!ensureGroupManagementUnlocked()) return
        AlertDialog.Builder(this)
            .setTitle("Hide ${category.name}?")
            .setMessage("This removes the category from the guide. You can bring it back from Manage Groups or Show all categories.")
            .setPositiveButton("Hide") { _, _ -> hideCategory(category) }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun confirmKeepOnlyCategory(category: XtreamCategory) {
        if (!ensureGroupManagementUnlocked()) return
        AlertDialog.Builder(this)
            .setTitle("Keep only ${category.name}?")
            .setMessage("Every other category in this section will be hidden. This is handy when you want to build a clean focused guide fast.")
            .setPositiveButton("Keep Only") { _, _ -> keepOnlyCategory(category) }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun ensureGroupManagementUnlocked(): Boolean {
        if (ProEntitlement.isProUnlocked(this)) return true
        ProFeatureGate.showUnlockPrompt(this, "Category hiding and group tools are available in GreenStreem Pro.")
        return false
    }

    private fun hideCategory(category: XtreamCategory) {
        lifecycleScope.launch {
            db.groupDao().hideGroup(HiddenGroup(category.id, category.name))
            Toast.makeText(this@MainActivity, "Hidden: ${category.name}", Toast.LENGTH_SHORT).show()
            currentLiveChannels = emptyList()
            epgAdapter.setData(emptyList())
            fetchCategories(autoSelectFirst = true, shouldScrollToActive = true)
        }
    }

    private fun keepOnlyCategory(category: XtreamCategory) {
        lifecycleScope.launch {
            val rowsToHide = currentCategoryRows()
                .filterNot { it.id == category.id }
                .filterNot { it.id.isVirtualCategoryId() }
                .filterNot { isPlaylistHeader(it) }
                .map { HiddenGroup(it.id, it.name) }
            if (rowsToHide.isNotEmpty()) {
                db.groupDao().hideGroups(rowsToHide)
            }
            Toast.makeText(this@MainActivity, "Showing only ${category.name}", Toast.LENGTH_SHORT).show()
            fetchCategories(autoSelectFirst = false, shouldScrollToActive = true)
            fetchContentForCategory(category)
            updateUiState(UiState.EPG_GRID)
        }
    }

    private fun showAllCategories() {
        if (!ensureGroupManagementUnlocked()) return
        lifecycleScope.launch {
            db.groupDao().clearAll()
            Toast.makeText(this@MainActivity, "All categories shown", Toast.LENGTH_SHORT).show()
            fetchCategories(autoSelectFirst = true, shouldScrollToActive = true)
        }
    }

    private fun currentCategoryRows(): List<XtreamCategory> {
        return (0 until categoryAdapter.itemCount).mapNotNull { categoryAdapter.getItemAt(it) }
    }

    private fun saveLastCategoryForCurrentMode(categoryId: String, position: Int) {
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        prefs.edit()
            .putString(lastCategoryIdKey(currentMode), categoryId)
            .putInt(lastCategoryPosKey(currentMode), position)
            .apply()
    }

    private fun saveLastCategoryIdForMode(mode: ContentMode, categoryId: String) {
        if (mode == ContentMode.LIVE_TV && categoryId.isVirtualLiveCategoryId()) return
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

    private fun scheduleLiveFocusedRowSave(
        position: Int,
        categoryId: String? = currentLiveCategoryId
    ) {
        val safePosition = position.coerceAtLeast(0)
        val safeCategoryId = categoryId?.takeIf { it.isNotBlank() }
        liveFocusSaveRunnable?.let { liveFocusSaveHandler.removeCallbacks(it) }
        liveFocusSaveRunnable = Runnable {
            val editor = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
                .edit()
                .putInt(KEY_LAST_LIVE_FOCUSED_ROW, safePosition)
            if (safeCategoryId != null) {
                editor.putInt("$KEY_LIVE_FOCUSED_ROW_PREFIX$safeCategoryId", safePosition)
            }
            editor.apply()
        }
        liveFocusSaveHandler.postDelayed(liveFocusSaveRunnable!!, LIVE_FOCUS_SAVE_DELAY_MS)
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
        syncCurrentLiveChannelFromCachedStreams()
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val playing = currentChannel
        val lastPlayedId = prefs.getLong("last_channel_id", -1L).takeIf { it > 0L }
        val savedLaunchCategoryId = prefs.getString(KEY_LAST_PLAYBACK_LIVE_CATEGORY_ID, null)
            ?.takeIf { it.isNotBlank() }
        val targetCategoryId = savedLaunchCategoryId
            ?.takeIf { it.isVirtualLiveCategoryId() }
            ?: resolveLiveCategoryId(playing)
            ?: savedLaunchCategoryId
            ?: prefs.getString("last_category_id", null)?.takeUnless { it.isVirtualLiveCategoryId() }
            ?: getLastCategoryIdForMode(ContentMode.LIVE_TV)

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

        val targetChannelId = guideFullscreenReturnChannelId ?: playing?.id ?: lastPlayedId
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

        restorePlayingChannelFocusOnNextGuideOpen = true
        suppressBackToCategoriesUntilMs = 0L
        lastBackPressTs = 0L
        updateUiState(UiState.EPG_GRID)
        if (row != -1) {
            rvContent.post { focusEpgRowAt(row) }
        }
        rvContent.postDelayed({
            if (currentState == UiState.EPG_GRID) {
                guideFullscreenReturnChannelId = null
            }
        }, 1500L)
    }

    private fun alignLiveCategorySelectionToPlayback() {
        if (currentMode != ContentMode.LIVE_TV) return
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val savedLaunchCategoryId = prefs.getString(KEY_LAST_PLAYBACK_LIVE_CATEGORY_ID, null)
            ?.takeIf { it.isNotBlank() }
        val targetCategoryId = savedLaunchCategoryId
            ?.takeIf { it.isVirtualLiveCategoryId() }
            ?: resolveLiveCategoryId(currentChannel)
            ?: savedLaunchCategoryId
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
        val savedLaunchCategoryId = prefs.getString(KEY_LAST_PLAYBACK_LIVE_CATEGORY_ID, null)
            ?.takeIf { it.isNotBlank() }
        return savedLaunchCategoryId?.takeIf { it.isVirtualLiveCategoryId() }
            ?: resolveLiveCategoryId(currentChannel)
            ?: savedLaunchCategoryId
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

    fun playChannel(
        channel: Channel,
        openInGuide: Boolean = true,
        preferredListing: XtreamEpgListing? = null
    ) {
        if (!isPlaylistEnabled()) {
            Toast.makeText(this, "Playlist is disabled in settings", Toast.LENGTH_SHORT).show()
            return
        }
        val resolvedCategoryId = when (currentLiveCategoryId) {
            "favorites", "recent" -> currentLiveCategoryId
            else -> resolveLiveCategoryId(channel)
        }
        val normalizedChannel = if (!resolvedCategoryId.isNullOrBlank() && channel.group != resolvedCategoryId) {
            channel.copy(group = resolvedCategoryId)
        } else {
            channel
        }
        val currentlyAiring = preferredListing ?: resolveCurrentlyAiringListing(normalizedChannel.id.toInt())
        val descriptionBeforeClick = tvProgramDescription.text?.toString().orEmpty()
        if (descriptionBeforeClick.isNotBlank() && !descriptionBeforeClick.isLoadingLike()) {
            lastLiveProgramDescription = descriptionBeforeClick
        }
        if (openInGuide) {
            suppressEpgFocusUpdatesUntilMs = System.currentTimeMillis() + 2500L
            suppressPlayingIndicatorUpdatesUntilMs = suppressEpgFocusUpdatesUntilMs
            epgAdapter.suppressPlayingIndicatorUpdatesUntilMs = suppressPlayingIndicatorUpdatesUntilMs
        }

        if (openInGuide && currentState != UiState.FULL_SCREEN && currentChannel?.id == normalizedChannel.id) {
            rememberLivePlaybackLaunchCategory(normalizedChannel.id, resolvedCategoryId)
            guideFullscreenReturnChannelId = normalizedChannel.id
            updateUiState(UiState.FULL_SCREEN)
            return
        }

        val wasFullScreen = currentState == UiState.FULL_SCREEN
        val previousPlayingChannelId = currentChannel?.id
        if (currentChannel?.id != normalizedChannel.id) {
            previousChannel = currentChannel
        }
        currentChannel = normalizedChannel
        epgAdapter.setCurrentPlayingChannelId(normalizedChannel.id)
        val targetState = when {
            openInGuide -> null
            wasFullScreen -> UiState.FULL_SCREEN
            else -> null
        }
        val liveUrls = buildLivePlaybackUrls(normalizedChannel)
        val liveUrl = liveUrls.firstOrNull().orEmpty()
        playLiveMedia(
            liveUrls,
            normalizedChannel.name,
            targetState
        )

        if (!resolvedCategoryId.isNullOrBlank()) {
            saveLastCategoryIdForMode(ContentMode.LIVE_TV, resolvedCategoryId)
        }
        updateCurrentLiveChannelIndex(normalizedChannel.id)
        refreshRecentChannelsRow()
        val prefsEdit = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putLong("last_channel_id", normalizedChannel.id)
            .putString(KEY_LAST_PLAYBACK_LIVE_CATEGORY_ID, resolvedCategoryId.orEmpty())
        if (!resolvedCategoryId.isNullOrBlank() && !resolvedCategoryId.isVirtualLiveCategoryId()) {
            prefsEdit.putString("last_category_id", resolvedCategoryId)
        }
        prefsEdit.apply()

        updateFocusInfo(
            normalizedChannel,
            currentlyAiring,
            respectSuppressWindow = !openInGuide
        )

        saveLastPlayback(
            type = LAST_PLAYBACK_LIVE,
            title = normalizedChannel.name,
            url = liveUrl,
            resumeKey = null,
            channelId = normalizedChannel.id
        )
        if (openInGuide && descriptionBeforeClick.isNotBlank()) {
            tvProgramDescription.postDelayed({
                if (currentMode == ContentMode.LIVE_TV &&
                    currentState == UiState.EPG_GRID &&
                    currentChannel?.id == normalizedChannel.id &&
                    tvProgramDescription.text.toString().isLoadingLike()
                ) {
                    tvProgramDescription.text = descriptionBeforeClick
                }
            }, 180L)
        }
        if (openInGuide) {
            rvContent.postDelayed({
                epgAdapter.suppressPlayingIndicatorUpdatesUntilMs = 0L
                epgAdapter.refreshPlayingIndicatorRows(previousPlayingChannelId, normalizedChannel.id)
            }, 2600L)
        }
        if (!openInGuide && wasFullScreen) showMiniInfoTemporarily()
    }

    private fun rememberLivePlaybackLaunchCategory(channelId: Long, categoryId: String?) {
        val resolved = categoryId?.takeIf { it.isNotBlank() } ?: return
        val prefsEdit = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putLong("last_channel_id", channelId)
            .putString(KEY_LAST_PLAYBACK_LIVE_CATEGORY_ID, resolved)
        if (!resolved.isVirtualLiveCategoryId()) {
            prefsEdit.putString("last_category_id", resolved)
        }
        prefsEdit.apply()
    }

    private fun resolveCurrentlyAiringListing(streamId: Int): XtreamEpgListing? {
        val cachedListings = epgCacheByStreamId[streamId]
        val now = System.currentTimeMillis() / 1000
        return cachedListings?.firstOrNull { listing ->
            now >= listing.startTimestamp && now < listing.stopTimestamp
        }
    }

    private fun String.isLoadingLike(): Boolean {
        val normalized = trim()
        return normalized.isEmpty() || normalized.equals("loading...", ignoreCase = true) ||
            normalized.startsWith("loading", ignoreCase = true)
    }

    private fun String.isVirtualLiveCategoryId(): Boolean =
        equals("favorites", ignoreCase = true) ||
            equals("recent", ignoreCase = true)

    private fun String.isVirtualCategoryId(): Boolean =
        isVirtualLiveCategoryId() ||
            equals(ALL_MOVIES_ID, ignoreCase = true) ||
            equals(ALL_SERIES_ID, ignoreCase = true) ||
            equals(MY_LIST_MOVIES_ID, ignoreCase = true) ||
            equals(MY_LIST_SERIES_ID, ignoreCase = true)

    private fun resumeLastChannel(id: Long) {
        currentMode = ContentMode.LIVE_TV
        saveCurrentMode(ContentMode.LIVE_TV)
        if (isM3uPlaylist()) {
            lifecycleScope.launch {
                val channel = loadM3uChannels().firstOrNull { it.id == id } ?: return@launch
                currentChannel = channel
                epgAdapter.setCurrentPlayingChannelId(id)
                resetAudioSelectionForNewMedia()
                val urls = buildLivePlaybackUrls(channel)
                val url = urls.firstOrNull().orEmpty()
                saveLastPlayback(LAST_PLAYBACK_LIVE, channel.name, url, null, id)
                playLiveMedia(urls, channel.name, UiState.FULL_SCREEN)
            }
            return
        }
        val prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        val savedGroup = prefs.getString(KEY_LAST_PLAYBACK_LIVE_CATEGORY_ID, "")
            ?.takeIf { it.isNotBlank() }
            ?: prefs.getString("last_category_id", "")
            ?: ""
        currentChannel = Channel(id = id, name = "Resuming...", group = savedGroup, streamUrl = "")
        epgAdapter.setCurrentPlayingChannelId(id)
        resetAudioSelectionForNewMedia()
        val urls = currentChannel?.let { buildLivePlaybackUrls(it) }.orEmpty()
        val url = urls.firstOrNull() ?: buildLiveStreamUrl(id)
        currentLivePlaybackUrls = urls.ifEmpty { listOf(url) }
        currentLivePlaybackUrlIndex = 0
        currentLivePlaybackUrl = url
        val savedTitle = prefs.getString(KEY_LAST_PLAYBACK_TITLE, "").orEmpty()
        saveLastPlayback(
            LAST_PLAYBACK_LIVE,
            savedTitle.takeIf { it.isNotBlank() && it != "Resuming..." } ?: "Live TV",
            url,
            null,
            id
        )
        resetLivePlaybackWatchdog()
        player?.setMediaItem(createLiveMediaItem(url))
        player?.prepare(); player?.play()
        updateUiState(UiState.FULL_SCREEN)
    }

    private fun buildLiveStreamUrl(streamId: Long): String {
        val format = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_LIVE_STREAM_FORMAT, LIVE_STREAM_FORMAT_TS)
        return buildLiveStreamUrl(streamId, format)
    }

    private fun buildLiveStreamUrl(streamId: Long, format: String?): String {
        return buildLiveStreamUrl(XtreamManager.baseUrl, streamId, format)
    }

    private fun buildLiveStreamUrl(baseUrl: String, streamId: Long, format: String?): String {
        val ext = if (format == LIVE_STREAM_FORMAT_HLS) "m3u8" else "ts"
        return "${baseUrl.trimEnd('/')}/live/${XtreamManager.username}/${XtreamManager.password}/$streamId.$ext"
    }

    private fun buildLivePlaybackUrls(channel: Channel): List<String> {
        if (!isM3uPlaylist()) {
            val format = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
                .getString(KEY_LIVE_STREAM_FORMAT, LIVE_STREAM_FORMAT_TS)
            val alternateFormat = if (format == LIVE_STREAM_FORMAT_HLS) LIVE_STREAM_FORMAT_TS else LIVE_STREAM_FORMAT_HLS
            val baseUrls = listOfNotNull(
                alternateBaseUrlWithoutPort(XtreamManager.baseUrl),
                XtreamManager.baseUrl
            ).distinct()
            val formats = if (format == LIVE_STREAM_FORMAT_HLS) {
                listOf(format, alternateFormat)
            } else {
                listOf(format)
            }
            return formats
                .flatMap { liveFormat -> baseUrls.map { baseUrl -> buildLiveStreamUrl(baseUrl, channel.id, liveFormat) } }
                .distinct()
        }
        val rawUrl = channel.streamUrl.trim()
        val normalizedUrl = normalizeM3uLiveUrlForPlayer(rawUrl)
        val alternateUrl = alternateM3uLiveUrlForPlayer(normalizedUrl)
        return listOf(normalizedUrl, rawUrl, alternateUrl)
            .filter { it.isNotBlank() }
            .distinct()
    }

    private fun alternateBaseUrlWithoutPort(baseUrl: String): String? {
        val uri = runCatching { Uri.parse(baseUrl) }.getOrNull() ?: return null
        if (uri.port <= 0) return null
        val host = uri.host?.takeIf { it.isNotBlank() } ?: return null
        val scheme = uri.scheme?.takeIf { it.isNotBlank() } ?: return null
        return "$scheme://$host"
    }

    private fun normalizeM3uLiveUrlForPlayer(rawUrl: String): String {
        val trimmed = rawUrl.trim()
        val uri = runCatching { Uri.parse(trimmed) }.getOrNull() ?: return trimmed
        val path = uri.path.orEmpty()
        if (!path.contains("/live/", ignoreCase = true)) return trimmed

        val currentExt = path.substringAfterLast('.', missingDelimiterValue = "")
            .substringBefore('/')
            .lowercase(Locale.getDefault())
        if (currentExt != "m3u8" && currentExt != "ts") return trimmed

        val format = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_LIVE_STREAM_FORMAT, LIVE_STREAM_FORMAT_TS)
        val desiredExt = if (format == LIVE_STREAM_FORMAT_HLS) "m3u8" else "ts"
        if (currentExt == desiredExt) return trimmed

        val encodedPath = uri.encodedPath ?: return trimmed
        val suffix = ".$currentExt"
        if (!encodedPath.endsWith(suffix, ignoreCase = true)) return trimmed
        return uri.buildUpon()
            .encodedPath(encodedPath.dropLast(suffix.length) + ".$desiredExt")
            .build()
            .toString()
    }

    private fun alternateM3uLiveUrlForPlayer(rawUrl: String): String {
        val trimmed = rawUrl.trim()
        val uri = runCatching { Uri.parse(trimmed) }.getOrNull() ?: return ""
        val path = uri.path.orEmpty()
        if (!path.contains("/live/", ignoreCase = true)) return ""

        val currentExt = path.substringAfterLast('.', missingDelimiterValue = "")
            .substringBefore('/')
            .lowercase(Locale.getDefault())
        val alternateExt = when (currentExt) {
            "m3u8" -> "ts"
            "ts" -> "m3u8"
            else -> return ""
        }

        val encodedPath = uri.encodedPath ?: return ""
        val suffix = ".$currentExt"
        if (!encodedPath.endsWith(suffix, ignoreCase = true)) return ""
        return uri.buildUpon()
            .encodedPath(encodedPath.dropLast(suffix.length) + ".$alternateExt")
            .build()
            .toString()
    }

    private fun createLiveMediaItem(url: String): MediaItem {
        val ext = Uri.parse(url).path.orEmpty()
            .substringAfterLast('.', "")
            .lowercase(Locale.getDefault())
        val mimeType = when (ext) {
            "m3u8" -> MimeTypes.APPLICATION_M3U8
            "ts" -> MimeTypes.VIDEO_MP2T
            else -> null
        }
        return MediaItem.Builder()
            .setUri(url)
            .also { builder -> mimeType?.let { builder.setMimeType(it) } }
            .build()
    }

    private fun switchToNextLivePlaybackUrl(reason: String): Boolean {
        val urls = currentLivePlaybackUrls
        if (urls.isEmpty() || currentLivePlaybackUrlIndex >= urls.lastIndex) return false
        val nextIndex = ((currentLivePlaybackUrlIndex + 1)..urls.lastIndex)
            .firstOrNull { urls[it] !in rejectedLivePlaybackUrls }
            ?: return false
        currentLivePlaybackUrlIndex = nextIndex
        val nextUrl = urls[currentLivePlaybackUrlIndex]
        currentLivePlaybackUrl = nextUrl
        resetLivePlaybackWatchdog()
        Log.w(TAG, "switching live source reason=$reason channel=${currentChannel?.name.orEmpty()} url=${safePlaybackUrl(nextUrl)} index=$currentLivePlaybackUrlIndex/${urls.lastIndex}")
        runCatching {
            resetAudioSelectionForNewMedia()
            player?.setMediaItem(createLiveMediaItem(nextUrl))
            player?.prepare()
            player?.play()
        }.onFailure { error ->
            Log.w(TAG, "failed switching live source url=${safePlaybackUrl(nextUrl)}", error)
        }
        return true
    }

    private fun rememberLiveStreamFormatForUrl(url: String) {
        val format = when (liveUrlExtension(url)) {
            "m3u8" -> LIVE_STREAM_FORMAT_HLS
            "ts" -> LIVE_STREAM_FORMAT_TS
            else -> return
        }
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_LIVE_STREAM_FORMAT, format)
            .apply()
    }

    private fun liveUrlExtension(url: String): String {
        return Uri.parse(url).path.orEmpty()
            .substringAfterLast('.', "")
            .substringBefore('/')
            .lowercase(Locale.getDefault())
    }

    private fun recoverLivePlayback(reason: String): Boolean {
        val liveUrl = currentLivePlaybackUrl ?: return false
        val currentPlayer = player ?: return false
        lastLivePlaybackReconnectAtMs = System.currentTimeMillis()
        resetLivePlaybackWatchdog()
        if (reason.contains("BAD_HTTP_STATUS", ignoreCase = true) || reason.contains("509")) {
            rejectedLivePlaybackUrls.add(liveUrl)
            Log.w(TAG, "marking live source rejected reason=$reason ${livePlaybackDebugSummary(liveUrl)}")
        }
        if (switchToNextLivePlaybackUrl(reason)) return true
        if (currentLivePlaybackUrlIndex > 0 && currentLivePlaybackUrls.isNotEmpty()) {
            currentLivePlaybackUrlIndex = 0
            currentLivePlaybackUrl = currentLivePlaybackUrls.first()
            Log.w(TAG, "live playback $reason; returning to primary ${livePlaybackDebugSummary(currentLivePlaybackUrls.first())}")
            runCatching {
                resetAudioSelectionForNewMedia()
                currentPlayer.setMediaItem(createLiveMediaItem(currentLivePlaybackUrls.first()))
                currentPlayer.prepare()
                currentPlayer.play()
            }.onFailure { error ->
                Log.w(TAG, "failed returning to primary live playback url=${safePlaybackUrl(currentLivePlaybackUrls.first())}", error)
            }
            return true
        }

        Log.w(TAG, "live playback $reason; reconnecting ${currentChannel?.name.orEmpty()} state=${currentPlayer.playbackState} url=${safePlaybackUrl(liveUrl)}")
        runCatching {
            resetAudioSelectionForNewMedia()
            currentPlayer.setMediaItem(createLiveMediaItem(liveUrl))
            currentPlayer.prepare()
            currentPlayer.play()
        }.onFailure { error ->
            Log.w(TAG, "failed reconnecting live playback url=${safePlaybackUrl(liveUrl)}", error)
        }
        return true
    }

    private fun reconnectCurrentLivePlayback(reason: String): Boolean {
        val liveUrl = currentLivePlaybackUrl ?: return false
        val currentPlayer = player ?: return false
        lastLivePlaybackReconnectAtMs = System.currentTimeMillis()
        resetLivePlaybackWatchdog()
        Log.w(TAG, "live playback $reason; reconnecting current ${livePlaybackDebugSummary(liveUrl)}")
        runCatching {
            resetAudioSelectionForNewMedia()
            currentPlayer.setMediaItem(createLiveMediaItem(liveUrl))
            currentPlayer.prepare()
            currentPlayer.play()
        }.onFailure { error ->
            Log.w(TAG, "failed reconnecting current live playback url=${safePlaybackUrl(liveUrl)}", error)
        }
        return true
    }

    private fun safePlaybackUrl(url: String): String {
        val uri = runCatching { Uri.parse(url) }.getOrNull() ?: return url.take(96)
        val host = uri.host.orEmpty()
        val port = if (uri.port > 0) ":${uri.port}" else ""
        val path = uri.path.orEmpty()
        val tail = path.substringAfterLast('/').takeLast(24)
        return "${uri.scheme}://$host$port/.../$tail"
    }

    private fun livePlaybackDebugSummary(url: String): String {
        val uri = runCatching { Uri.parse(url) }.getOrNull() ?: return "url=${url.take(96)}"
        val port = if (uri.port > 0) ":${uri.port}" else ""
        val path = uri.path.orEmpty()
        val ext = liveUrlExtension(url).ifBlank { "unknown" }
        val streamId = path.substringAfterLast('/').substringBefore('.').ifBlank { "unknown" }
        val type = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_PLAYLIST_TYPE, PLAYLIST_TYPE_XTREAM)
        return "type=$type host=${uri.host.orEmpty()}$port stream=$streamId ext=$ext"
    }

    private fun buildVodUrl(streamId: Int, providerExtension: String?): String {
        val ext = providerExtension?.takeIf { it.isNotBlank() } ?: "mp4"
        return "${XtreamManager.baseUrl}/movie/${XtreamManager.username}/${XtreamManager.password}/$streamId.$ext"
    }

    private fun shouldUseExternalMoviePlayer(): Boolean {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_MOVIE_PLAYER_MODE, MOVIE_PLAYER_BUILT_IN) == MOVIE_PLAYER_EXTERNAL
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
        playChannel(currentLiveChannels[targetIndex], openInGuide = false)
        return true
    }

    private fun playPreviousChannel(): Boolean {
        if (currentMode != ContentMode.LIVE_TV) return false
        val target = previousChannel ?: run {
            Toast.makeText(this, "No previous channel", Toast.LENGTH_SHORT).show()
            return true
        }
        playChannel(target, openInGuide = false)
        return true
    }

    private fun cycleAspectRatio() {
        val currentIndex = aspectModes.indexOfFirst { it.first == currentDisplayModeId }.coerceAtLeast(0)
        val next = aspectModes[(currentIndex + 1) % aspectModes.size]
        applyDisplayMode(next.first)
        Toast.makeText(this, "Aspect ratio: ${next.second}", Toast.LENGTH_SHORT).show()
    }

    private fun applyDisplayMode(choiceId: String) {
        val choice = displayModeChoices.firstOrNull { it.id == choiceId } ?: displayModeChoices.first()
        currentDisplayModeId = choice.id
        currentAspectRatioMode = choice.resizeMode
        applyDisplayModeToViews(choice)
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_PLAYER_DISPLAY_MODE_ID, choice.id)
            .putInt(KEY_PLAYER_ASPECT_MODE, currentAspectRatioMode)
            .apply()
    }

    private fun applyDisplayModeToViews(choice: DisplayModeChoice? = displayModeChoices.firstOrNull { it.id == currentDisplayModeId }) {
        val selected = choice ?: displayModeChoices.first()
        listOf(playerView, previewPlayerView).forEach { view ->
            view.resizeMode = selected.resizeMode
            view.scaleX = 1f
            view.scaleY = 1f
            val contentFrame = view.findViewById<AspectRatioFrameLayout>(androidx.media3.ui.R.id.exo_content_frame)
            contentFrame?.resizeMode = selected.resizeMode
            contentFrame?.scaleX = selected.scaleX
            contentFrame?.scaleY = selected.scaleY
            contentFrame?.requestLayout()
            contentFrame?.invalidate()
            view.videoSurfaceView?.scaleX = selected.scaleX
            view.videoSurfaceView?.scaleY = selected.scaleY
            view.videoSurfaceView?.requestLayout()
            view.requestLayout()
            view.invalidate()
        }
    }

    private fun displayModeRowBackground(selected: Boolean): GradientDrawable {
        return GradientDrawable().apply {
            cornerRadius = resources.displayMetrics.density * 8f
            setColor(if (selected) AppearanceTheme.accentColor(this@MainActivity) else Color.rgb(25, 30, 38))
            setStroke(
                (if (selected) 3 else 1) * resources.displayMetrics.density.toInt().coerceAtLeast(1),
                if (selected) Color.WHITE else Color.rgb(70, 78, 88)
            )
        }
    }

    private fun showDisplayModeDialog() {
        val currentIndex = displayModeChoices.indexOfFirst { it.id == currentDisplayModeId }
            .takeIf { it >= 0 } ?: 0
        val adapter = object : BaseAdapter() {
            override fun getCount() = displayModeChoices.size
            override fun getItem(position: Int) = displayModeChoices[position]
            override fun getItemId(position: Int) = position.toLong()
            override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
                val view = convertView ?: layoutInflater.inflate(R.layout.item_display_mode_option, parent, false)
                val choice = displayModeChoices[position]
                val selected = choice.id == currentDisplayModeId
                view.background = displayModeRowBackground(selected)
                val title = view.findViewById<TextView>(R.id.tvDisplayModeTitle)
                val description = view.findViewById<TextView>(R.id.tvDisplayModeDescription)
                title.text = if (selected) "SELECTED  ${choice.title}" else choice.title
                title.setTextColor(if (selected) Color.BLACK else Color.WHITE)
                description.text = choice.description
                description.setTextColor(if (selected) Color.rgb(8, 18, 16) else Color.rgb(176, 186, 198))
                return view
            }
        }
        AlertDialog.Builder(this)
            .setTitle("Display mode")
            .setSingleChoiceItems(adapter, currentIndex) { dialog, which ->
                val choice = displayModeChoices[which]
                applyDisplayMode(choice.id)
                dialog.dismiss()
                Toast.makeText(this, "Display mode: ${choice.title}", Toast.LENGTH_SHORT).show()
                showMovieControls(focusControls = false)
            }
            .setNegativeButton("Cancel", null)
            .create()
            .also { dialog ->
                dialog.setOnShowListener {
                    dialog.window?.let { window ->
                        val width = (resources.displayMetrics.widthPixels * 0.36f).toInt()
                        window.setLayout(width, ViewGroup.LayoutParams.WRAP_CONTENT)
                        window.setGravity(Gravity.END or Gravity.CENTER_VERTICAL)
                        window.attributes = window.attributes.apply {
                            x = (24 * resources.displayMetrics.density).toInt()
                            dimAmount = 0.18f
                        }
                    }
                    val list = dialog.listView
                    list.setSelection(currentIndex)
                    list.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
                        override fun onItemSelected(parent: AdapterView<*>?, view: View?, position: Int, id: Long) {
                            displayModeChoices.getOrNull(position)?.let { choice ->
                                applyDisplayMode(choice.id)
                                adapter.notifyDataSetChanged()
                            }
                        }

                        override fun onNothingSelected(parent: AdapterView<*>?) = Unit
                    }
                }
            }
            .show()
    }

    private fun buildRecentChannels(): List<Channel> {
        val recentIds = getRecentChannelIds()
        if (recentIds.isEmpty()) return emptyList()
        if (isM3uPlaylist()) {
            val channelById = cachedM3uChannels.orEmpty().associateBy { it.id }
            return recentIds.mapNotNull { channelById[it] }
        }
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
        recentChannelAdapter.submitList(emptyList())
        updateRecentChannelsVisibility()
    }

    private fun updateRecentChannelsVisibility() {
        val shouldShow = currentState != UiState.FULL_SCREEN && recentChannelAdapter.itemCount > 0
        rvRecentChannels.visibility = if (shouldShow) View.VISIBLE else View.GONE
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
                pbProgramProgress?.visibility = View.GONE
            }
        }
        miniInfoHandler.postDelayed(miniInfoRunnable!!, miniInfoTimeoutMs)
    }

    companion object {
        private const val TAG = "GreenStreemEpg"
        private const val DEBUG_EPG_FOCUS = false
        private const val LIVE_FOCUS_SAVE_DELAY_MS = 450L
        private const val IPTV_PLAYER_USER_AGENT = "VLC/3.0.20 LibVLC/3.0.20"
        private val IPTV_PLAYER_HEADERS = mapOf(
            "Accept" to "*/*",
            "Connection" to "keep-alive",
            "Icy-MetaData" to "1"
        )
        private const val KEY_AUTOPLAY_LAST_CHANNEL = "autoplay_last_channel"
        private const val KEY_PLAYER_ASPECT_MODE = "player_aspect_mode"
        private const val KEY_PLAYER_DISPLAY_MODE_ID = "player_display_mode_id"
        private const val KEY_MINI_INFO_TIMEOUT_SEC = "mini_info_timeout_sec"
        private const val KEY_MOVIE_PLAYER_MODE = "player_movie_player_mode"
        private const val MOVIE_PLAYER_BUILT_IN = "built_in"
        private const val MOVIE_PLAYER_EXTERNAL = "external"
        private const val KEY_LIVE_STREAM_FORMAT = "player_live_stream_format"
        private const val LIVE_STREAM_FORMAT_TS = "ts"
        private const val LIVE_STREAM_FORMAT_HLS = "hls"
        private const val KEY_AUDIO_PASSTHROUGH = "player_audio_passthrough"
        private const val KEY_AUDIO_OFFSET_MS = "player_audio_offset_ms"
        private const val KEY_AUTO_NEXT_EPISODE = "player_auto_next_episode"
        private const val NEXT_EPISODE_PROMPT_REMAINING_MS = 10_000L
        private const val VOD_RESUME_TICK_MS = 1_000L
        private const val KEY_TUNNELED_PLAYBACK = "player_tunneled_playback"
        private const val KEY_BUFFER_SIZE_SEC = "player_buffer_size_sec"
        private const val KEY_LAST_UI_STATE = "last_ui_state"
        private const val KEY_LAST_CONTENT_MODE = "last_content_mode"
        private const val KEY_LAST_PLAYBACK_TYPE = "last_playback_type"
        private const val KEY_LAST_PLAYBACK_TITLE = "last_playback_title"
        private const val KEY_LAST_PLAYBACK_URL = "last_playback_url"
        private const val KEY_LAST_PLAYBACK_RESUME_KEY = "last_playback_resume_key"
        private const val KEY_LAST_PLAYBACK_CHANNEL_ID = "last_playback_channel_id"
        private const val KEY_LAST_PLAYBACK_LIVE_CATEGORY_ID = "last_playback_live_category_id"
        private const val VOD_WATCHED_REMAINING_MS = 600_000L
        private const val LAST_PLAYBACK_LIVE = "live"
        private const val LAST_PLAYBACK_MOVIE = "movie"
        private const val LAST_PLAYBACK_SERIES = "series"
        private const val KEY_VOD_WATCHED_PREFIX = "vod_watched_"
        private const val EXTRA_SERIES_EPISODE_URLS = "series_episode_urls"
        private const val EXTRA_SERIES_EPISODE_TITLES = "series_episode_titles"
        private const val EXTRA_SERIES_EPISODE_KEYS = "series_episode_keys"
        private const val EXTRA_SERIES_EPISODE_INDEX = "series_episode_index"
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
        private const val KEY_TIME_FORMAT = "general_time_format"
        private const val KEY_SHOW_CLOCK = "general_show_clock"
        private const val KEY_SHOW_DATE_CLOCK = "general_show_date_clock"
        private const val KEY_EPG_DAYS = "epg_past_days"
        private const val KEY_EPG_DAYS_LEGACY = "epg_days"
        private const val KEY_EPG_AUTO_UPDATE = "epg_auto_update"
        private const val KEY_EPG_UPDATE_INTERVAL = "epg_update_interval"
        private const val KEY_EPG_UPDATE_ON_START = "epg_update_on_start"
        private const val KEY_EPG_FORCE_REFRESH_NOW = "epg_force_refresh_now"
        private const val KEY_EPG_UPDATE_IN_PROGRESS = "epg_update_in_progress"
        private const val KEY_EPG_UPDATE_STARTED_AT = "epg_update_started_at"
        private const val KEY_EPG_LAST_REFRESHED_AT = "epg_last_refreshed_at"
        private const val KEY_EPG_CLEAR_REQUESTED = "epg_clear_requested"
        private const val KEY_EPG_SETTINGS_SIGNATURE = "epg_settings_signature"
        private const val KEY_GROUPS_CHANGED = "groups_changed"
        private const val KEY_EPG_CLICK_TO_PLAY = "epg_click_to_play"
        private const val KEY_PLAYLIST_ENABLED = "playlist_enabled"
        private const val KEY_PLAYLIST_UPDATE_ON_START = "playlist_update_on_start"
        private const val KEY_PLAYLIST_TYPE = "playlist_type"
        private const val KEY_M3U_URL = "m3u_url"
        private const val PLAYLIST_TYPE_XTREAM = "xtream"
        private const val PLAYLIST_TYPE_M3U = "m3u"
        private const val KEY_SECONDARY_EPG_ENABLED = "secondary_epg_enabled"
        private const val KEY_SECONDARY_EPG_MODE = "secondary_epg_mode"
        private const val SECONDARY_EPG_MODE_FILL_MISSING = 0
        private const val SECONDARY_EPG_MODE_SECONDARY_FIRST = 1
        private const val SECONDARY_EPG_MODE_SECONDARY_ONLY = 2
        private const val SECONDARY_EPG_MODE_PROVIDER_ONLY = 3
        private const val EPG_PROVIDER_SECONDARY_PREFIX = "secondary:"
        private const val KEY_MY_LIST_MOVIES = "my_list_movie_ids"
        private const val KEY_MY_LIST_SERIES = "my_list_series_ids"
        private const val ALL_MOVIES_ID = "all_movies"
        private const val ALL_SERIES_ID = "all_series"
        private const val MY_LIST_MOVIES_ID = "my_list_movies"
        private const val MY_LIST_SERIES_ID = "my_list_series"
        private const val MAX_RECENT_CHANNELS = 30
    }

    private fun isPlaylistEnabled(): Boolean {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getBoolean(KEY_PLAYLIST_ENABLED, true)
    }

    private fun isM3uPlaylist(): Boolean {
        return getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_PLAYLIST_TYPE, PLAYLIST_TYPE_XTREAM) == PLAYLIST_TYPE_M3U
    }

    private fun promoteXtreamM3uPrefsIfNeeded(prefs: android.content.SharedPreferences) {
        if (prefs.getString(KEY_PLAYLIST_TYPE, PLAYLIST_TYPE_XTREAM) != PLAYLIST_TYPE_M3U) return
        val m3uUrl = prefs.getString(KEY_M3U_URL, "").orEmpty()
            .ifBlank { prefs.getString("server_url", "").orEmpty() }
        val credentials = XtreamM3uUrl.parse(m3uUrl) ?: return
        val name = prefs.getString("playlist_name", "M3U Playlist").orEmpty().ifBlank { "M3U Playlist" }
        Log.i(TAG, "promoting Xtream-style M3U playlist to Xtream API mode host=${credentials.serverUrl}")
        prefs.edit()
            .putString(KEY_PLAYLIST_TYPE, PLAYLIST_TYPE_XTREAM)
            .remove(KEY_M3U_URL)
            .putString("server_url", credentials.serverUrl)
            .putString("username", credentials.username)
            .putString("password", credentials.password)
            .putString(KEY_LIVE_STREAM_FORMAT, if (credentials.output.equals("m3u8", ignoreCase = true)) LIVE_STREAM_FORMAT_HLS else LIVE_STREAM_FORMAT_TS)
            .putString("playlist_name", name)
            .putBoolean("has_playlist", true)
            .putBoolean(KEY_PLAYLIST_ENABLED, true)
            .apply()
        val profile = PlaylistProfilesManager.createProfile(
            name,
            credentials.serverUrl,
            credentials.username,
            credentials.password
        )
        PlaylistProfilesManager.upsertProfileAndActivate(this, profile)
    }

    private suspend fun loadM3uChannels(): List<Channel> {
        cachedM3uChannels?.let { return it }
        val url = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .getString(KEY_M3U_URL, "")
            .orEmpty()
        if (url.isBlank()) return emptyList()
        val channels = withContext(Dispatchers.IO) {
            runCatching {
                URL(url).openStream().use { stream -> M3uParser.parse(stream) }
            }.getOrDefault(emptyList())
        }
        cachedM3uChannels = channels
        return channels
    }

    private suspend fun loadM3uChannelsForMode(mode: ContentMode): List<Channel> {
        val kind = when (mode) {
            ContentMode.LIVE_TV -> M3uContentKind.LIVE
            ContentMode.MOVIES -> M3uContentKind.MOVIES
            ContentMode.SERIES -> M3uContentKind.SERIES
        }
        return loadM3uChannels().filter { classifyM3uChannel(it) == kind }
    }

    private fun classifyM3uChannel(channel: Channel): M3uContentKind {
        val url = channel.streamUrl.lowercase(Locale.getDefault())
        val group = channel.group.lowercase(Locale.getDefault())
        val name = channel.name.lowercase(Locale.getDefault())
        val haystack = "$group $name $url"
        val extension = url.substringBefore('?').substringAfterLast('.', "")
        return when {
            "/series/" in url ||
                group.startsWith("series") ||
                group.contains(" series") ||
                group.contains("tv series") ||
                group.contains("tv show") ||
                group.contains("shows") ||
                group.contains("boxset") ||
                group.contains("box set") ||
                group.contains("season") ||
                name.contains(" season ") ||
                name.contains(" episode ") ||
                Regex("""\bs\d{1,2}e\d{1,2}\b""").containsMatchIn(haystack) -> M3uContentKind.SERIES
            "/movie/" in url ||
                group.startsWith("movie") ||
                group.startsWith("vod") ||
                group.contains(" movie") ||
                group.contains("movies") ||
                group.contains("vod") ||
                group.contains("film") ||
                group.contains("cinema") ||
                group.contains("top 100") ||
                Regex("""\b(19|20)\d{2}\s+movies?\b""").containsMatchIn(group) ||
                extension in setOf("mp4", "mkv", "avi", "mov", "m4v") -> M3uContentKind.MOVIES
            "/live/" in url -> M3uContentKind.LIVE
            else -> M3uContentKind.LIVE
        }
    }

    private fun m3uDisplayGroup(channel: Channel): String =
        channel.group.trim().ifBlank {
            when (classifyM3uChannel(channel)) {
                M3uContentKind.MOVIES -> "Movies"
                M3uContentKind.SERIES -> "Series"
                M3uContentKind.LIVE -> "Default"
            }
        }

    private fun Channel.toM3uVodStream(): XtreamVodStream {
        return XtreamVodStream(
            num = number,
            name = name,
            streamId = id.toInt(),
            streamIcon = logoUrl,
            categoryId = m3uDisplayGroup(this),
            containerExtension = streamUrl.substringAfterLast('.', "").substringBefore('?').takeIf { it.length in 2..5 },
            directUrl = streamUrl
        )
    }

    private fun resolveLiveCategoryId(channel: Channel?): String? {
        val group = channel?.group?.trim().orEmpty()
        if (group.isVirtualLiveCategoryId()) return group
        val stream = cachedLiveStreams
            ?.values
            ?.asSequence()
            ?.flatten()
            ?.firstOrNull { it.streamId.toLong() == channel?.id }
        stream?.categoryId?.takeIf { it.isNotBlank() }?.let { return it }
        return group.takeIf { it.isNotBlank() }
    }

    private fun syncCurrentLiveChannelFromCachedStreams(): String? {
        val channel = currentChannel ?: return null
        val preservedVirtualGroup = channel.group.trim().takeIf { it.isVirtualLiveCategoryId() }
        val stream = cachedLiveStreams
            ?.values
            ?.asSequence()
            ?.flatten()
            ?.firstOrNull { it.streamId.toLong() == channel.id }
            ?: return null
        val categoryId = stream.categoryId?.takeIf { it.isNotBlank() } ?: return null
        val effectiveCategoryId = preservedVirtualGroup ?: categoryId
        currentChannel = channel.copy(
            name = stream.name,
            group = effectiveCategoryId,
            logoUrl = stream.streamIcon,
            epgId = stream.epgId,
            number = stream.num,
            hasCatchup = supportsCatchup(stream)
        )
        if (preservedVirtualGroup == null) {
            saveLastCategoryIdForMode(ContentMode.LIVE_TV, categoryId)
            getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
                .edit()
                .putString("last_category_id", categoryId)
                .apply()
        }
        return effectiveCategoryId
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
        window.clearFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON)
        saveVodResumeProgress()
        dismissCurrentActionDialog()
        miniInfoRunnable?.let { miniInfoHandler.removeCallbacks(it) }
        zapBarRunnable?.let { zapBarHandler.removeCallbacks(it) }
        movieControlsHideRunnable?.let { movieControlsHandler.removeCallbacks(it) }
        movieControlsTickRunnable?.let { movieControlsHandler.removeCallbacks(it) }
        vodInfoRunnable?.let { vodInfoHandler.removeCallbacks(it) }
        currentVodInfoCall?.cancel()
        epgUiFlushRunnable?.let { epgUiUpdateHandler.removeCallbacks(it) }
        pendingEpgUiUpdates.clear()
        uiTickRunnable?.let { uiTickHandler.removeCallbacks(it) }
        sleepTimerRunnable?.let { sleepTimerHandler.removeCallbacks(it) }
        startupWorkRunnable?.let { startupWorkHandler.removeCallbacks(it) }
        livePlaybackWatchdogRunnable?.let { livePlaybackHandler.removeCallbacks(it) }
        super.onDestroy()
        player?.release()
    }
}
