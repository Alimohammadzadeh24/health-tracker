package com.alimmz.steptracker.core.navigation

import androidx.compose.animation.AnimatedContentTransitionScope
import androidx.navigation.NavBackStackEntry
import kotlinx.serialization.Serializable

sealed interface NavRoutes {

    @Serializable
    data object SplashNav : NavRoutes

    @Serializable
    data object HomeNav : NavRoutes

    @Serializable
    data object TrackNav : NavRoutes

    @Serializable
    data object ReportNav : NavRoutes

    @Serializable
    data object HistoryNav : NavRoutes

    @Serializable
    data object AccountNav : NavRoutes
}

val allTopLevelDestinations = setOf(
    NavRoutes.HomeNav,
    NavRoutes.TrackNav,
    NavRoutes.ReportNav,
    NavRoutes.HistoryNav,
    NavRoutes.AccountNav,
)

fun AnimatedContentTransitionScope<NavBackStackEntry>.destAndSourceAreBottomBarRoutes(
    bottomBarRoutes: Set<Any>
): Boolean {
    return bottomBarRoutes.any { it::class.qualifiedName == this.targetState.destination.route } && bottomBarRoutes.any {
        it::class.qualifiedName == this.initialState.destination.route
    }
}