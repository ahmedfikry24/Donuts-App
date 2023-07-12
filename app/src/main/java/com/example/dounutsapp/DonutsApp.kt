package com.example.dounutsapp

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.dounutsapp.screens.home.HomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonutsApp() {
    Scaffold { padding ->
        HomeScreen(padding)
    }
}