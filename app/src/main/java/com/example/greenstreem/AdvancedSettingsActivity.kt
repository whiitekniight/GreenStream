package com.example.greenstreem

import android.content.Context
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.InputType
import android.widget.EditText
import android.widget.LinearLayout
import android.widget.RadioButton
import android.widget.RadioGroup
import android.widget.ScrollView
import android.widget.TextView
import android.widget.Toast
import android.view.View
import android.view.inputmethod.InputMethodManager
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch
import java.security.MessageDigest

class AdvancedSettingsActivity : AppCompatActivity() {

    private lateinit var prefs: android.content.SharedPreferences
    private lateinit var rvOptions: RecyclerView
    private lateinit var specs: List<Spec>
    private lateinit var section: Section

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist_settings)

        prefs = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        PlayBillingManager.start(this)
        section = Section.from(intent.getStringExtra(EXTRA_SECTION))
        if (!section.isFree && !ProFeatureGate.require(this, "${section.title} are available in GreenStreem Pro.")) {
            return
        }
        specs = buildSpecs(section)

        findViewById<TextView>(R.id.tvPlaylistSettingsTitle)?.text = section.title
        rvOptions = findViewById(R.id.rvPlaylistOptions)
        rvOptions.layoutManager = LinearLayoutManager(this)
        render()
    }

    override fun onResume() {
        super.onResume()
        if (::rvOptions.isInitialized) render()
    }

    private fun render() {
        val labels = specs.map { spec ->
            when (spec) {
                is Spec.ProInfo -> spec.title
                is Spec.Toggle -> "${spec.title}: ${if (prefs.getBoolean(spec.key, spec.default)) "On" else "Off"}"
                is Spec.Choice -> "${spec.title}: ${spec.options[prefs.getInt(spec.key, spec.defaultIndex).coerceIn(spec.options.indices)]}"
                is Spec.Action -> when (spec.actionKey) {
                    "update_epg_now" -> {
                        if (isEpgUpdateInProgress()) "${spec.title}: Updating..." else spec.title
                    }
                    "secondary_epg_url" -> {
                        val urls = getSecondaryEpgUrls()
                        if (urls.isEmpty()) "${spec.title}: Not set" else "${spec.title}: ${urls.size} set"
                    }
                    "channel_prefix_cleanup" -> {
                        val mode = when (prefs.getInt(ChannelNameFormatter.KEY_PREFIX_MODE, ChannelNameFormatter.MODE_OFF)) {
                            ChannelNameFormatter.MODE_REMOVE -> "Remove"
                            ChannelNameFormatter.MODE_ADD -> "Add"
                            else -> "Off"
                        }
                        val prefixes = prefs.getString(ChannelNameFormatter.KEY_PREFIX_VALUES, "")?.trim().orEmpty()
                        if (prefixes.isBlank()) "${spec.title}: $mode, no prefixes" else "${spec.title}: $mode ($prefixes)"
                    }
                    else -> spec.title
                }
            }
        }
        rvOptions.adapter = SimpleSettingsAdapter(labels) { selection ->
            val idx = labels.indexOf(selection)
            if (idx == -1) return@SimpleSettingsAdapter
            when (val spec = specs[idx]) {
                is Spec.ProInfo -> showProDialog()
                is Spec.Toggle -> {
                    val next = !prefs.getBoolean(spec.key, spec.default)
                    prefs.edit().putBoolean(spec.key, next).commit()
                    syncActivePlaylistIfEpgSetting(spec.key)
                    render()
                }
                is Spec.Choice -> showChoiceDialog(spec)
                is Spec.Action -> runAction(spec)
            }
        }
    }

    private fun showChoiceDialog(spec: Spec.Choice) {
        val current = prefs.getInt(spec.key, spec.defaultIndex).coerceIn(spec.options.indices)
        AlertDialog.Builder(this)
            .setTitle(spec.title)
            .setSingleChoiceItems(spec.options.toTypedArray(), current) { dialog, which ->
                prefs.edit().putInt(spec.key, which).commit()
                syncActivePlaylistIfEpgSetting(spec.key)
                dialog.dismiss()
                render()
            }
            .show()
    }

    private fun syncActivePlaylistIfEpgSetting(key: String) {
        if (key == "secondary_epg_enabled" || key == "secondary_epg_mode") {
            markEpgDataStale()
            PlaylistProfilesManager.syncLegacyKeysToActive(this)
        }
    }

    private fun markEpgDataStale() {
        prefs.edit()
            .putBoolean("epg_clear_requested", true)
            .putBoolean("epg_force_refresh_now", true)
            .remove("epg_settings_signature")
            .commit()
    }

    private fun runAction(spec: Spec.Action) {
        when (spec.actionKey) {
            "set_parental_pin" -> showSetParentalPinDialog()
            "clear_recent_channels" -> {
                prefs.edit().remove("recent_channel_ids").apply()
                Toast.makeText(this, "Recent channels cleared", Toast.LENGTH_SHORT).show()
            }
            "clear_history" -> {
                prefs.edit()
                    .remove("last_channel_id")
                    .remove("last_category_id")
                    .remove("continue_watching_items")
                    .remove("last_playback_type")
                    .remove("last_playback_title")
                    .remove("last_playback_url")
                    .remove("last_playback_resume_key")
                    .remove("last_playback_channel_id")
                    .apply()
                Toast.makeText(this, "Playback history cleared", Toast.LENGTH_SHORT).show()
            }
            "secondary_epg_url" -> showSecondaryEpgUrlDialog()
            "channel_prefix_cleanup" -> showChannelPrefixDialog()
            "update_epg_now" -> {
                prefs.edit()
                    .putBoolean(KEY_EPG_FORCE_REFRESH_NOW, true)
                    .putBoolean(KEY_EPG_UPDATE_IN_PROGRESS, true)
                    .putLong(KEY_EPG_UPDATE_STARTED_AT, System.currentTimeMillis())
                    .apply()
                render()
                Toast.makeText(this, "EPG update requested", Toast.LENGTH_SHORT).show()
            }
            "clear_epg" -> {
                AlertDialog.Builder(this)
                    .setTitle("Clear EPG")
                    .setMessage("This will remove all cached EPG data. It will be re-downloaded on next update.")
                    .setPositiveButton("Clear") { _, _ ->
                        prefs.edit().putBoolean("epg_clear_requested", true).apply()
                        Toast.makeText(this, "EPG will be cleared on next launch", Toast.LENGTH_SHORT).show()
                    }
                    .setNegativeButton("Cancel", null)
                    .show()
            }
            "check_app_updates" -> lifecycleScope.launch {
                AppUpdater.checkForUpdates(this@AdvancedSettingsActivity, manual = true)
            }
            "open_backup_restore" -> startActivity(Intent(this, BackupRestoreActivity::class.java))
            "backup_settings" -> lifecycleScope.launch {
                val result = SettingsBackupManager.backupNow(this@AdvancedSettingsActivity)
                result.onSuccess { file ->
                    Toast.makeText(this@AdvancedSettingsActivity, "Backup saved: ${file.name}", Toast.LENGTH_LONG).show()
                }.onFailure { err ->
                    Toast.makeText(this@AdvancedSettingsActivity, "Backup failed: ${err.message}", Toast.LENGTH_LONG).show()
                }
            }
            "restore_settings" -> lifecycleScope.launch {
                val result = SettingsBackupManager.restoreLatest(this@AdvancedSettingsActivity)
                result.onSuccess { (file, summary) ->
                    Toast.makeText(this@AdvancedSettingsActivity, "${file.name}: ${summary.message()}", Toast.LENGTH_LONG).show()
                    render()
                }.onFailure { err ->
                    Toast.makeText(this@AdvancedSettingsActivity, "Restore failed: ${err.message}", Toast.LENGTH_LONG).show()
                }
            }
            "app_version" -> showAppVersion()
            else -> Toast.makeText(this, "Action not implemented yet", Toast.LENGTH_SHORT).show()
        }
    }

    private fun showProDialog() {
        AlertDialog.Builder(this)
            .setTitle("GreenStreem Pro")
            .setMessage("Advanced EPG controls are available in GreenStreem Pro.")
            .setPositiveButton("Unlock Pro") { _, _ -> PlayBillingManager.launchProUnlock(this) }
            .setNegativeButton("Not now", null)
            .show()
    }

    private fun showSetParentalPinDialog() {
        val existingHash = prefs.getString(KEY_PARENTAL_PIN_HASH, null).orEmpty()
        if (existingHash.isBlank()) {
            promptForNewPin()
            return
        }
        val currentInput = EditText(this).apply {
            hint = "Enter current PIN"
            inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_VARIATION_PASSWORD
        }
        AlertDialog.Builder(this)
            .setTitle("Change parental PIN")
            .setView(currentInput)
            .setPositiveButton("Next") { _, _ ->
                val current = currentInput.text?.toString()?.trim().orEmpty()
                if (current.length < 4 || hashPin(current) != existingHash) {
                    Toast.makeText(this, "Current PIN is incorrect", Toast.LENGTH_SHORT).show()
                    return@setPositiveButton
                }
                promptForNewPin()
            }
            .setNegativeButton("Cancel", null)
            .setNeutralButton("Clear PIN") { _, _ ->
                prefs.edit()
                    .remove(KEY_PARENTAL_PIN_HASH)
                    .putBoolean("parental_lock_settings", false)
                    .putBoolean("parental_enabled", false)
                    .apply()
                Toast.makeText(this, "Parental PIN cleared", Toast.LENGTH_SHORT).show()
                render()
            }
            .show()
    }

    private fun promptForNewPin() {
        val firstInput = EditText(this).apply {
            hint = "Enter new 4+ digit PIN"
            inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_VARIATION_PASSWORD
        }
        AlertDialog.Builder(this)
            .setTitle("Set parental PIN")
            .setView(firstInput)
            .setPositiveButton("Next") { _, _ ->
                val first = firstInput.text?.toString()?.trim().orEmpty()
                if (first.length < 4) {
                    Toast.makeText(this, "PIN must be at least 4 digits", Toast.LENGTH_SHORT).show()
                    return@setPositiveButton
                }
                confirmNewPin(first)
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun confirmNewPin(newPin: String) {
        val confirmInput = EditText(this).apply {
            hint = "Confirm PIN"
            inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_VARIATION_PASSWORD
        }
        AlertDialog.Builder(this)
            .setTitle("Confirm parental PIN")
            .setView(confirmInput)
            .setPositiveButton("Save") { _, _ ->
                val confirm = confirmInput.text?.toString()?.trim().orEmpty()
                if (newPin != confirm) {
                    Toast.makeText(this, "PINs do not match", Toast.LENGTH_SHORT).show()
                    return@setPositiveButton
                }
                prefs.edit()
                    .putString(KEY_PARENTAL_PIN_HASH, hashPin(newPin))
                    .putBoolean("parental_enabled", true)
                    .apply()
                Toast.makeText(this, "Parental PIN saved", Toast.LENGTH_SHORT).show()
                render()
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun showAppVersion() {
        val pInfo = packageManager.getPackageInfo(packageName, 0)
        val versionName = pInfo.versionName ?: "unknown"
        val versionCode = pInfo.longVersionCode
        AlertDialog.Builder(this)
            .setTitle("App version")
            .setMessage("GreenStreem\nVersion $versionName ($versionCode)")
            .setPositiveButton("OK", null)
            .show()
    }

    private fun hashPin(pin: String): String {
        val bytes = MessageDigest.getInstance("SHA-256").digest(pin.toByteArray(Charsets.UTF_8))
        return bytes.joinToString("") { "%02x".format(it) }
    }

    private fun showSecondaryEpgUrlDialog() {
        val input = EditText(this).apply {
            hint = "One XMLTV URL per line\nhttps://example.com/epg.xml\nhttps://example.com/epg2.xml.gz"
            setSingleLine(false)
            minLines = 5
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_MULTI_LINE
            setText(getSecondaryEpgUrls().joinToString("\n"))
        }
        AlertDialog.Builder(this)
            .setTitle("Additional EPG sources")
            .setView(input)
            .setPositiveButton("Save") { _, _ ->
                hideKeyboard(input)
                val urls = input.text?.toString()
                    ?.lines()
                    ?.map { it.trim() }
                    ?.filter { it.isNotBlank() }
                    ?.distinct()
                    .orEmpty()
                prefs.edit()
                    .putString("secondary_epg_urls", urls.joinToString("\n"))
                    .putString("secondary_epg_url", urls.firstOrNull().orEmpty())
                    .commit()
                markEpgDataStale()
                PlaylistProfilesManager.syncLegacyKeysToActive(this)
                Toast.makeText(this, "${urls.size} additional EPG source(s) saved", Toast.LENGTH_SHORT).show()
                render()
            }
            .setNegativeButton("Cancel") { _, _ -> hideKeyboard(input) }
            .setNeutralButton("Clear") { _, _ ->
                hideKeyboard(input)
                prefs.edit()
                    .remove("secondary_epg_urls")
                    .remove("secondary_epg_url")
                    .commit()
                markEpgDataStale()
                PlaylistProfilesManager.syncLegacyKeysToActive(this)
                Toast.makeText(this, "Additional EPG sources cleared", Toast.LENGTH_SHORT).show()
                render()
            }
            .show()
    }

    private fun hideKeyboard(view: View) {
        (getSystemService(Context.INPUT_METHOD_SERVICE) as? InputMethodManager)
            ?.hideSoftInputFromWindow(view.windowToken, 0)
        view.clearFocus()
    }

    private fun getSecondaryEpgUrls(): List<String> {
        val saved = prefs.getString("secondary_epg_urls", null)
            ?.lines()
            ?.map { it.trim() }
            ?.filter { it.isNotBlank() }
            .orEmpty()
        val legacy = prefs.getString("secondary_epg_url", null)?.trim().orEmpty()
        return (saved + legacy)
            .filter { it.isNotBlank() }
            .distinct()
    }

    private fun showChannelPrefixDialog() {
        val currentMode = prefs.getInt(ChannelNameFormatter.KEY_PREFIX_MODE, ChannelNameFormatter.MODE_OFF)
        val input = EditText(this).apply {
            hint = "US, UK, CA"
            setSingleLine(true)
            setText(prefs.getString(ChannelNameFormatter.KEY_PREFIX_VALUES, "") ?: "")
            inputType = InputType.TYPE_CLASS_TEXT
        }
        val modeGroup = RadioGroup(this).apply {
            orientation = RadioGroup.VERTICAL
        }
        val offButton = RadioButton(this).apply {
            id = ChannelNameFormatter.MODE_OFF
            text = "Off"
        }
        val removeButton = RadioButton(this).apply {
            id = ChannelNameFormatter.MODE_REMOVE
            text = "Remove prefix from channel names"
        }
        val addButton = RadioButton(this).apply {
            id = ChannelNameFormatter.MODE_ADD
            text = "Add first prefix to channel names"
        }
        modeGroup.addView(offButton)
        modeGroup.addView(removeButton)
        modeGroup.addView(addButton)
        modeGroup.check(currentMode)
        val content = LinearLayout(this).apply {
            orientation = LinearLayout.VERTICAL
            setPadding(32, 16, 32, 0)
            addView(TextView(this@AdvancedSettingsActivity).apply {
                text = "Example: type US, UK then choose Remove to show US A&E as A&E."
                setTextColor(android.graphics.Color.WHITE)
                setPadding(0, 0, 0, 16)
            })
            addView(TextView(this@AdvancedSettingsActivity).apply {
                text = "Prefixes"
                setTextColor(android.graphics.Color.WHITE)
            })
            addView(input)
            addView(TextView(this@AdvancedSettingsActivity).apply {
                text = "Action"
                setTextColor(android.graphics.Color.WHITE)
                setPadding(0, 24, 0, 0)
            })
            addView(modeGroup)
        }
        val scroller = ScrollView(this).apply {
            addView(content)
            layoutParams = LinearLayout.LayoutParams(
                LinearLayout.LayoutParams.MATCH_PARENT,
                (resources.displayMetrics.heightPixels * 0.55f).toInt()
            )
        }
        AlertDialog.Builder(this)
            .setTitle("Channel prefix cleanup")
            .setView(scroller)
            .setPositiveButton("Save") { _, _ ->
                val value = input.text?.toString()?.trim().orEmpty()
                prefs.edit()
                    .putString(ChannelNameFormatter.KEY_PREFIX_VALUES, value)
                    .putInt(ChannelNameFormatter.KEY_PREFIX_MODE, modeGroup.checkedRadioButtonId)
                    .apply()
                Toast.makeText(this, "Channel prefix cleanup saved", Toast.LENGTH_SHORT).show()
                render()
            }
            .setNegativeButton("Cancel", null)
            .setNeutralButton("Clear") { _, _ ->
                prefs.edit().remove(ChannelNameFormatter.KEY_PREFIX_VALUES).apply()
                prefs.edit().putInt(ChannelNameFormatter.KEY_PREFIX_MODE, ChannelNameFormatter.MODE_OFF).apply()
                Toast.makeText(this, "Channel prefixes cleared", Toast.LENGTH_SHORT).show()
                render()
            }
            .show()
    }

    private fun buildSpecs(section: Section): List<Spec> {
        return when (section) {
            Section.GENERAL -> listOf(
                Spec.Toggle("general_auto_start", "Auto start app on boot", false),
                Spec.Toggle("general_confirm_exit", "Confirm app exit", false),
                Spec.Choice("general_time_format", "Time format", listOf("12-hour", "24-hour"), 0),
                Spec.Toggle("general_show_clock", "Show clock in UI", true),
                Spec.Toggle("general_show_date_clock", "Show date on clock", false),
                Spec.Choice("general_panels_timeout", "Panels timeout", listOf("2 sec", "4 sec", "6 sec", "8 sec", "10 sec"), 2),
                Spec.Choice("general_popup_timeout", "Popup timeout", listOf("2 sec", "4 sec", "6 sec", "8 sec", "10 sec"), 2),
                Spec.Toggle("general_open_last_group", "Open last group on startup", true),
                Spec.Toggle("general_resume_last_channel", "Resume last channel", true),
                Spec.Toggle("general_show_channel_numbers", "Show channel numbers", true)
            )
            Section.EPG -> gateProEpgSpecs(listOf(
                Spec.Toggle("epg_auto_update", "Auto update EPG", true),
                Spec.Toggle("epg_update_on_start", "Update EPG on app start", true),
                Spec.Choice("epg_update_interval", "EPG update interval", listOf("2 hours", "6 hours", "12 hours", "24 hours"), 2),
                Spec.Choice("epg_past_days", "Past days to keep EPG", listOf("1 day", "2 days", "3 days", "7 days"), 1),
                Spec.Choice("epg_time_offset", "EPG time offset", listOf("-2h", "-1h", "-0:30", "0 (default)", "+0:30", "+1h", "+2h"), 3),
                Spec.Toggle("epg_prefer_logos", "Prefer logos from EPG", false),
                Spec.Toggle("epg_show_past_no_catchup", "Show past programs without catch-up", true),
                Spec.Toggle("epg_catchup_icon", "Show catch-up icon in channels list", true),
                Spec.Toggle("epg_color_by_progress", "Color current progress", true),
                Spec.Toggle("epg_click_to_play", "Guide click starts playback", true),
                Spec.Action("Update EPG now", "update_epg_now"),
                Spec.Action("Clear EPG", "clear_epg"),
                Spec.Toggle("secondary_epg_enabled", "Use additional EPG sources", false),
                Spec.Choice("secondary_epg_mode", "EPG source priority", listOf("Fill missing only", "Custom XML first", "Custom XML only", "Provider only"), 0),
                Spec.Action("Additional EPG sources", "secondary_epg_url")
            ))
            Section.APPEARANCE -> listOf(
                Spec.Choice("appearance_theme", "Theme", listOf("Dark", "Light", "System"), 0),
                Spec.Choice("appearance_logo_size", "Channel logo size", listOf("Small", "Medium", "Large"), 1),
                Spec.Choice("appearance_list_density", "List density", listOf("Compact", "Comfortable", "Large"), 1),
                Spec.Choice(
                    "appearance_accent",
                    "Accent color",
                    listOf(
                        "Green",
                        "Blue",
                        "Orange",
                        "Hot Pink",
                        "Purple",
                        "Neon Cyan",
                        "Neon Lime",
                        "Electric Yellow",
                        "Neon Red",
                        "Teal",
                        "Lavender"
                    ),
                    0
                ),
                Spec.Choice("appearance_ui_transparency", "User interface transparency", listOf("0%", "20%", "40%", "60%", "80%"), 1),
                Spec.Action("Channel prefix cleanup", "channel_prefix_cleanup"),
                Spec.Toggle("appearance_show_logos", "Show channel logos", true),
                Spec.Toggle("appearance_show_video_resolution", "Show video resolution instead of labels", false),
                Spec.Toggle("appearance_enable_animations", "Enable UI animations", true)
            )
            Section.REMOTE_CONTROL -> listOf(
                Spec.Toggle("remote_menu_quick_panel", "Menu opens quick panel", true),
                Spec.Toggle("remote_channel_keys_zap", "Channel keys zap channels", true),
                Spec.Toggle("remote_guide_toggle", "Guide key toggles full guide", true),
                Spec.Toggle("remote_long_ok_options", "Long OK opens channel options", true),
                Spec.Choice("remote_back_double_press_window", "Double-back window", listOf("300 ms", "500 ms", "800 ms"), 1),
                Spec.Toggle("remote_info_cycles_aspect", "Info key cycles aspect ratio", true)
            )
            Section.PARENTAL_CONTROL -> listOf(
                Spec.Toggle("parental_enabled", "Enable parental control", false),
                Spec.Toggle("parental_lock_settings", "Lock settings with PIN", false),
                Spec.Toggle("parental_no_pin_after_unlock", "Don't require PIN after unlocking", false),
                Spec.Toggle("parental_hide_adult_groups", "Hide adult groups", false),
                Spec.Toggle("parental_lock_vod", "Lock VOD content", false),
                Spec.Action("Set/Change PIN", "set_parental_pin")
            )
            Section.OTHER -> listOf(
                Spec.Action("Clear recent channels", "clear_recent_channels"),
                Spec.Action("Clear playback history", "clear_history"),
                Spec.Toggle("other_enable_logs", "Enable debug logs", false),
                Spec.Toggle("updater_auto_check", "Auto check app updates", true),
                Spec.Action("Check for app updates now", "check_app_updates"),
                Spec.Action("Backup & Restore", "open_backup_restore")
            ).filterNot {
                BuildConfig.PLAY_STORE_BUILD &&
                    ((it as? Spec.Toggle)?.key == "updater_auto_check" ||
                        (it as? Spec.Action)?.actionKey == "check_app_updates")
            }
            Section.ABOUT -> listOf(
                Spec.Action("App version", "app_version")
            )
        }
    }

    private fun isEpgUpdateInProgress(): Boolean {
        if (!prefs.getBoolean(KEY_EPG_UPDATE_IN_PROGRESS, false)) return false
        val startedAt = prefs.getLong(KEY_EPG_UPDATE_STARTED_AT, 0L)
        val stale = startedAt > 0L && System.currentTimeMillis() - startedAt > 15L * 60L * 1000L
        if (stale) {
            prefs.edit()
                .putBoolean(KEY_EPG_UPDATE_IN_PROGRESS, false)
                .remove(KEY_EPG_UPDATE_STARTED_AT)
                .apply()
            return false
        }
        return true
    }

    private fun gateProEpgSpecs(epgSpecs: List<Spec>): List<Spec> {
        if (ProEntitlement.isProUnlocked(this)) return epgSpecs
        val freeKeys = setOf("epg_update_on_start", "epg_click_to_play")
        return buildList {
            add(Spec.ProInfo("GreenStreem Pro unlocks advanced EPG controls"))
            addAll(epgSpecs.filter { spec ->
                when (spec) {
                    is Spec.Toggle -> spec.key in freeKeys
                    is Spec.Choice -> false
                    is Spec.Action -> false
                    is Spec.ProInfo -> true
                }
            })
        }
    }

    sealed class Spec {
        data class ProInfo(val title: String) : Spec()
        data class Toggle(val key: String, val title: String, val default: Boolean) : Spec()
        data class Choice(val key: String, val title: String, val options: List<String>, val defaultIndex: Int) : Spec()
        data class Action(val title: String, val actionKey: String) : Spec()
    }

    enum class Section(val id: String, val title: String) {
        GENERAL("general", "General Settings"),
        EPG("epg", "EPG Settings"),
        APPEARANCE("appearance", "Appearance Settings"),
        REMOTE_CONTROL("remote", "Remote Control Settings"),
        PARENTAL_CONTROL("parental", "Parental Control Settings"),
        OTHER("other", "Other Settings"),
        ABOUT("about", "About");

        val isFree: Boolean
            get() = this == ABOUT

        companion object {
            fun from(raw: String?): Section = entries.firstOrNull { it.id == raw } ?: GENERAL
        }
    }

    companion object {
        const val EXTRA_SECTION = "section"
        private const val KEY_PARENTAL_PIN_HASH = "parental_pin_hash"
        private const val KEY_EPG_FORCE_REFRESH_NOW = "epg_force_refresh_now"
        private const val KEY_EPG_UPDATE_IN_PROGRESS = "epg_update_in_progress"
        private const val KEY_EPG_UPDATE_STARTED_AT = "epg_update_started_at"
    }
}
