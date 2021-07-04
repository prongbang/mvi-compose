package com.prongbang.mvicompose.router

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.prongbang.mvicompose.ui.forgot.ForgotScreen
import com.prongbang.mvicompose.ui.home.HomeScreen
import com.prongbang.mvicompose.ui.login.LoginScreen

/**
 * @Document: https://developer.android.com/jetpack/compose/navigation
 */
@Composable
fun AppRouter(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = "login"
    ) {
        composable("login") { LoginScreen(navController) }
        composable("home") { HomeScreen() }
        composable("forgot") { ForgotScreen(navController) }
    }
}