package com.prongbang.mvicompose.ui.home.domain

import androidx.annotation.StringRes
import com.prongbang.mvicompose.R

data class Screen(val route: String, @StringRes val resourceId: Int) {
    companion object {
        val items = listOf(Screen("landing", R.string.home), Screen("profile", R.string.profile))
    }
}