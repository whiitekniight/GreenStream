package com.example.greenstreem

import android.content.Context
import android.net.Uri
import android.os.Build
import android.os.Environment
import android.provider.MediaStore
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.io.File

object SettingsBackupManager {

    private const val PREFS_NAME = "iptv_prefs"
    private const val BACKUP_DIR = "backups"
    private const val PUBLIC_BACKUP_DIR = "GreenStreem/backups"
    private const val BACKUP_PREFIX = "greenstreem-backup-"
    private const val BACKUP_EXTENSION = ".json"

    data class RestoreSummary(
        val favorites: Int,
        val hiddenGroups: Int,
        val hiddenChannels: Int,
        val groupOrder: Int,
        val channelOrder: Int,
        val epgMappings: Int
    ) {
        fun message(): String {
            return "Restored favorites=$favorites, hidden groups=$hiddenGroups, hidden channels=$hiddenChannels, group order=$groupOrder, channel order=$channelOrder, EPG mappings=$epgMappings"
        }
    }

    data class BackupEntry(
        val title: String,
        val detail: String,
        val file: File? = null,
        val uri: Uri? = null
    )

    suspend fun backupNow(context: Context, label: String? = null): Result<File> = runCatching {
        val backupText = createBackupText(context).getOrThrow()
        val out = writePrivateBackup(context, backupText, label)
        writePublicBackup(context, out.name, backupText)
        out
    }

    suspend fun createBackupText(context: Context): Result<String> = runCatching {
        buildBackupJson(context).toString()
    }

    private suspend fun buildBackupJson(context: Context): JSONObject {
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val db = AppDatabase.getDatabase(context)

        val root = JSONObject()
        root.put("schema", 1)
        root.put("createdAtMs", System.currentTimeMillis())
        root.put("packageName", context.packageName)

        val prefsArray = JSONArray()
        prefs.all.forEach { (key, raw) ->
            val entry = JSONObject().put("k", key)
            when (raw) {
                is Boolean -> entry.put("t", "bool").put("v", raw)
                is Int -> entry.put("t", "int").put("v", raw)
                is Long -> entry.put("t", "long").put("v", raw)
                is Float -> entry.put("t", "float").put("v", raw.toDouble())
                is String -> entry.put("t", "string").put("v", raw)
                is Set<*> -> {
                    val list = raw.filterIsInstance<String>()
                    entry.put("t", "string_set").put("v", JSONArray(list))
                }
                else -> return@forEach
            }
            prefsArray.put(entry)
        }
        root.put("prefs", prefsArray)

        val favorites = db.favoriteDao().getAll().first()
        root.put("favorites", JSONArray().apply {
            favorites.forEach { f ->
                put(JSONObject()
                    .put("streamId", f.streamId)
                    .put("name", f.name)
                    .put("streamIcon", f.streamIcon)
                    .put("epgId", f.epgId)
                    .put("categoryId", f.categoryId))
            }
        })

        val hiddenGroups = db.groupDao().getAllHidden().first()
        root.put("hiddenGroups", JSONArray().apply {
            hiddenGroups.forEach { g ->
                put(JSONObject().put("groupId", g.groupId).put("name", g.name))
            }
        })

        val hiddenChannels = db.hiddenChannelDao().getAllHidden().first()
        root.put("hiddenChannels", JSONArray().apply {
            hiddenChannels.forEach { c ->
                put(JSONObject().put("channelId", c.channelId).put("name", c.name))
            }
        })

        val groupOrder = db.groupOrderDao().getAllOrder().first()
        root.put("groupOrder", JSONArray().apply {
            groupOrder.forEach { g ->
                put(JSONObject().put("groupId", g.groupId).put("position", g.position))
            }
        })

        val allChannelOrder = db.channelOrderDao().getAllOrder().first()
        root.put("channelOrder", JSONArray().apply {
            allChannelOrder.forEach { c ->
                put(
                    JSONObject()
                        .put("channelId", c.channelId)
                        .put("groupId", c.groupId)
                        .put("position", c.position)
                )
            }
        })

        val epgMappings = db.epgChannelMappingDao().getAll()
        root.put("epgChannelMappings", JSONArray().apply {
            epgMappings.forEach { mapping ->
                put(
                    JSONObject()
                        .put("channelId", mapping.channelId)
                        .put("provider", mapping.provider)
                        .put("epgChannelId", mapping.epgChannelId)
                        .put("displayName", mapping.displayName)
                )
            }
        })

        return root
    }

    suspend fun restoreLatest(context: Context): Result<Pair<File, RestoreSummary>> = runCatching {
        val file = listBackupFiles(context).firstOrNull()
            ?: error("No backup file found")
        file to restoreFromFile(context, file)
    }

    suspend fun restoreFile(context: Context, file: File): Result<RestoreSummary> = runCatching {
        if (!file.exists() || !file.isFile) error("Backup file not found")
        restoreFromFile(context, file)
    }

    suspend fun restoreEntry(context: Context, entry: BackupEntry): Result<RestoreSummary> = runCatching {
        when {
            entry.file != null -> restoreFromFile(context, entry.file)
            entry.uri != null -> {
                val text = context.contentResolver.openInputStream(entry.uri)?.bufferedReader()?.use { it.readText() }
                    ?: error("Could not open backup")
                restoreFromText(context, text)
            }
            else -> error("Backup file not found")
        }
    }

    fun listBackupFiles(context: Context): List<File> {
        return privateBackupDir(context).listFiles()
            ?.filter { it.isFile && it.extension.equals("json", ignoreCase = true) }
            ?.sortedByDescending { it.lastModified() }
            .orEmpty()
    }

    fun listAvailableBackups(context: Context): List<BackupEntry> {
        val dateFmt = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault())
        val privateEntries = listBackupFiles(context).map { file ->
            BackupEntry(
                title = file.nameWithoutExtension.removePrefix(BACKUP_PREFIX),
                detail = "App backup - ${dateFmt.format(java.util.Date(file.lastModified()))}",
                file = file
            )
        }
        return (privateEntries + listPublicBackupEntries(context) + listPublicBackupFilesDirect())
            .distinctBy { it.title + "|" + it.detail }
    }

    fun backupDirectory(context: Context): File {
        return privateBackupDir(context)
    }

    fun publicBackupLocation(): String = "Downloads/$PUBLIC_BACKUP_DIR"

    suspend fun restoreLatestPublic(context: Context): Result<Pair<String, RestoreSummary>> = runCatching {
        val backupText = readLatestPublicBackup(context)
            ?: error("No backup found in ${publicBackupLocation()}")
        publicBackupLocation() to restoreFromText(context, backupText)
    }

    suspend fun restoreBackupText(context: Context, backupText: String): Result<RestoreSummary> =
        withContext(Dispatchers.IO) {
            runCatching { restoreFromText(context, backupText) }
        }

    private suspend fun restoreFromFile(context: Context, file: File): RestoreSummary {
        return restoreFromText(context, file.readText())
    }

    private suspend fun restoreFromText(context: Context, text: String): RestoreSummary {
        val root = JSONObject(text)
        val prefs = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)
        val db = AppDatabase.getDatabase(context)

        prefs.edit().clear().commit()
        val prefsArray = root.optJSONArray("prefs") ?: JSONArray()
        val edit = prefs.edit()
        for (i in 0 until prefsArray.length()) {
            val item = prefsArray.optJSONObject(i) ?: continue
            val key = item.optString("k", "")
            if (key.isBlank()) continue
            when (item.optString("t", "")) {
                "bool" -> edit.putBoolean(key, item.optBoolean("v", false))
                "int" -> edit.putInt(key, item.optInt("v", 0))
                "long" -> edit.putLong(key, item.optLong("v", 0L))
                "float" -> edit.putFloat(key, item.optDouble("v", 0.0).toFloat())
                "string" -> edit.putString(key, item.optString("v", ""))
                "string_set" -> {
                    val arr = item.optJSONArray("v") ?: JSONArray()
                    val set = mutableSetOf<String>()
                    for (j in 0 until arr.length()) {
                        set.add(arr.optString(j, ""))
                    }
                    edit.putStringSet(key, set)
                }
            }
        }
        edit.commit()

        // EPG program caches are device-local and are intentionally not included in a backup.
        // Never restore stale refresh markers that would prevent the new installation from
        // downloading guide data after the restored playlist and EPG sources are applied.
        prefs.edit()
            .putBoolean("groups_changed", true)
            .putBoolean("epg_force_refresh_now", true)
            .putBoolean("epg_update_in_progress", false)
            .remove("epg_update_started_at")
            .remove("epg_last_refreshed_at")
            .remove("epg_settings_signature")
            .commit()

        db.favoriteDao().clearAll()
        db.groupDao().clearAll()
        db.hiddenChannelDao().clearAll()
        db.groupOrderDao().clearAllOrder()
        db.channelOrderDao().clearAll()
        db.epgCacheDao().clearAll()
        db.epgChannelMappingDao().clearAll()
        db.xmltvDao().clearPrograms()
        db.xmltvDao().clearAliases()

        val favorites = mutableListOf<Favorite>()
        val favoritesJson = root.optJSONArray("favorites") ?: JSONArray()
        for (i in 0 until favoritesJson.length()) {
            val item = favoritesJson.optJSONObject(i) ?: continue
            favorites.add(
                Favorite(
                    streamId = item.optInt("streamId"),
                    name = item.optString("name"),
                    streamIcon = if (item.has("streamIcon") && !item.isNull("streamIcon")) item.optString("streamIcon") else null,
                    epgId = if (item.has("epgId") && !item.isNull("epgId")) item.optString("epgId") else null,
                    categoryId = if (item.has("categoryId") && !item.isNull("categoryId")) item.optString("categoryId") else null
                )
            )
        }
        if (favorites.isNotEmpty()) db.favoriteDao().insertAll(favorites)

        val hiddenGroups = mutableListOf<HiddenGroup>()
        val hiddenGroupsJson = root.optJSONArray("hiddenGroups") ?: JSONArray()
        for (i in 0 until hiddenGroupsJson.length()) {
            val item = hiddenGroupsJson.optJSONObject(i) ?: continue
            hiddenGroups.add(HiddenGroup(item.optString("groupId"), item.optString("name")))
        }
        if (hiddenGroups.isNotEmpty()) db.groupDao().hideGroups(hiddenGroups)

        val hiddenChannels = mutableListOf<HiddenChannel>()
        val hiddenChannelsJson = root.optJSONArray("hiddenChannels") ?: JSONArray()
        for (i in 0 until hiddenChannelsJson.length()) {
            val item = hiddenChannelsJson.optJSONObject(i) ?: continue
            hiddenChannels.add(HiddenChannel(item.optLong("channelId"), item.optString("name")))
        }
        if (hiddenChannels.isNotEmpty()) db.hiddenChannelDao().hideChannels(hiddenChannels)

        val groupOrder = mutableListOf<GroupOrder>()
        val groupOrderJson = root.optJSONArray("groupOrder") ?: JSONArray()
        for (i in 0 until groupOrderJson.length()) {
            val item = groupOrderJson.optJSONObject(i) ?: continue
            groupOrder.add(GroupOrder(item.optString("groupId"), item.optInt("position")))
        }
        if (groupOrder.isNotEmpty()) db.groupOrderDao().saveOrder(groupOrder)

        val channelOrder = mutableListOf<ChannelOrder>()
        val channelOrderJson = root.optJSONArray("channelOrder") ?: JSONArray()
        for (i in 0 until channelOrderJson.length()) {
            val item = channelOrderJson.optJSONObject(i) ?: continue
            channelOrder.add(
                ChannelOrder(
                    channelId = item.optLong("channelId"),
                    groupId = item.optString("groupId"),
                    position = item.optInt("position")
                )
            )
        }
        if (channelOrder.isNotEmpty()) db.channelOrderDao().saveOrder(channelOrder)

        val epgMappings = mutableListOf<EpgChannelMapping>()
        val epgMappingsJson = root.optJSONArray("epgChannelMappings") ?: JSONArray()
        for (i in 0 until epgMappingsJson.length()) {
            val item = epgMappingsJson.optJSONObject(i) ?: continue
            val epgChannelId = item.optString("epgChannelId", "")
            if (!item.has("channelId") || epgChannelId.isBlank()) continue
            epgMappings.add(
                EpgChannelMapping(
                    channelId = item.optLong("channelId"),
                    provider = item.optString("provider", ""),
                    epgChannelId = epgChannelId,
                    displayName = item.optString("displayName", epgChannelId)
                )
            )
        }
        epgMappings.forEach { db.epgChannelMappingDao().upsert(it) }

        PlaylistProfilesManager.syncLegacyKeysToActive(context)
        XtreamManager.initFromPrefs(context)
        SecondaryEpgProvider.clearCache()
        return RestoreSummary(
            favorites = favorites.size,
            hiddenGroups = hiddenGroups.size,
            hiddenChannels = hiddenChannels.size,
            groupOrder = groupOrder.size,
            channelOrder = channelOrder.size,
            epgMappings = epgMappings.size
        )
    }

    private fun privateBackupDir(context: Context): File {
        return File(context.getExternalFilesDir(null), BACKUP_DIR).apply { mkdirs() }
    }

    private fun writePrivateBackup(context: Context, backupText: String, label: String?): File {
        val safeLabel = label
            ?.trim()
            ?.replace(Regex("""[^A-Za-z0-9._ -]"""), "")
            ?.replace(Regex("""\s+"""), "-")
            ?.take(40)
            .orEmpty()
        val suffix = if (safeLabel.isBlank()) {
            System.currentTimeMillis().toString()
        } else {
            "$safeLabel-${System.currentTimeMillis()}"
        }
        val out = File(privateBackupDir(context), "$BACKUP_PREFIX$suffix$BACKUP_EXTENSION")
        out.writeText(backupText)
        return out
    }

    private fun writePublicBackup(context: Context, fileName: String, backupText: String) {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            val values = android.content.ContentValues().apply {
                put(MediaStore.MediaColumns.DISPLAY_NAME, fileName)
                put(MediaStore.MediaColumns.MIME_TYPE, "application/json")
                put(MediaStore.MediaColumns.RELATIVE_PATH, Environment.DIRECTORY_DOWNLOADS + "/$PUBLIC_BACKUP_DIR")
            }
            val uri = context.contentResolver.insert(MediaStore.Downloads.EXTERNAL_CONTENT_URI, values)
                ?: error("Could not create backup in Downloads")
            context.contentResolver.openOutputStream(uri)?.use { stream ->
                stream.write(backupText.toByteArray(Charsets.UTF_8))
            } ?: error("Could not write backup in Downloads")
        } else {
            val dir = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), PUBLIC_BACKUP_DIR)
                .apply { mkdirs() }
            File(dir, fileName).writeText(backupText)
        }
    }

    private fun readLatestPublicBackup(context: Context): String? {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.Q) {
            return readLatestPublicBackupFromMediaStore(context)
        }
        val dir = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), PUBLIC_BACKUP_DIR)
        val file = dir.listFiles()
            ?.filter { it.isFile && it.name.startsWith(BACKUP_PREFIX) && it.name.endsWith(BACKUP_EXTENSION) }
            ?.maxByOrNull { it.lastModified() }
            ?: return null
        return file.readText()
    }

    private fun readLatestPublicBackupFromMediaStore(context: Context): String? {
        val projection = arrayOf(
            MediaStore.MediaColumns._ID,
            MediaStore.MediaColumns.DISPLAY_NAME,
            MediaStore.MediaColumns.RELATIVE_PATH,
            MediaStore.MediaColumns.DATE_MODIFIED
        )
        val downloadsPath = Environment.DIRECTORY_DOWNLOADS + "/$PUBLIC_BACKUP_DIR/"
        val selection = "${MediaStore.MediaColumns.DISPLAY_NAME} LIKE ? AND ${MediaStore.MediaColumns.RELATIVE_PATH} = ?"
        val selectionArgs = arrayOf("$BACKUP_PREFIX%$BACKUP_EXTENSION", downloadsPath)
        val sortOrder = "${MediaStore.MediaColumns.DATE_MODIFIED} DESC"
        context.contentResolver.query(
            MediaStore.Downloads.EXTERNAL_CONTENT_URI,
            projection,
            selection,
            selectionArgs,
            sortOrder
        )?.use { cursor ->
            val idColumn = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns._ID)
            val nameColumn = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DISPLAY_NAME)
            while (cursor.moveToNext()) {
                val name = cursor.getString(nameColumn)
                if (!name.startsWith(BACKUP_PREFIX) || !name.endsWith(BACKUP_EXTENSION)) continue
                val id = cursor.getLong(idColumn)
                val uri = Uri.withAppendedPath(MediaStore.Downloads.EXTERNAL_CONTENT_URI, id.toString())
                return context.contentResolver.openInputStream(uri)?.bufferedReader()?.use { it.readText() }
            }
        }
        return null
    }

    private fun listPublicBackupEntries(context: Context): List<BackupEntry> {
        val dateFmt = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault())
        if (Build.VERSION.SDK_INT < Build.VERSION_CODES.Q) {
            val dir = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), PUBLIC_BACKUP_DIR)
            return dir.listFiles()
                ?.filter { it.isFile && it.name.startsWith(BACKUP_PREFIX) && it.name.endsWith(BACKUP_EXTENSION) }
                ?.sortedByDescending { it.lastModified() }
                ?.map { file ->
                    BackupEntry(
                        title = file.nameWithoutExtension.removePrefix(BACKUP_PREFIX),
                        detail = "Downloads backup - ${dateFmt.format(java.util.Date(file.lastModified()))}",
                        file = file
                    )
                }
                .orEmpty()
        }

        val entries = mutableListOf<BackupEntry>()
        val projection = arrayOf(
            MediaStore.MediaColumns._ID,
            MediaStore.MediaColumns.DISPLAY_NAME,
            MediaStore.MediaColumns.RELATIVE_PATH,
            MediaStore.MediaColumns.DATE_MODIFIED
        )
        val downloadsPath = Environment.DIRECTORY_DOWNLOADS + "/$PUBLIC_BACKUP_DIR/"
        val selection = "${MediaStore.MediaColumns.DISPLAY_NAME} LIKE ? AND ${MediaStore.MediaColumns.RELATIVE_PATH} = ?"
        val selectionArgs = arrayOf("$BACKUP_PREFIX%$BACKUP_EXTENSION", downloadsPath)
        val sortOrder = "${MediaStore.MediaColumns.DATE_MODIFIED} DESC"
        context.contentResolver.query(
            MediaStore.Downloads.EXTERNAL_CONTENT_URI,
            projection,
            selection,
            selectionArgs,
            sortOrder
        )?.use { cursor ->
            val idColumn = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns._ID)
            val nameColumn = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DISPLAY_NAME)
            val dateColumn = cursor.getColumnIndexOrThrow(MediaStore.MediaColumns.DATE_MODIFIED)
            while (cursor.moveToNext()) {
                val name = cursor.getString(nameColumn)
                if (!name.startsWith(BACKUP_PREFIX) || !name.endsWith(BACKUP_EXTENSION)) continue
                val id = cursor.getLong(idColumn)
                val modifiedMs = cursor.getLong(dateColumn) * 1000L
                entries.add(
                    BackupEntry(
                        title = name.removeSuffix(BACKUP_EXTENSION).removePrefix(BACKUP_PREFIX),
                        detail = "Downloads backup - ${dateFmt.format(java.util.Date(modifiedMs))}",
                        uri = Uri.withAppendedPath(MediaStore.Downloads.EXTERNAL_CONTENT_URI, id.toString())
                    )
                )
            }
        }
        return entries
    }

    private fun listPublicBackupFilesDirect(): List<BackupEntry> {
        val dateFmt = java.text.SimpleDateFormat("yyyy-MM-dd HH:mm", java.util.Locale.getDefault())
        val dir = File(Environment.getExternalStoragePublicDirectory(Environment.DIRECTORY_DOWNLOADS), PUBLIC_BACKUP_DIR)
        return dir.listFiles()
            ?.filter { it.isFile && it.name.startsWith(BACKUP_PREFIX) && it.name.endsWith(BACKUP_EXTENSION) }
            ?.sortedByDescending { it.lastModified() }
            ?.map { file ->
                BackupEntry(
                    title = file.nameWithoutExtension.removePrefix(BACKUP_PREFIX),
                    detail = "Downloads backup - ${dateFmt.format(java.util.Date(file.lastModified()))}",
                    file = file
                )
            }
            .orEmpty()
    }
}
