package com.embersol.website.util

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.embersol.website.extensions.*

object AppStyle {
    object Color {
        object Text {
            val Light = Color(0xFFFFFFFF)
        }
    }

    object TextStyle {
        val Title = TextStyle(fontSize = TextUnit(30F))
        val Subtitle = TextStyle(fontSize = TextUnit(20F))
        val Body = TextStyle(fontSize = TextUnit(12F))
    }

    object Padding {
        val Hairline = 0.dp
        val Small = 8.dp
        val Large = 16.dp
    }
}