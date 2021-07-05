package com.prongbang.mvicompose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.navigation.compose.rememberNavController
import com.prongbang.router.NavHostRouter
import com.prongbang.theme.MviComposeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MviComposeTheme {
                val navController = rememberNavController()
                Surface(color = MaterialTheme.colors.background) {
                    NavHostRouter(navController)
                }
            }
        }
    }
}