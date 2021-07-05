package com.prongbang.mvicompose.ui.main

import androidx.compose.foundation.layout.padding
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavGraph.Companion.findStartDestination
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.currentBackStackEntryAsState
import androidx.navigation.compose.rememberNavController
import com.prongbang.mvicompose.screen.Screen
import com.prongbang.mvicompose.ui.landing.LandingScreen
import com.prongbang.mvicompose.ui.profile.ProfileScreen
import com.prongbang.mvicompose.ui.theme.MviComposeTheme

@Composable
fun MainScreen() {
    val navController = rememberNavController()
    MviComposeTheme {
        Scaffold(
            bottomBar = {
                BottomNavigation {
                    val navBackStackEntry by navController.currentBackStackEntryAsState()
                    val currentDestination = navBackStackEntry?.destination
                    Screen.BOTTOM_MENUS.forEach { screen: Screen ->
                        BottomNavigationItem(
                            icon = { Icon(Icons.Filled.Favorite, contentDescription = null) },
                            label = { Text(stringResource(screen.resourceId)) },
                            selected = currentDestination?.hierarchy?.any { it.route == screen.route } == true,
                            onClick = {
                                navController.navigate(screen.route) {
                                    // Pop up to the start destination of the graph to
                                    // avoid building up a large stack of destinations
                                    // on the back stack as users select items
                                    popUpTo(navController.graph.findStartDestination().id) {
                                        saveState = true
                                    }
                                    // Avoid multiple copies of the same destination when
                                    // re-selecting the same item
                                    launchSingleTop = true
                                    // Restore state when re-selecting a previously selected item
                                    restoreState = true
                                }
                            }
                        )
                    }
                }
            }
        ) { innerPadding ->
            NavHost(
                navController,
                startDestination = Screen.Landing.route,
                Modifier.padding(innerPadding)
            ) {
                composable(Screen.Landing.route) { LandingScreen(navController) }
                composable(Screen.Profile.route) { ProfileScreen(navController) }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewHomeScreen() {
    MainScreen()
}