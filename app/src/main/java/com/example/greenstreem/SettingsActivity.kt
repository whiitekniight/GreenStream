package com.example.greenstreem

import android.content.Intent
import android.os.Bundle
import android.text.InputType
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.app.AlertDialog
import androidx.core.widget.ImageViewCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.launch
import java.security.MessageDigest

class SettingsActivity : AppCompatActivity() {

    private lateinit var tvDetailTitle: TextView
    private lateinit var tvDetailDesc: TextView
    private lateinit var ivDetailIcon: ImageView
    private val prefs by lazy { getSharedPreferences("iptv_prefs", MODE_PRIVATE) }

    private val settingsList by lazy {
        buildList {
            add(SettingItem("Playlists", "Manage playlists and login sources.", android.R.drawable.ic_menu_slideshow))
            add(SettingItem("Restore Code", "Optional: enter the code given by your provider to back up or restore this app.", android.R.drawable.ic_menu_save))
            add(SettingItem("TV Guide", proAwareDescription("EPG sources, update behavior, and display options.", "Pro: EPG sources, update behavior, and display options."), android.R.drawable.ic_menu_today))
            add(SettingItem("Playback", proAwareDescription("Player behavior, startup, and stream options.", "Pro: playback behavior, startup, and stream options."), android.R.drawable.ic_media_play))
            add(SettingItem("Downloads", proAwareDescription("Movie download location and network targets.", "Pro: movie downloads and network storage."), android.R.drawable.stat_sys_download_done))
            add(SettingItem("General", proAwareDescription("Core app behavior and global options.", "Pro: startup, clock, panel, and global options."), android.R.drawable.ic_menu_preferences))
            add(SettingItem("Appearance", proAwareDescription("Theme and layout preferences.", "Pro: themes, colors, layout density, and channel-name cleanup."), android.R.drawable.ic_menu_gallery))
            add(SettingItem("Remote Control", proAwareDescription("Remote keys and navigation behavior.", "Pro: remote key customization and navigation behavior."), android.R.drawable.ic_menu_directions))
            add(SettingItem("Parental Control", proAwareDescription("PIN and content restrictions.", "Pro: PIN and content restrictions."), android.R.drawable.ic_lock_lock))
            add(SettingItem("Channel Sorting", proAwareDescription("Choose and configure channel sort mode.", "Pro: alphabetical, numerical, and manual channel sorting."), android.R.drawable.ic_menu_sort_alphabetically))
            add(SettingItem("Group Sorting", proAwareDescription("Reorder channel groups.", "Pro: reorder channel groups."), android.R.drawable.ic_menu_sort_by_size))
            add(SettingItem("Manage Groups", proAwareDescription("Hide or show channel groups.", "Pro: hide, show, and manage channel groups."), android.R.drawable.ic_menu_sort_by_size))
            if (BuildConfig.PLAY_STORE_BUILD && !ProEntitlement.isProUnlocked(this@SettingsActivity)) {
                add(SettingItem("Unlock Pro", "Unlock sorting, group management, and advanced EPG controls.", android.R.drawable.star_big_on))
            }
            if (!BuildConfig.PLAY_STORE_BUILD) {
                add(SettingItem("Updates", "Check for new GreenStreem versions.", android.R.drawable.stat_sys_download_done))
            }
            add(SettingItem("Maintenance", "Backup, restore, and maintenance tools.", android.R.drawable.ic_menu_manage))
            add(SettingItem("About", "Version info, licenses, and project details.", android.R.drawable.ic_menu_info_details))
        }
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        PlayBillingManager.start(this)
        if (shouldRequestSettingsPin() && !settingsUnlocked) {
            promptForSettingsPin()
            return
        }
        setContentView(R.layout.activity_settings)

        tvDetailTitle = findViewById(R.id.tvSettingDetailTitle)
        tvDetailDesc = findViewById(R.id.tvSettingDetailDesc)
        ivDetailIcon = findViewById(R.id.ivSettingIconLarge)

        val rvOptions = findViewById<RecyclerView>(R.id.rvSettingsOptions)
        rvOptions.layoutManager = LinearLayoutManager(this)
        
        rvOptions.adapter = SettingsAdapter(
            settingsList,
            onFocused = { position ->
                rvOptions.post {
                    val adapter = rvOptions.adapter ?: return@post
                    if (position !in 0 until adapter.itemCount) return@post
                    val layout = rvOptions.layoutManager as? LinearLayoutManager ?: return@post
                    val itemHeight = rvOptions.findViewHolderForAdapterPosition(position)?.itemView?.height
                        ?: rvOptions.getChildAt(0)?.height
                        ?: 84
                    val offset = ((rvOptions.height - itemHeight) / 2).coerceAtLeast(0)
                    layout.scrollToPositionWithOffset(position, offset)
                }
            }
        ) { item ->
            when (item.title) {
                "Playlists" -> startActivity(Intent(this, PlaylistSettingsActivity::class.java))
                "Restore Code" -> startActivity(Intent(this, BackupRestoreActivity::class.java))
                "TV Guide" -> openProFeature("TV Guide settings are available in GreenStreem Pro.") {
                    openAdvanced(AdvancedSettingsActivity.Section.EPG.id)
                }
                "General" -> openProFeature("General customization settings are available in GreenStreem Pro.") {
                    openAdvanced(AdvancedSettingsActivity.Section.GENERAL.id)
                }
                "Playback" -> openProFeature("Playback settings are available in GreenStreem Pro.") {
                    startActivity(Intent(this, PlaybackSettingsActivity::class.java))
                }
                "Downloads" -> openProFeature("Downloads and network storage are available in GreenStreem Pro.") {
                    startActivity(Intent(this, DownloadSettingsActivity::class.java))
                }
                "Channel Sorting" -> openProFeature("Channel sorting is available in GreenStreem Pro.") {
                    startActivity(Intent(this, ChannelSortingModeActivity::class.java))
                }
                "Group Sorting" -> openProFeature("Group sorting is available in GreenStreem Pro.") {
                    startActivity(Intent(this, GroupSortingActivity::class.java))
                }
                "Appearance" -> openProFeature("Appearance customization is available in GreenStreem Pro.") {
                    openAdvanced(AdvancedSettingsActivity.Section.APPEARANCE.id)
                }
                "Remote Control" -> openProFeature("Remote control customization is available in GreenStreem Pro.") {
                    openAdvanced(AdvancedSettingsActivity.Section.REMOTE_CONTROL.id)
                }
                "Parental Control" -> openProFeature("Parental controls are available in GreenStreem Pro.") {
                    openAdvanced(AdvancedSettingsActivity.Section.PARENTAL_CONTROL.id)
                }
                "Manage Groups" -> openProFeature("Group management is available in GreenStreem Pro.") {
                    startActivity(Intent(this, ManageGroupsActivity::class.java))
                }
                "Updates" -> lifecycleScope.launch {
                    AppUpdater.checkForUpdates(this@SettingsActivity, manual = true)
                }
                "Unlock Pro" -> PlayBillingManager.launchProUnlock(this)
                "Maintenance" -> openProFeature("Maintenance tools are available in GreenStreem Pro.") {
                    openAdvanced(AdvancedSettingsActivity.Section.OTHER.id)
                }
                "About" -> openAdvanced(AdvancedSettingsActivity.Section.ABOUT.id)
            }
        }
        
        updateDetailView(settingsList[0])
    }

    private fun shouldRequestSettingsPin(): Boolean {
        val lockEnabled = prefs.getBoolean("parental_lock_settings", false)
        val pinHash = prefs.getString(KEY_PARENTAL_PIN_HASH, "").orEmpty()
        return lockEnabled && pinHash.isNotBlank()
    }

    private fun promptForSettingsPin() {
        val input = EditText(this).apply {
            hint = "Enter parental PIN"
            inputType = InputType.TYPE_CLASS_NUMBER or InputType.TYPE_NUMBER_VARIATION_PASSWORD
        }
        AlertDialog.Builder(this)
            .setTitle("Settings locked")
            .setCancelable(false)
            .setView(input)
            .setPositiveButton("Unlock") { _, _ ->
                val entered = input.text?.toString()?.trim().orEmpty()
                val expected = prefs.getString(KEY_PARENTAL_PIN_HASH, "").orEmpty()
                if (entered.isNotBlank() && hashPin(entered) == expected) {
                    settingsUnlocked = true
                    recreate()
                } else {
                    Toast.makeText(this, "Incorrect PIN", Toast.LENGTH_SHORT).show()
                    finish()
                }
            }
            .setNegativeButton("Cancel") { _, _ -> finish() }
            .show()
    }

    private fun hashPin(pin: String): String {
        val bytes = MessageDigest.getInstance("SHA-256").digest(pin.toByteArray(Charsets.UTF_8))
        return bytes.joinToString("") { "%02x".format(it) }
    }

    private fun updateDetailView(item: SettingItem) {
        tvDetailTitle.text = item.title
        tvDetailDesc.text = item.desc
        ivDetailIcon.setImageResource(item.iconRes)
        ImageViewCompat.setImageTintList(
            ivDetailIcon,
            android.content.res.ColorStateList.valueOf(AppearanceTheme.accentColor(this))
        )
    }

    override fun onResume() {
        super.onResume()
        PlayBillingManager.refreshPurchases()
    }

    private fun openAdvanced(section: String) {
        startActivity(Intent(this, AdvancedSettingsActivity::class.java).putExtra(AdvancedSettingsActivity.EXTRA_SECTION, section))
    }

    private fun proAwareDescription(freeDescription: String, lockedDescription: String): String {
        return if (ProEntitlement.isProUnlocked(this)) freeDescription else lockedDescription
    }

    private fun openProFeature(message: String, action: () -> Unit) {
        if (!BuildConfig.PLAY_STORE_BUILD || ProEntitlement.isProUnlocked(this)) {
            action()
        } else {
            ProFeatureGate.showUnlockPrompt(this, message)
        }
    }

    data class SettingItem(val title: String, val desc: String, val iconRes: Int)

    private inner class SettingsAdapter(
        private val items: List<SettingItem>,
        private val onFocused: (Int) -> Unit,
        private val onClick: (SettingItem) -> Unit
    ) : RecyclerView.Adapter<SettingsAdapter.ViewHolder>() {

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val tvTitle: TextView = view.findViewById(R.id.tvSettingTitle)
            val ivIcon: ImageView = view.findViewById(R.id.ivSettingIcon)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context)
                .inflate(R.layout.item_settings_row, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
            holder.tvTitle.text = item.title
            holder.ivIcon.setImageResource(item.iconRes)
            holder.itemView.background = AppearanceTheme.buttonBackground(holder.itemView.context)
            
            holder.itemView.setOnClickListener { onClick(item) }
            
            holder.itemView.setOnFocusChangeListener { _, hasFocus ->
                if (hasFocus) {
                    updateDetailView(item)
                    val currentPosition = holder.bindingAdapterPosition
                    if (currentPosition != RecyclerView.NO_POSITION) onFocused(currentPosition)
                    holder.itemView.animate().scaleX(1.05f).scaleY(1.05f).setDuration(200).start()
                } else {
                    holder.itemView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(200).start()
                }
            }
        }

        override fun getItemCount() = items.size
    }

    companion object {
        private const val KEY_PARENTAL_PIN_HASH = "parental_pin_hash"
        private var settingsUnlocked = false
    }
}
