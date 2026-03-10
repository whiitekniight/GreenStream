package com.example.greenstreem

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.HorizontalScrollView
import android.widget.ImageView
import android.widget.LinearLayout
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide

class EpgRowAdapter(
    private val pxPerMinute: Int,
    private val sync: ScrollSync,
    private val onProgramFocus: (Channel, XtreamEpgListing?) -> Unit,
    private val onProgramClick: (Channel) -> Unit,
    private val onProgramLongClick: (Channel) -> Unit,
    private val onVisibilityToggleClick: (Channel) -> Unit
) : RecyclerView.Adapter<EpgRowAdapter.VH>() {

    private var channels: List<Channel> = emptyList()
    private val channelPrograms = mutableMapOf<Int, List<XtreamEpgListing>>()
    private val deferredFocusedRowUpdates = mutableSetOf<Int>()
    private var currentPlayingChannelId: Long? = null
    private var visibilityEditMode = false
    private var hiddenChannelIds: Set<Long> = emptySet()

    var focusedRowPosition: Int = RecyclerView.NO_POSITION

    init {
        setHasStableIds(true)
    }

    class VH(v: View) : RecyclerView.ViewHolder(v) {
        val ivLogo: ImageView = v.findViewById(R.id.ivChannelLogo)
        val ivNowPlayingIndicator: ImageView = v.findViewById(R.id.ivNowPlayingIndicator)
        val ivCatchupIndicator: ImageView = v.findViewById(R.id.ivCatchupIndicator)
        val ivVisibilityEye: ImageView = v.findViewById(R.id.ivVisibilityEye)
        val tvName: TextView = v.findViewById(R.id.tvChannelName)
        val hsv: HorizontalScrollView = v.findViewById(R.id.hsvRow)
        val container: LinearLayout = v.findViewById(R.id.programsContainer)
    }

    fun setData(newChannels: List<Channel>) {
        if (this.channels == newChannels) return
        channelPrograms.clear()
        deferredFocusedRowUpdates.clear()
        this.channels = newChannels
        notifyDataSetChanged()
    }

    fun getChannelAt(position: Int): Channel? = channels.getOrNull(position)

    fun getPositionForChannelId(channelId: Long): Int =
        channels.indexOfFirst { it.id == channelId }

    fun getNowPlayingIndex(channelId: Int): Int {
        val now = System.currentTimeMillis() / 1000
        val programs = channelPrograms[channelId] ?: return 0
        val idx = programs.indexOfFirst { it.startTimestamp <= now && now < it.stopTimestamp }
        return if (idx == -1) 0 else idx
    }

    fun setCurrentPlayingChannelId(channelId: Long?) {
        if (currentPlayingChannelId == channelId) return
        val oldPos = currentPlayingChannelId?.let { id -> channels.indexOfFirst { it.id == id } } ?: -1
        currentPlayingChannelId = channelId
        val newPos = channelId?.let { id -> channels.indexOfFirst { it.id == id } } ?: -1
        if (oldPos != -1) notifyItemChanged(oldPos, "PLAYING_CHANGED")
        if (newPos != -1) notifyItemChanged(newPos, "PLAYING_CHANGED")
    }

    fun setChannelVisibilityEditMode(enabled: Boolean) {
        if (visibilityEditMode == enabled) return
        visibilityEditMode = enabled
        notifyDataSetChanged()
    }

    fun setHiddenChannelIds(hiddenIds: Set<Long>) {
        val previous = hiddenChannelIds.toSet()
        hiddenChannelIds = hiddenIds.toSet()
        if (!visibilityEditMode) return

        if (previous.isEmpty() || hiddenIds.isEmpty()) {
            notifyDataSetChanged()
            return
        }

        val changedIds = (previous - hiddenIds) + (hiddenIds - previous)
        if (changedIds.isEmpty()) return
        changedIds.forEach { id ->
            val pos = channels.indexOfFirst { it.id == id }
            if (pos != -1) notifyItemChanged(pos, "VISIBILITY_CHANGED")
        }
    }

    fun setEpgData(streamId: Int, listings: List<XtreamEpgListing>) {
        val existing = channelPrograms[streamId]
        if (existing == listings) return
        
        channelPrograms[streamId] = listings
        val pos = channels.indexOfFirst { it.id.toInt() == streamId }
        if (pos != -1) {
            if (pos == focusedRowPosition) {
                deferredFocusedRowUpdates.add(pos)
            } else {
                notifyItemChanged(pos, "EPG_UPDATE")
            }
        }
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_epg_row, parent, false)
        return VH(v)
    }

    override fun getItemId(position: Int): Long {
        return channels.getOrNull(position)?.id ?: RecyclerView.NO_ID
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        bindInternal(holder, position, false)
    }

    override fun onBindViewHolder(holder: VH, position: Int, payloads: MutableList<Any>) {
        if (payloads.contains("EPG_UPDATE")) {
            updateProgramBlocks(holder, position, true)
        } else if (payloads.contains("PLAYING_CHANGED")) {
            updatePlayingIndicator(holder, position)
        } else if (payloads.contains("VISIBILITY_CHANGED")) {
            updateVisibilityIndicator(holder, channels[position])
        } else {
            bindInternal(holder, position, false)
        }
    }

    private fun bindInternal(holder: VH, position: Int, isEpgUpdateOnly: Boolean) {
        val channel = channels[position]
        if (!isEpgUpdateOnly) {
            holder.tvName.text = channel.name
            updatePlayingIndicator(holder, position)
            updateCatchupIndicator(holder, channel)
            updateVisibilityIndicator(holder, channel)

            Glide.with(holder.itemView.context)
                .load(channel.logoUrl)
                .placeholder(android.R.drawable.ic_menu_report_image)
                .into(holder.ivLogo)

            sync.register(holder.hsv)
            holder.hsv.post { holder.hsv.scrollTo(sync.getCurrentX(), 0) }

            holder.hsv.setOnScrollChangeListener { _, scrollX, _, _, _ ->
                sync.notifyRowScrolled(holder.hsv, scrollX)
            }
        }
        updateProgramBlocks(holder, position, isEpgUpdateOnly)
    }

    private fun updateVisibilityIndicator(holder: VH, channel: Channel) {
        if (!visibilityEditMode) {
            holder.ivVisibilityEye.visibility = View.GONE
            holder.tvName.alpha = 1f
            return
        }
        val hidden = channel.id in hiddenChannelIds
        holder.ivVisibilityEye.visibility = View.VISIBLE
        holder.ivVisibilityEye.setImageResource(
            if (hidden) R.drawable.ic_visibility_off_eye else R.drawable.ic_visibility_on_eye
        )
        holder.ivVisibilityEye.setOnClickListener { onVisibilityToggleClick(channel) }
        holder.tvName.alpha = if (hidden) 0.65f else 1f
    }

    private fun updatePlayingIndicator(holder: VH, position: Int) {
        val channel = channels[position]
        holder.ivNowPlayingIndicator.visibility =
            if (channel.id == currentPlayingChannelId) View.VISIBLE else View.GONE
    }

    private fun updateCatchupIndicator(holder: VH, channel: Channel) {
        holder.ivCatchupIndicator.visibility = if (channel.hasCatchup) View.VISIBLE else View.GONE
    }

    private fun updateProgramBlocks(holder: VH, position: Int, isEpgUpdateOnly: Boolean) {
        val channel = channels[position]
        val programs = channelPrograms[channel.id.toInt()] ?: emptyList()

        if (isEpgUpdateOnly) {
            val focused = holder.itemView.rootView.findFocus()
            if (focused != null && isDescendantOf(holder.itemView, focused)) {
                // Avoid rebuilding currently focused row while user navigates.
                return
            }
        }
        
        if (isEpgUpdateOnly && holder.container.childCount > 0 && programs.isNotEmpty()) {
            val firstChild = holder.container.getChildAt(0)
            val firstTitle = firstChild?.findViewById<TextView>(R.id.tvProgramTitle)?.text
            if (firstTitle != "No Information") {
                if (holder.container.childCount == programs.size) return
            }
        }

        holder.container.removeAllViews()
        val inflater = LayoutInflater.from(holder.itemView.context)

        if (programs.isEmpty()) {
            addProgramBlock(inflater, holder.container, "No Information", 180, channel, null)
        } else {
            programs.forEach { prog ->
                val durationMin = ((prog.stopTimestamp - prog.startTimestamp) / 60).toInt()
                addProgramBlock(inflater, holder.container, DataUtils.decodeBase64(prog.title), durationMin, channel, prog)
            }
        }

        // Focus is controlled by MainActivity to avoid row-level focus tug-of-war during async updates.
    }

    private fun isDescendantOf(parent: View, child: View): Boolean {
        var current: View? = child
        while (current != null) {
            if (current === parent) return true
            current = current.parent as? View
        }
        return false
    }

    private fun addProgramBlock(inflater: LayoutInflater, container: LinearLayout, title: String, durationMin: Int, channel: Channel, listing: XtreamEpgListing?) {
        val view = inflater.inflate(R.layout.item_epg_program, container, false)
        val tvTitle = view.findViewById<TextView>(R.id.tvProgramTitle)
        tvTitle.text = title

        val width = (durationMin * pxPerMinute).coerceAtLeast(200)
        view.layoutParams = LinearLayout.LayoutParams(width, ViewGroup.LayoutParams.MATCH_PARENT)
        view.isLongClickable = true
        
        view.setOnClickListener {
            if (visibilityEditMode) onVisibilityToggleClick(channel) else onProgramClick(channel)
        }
        
        // ADDED: Handle Long Click for Favorites
        view.setOnLongClickListener {
            if (!visibilityEditMode) onProgramLongClick(channel)
            true 
        }

        view.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                view.animate().scaleX(1.04f).scaleY(1.04f).setDuration(120).start()
                view.elevation = 6f
                val rv = container.parent?.parent?.parent as? RecyclerView
                val rowView = container.parent?.parent as? View
                if (rv != null && rowView != null) {
                    val pos = rv.getChildAdapterPosition(rowView)
                    if (pos != RecyclerView.NO_POSITION) {
                        val previous = focusedRowPosition
                        focusedRowPosition = pos
                        if (previous != RecyclerView.NO_POSITION && previous != focusedRowPosition &&
                            deferredFocusedRowUpdates.remove(previous)
                        ) {
                            notifyItemChanged(previous, "EPG_UPDATE")
                        }
                    }
                }
                onProgramFocus(channel, listing)
            } else {
                view.animate().scaleX(1.0f).scaleY(1.0f).setDuration(100).start()
                view.elevation = 0f
            }
        }
        container.addView(view)
    }

    override fun onViewRecycled(holder: VH) {
        super.onViewRecycled(holder)
        sync.unregister(holder.hsv)
    }

    override fun getItemCount() = channels.size
}
