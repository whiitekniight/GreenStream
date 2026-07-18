package com.example.greenstreem

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
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
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
    private val chooseBackupFile = registerForActivityResult(ActivityResultContracts.OpenDocument()) { uri ->
        if (uri != null) restorePickedBackup(uri)
    }

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
                Row.Action("Add or change restore code", Action.CONNECT_CLOUD),
                Row.Action("Create named backup", Action.CREATE_BACKUP),
                Row.Action("Find backup file", Action.CHOOSE_BACKUP)
            )
        )
        lifecycleScope.launch {
            val state = withContext(Dispatchers.IO) {
                val connected = CloudBackupManager.isConnected(this@BackupRestoreActivity)
                RestoreScreenState(
                    connected = connected,
                    status = CloudBackupManager.statusText(this@BackupRestoreActivity),
                    backups = SettingsBackupManager.listAvailableBackups(this@BackupRestoreActivity)
                )
            }
            if (generation != renderGeneration || isFinishing || isDestroyed) return@launch
            val list = mutableListOf<Row>(Row.Info(state.status))
            list.add(Row.Action(if (state.connected) "Change restore code" else "Add your restore code (optional)", Action.CONNECT_CLOUD))
            if (state.connected) {
                list.add(Row.Action("Save current setup to this restore code", Action.BACKUP_CLOUD))
                list.add(Row.Action("Restore saved setup from this code", Action.RESTORE_CLOUD))
            }
            list.addAll(listOf(
                Row.Action("Create named backup", Action.CREATE_BACKUP),
                Row.Action("Find backup file", Action.CHOOSE_BACKUP),
                Row.Action("Refresh backup list", Action.REFRESH_LIST)
            ))
            if (state.backups.isEmpty()) {
                list.add(Row.Info("No backups found in ${SettingsBackupManager.publicBackupLocation()}"))
            } else {
                state.backups.forEach { backup ->
                    list.add(Row.BackupFile(backup, "${backup.title}\n${backup.detail}"))
                }
            }
            list.add(Row.Info("Downloads backups: ${SettingsBackupManager.publicBackupLocation()}"))
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
            is Row.BackupFile -> confirmRestore(row.backup)
            is Row.Info -> Unit
        }
    }

    private fun handleAction(action: Action) {
        when (action) {
            Action.CREATE_BACKUP -> showBackupNameDialog()
            Action.CHOOSE_BACKUP -> chooseBackupFile.launch(arrayOf("application/json", "text/plain", "*/*"))
            Action.REFRESH_LIST -> render()
            Action.CONNECT_CLOUD -> showRestoreCodeDialog()
            Action.BACKUP_CLOUD -> backUpToCloud()
            Action.RESTORE_CLOUD -> confirmCloudRestore()
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

    private fun restorePickedBackup(uri: Uri) {
        lifecycleScope.launch {
            val result = runCatching {
                contentResolver.openInputStream(uri)?.bufferedReader()?.use { it.readText() }
                    ?: error("Could not open selected backup")
            }.fold(
                onSuccess = { SettingsBackupManager.restoreBackupText(this@BackupRestoreActivity, it) },
                onFailure = { Result.failure(it) }
            )
            result.onSuccess { summary ->
                Toast.makeText(this@BackupRestoreActivity, summary.message(), Toast.LENGTH_LONG).show()
                restartApp()
            }.onFailure { err ->
                Toast.makeText(this@BackupRestoreActivity, "Restore failed: ${err.message}", Toast.LENGTH_LONG).show()
            }
        }
    }

    private fun showBackupNameDialog() {
        val input = EditText(this).apply {
            hint = "Living room Shield"
            inputType = InputType.TYPE_CLASS_TEXT or InputType.TYPE_TEXT_FLAG_CAP_WORDS
            setSingleLine(true)
        }
        AlertDialog.Builder(this)
            .setTitle("Name backup")
            .setView(input)
            .setPositiveButton("Backup") { _, _ ->
                val label = input.text?.toString()?.trim().orEmpty()
                lifecycleScope.launch {
                    val result = SettingsBackupManager.backupNow(this@BackupRestoreActivity, label)
                    result.onSuccess { file ->
                        Toast.makeText(this@BackupRestoreActivity, "Backup saved: ${file.name}", Toast.LENGTH_LONG).show()
                        render()
                    }.onFailure { err ->
                        Toast.makeText(this@BackupRestoreActivity, "Backup failed: ${err.message}", Toast.LENGTH_LONG).show()
                    }
                }
            }
            .setNegativeButton("Cancel", null)
            .show()
    }

    private fun confirmRestore(backup: SettingsBackupManager.BackupEntry) {
        AlertDialog.Builder(this)
            .setTitle("Restore backup")
            .setMessage("Restore ${backup.title}? This will overwrite current settings.")
            .setPositiveButton("Restore") { _, _ ->
                lifecycleScope.launch {
                    val result = SettingsBackupManager.restoreEntry(this@BackupRestoreActivity, backup)
                    result.onSuccess { summary ->
                        Toast.makeText(this@BackupRestoreActivity, summary.message(), Toast.LENGTH_LONG).show()
                        restartApp()
                    }.onFailure { err ->
                        Toast.makeText(this@BackupRestoreActivity, "Restore failed: ${err.message}", Toast.LENGTH_LONG).show()
                    }
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
        data class BackupFile(val backup: SettingsBackupManager.BackupEntry, val title: String) : Row()
        data class Info(val title: String) : Row()
    }

    private data class RestoreScreenState(
        val connected: Boolean,
        val status: String,
        val backups: List<SettingsBackupManager.BackupEntry>
    )

    private enum class Action {
        CREATE_BACKUP,
        CHOOSE_BACKUP,
        REFRESH_LIST,
        CONNECT_CLOUD,
        BACKUP_CLOUD,
        RESTORE_CLOUD
    }

    private class BackupRowsAdapter(
        private val items: List<Row>,
        private val onClickIndex: (Int) -> Unit
    ) : RecyclerView.Adapter<BackupRowsAdapter.ViewHolder>() {

        class ViewHolder(view: android.view.View) : RecyclerView.ViewHolder(view) {
            val text: TextView = view.findViewById(android.R.id.text1)
        }

        override fun onCreateViewHolder(parent: android.view.ViewGroup, viewType: Int): ViewHolder {
            val view = android.view.LayoutInflater.from(parent.context)
                .inflate(android.R.layout.simple_list_item_1, parent, false)
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val row = items[position]
            val title = when (row) {
                is Row.Action -> row.title
                is Row.BackupFile -> row.title
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
        }

        override fun getItemCount(): Int = items.size
    }
}
