package com.kyawlinnthant.googlenewsclone.main

import androidx.compose.foundation.layout.WindowInsets
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.kyawlinnthant.googlenewsclone.navigation.GoogleNewsCloneGraph

@Composable
fun MainView(
    modifier: Modifier = Modifier,
) {
    val navHostController = rememberNavController()
    Scaffold(
        modifier = modifier.fillMaxSize(),
        bottomBar = {
            BottomBar(navHostController = navHostController)
        },
        contentWindowInsets = WindowInsets(0,0,0,0)
    ) {
        GoogleNewsCloneGraph(
            controller = navHostController,
            paddingValues = it
        )
    }
}