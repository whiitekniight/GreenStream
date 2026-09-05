package com.example.greenstreem

import android.content.Context
import android.os.Build
import android.provider.Settings
import android.security.keystore.KeyGenParameterSpec
import android.security.keystore.KeyProperties
import android.util.Base64
import android.util.Log
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.delay
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import org.json.JSONArray
import org.json.JSONObject
import java.net.HttpURLConnection
import java.net.URL
import java.security.KeyStore
import java.security.SecureRandom
import java.util.UUID
import java.util.concurrent.atomic.AtomicBoolean
import java.util.concurrent.atomic.AtomicLong
import javax.crypto.Cipher
import javax.crypto.KeyGenerator
import javax.crypto.SecretKey
import javax.crypto.SecretKeyFactory
import javax.crypto.spec.GCMParameterSpec
import javax.crypto.spec.PBEKeySpec
import javax.crypto.spec.SecretKeySpec

object CloudBackupManager {
    private const val BASE_URL = "https://dashboard.greenstreemlabs.com"
    private const val PREFS_NAME = "greenstreem_cloud_backup"
    private const val KEY_ALIAS = "greenstreem_cloud_credentials"
    private const val KEY_CODE = "restore_code"
    private const val KEY_TOKEN = "device_token"
    private const val KEY_LAST_BACKUP = "last_backup_ms"
    private const val AUTO_BACKUP_INTERVAL_MS = 10 * 60 * 1000L
    private const val PBKDF_ITERATIONS = 180_000
    private const val MANAGEMENT_POLL_INTERVAL_MS = 30_000L
    private const val MANAGEMENT_STATE_INTERVAL_MS = 10 * 60 * 1000L
    private const val MANAGEMENT_CHANNEL_BUDGET_BYTES = 4_500_000
    private const val TAG = "GreenStreemCloud"
    private val autoBackupRunning = AtomicBoolean(false)
    private val managementSyncRunning = AtomicBoolean(false)
    private val playbackActive = AtomicBoolean(false)
    private val lastManagementStateUpload = AtomicLong(0L)
    private val backgroundScope = CoroutineScope(SupervisorJob() + Dispatchers.IO)
    @Volatile private var cachedManagementCatalog: ManagementCatalog? = null

    private data class ManagedChannel(
        val streamId: Int,
        val name: String,
        val streamIcon: String?,
        val epgId: String?,
        val categoryId: String?
    )

    private data class ManagementCatalog(
        val categories: List<XtreamCategory>,
        val channels: List<ManagedChannel>,
        val loadedAt: Long
    )

    data class ConnectResult(val hasBackup: Boolean, val backupUpdatedAt: Long)
    data class BackupResult(val revision: Int, val updatedAt: Long)

    fun isConnected(context: Context): Boolean = readSecret(context, KEY_CODE) != null && readSecret(context, KEY_TOKEN) != null

    fun statusText(context: Context): String {
        if (!isConnected(context)) return "Cloud backup: not connected"
        val last = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE).getLong(KEY_LAST_BACKUP, 0L)
        if (last <= 0L) return "Cloud backup: connected"
        val whenText = android.text.format.DateUtils.getRelativeTimeSpanString(last, System.currentTimeMillis(), 60_000L)
        return "Cloud backup: saved $whenText"
    }

    fun setPlaybackActive(active: Boolean) {
        playbackActive.set(active)
    }

    suspend fun connect(context: Context, rawCode: String): Result<ConnectResult> = withContext(Dispatchers.IO) {
        runCatching {
            val code = rawCode.uppercase().filter { it.isLetterOrDigit() }
            require(code.length == 6) { "Enter the 6-character restore code" }
            val installationId = Settings.Secure.getString(context.contentResolver, Settings.Secure.ANDROID_ID)
                ?.takeIf { it.isNotBlank() } ?: UUID.randomUUID().toString()
            val body = JSONObject()
                .put("code", code)
                .put("installationId", installationId)
                .put("deviceName", listOf(Build.MANUFACTURER, Build.MODEL).filter { it.isNotBlank() }.joinToString(" "))
                .put("platform", "android")
                .put("appVersion", appVersion(context))
            val result = request("POST", "/api/device/pair", body)
            writeSecret(context, KEY_CODE, code)
            writeSecret(context, KEY_TOKEN, result.getString("deviceToken"))
            val updatedAt = result.optLong("backupUpdatedAt", 0L)
            if (updatedAt > 0L) prefs(context).edit().putLong(KEY_LAST_BACKUP, updatedAt * 1000L).apply()
            CloudBackupScheduler.schedule(context)
            ConnectResult(result.optBoolean("hasBackup", false), updatedAt)
        }
    }

    suspend fun upload(context: Context): Result<BackupResult> = withContext(Dispatchers.IO) {
        runCatching {
            val code = readSecret(context, KEY_CODE) ?: error("Enter the customer's restore code first")
            val token = readSecret(context, KEY_TOKEN) ?: error("Cloud backup is not connected")
            val backupText = SettingsBackupManager.createBackupText(context).getOrThrow()
            val envelope = encrypt(code, backupText)
            val result = request("PUT", "/api/device/backup", JSONObject().put("backup", envelope), token)
            val updatedAt = result.optLong("updatedAt", System.currentTimeMillis() / 1000L)
            prefs(context).edit().putLong(KEY_LAST_BACKUP, updatedAt * 1000L).apply()
            BackupResult(result.optInt("revision", 0), updatedAt)
        }
    }

    suspend fun downloadAndDecrypt(context: Context): Result<String> = withContext(Dispatchers.IO) {
        runCatching {
            val code = readSecret(context, KEY_CODE) ?: error("Enter the customer's restore code first")
            val token = readSecret(context, KEY_TOKEN) ?: error("Cloud backup is not connected")
            val result = request("GET", "/api/device/backup", token = token)
            decrypt(code, result.getJSONObject("backup"))
        }
    }

    fun backupIfDue(context: Context) {
        val appContext = context.applicationContext
        val last = prefs(appContext).getLong(KEY_LAST_BACKUP, 0L)
        if (System.currentTimeMillis() - last < AUTO_BACKUP_INTERVAL_MS || !autoBackupRunning.compareAndSet(false, true)) return
        backgroundScope.launch {
            try {
                // Android Keystore access can take seconds on TV hardware. Never make the
                // activity transition wait for it when MainActivity moves to the background.
                if (isConnected(appContext)) upload(appContext)
            } finally {
                autoBackupRunning.set(false)
            }
        }
    }

    fun startManagementSync(context: Context) {
        if (!managementSyncRunning.compareAndSet(false, true)) return
        val appContext = context.applicationContext
        backgroundScope.launch {
            while (true) {
                runCatching { syncManagement(appContext) }
                    .onFailure { Log.w(TAG, "Management sync failed: ${it.message.orEmpty()}", it) }
                delay(MANAGEMENT_POLL_INTERVAL_MS)
            }
        }
    }

    private suspend fun syncManagement(context: Context) {
        val token = readSecret(context, KEY_TOKEN) ?: return
        Log.d(TAG, "Management sync starting")
        request(
            "POST",
            "/api/device/heartbeat",
            JSONObject().put("status", "online").put("appVersion", appVersion(context)).put("events", JSONArray()),
            token
        )
        var stateChanged = false
        var restartRequested = false
        val commands = request("GET", "/api/device/commands", token = token).optJSONArray("commands") ?: JSONArray()
        for (index in 0 until commands.length()) {
            val command = commands.optJSONObject(index) ?: continue
            val commandId = command.optInt("id", 0)
            val name = command.optString("command", "")
            val payload = command.optJSONObject("payload") ?: JSONObject()
            val result = runCatching {
                when (name) {
                    "set_management_state" -> {
                        applyManagementState(context, payload)
                        stateChanged = true
                        "playlist controls applied"
                    }
                    "sync_settings" -> {
                        stateChanged = true
                        "settings sync requested"
                    }
                    "refresh" -> {
                        context.getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE).edit().putBoolean("groups_changed", true).apply()
                        "refresh requested"
                    }
                    "clear_cache" -> {
                        context.cacheDir.listFiles()?.forEach { it.deleteRecursively() }
                        "cache cleared"
                    }
                    "restart_app" -> {
                        restartRequested = true
                        "app restart requested"
                    }
                    else -> "command received"
                }
            }.fold(onSuccess = { it }, onFailure = { "error: ${it.message.orEmpty()}" })
            if (commandId > 0) {
                request("POST", "/api/device/commands/$commandId/ack", JSONObject().put("result", result), token)
            }
        }
        if (restartRequested) {
            Log.i(TAG, "Restarting app from dashboard command")
            val launchIntent = context.packageManager.getLaunchIntentForPackage(context.packageName)
                ?: error("App launch intent unavailable")
            launchIntent.addFlags(android.content.Intent.FLAG_ACTIVITY_NEW_TASK or android.content.Intent.FLAG_ACTIVITY_CLEAR_TASK)
            context.startActivity(launchIntent)
            return
        }
        val now = System.currentTimeMillis()
        if (stateChanged || now - lastManagementStateUpload.get() >= MANAGEMENT_STATE_INTERVAL_MS) {
            // A full management snapshot can contain tens of thousands of channels and
            // allocate several megabytes of JSON. On lower-memory TV devices that work
            // causes stop-the-world GC pauses visible as playback freezes/catch-up jumps.
            // Heartbeats and dashboard commands still run while playing; defer only the
            // expensive state build/upload until playback is inactive.
            if (playbackActive.get()) {
                Log.d(TAG, "Management state upload deferred during playback")
                return
            }
            uploadManagementState(context, token, forceCatalogRefresh = stateChanged)
            lastManagementStateUpload.set(now)
            if (stateChanged) runCatching { upload(context).getOrThrow() }
        }
    }

    private suspend fun uploadManagementState(context: Context, token: String, forceCatalogRefresh: Boolean) {
        val now = System.currentTimeMillis()
        val current = cachedManagementCatalog
        val catalog = if (forceCatalogRefresh || current == null || now - current.loadedAt >= MANAGEMENT_STATE_INTERVAL_MS) {
            loadManagementCatalog(context).also { cachedManagementCatalog = it }
        } else current
        val db = AppDatabase.getDatabase(context)
        val hidden = db.groupDao().getAllHidden().first().associateBy { it.groupId }
        val order = db.groupOrderDao().getAllOrder().first().associateBy { it.groupId }
        val categoryNames = catalog.categories.associate { it.id to it.name }
        val categories = catalog.categories.sortedBy { order[it.id]?.position ?: Int.MAX_VALUE }
        val favorites = db.favoriteDao().getAll().first()
        val state = JSONObject().put("version", 1)
        state.put("categories", JSONArray().apply {
            categories.forEachIndexed { position, category ->
                put(JSONObject().put("id", category.id).put("name", category.name).put("hidden", hidden.containsKey(category.id)).put("position", position))
            }
        })
        var remainingChannelBytes = MANAGEMENT_CHANNEL_BUDGET_BYTES
        var reportedChannelCount = 0
        state.put("channels", JSONArray().apply {
            for (channel in catalog.channels.take(50_000)) {
                val item = JSONObject().put("streamId", channel.streamId).put("name", channel.name).put("streamIcon", channel.streamIcon).put("epgId", channel.epgId).put("categoryId", channel.categoryId).put("categoryName", categoryNames[channel.categoryId].orEmpty())
                val itemBytes = item.toString().toByteArray(Charsets.UTF_8).size + 1
                if (itemBytes > remainingChannelBytes) break
                put(item)
                remainingChannelBytes -= itemBytes
                reportedChannelCount++
            }
        })
        state.put("favorites", JSONArray().apply {
            favorites.forEach { favorite ->
                put(JSONObject().put("streamId", favorite.streamId).put("name", favorite.name).put("streamIcon", favorite.streamIcon).put("epgId", favorite.epgId).put("categoryId", favorite.categoryId).put("categoryName", categoryNames[favorite.categoryId].orEmpty()))
            }
        })
        val upload = JSONObject().put("state", state)
        Log.i(TAG, "Uploading management state categories=${categories.size} channels=$reportedChannelCount favorites=${favorites.size} bytes=${upload.toString().toByteArray(Charsets.UTF_8).size}")
        request("PUT", "/api/device/management-state", upload, token)
        Log.i(TAG, "Management state uploaded")
    }

    private suspend fun loadManagementCatalog(context: Context): ManagementCatalog = withContext(Dispatchers.IO) {
        val prefs = context.getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
        if (prefs.getString("playlist_type", "xtream") == "m3u") {
            val url = prefs.getString("m3u_url", "").orEmpty()
            val parsed = if (url.isBlank()) emptyList() else URL(url).openStream().use { M3uParser.parse(it) }
            val categories = parsed.map { it.group.ifBlank { "Default" } }.distinct().mapIndexed { index, name -> XtreamCategory(name, name, index) }
            val channels = parsed.map { channel -> ManagedChannel(channel.id.toInt(), channel.name, channel.logoUrl, channel.epgId, channel.group.ifBlank { "Default" }) }
            ManagementCatalog(categories, channels, System.currentTimeMillis())
        } else {
            XtreamManager.initFromPrefs(context)
            val service = XtreamManager.getService() ?: error("Playlist is not ready")
            val categories = service.getLiveCategories(XtreamManager.username, XtreamManager.password).execute().body().orEmpty()
            val channels = service.getLiveStreams(XtreamManager.username, XtreamManager.password, null).execute().body().orEmpty().map { stream ->
                ManagedChannel(stream.streamId, stream.name, stream.streamIcon, stream.epgId, stream.categoryId)
            }
            ManagementCatalog(categories, channels, System.currentTimeMillis())
        }
    }

    private suspend fun applyManagementState(context: Context, payload: JSONObject) {
        val db = AppDatabase.getDatabase(context)
        val categories = payload.optJSONArray("categories") ?: JSONArray()
        val hiddenGroups = mutableListOf<HiddenGroup>()
        val groupOrder = mutableListOf<GroupOrder>()
        for (index in 0 until categories.length()) {
            val item = categories.optJSONObject(index) ?: continue
            val id = item.optString("id", "")
            if (id.isBlank()) continue
            if (item.optBoolean("hidden", false)) hiddenGroups.add(HiddenGroup(id, item.optString("name", id)))
            groupOrder.add(GroupOrder(id, item.optInt("position", index)))
        }
        db.groupDao().clearAll()
        if (hiddenGroups.isNotEmpty()) db.groupDao().hideGroups(hiddenGroups)
        db.groupOrderDao().clearAllOrder()
        if (groupOrder.isNotEmpty()) db.groupOrderDao().saveOrder(groupOrder)

        val favoritesJson = payload.optJSONArray("favorites") ?: JSONArray()
        val favorites = mutableListOf<Favorite>()
        for (index in 0 until favoritesJson.length()) {
            val item = favoritesJson.optJSONObject(index) ?: continue
            if (!item.has("streamId")) continue
            favorites.add(
                Favorite(
                    streamId = item.optInt("streamId"),
                    name = item.optString("name", ""),
                    streamIcon = if (item.has("streamIcon") && !item.isNull("streamIcon")) item.optString("streamIcon") else null,
                    epgId = if (item.has("epgId") && !item.isNull("epgId")) item.optString("epgId") else null,
                    categoryId = if (item.has("categoryId") && !item.isNull("categoryId")) item.optString("categoryId") else null
                )
            )
        }
        db.favoriteDao().clearAll()
        if (favorites.isNotEmpty()) db.favoriteDao().insertAll(favorites)
        context.getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE).edit().putBoolean("groups_changed", true).apply()
    }

    private fun encrypt(code: String, plaintext: String): JSONObject {
        val salt = ByteArray(16).also(SecureRandom()::nextBytes)
        val iv = ByteArray(12).also(SecureRandom()::nextBytes)
        val key = deriveKey(code, salt, PBKDF_ITERATIONS, "PBKDF2WithHmacSHA1")
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.ENCRYPT_MODE, key, GCMParameterSpec(128, iv))
        val ciphertext = cipher.doFinal(plaintext.toByteArray(Charsets.UTF_8))
        return JSONObject()
            .put("version", 1)
            .put("kdf", "PBKDF2WithHmacSHA1")
            .put("iterations", PBKDF_ITERATIONS)
            .put("salt", b64(salt))
            .put("iv", b64(iv))
            .put("ciphertext", b64(ciphertext))
    }

    private fun decrypt(code: String, envelope: JSONObject): String {
        require(envelope.optInt("version") == 1) { "Unsupported cloud backup version" }
        val iterations = envelope.getInt("iterations").coerceIn(100_000, 1_000_000)
        val kdf = envelope.optString("kdf", "PBKDF2WithHmacSHA1")
        val key = deriveKey(code, unb64(envelope.getString("salt")), iterations, kdf)
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.DECRYPT_MODE, key, GCMParameterSpec(128, unb64(envelope.getString("iv"))))
        return cipher.doFinal(unb64(envelope.getString("ciphertext"))).toString(Charsets.UTF_8)
    }

    private fun deriveKey(code: String, salt: ByteArray, iterations: Int, algorithm: String): SecretKeySpec {
        val factory = SecretKeyFactory.getInstance(algorithm)
        val key = factory.generateSecret(PBEKeySpec(code.toCharArray(), salt, iterations, 256)).encoded
        return SecretKeySpec(key, "AES")
    }

    private fun request(method: String, path: String, body: JSONObject? = null, token: String? = null): JSONObject {
        val connection = (URL(BASE_URL + path).openConnection() as HttpURLConnection).apply {
            requestMethod = method
            connectTimeout = 15_000
            readTimeout = 25_000
            setRequestProperty("Accept", "application/json")
            if (token != null) setRequestProperty("Authorization", "Bearer $token")
            if (body != null) {
                doOutput = true
                setRequestProperty("Content-Type", "application/json; charset=utf-8")
                outputStream.use { it.write(body.toString().toByteArray(Charsets.UTF_8)) }
            }
        }
        return try {
            val stream = if (connection.responseCode in 200..299) connection.inputStream else connection.errorStream
            val text = stream?.bufferedReader()?.use { it.readText() }.orEmpty()
            val json = if (text.isBlank()) JSONObject() else JSONObject(text)
            if (connection.responseCode !in 200..299) error(json.optString("error", "Cloud request failed (${connection.responseCode})"))
            json
        } finally {
            connection.disconnect()
        }
    }

    private fun prefs(context: Context) = context.getSharedPreferences(PREFS_NAME, Context.MODE_PRIVATE)

    private fun writeSecret(context: Context, key: String, value: String) {
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.ENCRYPT_MODE, credentialKey())
        prefs(context).edit().putString(key, b64(cipher.iv) + "." + b64(cipher.doFinal(value.toByteArray()))).apply()
    }

    private fun readSecret(context: Context, key: String): String? = runCatching {
        val parts = prefs(context).getString(key, null)?.split('.', limit = 2) ?: return null
        if (parts.size != 2) return null
        val cipher = Cipher.getInstance("AES/GCM/NoPadding")
        cipher.init(Cipher.DECRYPT_MODE, credentialKey(), GCMParameterSpec(128, unb64(parts[0])))
        cipher.doFinal(unb64(parts[1])).toString(Charsets.UTF_8)
    }.getOrNull()

    private fun credentialKey(): SecretKey {
        val store = KeyStore.getInstance("AndroidKeyStore").apply { load(null) }
        (store.getKey(KEY_ALIAS, null) as? SecretKey)?.let { return it }
        val generator = KeyGenerator.getInstance(KeyProperties.KEY_ALGORITHM_AES, "AndroidKeyStore")
        generator.init(
            KeyGenParameterSpec.Builder(KEY_ALIAS, KeyProperties.PURPOSE_ENCRYPT or KeyProperties.PURPOSE_DECRYPT)
                .setBlockModes(KeyProperties.BLOCK_MODE_GCM)
                .setEncryptionPaddings(KeyProperties.ENCRYPTION_PADDING_NONE)
                .build()
        )
        return generator.generateKey()
    }

    @Suppress("DEPRECATION")
    private fun appVersion(context: Context): String = context.packageManager.getPackageInfo(context.packageName, 0).versionName.orEmpty()
    private fun b64(bytes: ByteArray): String = Base64.encodeToString(bytes, Base64.NO_WRAP)
    private fun unb64(value: String): ByteArray = Base64.decode(value, Base64.NO_WRAP)
}
