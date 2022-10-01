package com.hifly.mycompose.ui.theme

import androidx.compose.material.Colors
import androidx.compose.material.lightColors
import androidx.compose.ui.graphics.Color

val Purple200 = Color(0xFFBB86FC)
val Purple500 = Color(0xFF6200EE)
val Purple700 = Color(0xFF3700B3)
val Teal200 = Color(0xFF03DAC5)

interface DesignColorPalette {
    val primaryDefaultBackground: Color
    val materialColors: Colors
}

fun lightColorPalette() = object : DesignColorPalette {
    override val primaryDefaultBackground: Color = Purple200
    override val materialColors: Colors = lightColors(
        primary = Purple500,
        background = Purple700,
        surface = Teal200
    )
}