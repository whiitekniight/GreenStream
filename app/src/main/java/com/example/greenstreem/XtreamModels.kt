package com.example.greenstreem

import com.google.gson.annotations.SerializedName

data class XtreamLoginResponse(
    @SerializedName("user_info") val userInfo: XtreamUserInfo?,
    @SerializedName("server_info") val serverInfo: XtreamServerInfo?
)

data class XtreamUserInfo(
    @SerializedName("username") val username: String,
    @SerializedName("status") val status: String,
    @SerializedName("exp_date") val expDate: String?,
    @SerializedName("active_cons") val activeCons: String?,
    @SerializedName("max_connections") val maxConnections: String?
)

data class XtreamServerInfo(
    @SerializedName("url") val url: String?,
    @SerializedName("port") val port: String?,
    @SerializedName("https_port") val httpsPort: String?,
    @SerializedName("server_protocol") val protocol: String?,
    @SerializedName("rtmp_port") val rtmpPort: String?
)

data class XtreamCategory(
    @SerializedName("category_id") val id: String,
    @SerializedName("category_name") val name: String,
    @SerializedName("parent_id") val parentId: Int
)

data class XtreamLiveStream(
    @SerializedName("num") val num: Int,
    @SerializedName("name") val name: String,
    @SerializedName("stream_type") val streamType: String,
    @SerializedName("stream_id") val streamId: Int,
    @SerializedName("stream_icon") val streamIcon: String?,
    @SerializedName("epg_channel_id") val epgId: String?,
    @SerializedName("category_id") val categoryId: String?,
    @SerializedName(value = "tv_archive", alternate = ["catchup", "has_archive"]) val tvArchive: String? = null,
    @SerializedName(value = "tv_archive_duration", alternate = ["archive_duration"]) val tvArchiveDuration: String? = null
)

data class XtreamVodStream(
    @SerializedName("num") val num: Int,
    @SerializedName("name") val name: String,
    @SerializedName("stream_id") val streamId: Int,
    @SerializedName("stream_icon") val streamIcon: String?,
    @SerializedName("category_id") val categoryId: String?,
    @SerializedName("container_extension") val containerExtension: String?
)

data class XtreamVodInfoResponse(
    @SerializedName("info") val info: XtreamVodDetailsInfo?,
    @SerializedName("movie_data") val movieData: XtreamVodMovieData?
)

data class XtreamVodDetailsInfo(
    @SerializedName("name") val name: String?,
    @SerializedName("plot") val plot: String?,
    @SerializedName("movie_image") val movieIcon: String?,
    @SerializedName("director") val director: String?,
    @SerializedName("genre") val genre: String?,
    @SerializedName("releasedate") val releaseDate: String?, // Changed from releaseDate to releasedate
    @SerializedName("rating") val rating: String?,
    @SerializedName("duration") val duration: String?
)

data class XtreamVodMovieData(
    @SerializedName("stream_id") val streamId: Int?,
    @SerializedName("container_extension") val extension: String?
)

data class XtreamSeries(
    @SerializedName("num") val num: Int,
    @SerializedName("name") val name: String,
    @SerializedName("series_id") val seriesId: Int,
    @SerializedName("cover") val cover: String?,
    @SerializedName("category_id") val categoryId: String?
)

data class XtreamSeriesInfoResponse(
    @SerializedName("seasons") val seasons: List<XtreamSeason>?,
    @SerializedName("episodes") val episodes: Map<String, List<XtreamEpisode>>?,
    @SerializedName("info") val info: XtreamSeriesDetailsInfo?
)

data class XtreamSeason(
    @SerializedName("air_date") val airDate: String?,
    @SerializedName("episode_count") val episodeCount: Int?,
    @SerializedName("id") val id: Int?,
    @SerializedName("name") val name: String?,
    @SerializedName("season_number") val seasonNumber: Int?
)

data class XtreamEpisode(
    @SerializedName("id") val id: String,
    @SerializedName("title") val title: String,
    @SerializedName("container_extension") val containerExtension: String?,
    @SerializedName("season") val season: Int?,
    @SerializedName("episode_num") val episodeNum: Int?
)

data class XtreamSeriesDetailsInfo(
    @SerializedName("name") val name: String?,
    @SerializedName("plot") val plot: String?,
    @SerializedName("cover") val cover: String?,
    @SerializedName("director") val director: String?,
    @SerializedName("genre") val genre: String?,
    @SerializedName("releaseDate") val releaseDate: String?,
    @SerializedName("rating") val rating: String?
)

data class XtreamEpgResponse(
    @SerializedName("epg_listings") val listings: List<XtreamEpgListing>?
)

data class XtreamEpgListing(
    @SerializedName("id") val id: String,
    @SerializedName("epg_id") val epgId: String,
    @SerializedName("title") val title: String,
    @SerializedName("description") val description: String,
    @SerializedName("start") val start: String,
    @SerializedName("end") val end: String,
    @SerializedName("start_timestamp") val startTimestamp: Long,
    @SerializedName("stop_timestamp") val stopTimestamp: Long
)
