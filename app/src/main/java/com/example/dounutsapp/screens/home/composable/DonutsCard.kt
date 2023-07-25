package com.example.dounutsapp.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextOverflow
import com.example.dounutsapp.R
import com.example.dounutsapp.composables.VerticalSpacer
import com.example.dounutsapp.ui.theme.black60
import com.example.dounutsapp.ui.theme.darkPink
import com.example.dounutsapp.ui.theme.size140
import com.example.dounutsapp.ui.theme.size160
import com.example.dounutsapp.ui.theme.size80
import com.example.dounutsapp.ui.theme.space12
import com.example.dounutsapp.ui.theme.space20
import com.example.dounutsapp.ui.theme.space40
import com.example.dounutsapp.ui.theme.space60
import com.example.dounutsapp.ui.theme.space8
import com.example.dounutsapp.ui.theme.text14Medium
import com.example.dounutsapp.ui.theme.text16Medium
import com.example.dounutsapp.ui.theme.white

@Composable
fun DonutsCard(imageId: Int, onClick: () -> Unit) {
    Box(contentAlignment = Alignment.TopCenter) {
        Card(
            Modifier
                .size(size140, size160)
                .padding(top = space60)
                .clickable(onClick = onClick),
            shape = RoundedCornerShape(topStart = space20, topEnd = space20),
            colors = CardDefaults.cardColors(white),
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(horizontal = space12),
                horizontalAlignment = Alignment.CenterHorizontally
            ) {
                VerticalSpacer(height = space40)
                Text(
                    text = stringResource(R.string.chocolate_cherry),
                    style = text14Medium,
                    color = black60,
                    maxLines = 1,
                    overflow = TextOverflow.Ellipsis
                )
                VerticalSpacer(height = space8)
                Text(
                    text = stringResource(R.string._20),
                    style = text16Medium,
                    color = darkPink
                )
                VerticalSpacer(height = space8)
            }
        }

        Image(
            modifier = Modifier.size(size80).clickable(onClick = onClick),
            painter = painterResource(imageId),
            contentDescription = stringResource(id = R.string.donut_image)
        )
    }
}