package com.kyawlinnthant.googlenewsclone.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.kyawlinnthant.navigation.Screen
import com.kyawlinnthant.presentation.FollowingScreen
import com.kyawlinnthant.presentation.ForYouScreen
import com.kyawlinnthant.presentation.HeadlinesScreen
import com.kyawlinnthant.presentation.SettingScreen

@Composable
fun GoogleNewsCloneGraph(
    controller : NavHostController,
    paddingValues: PaddingValues,
    modifier : Modifier = Modifier,
){
    NavHost(
        navController = controller,
        startDestination = Screen.Foryou.route,
        modifier = modifier.fillMaxSize().padding(paddingValues)
    ) {
        composable(
            route = Screen.Foryou.route
        ){
            ForYouScreen()
        }
        composable(
            route = Screen.Headlines.route
        ){
            HeadlinesScreen()
        }
        composable(
            route = Screen.Following.route
        ){
            FollowingScreen()
        }
        composable(
            route = Screen.Setting.route
        ){
            SettingScreen()
        }
    }
}