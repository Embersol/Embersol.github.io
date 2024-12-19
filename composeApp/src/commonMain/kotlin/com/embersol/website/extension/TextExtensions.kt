package com.embersol.website.extensions

import androidx.compose.ui.unit.TextUnit
import androidx.compose.ui.unit.TextUnitType

val TextUnitType.Companion.Default: TextUnitType
    get() = TextUnitType.Sp

fun TextUnit(value: Float): TextUnit {
    return TextUnit(value, TextUnitType.Default)
}