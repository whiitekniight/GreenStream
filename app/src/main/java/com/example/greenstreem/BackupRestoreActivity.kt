package com.example.greenstreem

import android.app.TimePickerDialog
import android.content.ActivityNotFoundException
import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.text.Editable
import android.text.InputType
import android.text.TextWatcher
import android.view.KeyEvent
import android.view.inputmethod.EditorInfo
import android.view.inputmethod.InputMethodManager
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.SwitchCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext

class BackupRestoreActivity : AppCompatActivity() {

    private lateinit var rvOptions: RecyclerView
    private var rows: List<Row> = emptyList()
    private var renderGeneration = 0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_playlist_settings)

        findViewById<TextView>(R.id.tvPlaylistSettingsTitle)?.text = "Restore Code & Backups"
        rvOptions = findViewById(R.id.rvPlaylistOptions)
        rvOptions.layoutManager = LinearLayoutManager(this)
        render()
    }

    private fun render() {
        val generation = ++renderGeneration
        showRows(
            listOf(
                Row.Info("Cloud backup: checking"),
                Row.Action("Add or change restore code", Action.CONNECT_CLOUD)
            )
        )
        lifecycleScope.launch {
            val state = withContext(Dispatchers.IO) {
                val connected = CloudBackupManager.isConnected(this@BackupRestoreActivity)
                RestoreScreenState(
                    connected = connected,
                    status = CloudBackupManager.statusText(this@BackupRestoreActivity)
                )
            }
            if (generation != renderGeneration || isFinishing || isDestroyed) return@launch
            val list = mutableListOf<Row>(Row.Info(state.status))
            list.add(Row.Action("Open Restore Code Website\ndashboard.greenstreemlabs.com/customer", Action.OPEN_RESTORE_SITE))
            list.add(Row.Action(if (state.connected) "Change restore code" else "Add your restore code (optional)", Action.CONNECT_CLOUD))
            if (state.connected) {
                list.add(Row.Action("Save current setup to this restore code", Action.BACKUP_CLOUD))
                list.add(Row.Action("Restore saved setup from this code", Action.RESTORE_CLOUD))
                list.add(
                    Row.Toggle(
                        title = "Automatic daily cloud backup",
                        checked = CloudBackupScheduler.isEnabled(this@BackupRestoreActivity),
                        action = Action.TOGGLE_AUTO_BACKUP
                    )
                )
                if (CloudBackupScheduler.isEnabled(this@BackupRestoreActivity)) {
                    list.add(Row.Action("Change automatic backup time", Action.CHANGE_AUTO_BACKUP_TIME))
                    CloudBackupScheduler.nextBackupDescription(this@BackupRestoreActivity)
                        .takeIf { it.isNotBlank() }
                        ?.let { list.add(Row.Info(it)) }
                }
            }
            showRows(list)
        }
    }

    private fun showRows(newRows: List<Row>) {
        rows = newRows
        rvOptions.adapter = BackupRowsAdapter(rows) { index -> onRowClick(rows[index]) }
    }

    private fun onRowClick(row: Row) {
        when (row) {
            is Row.Action -> handleAction(row.action)
            is Row.Toggle -> handleAction(row.action)
            is Row.Info -> Unit
        }
    }

    private fun handleAction(action: Action) {
        when (action) {
            Action.OPEN_RESTORE_SITE -> openRestoreCodeWebsite()
            Action.CONNECT_CLOUD -> showRestoreCodeDialog()
            Action.BACKUP_CLOUD -> backUpToCloud()
            Action.RESTORE_CLOUD -> confirmCloudRestore()
            Action.TOGGLE_AUTO_BACKUP -> {
                CloudBackupScheduler.setEnabled(this, !CloudBackupScheduler.isEnabled(this))
                render()
            }
            Action.CHANGE_AUTO_BACKUP_TIME -> showAutomaticBackupTimeDialog()
        }
    }

    private fun openRestoreCodeWebsite() {
        val url = "https://dashboard.greenstreemlabs.com/customer"
        try {
            startActivity(Intent(Intent.ACTION_VIEW, Uri.parse(url)))
        } catch (_: ActivityNotFoundException) {
            Toast.makeText(this, "Open $url on your phone or computer", Toast.LENGTH_LONG).show()
        }
    }

    private fun showAutomaticBackupTimeDialog() {
        TimePickerDialog(
            this,
            { _, hour, minute ->
                CloudBackupScheduler.setTime(this, hour, minute)
                render()
            },
            CloudBackupScheduler.hour(this),
            CloudBackupScheduler.minute(this),
            android.text.format.DateFormat.is24HourFormat(this)
        ).apply {
            setTitle("Daily cloud backup time")
            show()
        }
    }

    private fun showRestoreCodeDialog() {
        val input = EditText(this).apply {
            hint = "ABC123"
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_CHARACTERS
            filters = arrayOf(android.text.InputFilter.LengthFilter(6))
            imeOptions = EditorInfo.IME_ACTION_DONE
            setSingleLine(true)
        }
        input.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(text: CharSequence?, start: Int, count: Int, after: Int) = Unit
            override fun onTextChanged(text: CharSequence?, start: Int, before: Int, count: Int) = Unit
            override fun afterTextChanged(text: Editable?) {
                if (text?.count { it.isLetterOrDigit() } == 6) input.post { hideKeyboard(input) }
            }
        })
        input.setOnEditorActionListener { _, actionId, event ->
            val done = actionId == EditorInfo.IME_ACTION_DONE ||
                (event?.keyCode == KeyEvent.KEYCODE_ENTER && event.action == KeyEvent.ACTION_UP)
            if (done) hideKeyboard(input)
            done
        }
        AlertDialog.Builder(this)
            .setTitle("Permanent restore code")
            .setMessage("Enter the 6-character code from your GreenStreem provider.")
            .setView(input)
            .setPositiveButton("Connect") { _, _ ->
                hideKeyboard(input)
                lifecycleScope.launch {
                    CloudBackupManager.connect(this@BackupRestoreActivity, input.text.toString())
                        .onSuccess { result ->
                            render()
                            if (result.hasBackup) confirmCloudRestore()
                            else backUpToCloud("Connected. Creating the first cloud backup…")
                        }
                        .onFailure { Toast.makeText(this@BackupRestoreActivity, it.message, Toast.LENGTH_LONG).show() }
                }
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun hideKeyboard(input: EditText) {
        input.clearFocus()
        (getSystemService(INPUT_METHOD_SERVICE) as? InputMethodManager)
            ?.hideSoftInputFromWindow(input.windowToken, 0)
    }

    private fun backUpToCloud(startMessage: String? = null) {
        if (startMessage != null) Toast.makeText(this, startMessage, Toast.LENGTH_SHORT).show()
        lifecycleScope.launch {
            CloudBackupManager.upload(this@BackupRestoreActivity)
                .onSuccess {
                    Toast.makeText(this@BackupRestoreActivity, "Cloud backup saved", Toast.LENGTH_LONG).show()
                    render()
                }
                .onFailure { Toast.makeText(this@BackupRestoreActivity, "Cloud backup failed: ${it.message}", Toast.LENGTH_LONG).show() }
        }
    }

    private fun confirmCloudRestore() {
        AlertDialog.Builder(this)
            .setTitle("Restore cloud backup")
            .setMessage("Replace this installation's playlists, settings, favorites, hidden items, and ordering with the saved cloud backup?")
            .setPositiveButton("Restore") { _, _ ->
                lifecycleScope.launch {
                    CloudBackupManager.downloadAndDecrypt(this@BackupRestoreActivity)
                        .fold(
                            onSuccess = { SettingsBackupManager.restoreBackupText(this@BackupRestoreActivity, it) },
                            onFailure = { Result.failure(it) }
                        )
                        .onSuccess { summary ->
                            Toast.makeText(this@BackupRestoreActivity, summary.message(), Toast.LENGTH_LONG).show()
                            restartApp()
                        }
                        .onFailure { Toast.makeText(this@BackupRestoreActivity, "Cloud restore failed: ${it.message}", Toast.LENGTH_LONG).show() }
                }
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun restartApp() {
        val intent = Intent(this, SplashActivity::class.java).apply {
            addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK or Intent.FLAG_ACTIVITY_CLEAR_TASK)
        }
        startActivity(intent)
        finish()
    }

    private sealed class Row {
        data class Action(val title: String, val action: com.example.greenstreem.BackupRestoreActivity.Action) : Row()
        data class Toggle(
            val title: String,
            val checked: Boolean,
            val action: com.example.greenstreem.BackupRestoreActivity.Action
        ) : Row()
        data class Info(val title: String) : Row()
    }

    private data class RestoreScreenState(
        val connected: Boolean,
        val status: String
    )

    private enum class Action {
        OPEN_RESTORE_SITE,
        CONNECT_CLOUD,
        BACKUP_CLOUD,
        RESTORE_CLOUD,
        TOGGLE_AUTO_BACKUP,
        CHANGE_AUTO_BACKUP_TIME
    }

    private class BackupRowsAdapter(
        private val items: List<Row>,
        private val onClickIndex: (Int) -> Unit
    ) : RecyclerView.Adapter<BackupRowsAdapter.ViewHolder>() {

        class ViewHolder(view: android.view.View) : RecyclerView.ViewHolder(view) {
            val text: TextView = view.findViewById(android.R.id.text1)
            val toggle: SwitchCompat? = view.findViewById(R.id.switchRestoreOption)
        }

        override fun getItemViewType(position: Int): Int = if (items[position] is Row.Toggle) VIEW_TYPE_TOGGLE else VIEW_TYPE_TEXT

        override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): ViewHolder {
            val view = android.view.LayoutInflater.from(parent.context)
                .inflate(
                    if (viewType == VIEW_TYPE_TOGGLE) R.layout.item_restore_toggle else android.R.layout.simple_list_item_1,
                    parent,
                    false
                )
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val row = items[position]
            val title = when (row) {
                is Row.Action -> row.title
                is Row.Toggle -> row.title
                is Row.Info -> row.title
            }
            holder.text.text = title
            holder.text.setTextColor(android.graphics.Color.WHITE)
            holder.text.textSize = 16f
            val actionable = row !is Row.Info
            holder.itemView.isFocusable = actionable
            holder.itemView.isClickable = actionable
            holder.itemView.setBackgroundResource(R.drawable.selector_button_bg)
            holder.itemView.setPadding(32, 24, 32, 24)
            holder.itemView.setOnClickListener(if (actionable) android.view.View.OnClickListener { onClickIndex(position) } else null)
            holder.toggle?.isChecked = (row as? Row.Toggle)?.checked == true
        }

        override fun getItemCount(): Int = items.size

        companion object {
            private const val VIEW_TYPE_TEXT = 0
            private const val VIEW_TYPE_TOGGLE = 1
        }
    }
}
