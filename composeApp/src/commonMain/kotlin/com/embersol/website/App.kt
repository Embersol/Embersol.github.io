package com.embersol.website

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import com.embersol.website.util.AppStyle
import org.jetbrains.compose.ui.tooling.preview.Preview

@Composable @Preview fun App() {
    MaterialTheme {
        ScreenContent()
    }
}

@Composable fun ScreenContent() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
            .fillMaxWidth()
            .fillMaxHeight()
    ) {
        Header()
    }
}

@Composable fun Header() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(AppStyle.Padding.Large),
        modifier = Modifier
            .background(Color.Blue)
            .padding(AppStyle.Padding.Large)
            .fillMaxWidth()
    ) {
        Text("Embersol", color = AppStyle.Color.Text.Light,
             style = AppStyle.TextStyle.Title,
             textAlign = TextAlign.Center
        )
        Text("Innovative Software Solutions for iOS, Android, and the Web",
             color = AppStyle.Color.Text.Light,
             style = AppStyle.TextStyle.Subtitle,
             textAlign = TextAlign.Center
        )
    }
}