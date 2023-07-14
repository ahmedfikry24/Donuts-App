package com.example.dounutsapp

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonutsApp() {
    Scaffold { padding ->
        val navController = rememberNavController()
        DonutAppGraph(padding = padding, navController = navController)
    }
}