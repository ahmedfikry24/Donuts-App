package com.example.dounutsapp

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.dounutsapp.screens.donutInfo.DonutInfoScreen
import com.example.dounutsapp.screens.home.HomeScreen
import com.example.dounutsapp.screens.welcome.WelcomeScreen

@Composable
fun DonutAppGraph(padding: PaddingValues, navController: NavHostController) {
    NavHost(navController = navController, startDestination = AppDestination.WelcomeScreen.screen) {
        composable(AppDestination.WelcomeScreen.screen) {
            WelcomeScreen(
                padding = padding,
                navController = navController
            )
        }
        composable(AppDestination.HomeScreen.screen) {
            HomeScreen(
                padding = padding,
                navController = navController
            )
        }

        composable(AppDestination.DonutInfoScreen.screen) {
            DonutInfoScreen(
                padding = padding,
                navController = navController
            )
        }

    }
}