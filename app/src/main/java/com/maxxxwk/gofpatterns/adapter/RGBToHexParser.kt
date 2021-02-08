package com.maxxxwk.gofpatterns.adapter

import java.lang.StringBuilder

class RGBToHexParser {
    fun convert(r: Int, g: Int, b: Int) = StringBuilder().apply {
        append("#")
        append(Integer.toHexString(r))
        append(Integer.toHexString(g))
        append(Integer.toHexString(b))
    }.toString()
}