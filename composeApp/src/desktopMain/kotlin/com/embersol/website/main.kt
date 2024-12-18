package com.embersol.website

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "EmbersolWebsite",
    ) {
        App()
    }
}