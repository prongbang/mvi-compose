package com.prongbang.login

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.prongbang.screens.Screen
import com.prongbang.theme.MviComposeTheme

@Composable
fun LoginScreen(navController: NavController) {
    MviComposeTheme {
        Scaffold(
            topBar = { TopAppBar(title = { Text("LOGIN") }) },
        ) {
            Column(
                verticalArrangement = Arrangement.Center
            ) {
                Button(
                    onClick = {
                        navController.navigate(Screen.Main.route)
                    }
                ) {
                    Text("HOME")
                }
                Button(
                    onClick = {
                        navController.navigate(Screen.Forgot.route)
                    }
                ) {
                    Text("FORGOT")
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewLoginScreen() {
    val navController = rememberNavController()
    LoginScreen(navController = navController)
}