package com.example.greenstreem

import android.content.Context
import android.os.Bundle
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.media3.ui.AspectRatioFrameLayout
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class PlaybackSettingsActivity : AppCompatActivity() {

    private lateinit var prefs: android.content.SharedPreferences
    private lateinit var rvOptions: RecyclerView

    private val aspectOptions = listOf(
        "Fit" to AspectRatioFrameLayout.RESIZE_MODE_FIT,
        "Fill" to AspectRatioFrameLayout.RESIZE_MODE_FILL,
        "Zoom" to AspectRatioFrameLayout.RESIZE_MODE_ZOOM
    )
    private val miniInfoOptions = listOf(
        "Off" to 0,
        "2 seconds" to 2,
        "4 seconds" to 4,
        "6 seconds" to 6,
        "10 seconds" to 10
    )
    private val decoderOptions = listOf("Auto", "Hardware", "Software")
    private val moviePlayerOptions = listOf(
        "Built-in player" to MOVIE_PLAYER_BUILT_IN,
        "External player" to MOVIE_PLAYER_EXTERNAL
    )
    private val liveFormatOptions = listOf(
        "TS" to LIVE_STREAM_FORMAT_TS,
        "HLS" to LIVE_STREAM_FORMAT_HLS
    )
    private val bufferOptions = listOf(
        "Instant (0 sec)" to 0,
        "Tiny (3 sec)" to 3,
        "Low (5 sec)" to 5,
        "Quick (10 sec)" to 10,
        "Small (15 sec)" to 15,
        "Normal (30 sec)" to 30,
        "Large (60 sec)" to 60,
        "Very large (120 sec)" to 120
    )
    private val audioOffsetOptions = listOf(
        "-2000 ms" to -2000,
        "-1000 ms" to -1000,
        "-500 ms" to -500,
        "0 ms (default)" to 0,
        "+500 ms" to 500,
        "+1000 ms" to 1000,
        "+2000 ms" to 2000
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!ProFeatureGate.require(this, "Playback settings are available in GreenStreem Pro.")) return
        setContentView(R.layout.activity_playlist_settings)

        prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        findViewById<TextView>(R.id.tvPlaylistSettingsTitle)?.text = "Playback Settings"

        rvOptions = findViewById(R.id.rvPlaylistOptions)
        rvOptions.layoutManager = LinearLayoutManager(this)
        renderOptions()
    }

    private fun renderOptions() {
        val autoplayLabel = if (prefs.getBoolean(KEY_AUTOPLAY_LAST_CHANNEL, true)) "On" else "Off"
        val aspectLabel = aspectOptions.firstOrNull { it.second == prefs.getInt(KEY_PLAYER_ASPECT_MODE, AspectRatioFrameLayout.RESIZE_MODE_FILL) }?.first ?: "Fill"
        val timeoutLabel = miniInfoOptions.firstOrNull { it.second == prefs.getInt(KEY_MINI_INFO_TIMEOUT_SEC, 4) }?.first ?: "4 seconds"
        val videoDecoderLabel = decoderOptions.getOrElse(prefs.getInt(KEY_VIDEO_DECODER, 0)) { "Auto" }
        val audioDecoderLabel = decoderOptions.getOrElse(prefs.getInt(KEY_AUDIO_DECODER, 0)) { "Auto" }
        val moviePlayerLabel = moviePlayerOptions.firstOrNull {
            it.second == prefs.getString(KEY_MOVIE_PLAYER_MODE, MOVIE_PLAYER_BUILT_IN)
        }?.first ?: "Built-in player"
        val liveFormatLabel = liveFormatOptions.firstOrNull {
            it.second == prefs.getString(KEY_LIVE_STREAM_FORMAT, LIVE_STREAM_FORMAT_TS)
        }?.first ?: "TS"
        val tunneledLabel = if (prefs.getBoolean(KEY_TUNNELED_PLAYBACK, false)) "On" else "Off"
        val bufferLabel = bufferOptions.firstOrNull { it.second == prefs.getInt(KEY_BUFFER_SIZE_SEC, 60) }?.first ?: "Large (60 sec)"
        val passthroughLabel = if (prefs.getBoolean(KEY_AUDIO_PASSTHROUGH, false)) "On" else "Off"
        val autoNextLabel = if (prefs.getBoolean(KEY_AUTO_NEXT_EPISODE, true)) "On" else "Off"
        val audioOffsetMs = prefs.getInt(KEY_AUDIO_OFFSET_MS, 0)
        val audioOffsetLabel = audioOffsetOptions.firstOrNull { it.second == audioOffsetMs }?.first ?: "$audioOffsetMs ms"

        val options = listOf(
            "Video decoder: $videoDecoderLabel",
            "Audio decoder: $audioDecoderLabel",
            "Movie player: $moviePlayerLabel",
            "Live stream format: $liveFormatLabel",
            "Tunneled playback: $tunneledLabel",
            "Buffer size: $bufferLabel",
            "Audio passthrough: $passthroughLabel",
            "Audio offset: $audioOffsetLabel",
            "Auto next episode: $autoNextLabel",
            "Auto play last channel on startup: $autoplayLabel",
            "Default aspect ratio: $aspectLabel",
            "Mini info timeout: $timeoutLabel"
        )

        rvOptions.adapter = SimpleSettingsAdapter(options) { selection ->
            when {
                selection.startsWith("Video decoder") -> showDecoderDialog("Video decoder", KEY_VIDEO_DECODER)
                selection.startsWith("Audio decoder") -> showDecoderDialog("Audio decoder", KEY_AUDIO_DECODER)
                selection.startsWith("Movie player") -> showStringChoiceDialog("Movie player", KEY_MOVIE_PLAYER_MODE, moviePlayerOptions, MOVIE_PLAYER_BUILT_IN)
                selection.startsWith("Live stream format") -> showStringChoiceDialog("Live stream format", KEY_LIVE_STREAM_FORMAT, liveFormatOptions, LIVE_STREAM_FORMAT_TS)
                selection.startsWith("Tunneled playback") -> toggleBoolean(KEY_TUNNELED_PLAYBACK, false)
                selection.startsWith("Buffer size") -> showBufferDialog()
                selection.startsWith("Audio passthrough") -> toggleBoolean(KEY_AUDIO_PASSTHROUGH, false)
                selection.startsWith("Audio offset") -> showAudioOffsetDialog()
                selection.startsWith("Auto next episode") -> toggleBoolean(KEY_AUTO_NEXT_EPISODE, true)
                selection.startsWith("Auto play last channel") -> toggleBoolean(KEY_AUTOPLAY_LAST_CHANNEL, true)
                selection.startsWith("Default aspect ratio") -> showAspectRatioDialog()
                selection.startsWith("Mini info timeout") -> showMiniInfoTimeoutDialog()
            }
        }
    }

    private fun toggleBoolean(key: String, default: Boolean) {
        val next = !prefs.getBoolean(key, default)
        prefs.edit().putBoolean(key, next).apply()
        renderOptions()
    }

    private fun showDecoderDialog(title: String, key: String) {
        val current = prefs.getInt(key, 0).coerceIn(decoderOptions.indices)
        AlertDialog.Builder(this)
            .setTitle(title)
            .setSingleChoiceItems(decoderOptions.toTypedArray(), current) { dialog, which ->
                prefs.edit().putInt(key, which).apply()
                dialog.dismiss()
                renderOptions()
            }
            .show()
    }

    private fun showStringChoiceDialog(
        title: String,
        key: String,
        options: List<Pair<String, String>>,
        defaultValue: String
    ) {
        val current = prefs.getString(key, defaultValue) ?: defaultValue
        val currentIndex = options.indexOfFirst { it.second == current }.coerceAtLeast(0)
        AlertDialog.Builder(this)
            .setTitle(title)
            .setSingleChoiceItems(options.map { it.first }.toTypedArray(), currentIndex) { dialog, which ->
                prefs.edit().putString(key, options[which].second).apply()
                dialog.dismiss()
                renderOptions()
            }
            .show()
    }

    private fun showBufferDialog() {
        val current = prefs.getInt(KEY_BUFFER_SIZE_SEC, 60)
        val currentIndex = bufferOptions.indexOfFirst { it.second == current }.coerceAtLeast(0)
        AlertDialog.Builder(this)
            .setTitle("Buffer size")
            .setSingleChoiceItems(bufferOptions.map { it.first }.toTypedArray(), currentIndex) { dialog, which ->
                prefs.edit().putInt(KEY_BUFFER_SIZE_SEC, bufferOptions[which].second).apply()
                dialog.dismiss()
                renderOptions()
            }
            .show()
    }

    private fun showAudioOffsetDialog() {
        val current = prefs.getInt(KEY_AUDIO_OFFSET_MS, 0)
        val currentIndex = audioOffsetOptions.indexOfFirst { it.second == current }.coerceAtLeast(3)
        AlertDialog.Builder(this)
            .setTitle("Audio offset")
            .setSingleChoiceItems(audioOffsetOptions.map { it.first }.toTypedArray(), currentIndex) { dialog, which ->
                prefs.edit().putInt(KEY_AUDIO_OFFSET_MS, audioOffsetOptions[which].second).apply()
                dialog.dismiss()
                renderOptions()
            }
            .show()
    }

    private fun showAspectRatioDialog() {
        val current = prefs.getInt(KEY_PLAYER_ASPECT_MODE, AspectRatioFrameLayout.RESIZE_MODE_FILL)
        val currentIndex = aspectOptions.indexOfFirst { it.second == current }.coerceAtLeast(0)
        AlertDialog.Builder(this)
            .setTitle("Default aspect ratio")
            .setSingleChoiceItems(aspectOptions.map { it.first }.toTypedArray(), currentIndex) { dialog, which ->
                prefs.edit().putInt(KEY_PLAYER_ASPECT_MODE, aspectOptions[which].second).apply()
                dialog.dismiss()
                renderOptions()
            }
            .show()
    }

    private fun showMiniInfoTimeoutDialog() {
        val current = prefs.getInt(KEY_MINI_INFO_TIMEOUT_SEC, 4)
        val currentIndex = miniInfoOptions.indexOfFirst { it.second == current }.coerceAtLeast(0)
        AlertDialog.Builder(this)
            .setTitle("Mini info timeout")
            .setSingleChoiceItems(miniInfoOptions.map { it.first }.toTypedArray(), currentIndex) { dialog, which ->
                prefs.edit().putInt(KEY_MINI_INFO_TIMEOUT_SEC, miniInfoOptions[which].second).apply()
                dialog.dismiss()
                renderOptions()
            }
            .show()
    }

    companion object {
        const val KEY_AUTOPLAY_LAST_CHANNEL = "autoplay_last_channel"
        const val KEY_PLAYER_ASPECT_MODE = "player_aspect_mode"
        const val KEY_MINI_INFO_TIMEOUT_SEC = "mini_info_timeout_sec"
        const val KEY_VIDEO_DECODER = "player_video_decoder"
        const val KEY_AUDIO_DECODER = "player_audio_decoder"
        const val KEY_MOVIE_PLAYER_MODE = "player_movie_player_mode"
        const val MOVIE_PLAYER_BUILT_IN = "built_in"
        const val MOVIE_PLAYER_EXTERNAL = "external"
        const val KEY_LIVE_STREAM_FORMAT = "player_live_stream_format"
        const val LIVE_STREAM_FORMAT_TS = "ts"
        const val LIVE_STREAM_FORMAT_HLS = "hls"
        const val KEY_TUNNELED_PLAYBACK = "player_tunneled_playback"
        const val KEY_BUFFER_SIZE_SEC = "player_buffer_size_sec"
        const val KEY_AUDIO_PASSTHROUGH = "player_audio_passthrough"
        const val KEY_AUDIO_OFFSET_MS = "player_audio_offset_ms"
        const val KEY_AUTO_NEXT_EPISODE = "player_auto_next_episode"
    }
}
