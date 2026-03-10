package com.example.greenstreem

import java.io.Serializable

/**
 * Represents a Live TV Channel from an M3U playlist.
 */
data class Channel(
    val id: Long = 0,
    val name: String,
    val group: String,
    val logoUrl: String? = null,
    val streamUrl: String,
    val epgId: String? = null,
    val number: Int = 0,
    val hasCatchup: Boolean = false
) : Serializable
