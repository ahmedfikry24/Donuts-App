package com.example.dounutsapp.screens.welcome.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import com.example.dounutsapp.R
import com.example.dounutsapp.composables.VerticalSpacer
import com.example.dounutsapp.ui.theme.size100
import com.example.dounutsapp.ui.theme.size80
import com.example.dounutsapp.ui.theme.size160
import com.example.dounutsapp.ui.theme.size310
import com.example.dounutsapp.ui.theme.space20
import com.example.dounutsapp.ui.theme.space60

@Composable
fun DonutsImages() {
    Box(modifier = Modifier.fillMaxWidth(), contentAlignment = Alignment.BottomCenter) {
        Row(
            Modifier
                .fillMaxWidth()
                .height(size310).padding(end = space20),
            horizontalArrangement = Arrangement.SpaceBetween
        )
        {
            Image(
                modifier = Modifier.size(size100),
                painter = painterResource(R.drawable.image_3),
                contentDescription = ""
            )
            Column {
                VerticalSpacer(height = space60)
                Image(
                    modifier = Modifier
                        .size(size160, size100),
                    painter = painterResource(R.drawable.donut_1),
                    contentDescription = ""
                )
            }
        }
        Box(contentAlignment = Alignment.BottomStart){
            Image(
                modifier = Modifier
                    .fillMaxWidth(),
                painter = painterResource(R.drawable.donuts), contentDescription = "",
                contentScale = ContentScale.FillWidth
            )
            Image(
                modifier = Modifier.size(size80),
                painter = painterResource(R.drawable.donut_2), contentDescription = "",
                contentScale = ContentScale.FillBounds
            )
        }
    }
}