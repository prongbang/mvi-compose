package com.prongbang.mvicompose.ui.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.prongbang.mvicompose.ui.theme.MviComposeTheme

@Composable
fun ProfileScreen(navController: NavController) {
    MviComposeTheme {
        Scaffold {
            Column {
                Text(text = "PROFILE")
            }
        }
    }
}