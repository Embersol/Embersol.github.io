package com.embersol.website

import androidx.compose.foundation.background
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.runtime.saveable.rememberSaveable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.text.style.TextAlign
import cafe.adriel.voyager.navigator.Navigator
import com.embersol.website.extensions.Clear
import com.embersol.website.story.HomeScreen
import com.embersol.website.util.AppStyle
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview @Composable fun App() {
    MaterialTheme {
        Navigator(
            screen = HomeScreen()
        )
    }
}