package com.example.greenstreem

import android.app.Activity
import android.app.Application
import android.content.Context
import android.content.res.Configuration
import android.graphics.Color
import android.os.Handler
import android.os.Bundle
import android.os.Looper
import android.util.Log
import android.view.View
import android.view.Window
import android.view.WindowManager
import androidx.core.view.WindowCompat
import androidx.core.view.WindowInsetsCompat
import androidx.core.view.WindowInsetsControllerCompat

class GreenStreemApplication : Application() {
    override fun onCreate() {
        super.onCreate()
        CloudBackupScheduler.scheduleAsync(this)
        registerActivityLifecycleCallbacks(object : ActivityLifecycleCallbacks {
            override fun onActivityCreated(activity: Activity, savedInstanceState: Bundle?) {
                activity.applyGreenStreemFullscreenSafely()
            }

            override fun onActivityResumed(activity: Activity) {
                activity.applyGreenStreemFullscreenSafely()
            }

            override fun onActivityStarted(activity: Activity) = Unit
            override fun onActivityPaused(activity: Activity) = Unit
            override fun onActivityStopped(activity: Activity) = Unit
            override fun onActivitySaveInstanceState(activity: Activity, outState: Bundle) = Unit
            override fun onActivityDestroyed(activity: Activity) = Unit
        })
    }
}

private fun Activity.applyGreenStreemFullscreenSafely() {
    try {
        val isTv = isGreenStreemTvMode()
        val window = window
        WindowCompat.setDecorFitsSystemWindows(window, false)
        window.setFlags(
            WindowManager.LayoutParams.FLAG_FULLSCREEN,
            WindowManager.LayoutParams.FLAG_FULLSCREEN
        )
        window.statusBarColor = Color.TRANSPARENT
        window.navigationBarColor = Color.TRANSPARENT
        if (isTv) {
            window.applyHiddenSystemBars()
        } else {
            window.showTouchableSystemBars()
            fullscreenHandler.removeCallbacksAndMessages(null)
            fullscreenHandler.postDelayed({ window.applyHiddenSystemBars() }, MOBILE_SYSTEM_BARS_VISIBLE_MS)
        }
    } catch (error: Throwable) {
        Log.w("GreenStreem", "Unable to apply fullscreen window flags", error)
    }
}

private fun Window.showTouchableSystemBars() {
    decorView.systemUiVisibility = (
        View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        )
    WindowInsetsControllerCompat(this, decorView).show(WindowInsetsCompat.Type.systemBars())
}

private fun Window.applyHiddenSystemBars() {
    decorView.systemUiVisibility = (
        View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY
            or View.SYSTEM_UI_FLAG_FULLSCREEN
            or View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
            or View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
            or View.SYSTEM_UI_FLAG_LAYOUT_STABLE
        )
    WindowInsetsControllerCompat(this, decorView).hide(WindowInsetsCompat.Type.systemBars())
}

private fun Activity.isGreenStreemTvMode(): Boolean {
    val prefMode = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        .getString("ui_mode", "auto")
    return when (prefMode) {
        "tv" -> true
        "mobile" -> false
        else -> {
            val uiMode = resources.configuration.uiMode and Configuration.UI_MODE_TYPE_MASK
            uiMode == Configuration.UI_MODE_TYPE_TELEVISION ||
                packageManager.hasSystemFeature("android.software.leanback")
        }
    }
}

private val fullscreenHandler = Handler(Looper.getMainLooper())
private const val MOBILE_SYSTEM_BARS_VISIBLE_MS = 10_000L
