package com.example.greenstreem

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Build
import android.provider.Settings
import android.widget.Toast
import androidx.core.content.FileProvider
import androidx.fragment.app.FragmentActivity
import androidx.lifecycle.lifecycleScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONObject
import java.io.BufferedInputStream
import java.io.File
import java.net.HttpURLConnection
import java.net.URL

data class AppUpdateInfo(
    val versionCode: Int,
    val versionName: String,
    val apkUrl: String,
    val notes: String
)

object AppUpdater {
    private const val PREFS = "iptv_prefs"
    private const val KEY_UPDATER_AUTO_CHECK = "updater_auto_check"
    private const val KEY_LAST_SEEN_UPDATE_VERSION_CODE = "last_seen_update_version_code"
    private const val DEFAULT_UPDATE_FEED_URL =
        "https://raw.githubusercontent.com/whiitekniight/GreenStreem/main/updates/update.json"

    suspend fun maybeAutoCheck(activity: FragmentActivity) {
        val prefs = activity.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        if (!prefs.getBoolean(KEY_UPDATER_AUTO_CHECK, true)) return
        checkForUpdates(activity, manual = false)
    }

    suspend fun checkForUpdates(activity: FragmentActivity, manual: Boolean) {
        val feedUrl = DEFAULT_UPDATE_FEED_URL
        if (feedUrl.isBlank()) {
            if (manual) Toast.makeText(activity, "Update feed is unavailable", Toast.LENGTH_SHORT).show()
            return
        }

        val info = fetchUpdateInfo(feedUrl)
        if (info == null) {
            if (manual) Toast.makeText(activity, "Update check failed", Toast.LENGTH_SHORT).show()
            return
        }

        val currentCode = appVersionCode(activity)
        if (info.versionCode <= currentCode) {
            activity.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
                .edit()
                .remove(KEY_LAST_SEEN_UPDATE_VERSION_CODE)
                .apply()
            if (manual) Toast.makeText(activity, "App is up to date", Toast.LENGTH_SHORT).show()
            return
        }

        val prefs = activity.getSharedPreferences(PREFS, Context.MODE_PRIVATE)
        val lastSeenVersion = prefs.getInt(KEY_LAST_SEEN_UPDATE_VERSION_CODE, -1)
        if (!manual && lastSeenVersion == info.versionCode) {
            return
        }

        withContext(Dispatchers.Main) {
            prefs.edit().putInt(KEY_LAST_SEEN_UPDATE_VERSION_CODE, info.versionCode).apply()
            android.app.AlertDialog.Builder(activity)
                .setTitle("Update available")
                .setMessage("Version ${info.versionName} is available.\n\n${info.notes}")
                .setPositiveButton("Update") { _, _ ->
                    activity.lifecycleScope.launch {
                        downloadAndInstall(activity, info)
                    }
                }
                .setNegativeButton("Later", null)
                .show()
        }
    }

    private suspend fun fetchUpdateInfo(feedUrl: String): AppUpdateInfo? = withContext(Dispatchers.IO) {
        runCatching {
            val raw = URL(feedUrl).readText()
            val json = JSONObject(raw)
            AppUpdateInfo(
                versionCode = json.optInt("versionCode", 0),
                versionName = json.optString("versionName", ""),
                apkUrl = json.optString("apkUrl", ""),
                notes = json.optString("notes", "")
            )
        }.getOrNull()
    }

    private suspend fun downloadAndInstall(activity: FragmentActivity, info: AppUpdateInfo) {
        val apkFile = withContext(Dispatchers.IO) {
            runCatching {
                val out = File(activity.cacheDir, "greenstreem-update.apk")
                val conn = (URL(info.apkUrl).openConnection() as HttpURLConnection).apply {
                    instanceFollowRedirects = true
                    connectTimeout = 20_000
                    readTimeout = 60_000
                    requestMethod = "GET"
                }
                conn.connect()
                val contentType = conn.contentType.orEmpty().lowercase()
                if (contentType.contains("text/html")) {
                    error("Download URL returned a web page, not APK")
                }
                conn.inputStream.use { input ->
                    out.outputStream().use { output -> input.copyTo(output) }
                }
                if (!out.exists() || out.length() < 100_000L || !isLikelyApk(out)) {
                    error("Downloaded file is not a valid APK")
                }
                out
            }.getOrNull()
        } ?: run {
            Toast.makeText(activity, "Failed to download update", Toast.LENGTH_SHORT).show()
            return
        }

        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O && !canInstallPackages(activity)) {
            val intent = Intent(Settings.ACTION_MANAGE_UNKNOWN_APP_SOURCES).apply {
                data = Uri.parse("package:${activity.packageName}")
            }
            activity.startActivity(intent)
            Toast.makeText(activity, "Allow install unknown apps, then update again", Toast.LENGTH_LONG).show()
            return
        }

        val uri = FileProvider.getUriForFile(
            activity,
            "${activity.packageName}.fileprovider",
            apkFile
        )
        val installIntent = Intent(Intent.ACTION_INSTALL_PACKAGE).apply {
            data = uri
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
            putExtra(Intent.EXTRA_NOT_UNKNOWN_SOURCE, true)
        }
        val fallbackIntent = Intent(Intent.ACTION_VIEW).apply {
            setDataAndType(uri, "application/vnd.android.package-archive")
            addFlags(Intent.FLAG_GRANT_READ_URI_PERMISSION)
            addFlags(Intent.FLAG_ACTIVITY_NEW_TASK)
        }
        runCatching {
            val pm = activity.packageManager
            val launch = if (installIntent.resolveActivity(pm) != null) installIntent else fallbackIntent
            activity.startActivity(launch)
        }.onFailure { err ->
            Toast.makeText(activity, "Installer launch failed: ${err.message}", Toast.LENGTH_LONG).show()
        }
    }

    private fun isLikelyApk(file: File): Boolean {
        return runCatching {
            BufferedInputStream(file.inputStream()).use { input ->
                val b1 = input.read()
                val b2 = input.read()
                b1 == 'P'.code && b2 == 'K'.code
            }
        }.getOrDefault(false)
    }

    private fun appVersionCode(context: Context): Int {
        val pkg = context.packageManager.getPackageInfo(context.packageName, 0)
        return if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.P) pkg.longVersionCode.toInt() else pkg.versionCode
    }

    private fun canInstallPackages(context: Context): Boolean {
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.O) return true
        return runCatching { context.packageManager.canRequestPackageInstalls() }.getOrDefault(false)
    }
}
