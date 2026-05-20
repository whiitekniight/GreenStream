package com.example.greenstreem

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query

@Dao
interface XmltvDao {
    @Query("SELECT channelKey FROM xmltv_aliases WHERE aliasKey IN (:aliasKeys)")
    suspend fun getChannelKeysForAliases(aliasKeys: List<String>): List<String>

    @Query("SELECT channelKey FROM xmltv_aliases WHERE aliasKey = :aliasKey LIMIT 1")
    suspend fun getChannelKeyForAlias(aliasKey: String): String?

    @Query(
        """
        SELECT * FROM xmltv_programs
        WHERE channelKey IN (:channelKeys)
          AND stopTimestamp > :windowStart
          AND startTimestamp < :windowEnd
        ORDER BY startTimestamp
        """
    )
    suspend fun getProgramsForChannels(
        channelKeys: List<String>,
        windowStart: Long,
        windowEnd: Long
    ): List<XmltvProgramEntity>

    @Query("SELECT COUNT(*) FROM xmltv_programs")
    suspend fun countPrograms(): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAliases(aliases: List<XmltvAliasEntity>)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertPrograms(programs: List<XmltvProgramEntity>)

    @Query("DELETE FROM xmltv_aliases")
    suspend fun clearAliases()

    @Query("DELETE FROM xmltv_programs")
    suspend fun clearPrograms()
}
