package com.daud.moviemania

import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.daud.moviemania.navigation.graphs.MainNavGraph
import com.daud.moviemania.navigation.routes.MainRoute
import com.daud.moviemania.ui.theme.MovieManiaTheme

class MainActivity : ComponentActivity() {
    private lateinit var navHostController: NavHostController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MovieManiaTheme {
                navHostController = rememberNavController()
                MainNavGraph(navHostController = navHostController)

                Handler(Looper.getMainLooper()).postDelayed({
                    navHostController.navigate(MainRoute.MovieDetails.route)
                },5000)

                //Toast.makeText(navHostController.context,"",Toast.LENGTH_SHORT).show()
            }
        }
    }
}