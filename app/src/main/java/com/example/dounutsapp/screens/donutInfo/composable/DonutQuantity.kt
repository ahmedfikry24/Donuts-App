package com.example.dounutsapp.screens.donutInfo.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.example.dounutsapp.ui.theme.black
import com.example.dounutsapp.ui.theme.size45
import com.example.dounutsapp.ui.theme.space16
import com.example.dounutsapp.ui.theme.text32Medium
import com.example.dounutsapp.ui.theme.white

@Composable
fun DonutQuantity(onClick: () -> Unit, text: String, quantityStatus: Boolean) {
    val background = if (quantityStatus) black else white
    val textColor = if (quantityStatus) white else black
    Box(
        modifier = Modifier
            .size(size45)
            .background(background, RoundedCornerShape(space16))
            .clickable(onClick = onClick),
        contentAlignment = Alignment.Center,
    ) {
        Text(text = text, style = text32Medium, color = textColor)
    }
}