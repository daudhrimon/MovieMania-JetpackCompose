package com.daud.moviemania.navigation.routes

sealed class MainRoute(val route: String) {
    object MovieDashboard : MainRoute("movie_dashboard")
    object MovieDetails : MainRoute("movie_details")
}
