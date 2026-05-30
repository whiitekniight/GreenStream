package com.example.greenstreem

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface EpgCacheDao {
    @Query("SELECT * FROM epg_cache")
    suspend fun getAll(): List<EpgCacheEntry>

    @Query("SELECT * FROM epg_cache WHERE streamId IN (:streamIds)")
    suspend fun getByStreamIds(streamIds: List<Int>): List<EpgCacheEntry>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(entry: EpgCacheEntry)

    @Query("DELETE FROM epg_cache WHERE updatedAtMs < :olderThanMs")
    suspend fun deleteOlderThan(olderThanMs: Long)

    @Query("DELETE FROM epg_cache WHERE streamId = :streamId")
    suspend fun deleteByStreamId(streamId: Int)

    @Query("DELETE FROM epg_cache")
    suspend fun clearAll()
}
