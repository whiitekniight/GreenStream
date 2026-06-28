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
    @SerializedName(value = "category_id", alternate = ["id", "cat_id", "group_id"]) val id: String,
    @SerializedName(value = "category_name", alternate = ["name", "title", "group", "group_title"]) val name: String,
    @SerializedName(value = "parent_id", alternate = ["parent", "parentid"]) val parentId: Int = 0
)

data class XtreamLiveStream(
    @SerializedName("num") val num: Int,
    @SerializedName("name") val name: String,
    @SerializedName("stream_type") val streamType: String,
    @SerializedName("stream_id") val streamId: Int,
    @SerializedName("stream_icon") val streamIcon: String?,
    @SerializedName("epg_channel_id") val epgId: String?,
    @SerializedName(value = "category_id", alternate = ["category", "categoryId", "cat_id", "group_id", "category_name", "group"]) val categoryId: String?,
    @SerializedName(value = "tv_archive", alternate = ["catchup", "has_archive"]) val tvArchive: String? = null,
    @SerializedName(value = "tv_archive_duration", alternate = ["archive_duration"]) val tvArchiveDuration: String? = null
)

data class XtreamVodStream(
    @SerializedName("num") val num: Int,
    @SerializedName("name") val name: String,
    @SerializedName("stream_id") val streamId: Int,
    @SerializedName("stream_icon") val streamIcon: String?,
    @SerializedName(value = "category_id", alternate = ["category", "categoryId", "cat_id", "group_id", "category_name", "group"]) val categoryId: String?,
    @SerializedName("container_extension") val containerExtension: String?,
    val directUrl: String? = null
)

data class XtreamVodInfoResponse(
    @SerializedName("info") val info: XtreamVodDetailsInfo?,
    @SerializedName("movie_data") val movieData: XtreamVodMovieData?
)

data class XtreamVodDetailsInfo(
    @SerializedName("name") val name: String?,
    @SerializedName("plot") val plot: String?,
    @SerializedName("movie_image") val movieIcon: String?,
    @SerializedName(value = "backdrop_path", alternate = ["backdrop", "background", "cover_big"]) val backdropPath: Any?,
    @SerializedName("director") val director: String?,
    @SerializedName(value = "cast", alternate = ["actors"]) val cast: String?,
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
    @SerializedName(value = "category_id", alternate = ["category", "categoryId", "cat_id", "group_id", "category_name", "group"]) val categoryId: String?
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
    @SerializedName("episode_num") val episodeNum: Int?,
    val directUrl: String? = null
)

data class XtreamSeriesDetailsInfo(
    @SerializedName("name") val name: String?,
    @SerializedName("plot") val plot: String?,
    @SerializedName("cover") val cover: String?,
    @SerializedName(value = "backdrop_path", alternate = ["backdrop", "background", "cover_big"]) val backdropPath: Any?,
    @SerializedName("director") val director: String?,
    @SerializedName(value = "cast", alternate = ["actors"]) val cast: String?,
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
