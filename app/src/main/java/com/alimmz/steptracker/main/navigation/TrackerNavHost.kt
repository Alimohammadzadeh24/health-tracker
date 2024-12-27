package com.alimmz.steptracker.main.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.compose.animation.core.tween
import androidx.compose.animation.fadeIn
import androidx.compose.animation.fadeOut
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.alimmz.steptracker.core.navigation.NavRoutes
import com.alimmz.steptracker.core.navigation.allTopLevelDestinations
import com.alimmz.steptracker.core.navigation.destAndSourceAreBottomBarRoutes

@Composable
fun TrackerNavHost(
    isDarkMode: Boolean,
    modifier: Modifier = Modifier,
    navController: NavHostController,
    toggleDarkMode: () -> Unit,
    startDestination: NavRoutes = NavRoutes.SplashNav
) {

    val bottomSheetRoutes = allTopLevelDestinations

    NavHost(navController = navController,
        startDestination = startDestination,
        modifier = modifier,
        enterTransition = {
            if (destAndSourceAreBottomBarRoutes(bottomSheetRoutes)) fadeIn(
                tween(300)
            ) else slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Left, animationSpec = tween(300)
            )
        },
        exitTransition = {
            if (destAndSourceAreBottomBarRoutes(bottomSheetRoutes)) fadeOut(tween(300)) else slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Left, animationSpec = tween(300)
            )
        },
        popEnterTransition = {
            if (destAndSourceAreBottomBarRoutes(bottomSheetRoutes)) fadeIn(tween(300)) else slideIntoContainer(
                AnimatedContentTransitionScope.SlideDirection.Right, animationSpec = tween(300)
            )
        },
        popExitTransition = {
            if (destAndSourceAreBottomBarRoutes(bottomSheetRoutes)) fadeOut(tween(300)) else slideOutOfContainer(
                AnimatedContentTransitionScope.SlideDirection.Right, animationSpec = tween(300)
            )
        }) {

        composable<NavRoutes.SplashNav> { SplashView() }

        composable<RootedDeviceScreenRoot> { RootedDeviceScreen() }

    }
}