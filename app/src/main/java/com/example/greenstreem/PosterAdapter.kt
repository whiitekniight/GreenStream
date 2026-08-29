package com.example.greenstreem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import android.text.TextUtils
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.load.DecodeFormat
import com.bumptech.glide.load.engine.DiskCacheStrategy
import com.bumptech.glide.request.RequestOptions

class PosterAdapter(
    private val onClick: (Any, Int) -> Unit,
    private val onFocus: (Any, Int) -> Unit,
    private val onLongClick: (Any) -> Unit,
    private val onResolveMoviePoster: (XtreamVodStream) -> Unit = {}
) : RecyclerView.Adapter<PosterAdapter.VH>() {

    private var items: List<Any> = emptyList()
    private val moviePosterOverrides = mutableMapOf<Int, String>()
    private val requestedMoviePosterIds = mutableSetOf<Int>()

    private val posterOptions = RequestOptions()
        .format(DecodeFormat.PREFER_ARGB_8888)
        .diskCacheStrategy(DiskCacheStrategy.ALL)
        .override(320, 480)
        .centerCrop()
        .dontAnimate()

    class VH(v: View) : RecyclerView.ViewHolder(v) {
        val ivPoster: ImageView = v.findViewById(R.id.ivPoster)
        val tvTitle: TextView = v.findViewById(R.id.tvPosterTitle)
    }

    fun submitList(newItems: List<Any>) {
        items = newItems
        requestedMoviePosterIds.retainAll(
            newItems.filterIsInstance<XtreamVodStream>()
                .map { it.streamId }
                .toSet()
        )
        notifyDataSetChanged()
    }

    fun getItemAt(position: Int): Any? = items.getOrNull(position)

    fun updateVodPoster(streamId: Int, imageUrl: String?) {
        val cleanUrl = imageUrl?.takeIf { it.isNotBlank() } ?: return
        moviePosterOverrides[streamId] = cleanUrl
        val index = items.indexOfFirst { it is XtreamVodStream && it.streamId == streamId }
        if (index >= 0) notifyItemChanged(index)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_poster, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        val item = items[position]
        
        val title: String
        val imageUrl: String?
        
        when (item) {
            is XtreamVodStream -> {
                title = item.name
                imageUrl = item.streamIcon?.takeIf { it.isNotBlank() }
                    ?: moviePosterOverrides[item.streamId]
                if (imageUrl.isNullOrBlank() && requestedMoviePosterIds.add(item.streamId)) {
                    onResolveMoviePoster(item)
                }
            }
            is XtreamSeries -> {
                title = item.name
                imageUrl = item.cover
            }
            else -> {
                title = "Unknown"
                imageUrl = null
            }
        }

        holder.tvTitle.apply {
            text = title
            isSingleLine = true
            ellipsize = TextUtils.TruncateAt.MARQUEE
            marqueeRepeatLimit = -1
            setHorizontallyScrolling(true)
            isSelected = holder.itemView.hasFocus()
        }
        Glide.with(holder.itemView.context)
            .load(imageUrl)
            .placeholder(android.R.drawable.ic_menu_report_image)
            .apply(posterOptions)
            .into(holder.ivPoster)

        holder.itemView.isFocusable = true
        holder.itemView.isLongClickable = true
        holder.itemView.setBackgroundResource(R.drawable.selector_poster_bg)
        
        holder.itemView.setOnClickListener {
            val pos = holder.bindingAdapterPosition
            if (pos != RecyclerView.NO_POSITION) {
                getItemAt(pos)?.let { currentItem -> onClick(currentItem, pos) }
            }
        }
        holder.itemView.setOnLongClickListener {
            val pos = holder.bindingAdapterPosition
            if (pos != RecyclerView.NO_POSITION) {
                getItemAt(pos)?.let(onLongClick)
                true
            } else {
                false
            }
        }
        holder.itemView.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                holder.tvTitle.isSelected = true
                holder.itemView.alpha = 1f
                holder.itemView.animate()
                    .scaleX(1.08f)
                    .scaleY(1.08f)
                    .translationZ(12f)
                    .setDuration(120)
                    .start()
                val pos = holder.bindingAdapterPosition
                if (pos != RecyclerView.NO_POSITION) {
                    getItemAt(pos)?.let { currentItem -> onFocus(currentItem, pos) }
                }
            } else {
                holder.tvTitle.isSelected = false
                holder.itemView.alpha = 0.92f
                holder.itemView.animate()
                    .scaleX(1.0f)
                    .scaleY(1.0f)
                    .translationZ(0f)
                    .setDuration(120)
                    .start()
            }
        }
    }

    override fun onViewRecycled(holder: VH) {
        Glide.with(holder.itemView).clear(holder.ivPoster)
        holder.ivPoster.setImageDrawable(null)
        holder.tvTitle.text = ""
        holder.tvTitle.isSelected = false
        super.onViewRecycled(holder)
    }

    override fun getItemCount() = items.size
}
