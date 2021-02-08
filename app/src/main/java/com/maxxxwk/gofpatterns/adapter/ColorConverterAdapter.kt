package com.maxxxwk.gofpatterns.adapter


class ColorConverterAdapter : ColorConverter {

    private val colorParser = RGBToHexParser()

    override fun convertFromRGBAToColor(r: Float, g: Float, b: Float): String {
        val redInt = (r * 256).toInt()
        val greenInt = (g * 256).toInt()
        val blueInt = (b * 256).toInt()
        return colorParser.convert(redInt, greenInt, blueInt)
    }
}