package com.maxxxwk.gofpatterns.adapter

class Client {
    private val colorConverter: ColorConverter = ColorConverterAdapter()

    fun useColor(r: Float, g: Float, b: Float) {
        val hex = colorConverter.convertFromRGBAToColor(r, g, b)
        println(hex)
    }
}