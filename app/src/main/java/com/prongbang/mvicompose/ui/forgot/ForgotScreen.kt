package com.prongbang.mvicompose.ui.forgot

import androidx.compose.material.Button
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.prongbang.mvicompose.ui.theme.MviComposeTheme

@Composable
fun ForgotScreen(navController: NavController) {
    MviComposeTheme {
        Scaffold(topBar = { TopAppBar(title = { Text(text = "FORGOT") }) }) {
            Button(onClick = {
                // navController.navigate("login") { popUpTo("forgot") }
                navController.popBackStack()
            }) {
                Text(text = "Close")
            }
        }
    }
}

@Preview
@Composable
fun PreviewForgotScreen() {
    val navController = rememberNavController()
    ForgotScreen(navController)
}