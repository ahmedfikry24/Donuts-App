package com.example.dounutsapp

import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import com.example.dounutsapp.screens.welcome.WelcomeScreen

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun DonutsApp() {
    Scaffold { padding->
       WelcomeScreen(padding)
    }
}