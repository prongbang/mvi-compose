package com.prongbang.screens

import androidx.annotation.StringRes

sealed class Screen(val route: String, @StringRes val resourceId: Int) {
    object Main : Screen("main", R.string.main)
    object Landing : Screen("landing", R.string.landing)
    object Profile : Screen("profile", R.string.profile)
    object Forgot : Screen("forgot", R.string.forgot)
    object Login : Screen("login", R.string.login)

    companion object {
        val BOTTOM_MENUS: List<Screen> = listOf(Landing, Profile)
    }
}