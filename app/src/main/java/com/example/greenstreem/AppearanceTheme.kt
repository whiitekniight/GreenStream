package com.example.greenstreem

import android.content.Context
import android.graphics.Color
import android.graphics.drawable.ClipDrawable
import android.graphics.drawable.GradientDrawable
import android.graphics.drawable.LayerDrawable
import android.graphics.drawable.StateListDrawable
import android.view.Gravity

object AppearanceTheme {
    private const val KEY_ACCENT = "appearance_accent"

    fun accentColor(context: Context): Int {
        return when (context.getSharedPreferences("iptv_prefs", Context.MODE_PRIVATE).getInt(KEY_ACCENT, 0)) {
            1 -> Color.parseColor("#2196F3")
            2 -> Color.parseColor("#FF9800")
            3 -> Color.parseColor("#E91E63")
            4 -> Color.parseColor("#9C27B0")
            5 -> Color.parseColor("#00E5FF")
            6 -> Color.parseColor("#76FF03")
            7 -> Color.parseColor("#FFD600")
            8 -> Color.parseColor("#FF1744")
            9 -> Color.parseColor("#00BFA5")
            10 -> Color.parseColor("#B388FF")
            else -> Color.parseColor("#4CAF50")
        }
    }

    fun buttonBackground(context: Context): StateListDrawable {
        val focused = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadius = context.dp(4).toFloat()
            setColor(accentColor(context))
            setStroke(context.dp(2), Color.WHITE)
        }
        val normal = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadius = context.dp(4).toFloat()
            setColor(Color.parseColor("#1F262F"))
        }
        return StateListDrawable().apply {
            addState(intArrayOf(android.R.attr.state_focused), focused)
            addState(intArrayOf(), normal)
        }
    }

    fun epgProgramBackground(context: Context): StateListDrawable {
        val focused = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadius = context.dp(2).toFloat()
            setColor(Color.parseColor("#242424"))
            setStroke(context.dp(2), accentColor(context))
        }
        val normal = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadius = context.dp(2).toFloat()
            setColor(Color.parseColor("#242424"))
            setStroke(context.dp(1), Color.parseColor("#303030"))
        }
        return StateListDrawable().apply {
            addState(intArrayOf(android.R.attr.state_focused), focused)
            addState(intArrayOf(), normal)
        }
    }

    fun categoryBackground(context: Context): StateListDrawable {
        val focused = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadius = context.dp(4).toFloat()
            setColor(accentColor(context))
            setStroke(context.dp(2), Color.WHITE)
        }
        val normal = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadius = context.dp(4).toFloat()
            setColor(Color.parseColor("#CC111923"))
            setStroke(context.dp(1), Color.parseColor("#33414F"))
        }
        return StateListDrawable().apply {
            addState(intArrayOf(android.R.attr.state_focused), focused)
            addState(intArrayOf(), normal)
        }
    }

    fun categoryHeaderBackground(context: Context): StateListDrawable {
        val focused = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadius = context.dp(5).toFloat()
            setColor(accentColor(context))
            setStroke(context.dp(1), Color.WHITE)
        }
        val normal = GradientDrawable().apply {
            shape = GradientDrawable.RECTANGLE
            cornerRadius = context.dp(5).toFloat()
            setColor(Color.parseColor("#101820"))
            setStroke(context.dp(1), Color.parseColor("#283441"))
        }
        return StateListDrawable().apply {
            addState(intArrayOf(android.R.attr.state_focused), focused)
            addState(intArrayOf(), normal)
        }
    }

    fun progressDrawable(context: Context): LayerDrawable {
        val background = GradientDrawable().apply {
            setColor(Color.parseColor("#33FFFFFF"))
        }
        val progress = ClipDrawable(
            GradientDrawable().apply { setColor(accentColor(context)) },
            Gravity.START,
            ClipDrawable.HORIZONTAL
        )
        return LayerDrawable(arrayOf(background, progress)).apply {
            setId(0, android.R.id.background)
            setId(1, android.R.id.progress)
        }
    }

    private fun Context.dp(value: Int): Int = (value * resources.displayMetrics.density).toInt()
}
