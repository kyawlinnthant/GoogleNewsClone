package com.kyawlinnthant.googlenewsclone.main

import androidx.compose.material3.NavigationBar
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.navigation.NavHostController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.kyawlinnthant.navigation.Screen

@Composable
fun BottomBar(
    navHostController: NavHostController
) {
    val items = listOf(
        Screen.Foryou,
        Screen.Headlines,
        Screen.Following,
        Screen.Setting
    )
    val shouldShowBottomBar = navHostController.currentDestination?.route in items.map { it.route }
    val navBackStackEntry by navHostController.currentBackStackEntryAsState()
    val currentRoute = navBackStackEntry?.destination

    if (shouldShowBottomBar) {
        NavigationBar {
            items.forEach {
                BottomBarItem(
                    screen = it,
                    currentRoute = currentRoute,
                    navController = navHostController,
                )
            }
        }
    }
}