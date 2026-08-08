package com.example.greenstreem

import android.content.Context
import android.os.Bundle
import android.view.KeyEvent
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.ItemTouchHelper
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.coroutines.flow.first
import kotlinx.coroutines.launch
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import java.util.Collections

class ManualChannelSortingActivity : AppCompatActivity() {

    private lateinit var db: AppDatabase
    private lateinit var rvChannels: RecyclerView
    private var liveCategories: List<XtreamCategory> = emptyList()
    private var selectedCategoryId: String? = null
    private var selectedCategoryName: String = "Select Group"
    private var channels: MutableList<Channel> = mutableListOf()
    private var adapter: ChannelSortAdapter? = null
    private var itemTouchHelper: ItemTouchHelper? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        if (!ProFeatureGate.require(this, "Manual channel sorting is available in GreenStreem Pro.")) return
        setContentView(R.layout.activity_manage_groups)

        db = AppDatabase.getDatabase(this)
        XtreamManager.initFromPrefs(this)

        val title = findViewById<TextView>(R.id.tvTitle)
        val btnPrimary = findViewById<Button>(R.id.btnHideAll)
        val btnSecondary = findViewById<Button>(R.id.btnUnhideAll)
        title.text = "Manual Channel Sorting"
        btnPrimary.text = "Change Group"
        btnSecondary.visibility = View.GONE

        rvChannels = findViewById(R.id.rvGroups)
        rvChannels.layoutManager = LinearLayoutManager(this)
        adapter = ChannelSortAdapter(channels) { saveOrder() }
        rvChannels.adapter = adapter
        attachTouchDragSupportIfNeeded()

        btnPrimary.setOnClickListener { showGroupPicker() }

        fetchGroupsAndOpenSavedGroup()
    }

    private fun fetchGroupsAndOpenSavedGroup() {
        val service = XtreamManager.getService() ?: return
        service.getLiveCategories(XtreamManager.username, XtreamManager.password)
            .enqueue(object : Callback<List<XtreamCategory>> {
                override fun onResponse(call: Call<List<XtreamCategory>>, response: Response<List<XtreamCategory>>) {
                    if (!response.isSuccessful) return
                    liveCategories = listOf(FAVORITES_CATEGORY) + response.body().orEmpty()
                    val saved = getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
                        .getString(KEY_MANUAL_SORT_GROUP_ID, null)
                    val initial = liveCategories.firstOrNull { it.id == saved } ?: liveCategories.firstOrNull()
                    if (initial != null) {
                        loadChannelsForGroup(initial)
                    }
                }

                override fun onFailure(call: Call<List<XtreamCategory>>, t: Throwable) {}
            })
    }

    private fun showGroupPicker() {
        if (liveCategories.isEmpty()) return
        val names = liveCategories.map { it.name }.toTypedArray()
        val selectedIndex = liveCategories.indexOfFirst { it.id == selectedCategoryId }.coerceAtLeast(0)
        AlertDialog.Builder(this)
            .setTitle("Choose Group")
            .setSingleChoiceItems(names, selectedIndex) { dialog, which ->
                loadChannelsForGroup(liveCategories[which])
                dialog.dismiss()
            }
            .show()
    }

    private fun loadChannelsForGroup(category: XtreamCategory) {
        selectedCategoryId = category.id
        selectedCategoryName = category.name
        findViewById<TextView>(R.id.tvTitle).text = "Sort Channels: ${category.name}"
        getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE)
            .edit()
            .putString(KEY_MANUAL_SORT_GROUP_ID, category.id)
            .apply()

        if (category.id == FAVORITES_CATEGORY.id) {
            lifecycleScope.launch {
                val favorites = db.favoriteDao().getAll().first()
                val mapped = favorites.map { favorite ->
                    Channel(
                        id = favorite.streamId.toLong(),
                        name = favorite.name,
                        group = FAVORITES_CATEGORY.id,
                        logoUrl = favorite.streamIcon,
                        streamUrl = "",
                        epgId = favorite.epgId
                    )
                }
                showChannelsInSavedOrder(category.id, mapped)
            }
            return
        }

        val service = XtreamManager.getService() ?: return

        service.getLiveStreams(XtreamManager.username, XtreamManager.password, category.id)
            .enqueue(object : Callback<List<XtreamLiveStream>> {
                override fun onResponse(call: Call<List<XtreamLiveStream>>, response: Response<List<XtreamLiveStream>>) {
                    if (!response.isSuccessful) return
                    lifecycleScope.launch {
                        val hidden = db.hiddenChannelDao().getAllHidden().first().map { it.channelId }.toSet()
                        val mapped = response.body().orEmpty()
                            .filter { it.streamId.toLong() !in hidden }
                            .map { stream ->
                                Channel(
                                    id = stream.streamId.toLong(),
                                    name = stream.name,
                                    group = category.id,
                                    logoUrl = stream.streamIcon,
                                    streamUrl = "",
                                    epgId = stream.epgId,
                                    number = stream.num
                                )
                            }
                        showChannelsInSavedOrder(category.id, mapped)
                    }
                }

                override fun onFailure(call: Call<List<XtreamLiveStream>>, t: Throwable) {}
            })
    }

    private suspend fun showChannelsInSavedOrder(groupId: String, mapped: List<Channel>) {
        val orderMap = db.channelOrderDao().getOrderForGroup(groupId).first()
            .associateBy({ it.channelId }, { it.position })
        val sorted = mapped.sortedWith(
            compareBy<Channel> { orderMap[it.id] ?: Int.MAX_VALUE }
                .thenBy { it.number ?: Int.MAX_VALUE }
                .thenBy { it.name.lowercase() }
        )
        channels.clear()
        channels.addAll(sorted)
        adapter?.notifyDataSetChanged()
    }

    private fun saveOrder() {
        val groupId = selectedCategoryId ?: return
        lifecycleScope.launch {
            db.channelOrderDao().clearGroupOrder(groupId)
            val orders = channels.mapIndexed { index, channel ->
                ChannelOrder(channel.id, groupId, index)
            }
            db.channelOrderDao().saveOrder(orders)
        }
    }

    private fun attachTouchDragSupportIfNeeded() {
        if (itemTouchHelper != null) return
        val helper = ItemTouchHelper(object : ItemTouchHelper.SimpleCallback(
            ItemTouchHelper.UP or ItemTouchHelper.DOWN,
            0
        ) {
            override fun onMove(
                recyclerView: RecyclerView,
                viewHolder: RecyclerView.ViewHolder,
                target: RecyclerView.ViewHolder
            ): Boolean {
                val from = viewHolder.bindingAdapterPosition
                val to = target.bindingAdapterPosition
                val a = adapter ?: return false
                if (from == RecyclerView.NO_POSITION || to == RecyclerView.NO_POSITION) return false
                return a.onItemMove(from, to)
            }

            override fun onSwiped(viewHolder: RecyclerView.ViewHolder, direction: Int) {}

            override fun isLongPressDragEnabled(): Boolean = true

            override fun clearView(recyclerView: RecyclerView, viewHolder: RecyclerView.ViewHolder) {
                super.clearView(recyclerView, viewHolder)
                saveOrder()
            }
        })
        helper.attachToRecyclerView(rvChannels)
        itemTouchHelper = helper
    }

    private class ChannelSortAdapter(
        private val items: MutableList<Channel>,
        private val onOrderChanged: () -> Unit
    ) : RecyclerView.Adapter<ChannelSortAdapter.ViewHolder>() {

        private var grabbedPosition: Int = RecyclerView.NO_POSITION

        inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {
            val tvName: TextView = view.findViewById(R.id.tvGroupName)
        }

        override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
            val view = LayoutInflater.from(parent.context).inflate(R.layout.item_group_toggle, parent, false)
            view.findViewById<View>(R.id.swGroupVisible).visibility = View.GONE
            view.findViewById<View>(R.id.ivReorder).visibility = View.VISIBLE
            return ViewHolder(view)
        }

        override fun onBindViewHolder(holder: ViewHolder, position: Int) {
            val item = items[position]
            val numberPrefix = item.number?.let { "$it. " } ?: ""
            holder.tvName.text = numberPrefix + ChannelNameFormatter.format(holder.itemView.context, item.name)
            holder.itemView.isFocusable = true
            updateBackground(holder, position)

            holder.itemView.setOnKeyListener { _, keyCode, event ->
                if (event.action == KeyEvent.ACTION_DOWN) {
                    when (keyCode) {
                        KeyEvent.KEYCODE_DPAD_CENTER, KeyEvent.KEYCODE_ENTER -> {
                            val currentPos = holder.bindingAdapterPosition
                            if (currentPos == RecyclerView.NO_POSITION) return@setOnKeyListener false
                            if (grabbedPosition == RecyclerView.NO_POSITION) {
                                grabbedPosition = currentPos
                                notifyItemChanged(currentPos)
                            } else if (grabbedPosition == currentPos) {
                                grabbedPosition = RecyclerView.NO_POSITION
                                notifyItemChanged(currentPos)
                                onOrderChanged()
                            }
                            return@setOnKeyListener true
                        }

                        KeyEvent.KEYCODE_DPAD_UP -> {
                            if (grabbedPosition != RecyclerView.NO_POSITION) {
                                val currentPos = holder.bindingAdapterPosition
                                if (currentPos > 0 && currentPos == grabbedPosition) {
                                    Collections.swap(items, currentPos, currentPos - 1)
                                    grabbedPosition = currentPos - 1
                                    notifyItemMoved(currentPos, currentPos - 1)
                                    return@setOnKeyListener true
                                }
                            }
                        }

                        KeyEvent.KEYCODE_DPAD_DOWN -> {
                            if (grabbedPosition != RecyclerView.NO_POSITION) {
                                val currentPos = holder.bindingAdapterPosition
                                if (currentPos < items.size - 1 && currentPos == grabbedPosition) {
                                    Collections.swap(items, currentPos, currentPos + 1)
                                    grabbedPosition = currentPos + 1
                                    notifyItemMoved(currentPos, currentPos + 1)
                                    return@setOnKeyListener true
                                }
                            }
                        }
                    }
                }
                false
            }
        }

        fun onItemMove(from: Int, to: Int): Boolean {
            if (from !in items.indices || to !in items.indices) return false
            Collections.swap(items, from, to)
            notifyItemMoved(from, to)
            return true
        }

        private fun updateBackground(holder: ViewHolder, position: Int) {
            if (position == grabbedPosition) {
                holder.itemView.setBackgroundColor(
                    ContextCompat.getColor(holder.itemView.context, R.color.tivimate_accent_green)
                )
            } else {
                holder.itemView.setBackgroundResource(R.drawable.selector_button_bg)
            }
        }

        override fun getItemCount(): Int = items.size
    }

    companion object {
        private const val KEY_MANUAL_SORT_GROUP_ID = "manual_sort_group_id"
        private val FAVORITES_CATEGORY = XtreamCategory("favorites", "Favorites", 0)
    }
}
