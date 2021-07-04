package com.prongbang.mvicompose.ui.forgot

import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import com.prongbang.mvicompose.ui.theme.MviComposeTheme

@Composable
fun ForgotScreen(navController: NavController) {
    MviComposeTheme {
        Scaffold(topBar = { TopAppBar(title = { Text(text = "FORGOT") }) }) {
            Button(onClick = {
//                navController.navigate("login") { popUpTo("forgot") }
                navController.popBackStack()
            }) {
                Text(text = "Close")
            }
        }
    }
}