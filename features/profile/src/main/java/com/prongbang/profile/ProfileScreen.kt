package com.prongbang.profile

import androidx.compose.foundation.layout.Column
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.prongbang.theme.MviComposeTheme

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