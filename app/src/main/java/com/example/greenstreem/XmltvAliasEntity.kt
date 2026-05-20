package com.example.greenstreem

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "xmltv_aliases")
data class XmltvAliasEntity(
    @PrimaryKey val aliasKey: String,
    val channelKey: String
)
