package com.example.dounutsapp

sealed class AppDestination(val screen: String) {
    object WelcomeScreen : AppDestination("WelcomeScreen")
    object HomeScreen : AppDestination("homeScreen")
    object DonutInfoScreen : AppDestination("donutInfoScreen")
}