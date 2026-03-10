package com.example.greenstreem

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class SeriesDetailsActivity : AppCompatActivity() {

    private lateinit var ivCover: ImageView
    private lateinit var tvName: TextView
    private lateinit var tvPlot: TextView
    private lateinit var rvSeasons: RecyclerView
    private lateinit var rvEpisodes: RecyclerView

    private var seriesId: Int = -1
    private var allEpisodes: Map<String, List<XtreamEpisode>> = emptyMap()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_series_details)

        ivCover = findViewById(R.id.ivSeriesCover)
        tvName = findViewById(R.id.tvSeriesName)
        tvPlot = findViewById(R.id.tvSeriesPlot)
        rvSeasons = findViewById(R.id.rvSeasons)
        rvEpisodes = findViewById(R.id.rvEpisodes)

        seriesId = intent.getIntExtra("series_id", -1)
        val name = intent.getStringExtra("series_name")
        val cover = intent.getStringExtra("series_cover")

        tvName.text = name
        Glide.with(this).load(cover).into(ivCover)

        rvSeasons.layoutManager = LinearLayoutManager(this, LinearLayoutManager.HORIZONTAL, false)
        rvEpisodes.layoutManager = LinearLayoutManager(this)

        fetchSeriesInfo()
    }

    private fun fetchSeriesInfo() {
        val service = XtreamManager.getService() ?: return
        service.getSeriesInfo(XtreamManager.username, XtreamManager.password, seriesId)
            .enqueue(object : Callback<XtreamSeriesInfoResponse> {
                override fun onResponse(call: Call<XtreamSeriesInfoResponse>, response: Response<XtreamSeriesInfoResponse>) {
                    if (response.isSuccessful) {
                        val data = response.body()
                        tvPlot.text = data?.info?.plot ?: "No description available"
                        allEpisodes = data?.episodes ?: emptyMap()
                        
                        val seasons = data?.seasons ?: emptyList()
                        rvSeasons.adapter = SeasonAdapter(seasons) { seasonNum ->
                            displayEpisodes(seasonNum.toString())
                        }
                        
                        if (seasons.isNotEmpty()) {
                            displayEpisodes(seasons[0].seasonNumber?.toString() ?: "1")
                        }
                    }
                }
                override fun onFailure(call: Call<XtreamSeriesInfoResponse>, t: Throwable) {}
            })
    }

    private fun displayEpisodes(seasonKey: String) {
        val episodes = allEpisodes[seasonKey] ?: emptyList()
        rvEpisodes.adapter = EpisodeAdapter(episodes) { episode ->
            val url = "${XtreamManager.baseUrl}/series/${XtreamManager.username}/${XtreamManager.password}/${episode.id}.${episode.containerExtension ?: "mp4"}"
            val resumeKey = "series_${seriesId}_s${seasonKey}_ep${episode.id}"
            val intent = Intent(this, MainActivity::class.java)
            intent.putExtra("play_url", url)
            intent.putExtra("media_title", episode.title)
            intent.putExtra("resume_key", resumeKey)
            intent.flags = Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_SINGLE_TOP
            startActivity(intent)
        }
    }

    private class SeasonAdapter(
        private val items: List<XtreamSeason>,
        private val onClick: (Int) -> Unit
    ) : RecyclerView.Adapter<SeasonAdapter.VH>() {
        class VH(v: View) : RecyclerView.ViewHolder(v) {
            val tv: TextView = v.findViewById(android.R.id.text1)
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
            val v = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
            return VH(v)
        }
        override fun onBindViewHolder(holder: VH, position: Int) {
            val s = items[position]
            holder.tv.text = "Season ${s.seasonNumber}"
            holder.tv.setTextColor(android.graphics.Color.WHITE)
            holder.itemView.isFocusable = true
            holder.itemView.setBackgroundResource(R.drawable.selector_button_bg)
            holder.itemView.setOnClickListener { onClick(s.seasonNumber ?: 1) }
        }
        override fun getItemCount() = items.size
    }

    private class EpisodeAdapter(
        private val items: List<XtreamEpisode>,
        private val onClick: (XtreamEpisode) -> Unit
    ) : RecyclerView.Adapter<EpisodeAdapter.VH>() {
        class VH(v: View) : RecyclerView.ViewHolder(v) {
            val tv: TextView = v.findViewById(android.R.id.text1)
        }
        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
            val v = LayoutInflater.from(parent.context).inflate(android.R.layout.simple_list_item_1, parent, false)
            return VH(v)
        }
        override fun onBindViewHolder(holder: VH, position: Int) {
            val e = items[position]
            holder.tv.text = "E${e.episodeNum}: ${e.title}"
            holder.tv.setTextColor(android.graphics.Color.WHITE)
            holder.itemView.isFocusable = true
            holder.itemView.setBackgroundResource(R.drawable.selector_button_bg)
            holder.itemView.setOnClickListener { onClick(e) }
        }
        override fun getItemCount() = items.size
    }
}
