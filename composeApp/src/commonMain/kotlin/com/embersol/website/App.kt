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
import com.embersol.website.extensions.Clear
import com.embersol.website.util.AppStyle
import org.jetbrains.compose.ui.tooling.preview.Preview

@Preview @Composable fun App() {
    MaterialTheme {
        Box(
            modifier = Modifier
                .background(AppStyle.Color.Background)
                .fillMaxSize()
        ) {
            ScreenContent()
        }
    }
}

@Composable fun ScreenContent() {
    Column(
        modifier = Modifier
            .verticalScroll(rememberScrollState())
    ) {
        Header()
        NavigationBar()
    }
}

@Composable fun Header() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(AppStyle.Padding.Large),
        modifier = Modifier
            .background(AppStyle.Color.Primary)
            .padding(AppStyle.Padding.Large)
            .fillMaxWidth()
    ) {
        Text("Embersol",
             color = AppStyle.Color.Text.Light,
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

@OptIn(ExperimentalLayoutApi::class)
@Composable fun NavigationBar() {
    FlowRow(
        horizontalArrangement = Arrangement.spacedBy(AppStyle.Padding.Small, Alignment.CenterHorizontally),
        modifier = Modifier
            .background(AppStyle.Color.Secondary)
            .fillMaxWidth()
    ) {
        TextButton(
            onClick = { },
            colors = ButtonDefaults.textButtonColors(contentColor = AppStyle.Color.Text.Light),
        ) { Text("Services") }

        TextButton(
            onClick = { },
            colors = ButtonDefaults.textButtonColors(contentColor = AppStyle.Color.Text.Light),
            ) { Text("About Us") }
    }
}