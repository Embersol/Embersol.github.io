package com.embersol.website.story

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.style.TextAlign
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.embersol.website.util.AppStyle
import org.jetbrains.compose.ui.tooling.preview.Preview

class HomeScreen: Screen {
    @Preview @Composable override fun Content() {
        Box(
            modifier = Modifier
                .background(AppStyle.Color.Background)
                .fillMaxSize()
        ) {
            Column(
                modifier = Modifier
                    .verticalScroll(rememberScrollState())
                    .fillMaxSize()
            ) {
                Header()
                NavigationBar()
            }
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
        val navigator = LocalNavigator.current

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
                onClick = { navigator?.push(AboutUsScreen()) },
                colors = ButtonDefaults.textButtonColors(contentColor = AppStyle.Color.Text.Light),
                ) { Text("About Us") }
        }
    }
}