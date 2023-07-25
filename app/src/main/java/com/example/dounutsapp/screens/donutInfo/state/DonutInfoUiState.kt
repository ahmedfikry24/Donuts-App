package com.example.dounutsapp.screens.donutInfo.state

data class DonutInfoUiState(
    val quantity: Int = 0,
    val quantityStatus: Boolean = false,
    val totalPrice: Int = 0,
    val isFavorite :Boolean = false
)
