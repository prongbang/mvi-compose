package com.prongbang.router

import androidx.compose.animation.ExperimentalAnimationApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.prongbang.screens.Screen
import com.prongbang.forgot.ForgotScreen
import com.prongbang.login.LoginScreen
import com.prongbang.main.MainScreen

/**
 * @Document: https://developer.android.com/jetpack/compose/navigation
 */
@ExperimentalAnimationApi
@Composable
fun NavHostRouter(navController: NavHostController) {
    NavHost(
        navController = navController,
        startDestination = Screen.Login.route
    ) {
        composable(Screen.Login.route) { NextTransition { LoginScreen(navController) } }
        composable(Screen.Main.route) { MainScreen() }
        composable(Screen.Forgot.route /*+ "/{id}"*/) { navBackStack ->
            // Extracting the argument
            val id = navBackStack.arguments?.getString("id")

            NextTransition { ForgotScreen(navController) }
        }
    }
}