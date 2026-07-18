package com.example.greenstreem

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface EpgChannelMappingDao {
    @Query("SELECT * FROM epg_channel_mappings ORDER BY channelId")
    suspend fun getAll(): List<EpgChannelMapping>

    @Query("SELECT * FROM epg_channel_mappings WHERE channelId = :channelId LIMIT 1")
    suspend fun getMapping(channelId: Long): EpgChannelMapping?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun upsert(mapping: EpgChannelMapping)

    @Delete
    suspend fun delete(mapping: EpgChannelMapping)

    @Query("DELETE FROM epg_channel_mappings WHERE channelId = :channelId")
    suspend fun deleteForChannel(channelId: Long)

    @Query("DELETE FROM epg_channel_mappings")
    suspend fun clearAll()
}
