package com.example.greenstreem

import androidx.room.Entity
import androidx.room.Index
import androidx.room.PrimaryKey

@Entity(
    tableName = "xmltv_programs",
    indices = [
        Index(value = ["channelKey", "startTimestamp"]),
        Index(value = ["channelKey", "stopTimestamp"])
    ]
)
data class XmltvProgramEntity(
    @PrimaryKey val id: String,
    val channelKey: String,
    val epgId: String,
    val title: String,
    val description: String,
    val startTimestamp: Long,
    val stopTimestamp: Long
)
