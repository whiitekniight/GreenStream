package com.example.greenstreem

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import android.text.format.DateFormat
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import java.util.Calendar
import java.util.Date

object CloudBackupScheduler {
    private const val PREFS_NAME = "greenstreem_cloud_backup_schedule"
    private const val KEY_ENABLED = "enabled"
    private const val KEY_HOUR = "hour"
    private const val KEY_MINUTE = "minute"
    private const val DEFAULT_HOUR = 4
    private const val DEFAULT_MINUTE = 0
    private const val REQUEST_CODE = 4816
    private val schedulerScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    fun isEnabled(context: Context): Boolean = prefs(context).getBoolean(KEY_ENABLED, true)

    fun hour(context: Context): Int = prefs(context).getInt(KEY_HOUR, DEFAULT_HOUR).coerceIn(0, 23)

    fun minute(context: Context): Int = prefs(context).getInt(KEY_MINUTE, DEFAULT_MINUTE).coerceIn(0, 59)

    fun setEnabled(context: Context, enabled: Boolean) {
        prefs(context).edit().putBoolean(KEY_ENABLED, enabled).apply()
        scheduleAsync(context)
    }

    fun setTime(context: Context, hour: Int, minute: Int) {
        prefs(context).edit()
            .putInt(KEY_HOUR, hour.coerceIn(0, 23))
            .putInt(KEY_MINUTE, minute.coerceIn(0, 59))
            .apply()
        scheduleAsync(context)
    }

    fun scheduleAsync(context: Context) {
        val appContext = context.applicationContext
        schedulerScope.launch { schedule(appContext) }
    }

    fun schedule(context: Context) {
        val appContext = context.applicationContext
        val alarmManager = appContext.getSystemService(AlarmManager::class.java) ?: return
        val operation = pendingIntent(appContext)
        alarmManager.cancel(operation)
        if (!isEnabled(appContext) || !CloudBackupManager.isConnected(appContext)) return
        alarmManager.setAndAllowWhileIdle(
            AlarmManager.RTC_WAKEUP,
            nextTriggerAtMillis(appContext),
            operation
        )
    }

    fun scheduleDescription(context: Context): String {
        if (!isEnabled(context)) return "Automatic cloud backup: Off"
        val time = Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, hour(context))
            set(Calendar.MINUTE, minute(context))
        }.time
        return "Automatic cloud backup: On daily at ${DateFormat.getTimeFormat(context).format(time)}"
    }

    fun nextBackupDescription(context: Context): String {
        if (!isEnabled(context) || !CloudBackupManager.isConnected(context)) return ""
        val formatted = DateFormat.getDateFormat(context).format(Date(nextTriggerAtMillis(context))) +
            " " + DateFormat.getTimeFormat(context).format(Date(nextTriggerAtMillis(context)))
        return "Next automatic backup: $formatted"
    }

    private fun nextTriggerAtMillis(context: Context): Long {
        val now = Calendar.getInstance()
        return Calendar.getInstance().apply {
            set(Calendar.HOUR_OF_DAY, hour(context))
            set(Calendar.MINUTE, minute(context))
            set(Calendar.SECOND, 0)
            set(Calendar.MILLISECOND, 0)
            if (!after(now)) add(Calendar.DAY_OF_YEAR, 1)
        }.timeInMillis
    }

    private fun pendingIntent(context: Context): PendingIntent = PendingIntent.getBroadcast(
        context,
        REQUEST_CODE,
        Intent(context, CloudBackupAlarmReceiver::class.java).setAction(CloudBackupAlarmReceiver.ACTION_BACKUP),
        PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
    )

    private fun prefs(context: Context) =
        context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
}

class CloudBackupAlarmReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        val appContext = context.applicationContext
        if (intent.action != ACTION_BACKUP) return
        val pendingResult = goAsync()
        CoroutineScope(SupervisorJob() + Dispatchers.IO).launch {
            try {
                CloudBackupScheduler.schedule(appContext)
                if (CloudBackupScheduler.isEnabled(appContext) && CloudBackupManager.isConnected(appContext)) {
                    CloudBackupManager.upload(appContext)
                        .onFailure { Log.w(TAG, "Scheduled cloud backup failed", it) }
                }
            } finally {
                pendingResult.finish()
            }
        }
    }

    companion object {
        const val ACTION_BACKUP = "com.example.greenstreem.action.CLOUD_BACKUP"
        private const val TAG = "GreenStreemCloud"
    }
}

class CloudBackupScheduleRefreshReceiver : BroadcastReceiver() {
    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action == Intent.ACTION_BOOT_COMPLETED ||
            intent.action == Intent.ACTION_TIME_CHANGED ||
            intent.action == Intent.ACTION_TIMEZONE_CHANGED
        ) {
            CloudBackupScheduler.scheduleAsync(context)
        }
    }
}
