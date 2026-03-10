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
        EpgCacheEntry::class
    ],
    version = 6,
    exportSchema = false
)
abstract class AppDatabase : RoomDatabase() {
    abstract fun favoriteDao(): FavoriteDao
    abstract fun groupDao(): GroupDao
    abstract fun channelOrderDao(): ChannelOrderDao
    abstract fun groupOrderDao(): GroupOrderDao
    abstract fun hiddenChannelDao(): HiddenChannelDao
    abstract fun epgCacheDao(): EpgCacheDao

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
                .addMigrations(MIGRATION_5_6)
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
    }
}
