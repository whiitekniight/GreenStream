package com.example.greenstreem

import android.graphics.Color
import android.graphics.drawable.GradientDrawable
import android.text.TextUtils
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
    private val onProgramClick: (Channel, XtreamEpgListing?) -> Unit,
    private val onProgramLongClick: (Channel) -> Unit,
    private val onVisibilityToggleClick: (Channel) -> Unit
) : RecyclerView.Adapter<EpgRowAdapter.VH>() {

    private var channels: List<Channel> = emptyList()
    private val channelPrograms = mutableMapOf<Int, List<XtreamEpgListing>>()
    private val deferredFocusedRowUpdates = mutableSetOf<Int>()
    private var currentPlayingChannelId: Long? = null
    private var visibilityEditMode = false
    private var hiddenChannelIds: Set<Long> = emptySet()
    var suppressPlayingIndicatorUpdatesUntilMs: Long = 0L

    var focusedRowPosition: Int = RecyclerView.NO_POSITION
        set(value) {
            val normalized = if (value in channels.indices) value else RecyclerView.NO_POSITION
            if (field == normalized) {
                notifyRowFocusChanged(normalized)
                return
            }
            val previous = field
            field = normalized
            notifyRowFocusChanged(previous)
            notifyRowFocusChanged(normalized)
            if (previous != RecyclerView.NO_POSITION &&
                previous != normalized &&
                deferredFocusedRowUpdates.remove(previous)
            ) {
                notifyItemChanged(previous, "EPG_UPDATE")
            }
        }

    class VH(v: View) : RecyclerView.ViewHolder(v) {
        val ivLogo: ImageView = v.findViewById(R.id.ivChannelLogo)
        val ivNowPlayingIndicator: ImageView = v.findViewById(R.id.ivNowPlayingIndicator)
        val ivCatchupIndicator: ImageView = v.findViewById(R.id.ivCatchupIndicator)
        val ivVisibilityEye: ImageView = v.findViewById(R.id.ivVisibilityEye)
        val tvName: TextView = v.findViewById(R.id.tvChannelName)
        val channelInfo: View = v.findViewById(R.id.channelInfoContainer)
        val hsv: HorizontalScrollView = v.findViewById(R.id.hsvRow)
        val container: LinearLayout = v.findViewById(R.id.programsContainer)
        var boundChannelId: Long? = null
    }

    fun setData(newChannels: List<Channel>) {
        channelPrograms.clear()
        deferredFocusedRowUpdates.clear()
        this.channels = newChannels
        focusedRowPosition = RecyclerView.NO_POSITION
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
        if (System.currentTimeMillis() < suppressPlayingIndicatorUpdatesUntilMs) return
        if (oldPos != -1) notifyItemChanged(oldPos, "PLAYING_CHANGED")
        if (newPos != -1) notifyItemChanged(newPos, "PLAYING_CHANGED")
    }

    fun refreshPlayingIndicatorRows(vararg channelIds: Long?) {
        channelIds.filterNotNull().distinct().forEach { id ->
            val pos = channels.indexOfFirst { it.id == id }
            if (pos != -1) notifyItemChanged(pos, "PLAYING_CHANGED")
        }
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
        val shouldForceFocusedRefresh = existing.isNullOrEmpty() && listings.isNotEmpty()

        channelPrograms[streamId] = listings
        val pos = channels.indexOfFirst { it.id.toInt() == streamId }
        if (pos != -1) {
            if (pos == focusedRowPosition && !shouldForceFocusedRefresh) {
                deferredFocusedRowUpdates.add(pos)
            } else if (shouldForceFocusedRefresh) {
                deferredFocusedRowUpdates.remove(pos)
                notifyItemChanged(pos)
            } else {
                notifyItemChanged(pos, "EPG_UPDATE")
            }
        }
    }

    fun clearEpgData() {
        if (channelPrograms.isEmpty()) return
        channelPrograms.clear()
        deferredFocusedRowUpdates.clear()
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): VH {
        val v = LayoutInflater.from(parent.context).inflate(R.layout.item_epg_row, parent, false)
        return VH(v)
    }

    override fun onBindViewHolder(holder: VH, position: Int) {
        bindInternal(holder, position, false)
    }

    override fun onBindViewHolder(holder: VH, position: Int, payloads: MutableList<Any>) {
        if (payloads.contains("EPG_UPDATE")) {
            updateProgramBlocks(holder, position, true)
        } else if (payloads.contains("PLAYING_CHANGED")) {
            updatePlayingIndicator(holder, position)
        } else if (payloads.contains("ROW_FOCUS_CHANGED")) {
            val channel = channels.getOrNull(position)
            if (channel == null || holder.boundChannelId != channel.id) {
                bindInternal(holder, position, false)
            } else {
                updateChannelFocusStyle(holder, position)
            }
        } else if (payloads.contains("VISIBILITY_CHANGED")) {
            channels.getOrNull(position)?.let { updateVisibilityIndicator(holder, it) }
        } else {
            bindInternal(holder, position, false)
        }
    }

    private fun bindInternal(holder: VH, position: Int, isEpgUpdateOnly: Boolean) {
        val channel = channels[position]
        if (isEpgUpdateOnly && holder.boundChannelId != channel.id) {
            bindInternal(holder, position, false)
            return
        }
        if (!isEpgUpdateOnly) {
            holder.boundChannelId = channel.id
            holder.tvName.text = ChannelNameFormatter.format(holder.itemView.context, channel.name)
            updatePlayingIndicator(holder, position)
            updateCatchupIndicator(holder, channel)
            updateVisibilityIndicator(holder, channel)
            updateLogoAppearance(holder)

            Glide.with(holder.itemView.context)
                .load(channel.logoUrl)
                .placeholder(android.R.drawable.ic_menu_report_image)
                .into(holder.ivLogo)

            sync.register(holder.hsv)
            holder.hsv.post { holder.hsv.scrollTo(sync.getCurrentX(), 0) }

            holder.hsv.setOnScrollChangeListener { _, scrollX, _, _, _ ->
                sync.notifyRowScrolled(holder.hsv, scrollX)
            }
            val showOptions = View.OnLongClickListener {
                if (!visibilityEditMode) onProgramLongClick(channel)
                true
            }
            holder.itemView.setOnLongClickListener(showOptions)
            holder.channelInfo.setOnLongClickListener(showOptions)
            holder.tvName.setOnLongClickListener(showOptions)
            holder.ivLogo.setOnLongClickListener(showOptions)
        }
        updateProgramBlocks(holder, position, isEpgUpdateOnly)
        updateChannelFocusStyle(holder, position)
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

    private fun updateLogoAppearance(holder: VH) {
        val prefs = holder.itemView.context.getSharedPreferences("iptv_prefs", android.content.Context.MODE_PRIVATE)
        val showLogos = prefs.getBoolean("appearance_show_logos", true)
        holder.ivLogo.visibility = if (showLogos) View.VISIBLE else View.GONE
        if (!showLogos) return

        val sizeDp = when (prefs.getInt("appearance_logo_size", 1).coerceIn(0, 2)) {
            0 -> 20
            2 -> 32
            else -> 26
        }
        val sizePx = holder.itemView.context.dp(sizeDp)
        holder.ivLogo.layoutParams = holder.ivLogo.layoutParams.apply {
            width = sizePx
            height = sizePx
        }
    }

    private fun updatePlayingIndicator(holder: VH, position: Int) {
        val channel = channels[position]
        holder.ivNowPlayingIndicator.visibility =
            if (channel.id == currentPlayingChannelId) View.VISIBLE else View.GONE
    }

    private fun updateCatchupIndicator(holder: VH, channel: Channel) {
        holder.ivCatchupIndicator.visibility = if (channel.hasCatchup) View.VISIBLE else View.GONE
    }

    private fun updateChannelFocusStyle(holder: VH, position: Int) {
        val channel = channels.getOrNull(position)
        val focused = channel != null && holder.boundChannelId == channel.id && position == focusedRowPosition
        applyChannelFocusStyle(holder, focused)
    }

    private fun applyChannelFocusStyle(holder: VH, focused: Boolean) {
        val accent = AppearanceTheme.accentColor(holder.itemView.context)
        holder.tvName.setTextColor(if (focused) accent else Color.WHITE)
        holder.tvName.ellipsize = if (focused) TextUtils.TruncateAt.MARQUEE else TextUtils.TruncateAt.END
        holder.tvName.marqueeRepeatLimit = if (focused) -1 else 0
        holder.tvName.isSingleLine = true
        holder.tvName.isSelected = focused
        holder.itemView.isSelected = focused

        val pad = if (focused) holder.itemView.context.dp(2) else 0
        holder.ivLogo.setPadding(pad, pad, pad, pad)
        holder.ivLogo.background = if (focused) {
            GradientDrawable().apply {
                shape = GradientDrawable.RECTANGLE
                cornerRadius = holder.itemView.context.dp(4).toFloat()
                setColor(Color.TRANSPARENT)
                setStroke(holder.itemView.context.dp(2), accent)
            }
        } else {
            null
        }
    }

    private fun updateProgramBlocks(holder: VH, position: Int, isEpgUpdateOnly: Boolean) {
        val channel = channels[position]
        val programs = channelPrograms[channel.id.toInt()] ?: emptyList()

        if (isEpgUpdateOnly) {
            val focused = holder.itemView.rootView.findFocus()
            if (focused != null && isDescendantOf(holder.itemView, focused)) {
                return
            }
        }

        holder.container.removeAllViews()
        val inflater = LayoutInflater.from(holder.itemView.context)

        val displayPrograms = programsForDisplay(programs)

        if (displayPrograms.isEmpty()) {
            addProgramBlock(inflater, holder.container, "No Information", 180, channel, null)
        } else {
            displayPrograms.forEach { prog ->
                val durationMin = ((prog.stopTimestamp - prog.startTimestamp) / 60).toInt()
                addProgramBlock(inflater, holder.container, DataUtils.decodeBase64(prog.title), durationMin, channel, prog)
            }
        }
    }

    private fun programsForDisplay(programs: List<XtreamEpgListing>): List<XtreamEpgListing> {
        if (programs.isEmpty()) return emptyList()
        val now = System.currentTimeMillis() / 1000L
        val startWindow = now - 30 * 60L
        val endWindow = now + 8 * 60 * 60L
        val visible = programs.filter { it.stopTimestamp > startWindow && it.startTimestamp < endWindow }
        return (visible.ifEmpty { programs.take(12) }).take(24)
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
        view.background = AppearanceTheme.epgProgramBackground(view.context)
        val tvTitle = view.findViewById<TextView>(R.id.tvProgramTitle)
        tvTitle.text = title

        val width = (durationMin * pxPerMinute).coerceAtLeast(200)
        view.layoutParams = LinearLayout.LayoutParams(width, ViewGroup.LayoutParams.MATCH_PARENT)
        view.isLongClickable = true
        
        view.setOnClickListener {
            if (visibilityEditMode) onVisibilityToggleClick(channel) else onProgramClick(channel, listing)
        }
        
        // ADDED: Handle Long Click for Favorites
        view.setOnLongClickListener {
            if (!visibilityEditMode) onProgramLongClick(channel)
            true 
        }

        view.setOnFocusChangeListener { _, hasFocus ->
            if (hasFocus) {
                view.animate().scaleX(1.0f).scaleY(1.04f).setDuration(120).start()
                view.elevation = 6f
                val rv = container.parent?.parent?.parent as? RecyclerView
                val rowView = container.parent?.parent as? View
                if (rv != null && rowView != null) {
                    val pos = rv.getChildAdapterPosition(rowView)
                    if (pos != RecyclerView.NO_POSITION) {
                        focusedRowPosition = pos
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
        holder.boundChannelId = null
        holder.itemView.animate().cancel()
        holder.itemView.scaleX = 1f
        holder.itemView.scaleY = 1f
        holder.itemView.elevation = 0f
        applyChannelFocusStyle(holder, false)
        holder.container.removeAllViews()
        Glide.with(holder.itemView.context).clear(holder.ivLogo)
    }

    override fun getItemCount() = channels.size

    private fun notifyRowFocusChanged(position: Int) {
        if (position in channels.indices) notifyItemChanged(position, "ROW_FOCUS_CHANGED")
    }

    private fun android.content.Context.dp(value: Int): Int =
        (value * resources.displayMetrics.density).toInt()
}
