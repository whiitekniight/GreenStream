package com.example.greenstreem

import com.google.gson.JsonObject
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query

interface XtreamService {

    @GET("player_api.php")
    fun login(
        @Query("username") user: String,
        @Query("password") pass: String
    ): Call<XtreamLoginResponse>

    @GET("player_api.php?action=get_live_categories")
    fun getLiveCategories(
        @Query("username") user: String,
        @Query("password") pass: String
    ): Call<List<XtreamCategory>>

    @GET("player_api.php?action=get_live_streams")
    fun getLiveStreams(
        @Query("username") user: String,
        @Query("password") pass: String,
        @Query("category_id") categoryId: String? = null
    ): Call<List<XtreamLiveStream>>

    @GET("player_api.php?action=get_short_epg")
    fun getShortEpg(
        @Query("username") user: String,
        @Query("password") pass: String,
        @Query("stream_id") streamId: Int,
        @Query("limit") limit: Int = 10
    ): Call<XtreamEpgResponse>

    @GET("player_api.php?action=get_vod_categories")
    fun getVodCategories(
        @Query("username") user: String,
        @Query("password") pass: String
    ): Call<List<XtreamCategory>>

    @GET("player_api.php?action=get_vod_streams")
    fun getVodStreams(
        @Query("username") user: String,
        @Query("password") pass: String,
        @Query("category_id") categoryId: String? = null
    ): Call<List<XtreamVodStream>>

    @GET("player_api.php?action=get_vod_info")
    fun getVodInfo(
        @Query("username") user: String,
        @Query("password") pass: String,
        @Query("vod_id") streamId: Int
    ): Call<XtreamVodInfoResponse>

    @GET("player_api.php?action=get_series_categories")
    fun getSeriesCategories(
        @Query("username") user: String,
        @Query("password") pass: String
    ): Call<List<XtreamCategory>>

    @GET("player_api.php?action=get_series")
    fun getSeries(
        @Query("username") user: String,
        @Query("password") pass: String,
        @Query("category_id") categoryId: String? = null
    ): Call<List<XtreamSeries>>

    @GET("player_api.php?action=get_series_info")
    fun getSeriesInfo(
        @Query("username") user: String,
        @Query("password") pass: String,
        @Query("series_id") seriesId: Int
    ): Call<XtreamSeriesInfoResponse>

    @GET("player_api.php?action=get_series_info")
    fun getSeriesInfoRaw(
        @Query("username") user: String,
        @Query("password") pass: String,
        @Query("series_id") seriesId: Int
    ): Call<JsonObject>
}
