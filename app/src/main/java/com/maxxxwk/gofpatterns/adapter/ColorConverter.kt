package com.maxxxwk.gofpatterns.adapter

import android.graphics.Color

interface ColorConverter {
    fun convertFromRGBAToColor(r: Float, g: Float, b: Float): String
}