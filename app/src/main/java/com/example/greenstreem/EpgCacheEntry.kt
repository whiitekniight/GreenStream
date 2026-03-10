package com.example.greenstreem

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "epg_cache")
data class EpgCacheEntry(
    @PrimaryKey val streamId: Int,
    val listingsJson: String,
    val updatedAtMs: Long
)
