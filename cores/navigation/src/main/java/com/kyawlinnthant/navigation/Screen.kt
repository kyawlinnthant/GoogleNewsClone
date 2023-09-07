package com.kyawlinnthant.navigation

import androidx.annotation.DrawableRes
import androidx.annotation.StringRes

sealed class Screen(
    val route: String,
    @DrawableRes val icon: Int? = null,
    @StringRes val name: Int? = null
) {
    data object Foryou : Screen(
        route = "forYou",
        icon = R.drawable.ic_foryou,
        name = R.string.foryou
    ), BottomBarScreen

    data object Headlines : Screen(
        route = "headlines",
        icon = R.drawable.ic_headlines,
        name = R.string.headlines
    ), BottomBarScreen

    data object Following : Screen(
        route = "following",
        icon = R.drawable.ic_following,
        name = R.string.following
    ), BottomBarScreen

    data object Setting : Screen(
        route = "newsstand",
        icon = R.drawable.ic_setting,
        name = R.string.setting
    ), BottomBarScreen

    data object FullCoverage : Screen("fullCoverage")
    data object Article : Screen("article")
}
