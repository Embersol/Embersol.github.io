package com.embersol.website.util

import androidx.compose.material.ButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.unit.dp
import com.embersol.website.extensions.*

//    primary: Color,
//    primaryVariant: Color,
//    secondary: Color,
//    secondaryVariant: Color,
//    background: Color,
//    surface: Color,
//    error: Color,
//    onPrimary: Color,
//    onSecondary: Color,
//    onBackground: Color,
//    onSurface: Color,
//    onError: Color,
//    isLight: Boolean

object AppStyle {
    object Color {
        val Background = Color(0xFFF9F9F9)
        val Primary = Color(0xFF18407D)
        val Secondary = Color(0xFF2860AE)

        object Button {
            val Light = Color(0xFFFFFFFF)
        }
        object Text {
            val Light = Background
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