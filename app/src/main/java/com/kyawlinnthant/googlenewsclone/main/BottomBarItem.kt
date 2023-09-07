package com.kyawlinnthant.googlenewsclone.main

import androidx.compose.foundation.layout.RowScope
import androidx.compose.material3.Icon
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.setValue
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.navigation.NavDestination
import androidx.navigation.NavDestination.Companion.hierarchy
import androidx.navigation.NavHostController
import com.kyawlinnthant.navigation.Screen

@Composable
fun RowScope.BottomBarItem(
    screen: Screen,
    currentRoute: NavDestination?,
    navController: NavHostController,
) {

    val title = screen.name?.let { stringResource(id = it) }
    val icon = screen.icon?.let { painterResource(id = it) }
    var selectedRoute by remember { mutableStateOf(screen.route) }
    NavigationBarItem(
        label = {
            Text(text = title ?: "")
        },
        icon = {
            icon?.let {
                Icon(
                    painter = it,
                    contentDescription = "BottomBar Icon",
                )
            }
        },
        selected = currentRoute?.hierarchy?.any { it.route == screen.route } == true,
        onClick = {
            selectedRoute = screen.route
            navController.navigate(screen.route) {
                popUpTo(Screen.Foryou.route)
                launchSingleTop = true
                restoreState = true
            }
        },
    )
}