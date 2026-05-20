package com.example.greenstreem

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import androidx.room.migration.Migration
import androidx.sqlite.db.SupportSQLiteDatabase

@Database(
    entities = [
        Favorite::class,
        HiddenGroup::class,
        ChannelOrder::class,
        GroupOrder::class,
        HiddenChannel::class,
        EpgCacheEntry::class,
        EpgChannelMapping::class,
        XmltvAliasEntity::class,
        XmltvProgramEntity::class
    ],
    version = 8,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favoriteDao(): FavoriteDao
    abstract fun groupDao(): GroupDao
    abstract fun channelOrderDao(): ChannelOrderDao
    abstract fun groupOrderDao(): GroupOrderDao
    abstract fun hiddenChannelDao(): HiddenChannelDao
    abstract fun epgCacheDao(): EpgCacheDao
    abstract fun epgChannelMappingDao(): EpgChannelMappingDao
    abstract fun xmltvDao(): XmltvDao

    companion object {
        @Volatile
        private var INSTANCE: AppDatabase? = null

        fun getDatabase(context: Context): AppDatabase {
            return INSTANCE ?: synchronized(this) {
                val instance = Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "iptv_database"
                )
                .addMigrations(MIGRATION_5_6, MIGRATION_6_7, MIGRATION_7_8)
                .fallbackToDestructiveMigration()
                .build()
                INSTANCE = instance
                instance
            }
        }

        private val MIGRATION_5_6 = object : Migration(5, 6) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL(
                    """
                    CREATE TABLE IF NOT EXISTS epg_cache (
                        streamId INTEGER NOT NULL,
                        listingsJson TEXT NOT NULL,
                        updatedAtMs INTEGER NOT NULL,
                        PRIMARY KEY(streamId)
                    )
                    """.trimIndent()
                )
            }
        }

        private val MIGRATION_6_7 = object : Migration(6, 7) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL(
                    """
                    CREATE TABLE IF NOT EXISTS epg_channel_mappings (
                        channelId INTEGER NOT NULL,
                        provider TEXT NOT NULL,
                        epgChannelId TEXT NOT NULL,
                        displayName TEXT NOT NULL,
                        PRIMARY KEY(channelId)
                    )
                    """.trimIndent()
                )
            }
        }

        private val MIGRATION_7_8 = object : Migration(7, 8) {
            override fun migrate(db: SupportSQLiteDatabase) {
                db.execSQL(
                    """
                    CREATE TABLE IF NOT EXISTS xmltv_aliases (
                        aliasKey TEXT NOT NULL,
                        channelKey TEXT NOT NULL,
                        PRIMARY KEY(aliasKey)
                    )
                    """.trimIndent()
                )
                db.execSQL(
                    """
                    CREATE TABLE IF NOT EXISTS xmltv_programs (
                        id TEXT NOT NULL,
                        channelKey TEXT NOT NULL,
                        epgId TEXT NOT NULL,
                        title TEXT NOT NULL,
                        description TEXT NOT NULL,
                        startTimestamp INTEGER NOT NULL,
                        stopTimestamp INTEGER NOT NULL,
                        PRIMARY KEY(id)
                    )
                    """.trimIndent()
                )
                db.execSQL("CREATE INDEX IF NOT EXISTS index_xmltv_programs_channelKey_startTimestamp ON xmltv_programs(channelKey, startTimestamp)")
                db.execSQL("CREATE INDEX IF NOT EXISTS index_xmltv_programs_channelKey_stopTimestamp ON xmltv_programs(channelKey, stopTimestamp)")
            }
        }
    }
}
