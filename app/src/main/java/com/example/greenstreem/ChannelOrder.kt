package com.example.greenstreem

import androidx.room.Entity
@Entity(
    tableName = "channel_order",
    primaryKeys = ["channelId", "groupId"]
)
data class ChannelOrder(
    val channelId: Long,
    val groupId: String,
    val position: Int
)
