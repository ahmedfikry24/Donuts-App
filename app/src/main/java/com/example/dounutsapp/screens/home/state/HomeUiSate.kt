package com.example.dounutsapp.screens.home.state

import com.example.dounutsapp.R

data class HomeUiSate(
    val todayOfferDonuts: List<Int> = listOf(
        R.drawable.donut_5,
        R.drawable.donut_6,
        R.drawable.donut_7
    ),
    val donuts: List<Int> = listOf(R.drawable.donut_4, R.drawable.donut_3, R.drawable.donut_4)
)
