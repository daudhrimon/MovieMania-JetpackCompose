package com.daud.moviemania.navigation.graphs

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.daud.moviemania.navigation.routes.MainRoute
import com.daud.moviemania.ui.views.MovieDashboard
import com.daud.moviemania.ui.views.MovieDetails

@Composable
fun MainNavGraph(navHostController: NavHostController) {
    NavHost(
        navController = navHostController,
        startDestination = MainRoute.MovieDashboard.route
    ) {
        composable(MainRoute.MovieDashboard.route) {
            MovieDashboard(navHostController)
        }
        composable(MainRoute.MovieDetails.route) {
            MovieDetails(navHostController)
        }
    }
}