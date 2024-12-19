package com.embersol.website.story

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import cafe.adriel.voyager.navigator.currentOrThrow
import org.jetbrains.compose.ui.tooling.preview.Preview

class AboutUsScreen: Screen {
    @Preview @Composable override fun Content() {
        val navigator = LocalNavigator.current

        Column {
            Text("New Screen")
            Button(
                onClick = {
                    navigator?.pop()
                }
            ) {
                Text("Go Back")
            }
        }
    }

}