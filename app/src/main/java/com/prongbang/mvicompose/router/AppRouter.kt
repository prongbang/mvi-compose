package com.prongbang.mvicompose.router

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.prongbang.mvicompose.screen.Screen
import com.prongbang.mvicompose.ui.forgot.ForgotScreen
import com.prongbang.mvicompose.ui.main.MainScreen
import com.prongbang.mvicompose.ui.login.LoginScreen

/**
 * @Document: https://developer.android.com/jetpack/compose/navigation
 */
@Composable
fun AppRouter(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(Screen.Login.route) { LoginScreen(navController) }
        composable(Screen.Main.route) { MainScreen() }
        composable(Screen.Forgot.route) { ForgotScreen(navController) }
    }
}