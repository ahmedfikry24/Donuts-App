package com.example.dounutsapp.screens.home.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.style.TextDecoration
import com.example.dounutsapp.R
import com.example.dounutsapp.composables.HorizontalSpacer
import com.example.dounutsapp.composables.VerticalSpacer
import com.example.dounutsapp.ui.theme.black
import com.example.dounutsapp.ui.theme.black60
import com.example.dounutsapp.ui.theme.size210
import com.example.dounutsapp.ui.theme.size280
import com.example.dounutsapp.ui.theme.size35
import com.example.dounutsapp.ui.theme.size80
import com.example.dounutsapp.ui.theme.space100
import com.example.dounutsapp.ui.theme.space16
import com.example.dounutsapp.ui.theme.space20
import com.example.dounutsapp.ui.theme.space4
import com.example.dounutsapp.ui.theme.space8
import com.example.dounutsapp.ui.theme.text12Normal
import com.example.dounutsapp.ui.theme.text14Semi
import com.example.dounutsapp.ui.theme.text16Medium
import com.example.dounutsapp.ui.theme.text20Semi
import com.example.dounutsapp.ui.theme.white

@Composable
fun TodayOffersCard(onClick: () -> Unit, background: Color, imageId: Int) {
    Box(contentAlignment = Alignment.CenterEnd) {
        Card(
            Modifier
                .width(size210)
                .padding(end = space20)
                .clickable(onClick = onClick),
            shape = RoundedCornerShape(space20),
            colors = CardDefaults.cardColors(background),
            elevation = CardDefaults.cardElevation(space8)
        ) {
            Column(
                Modifier
                    .fillMaxWidth()
                    .padding(start = space20)
            ) {
                VerticalSpacer(height = space16)
                Box(
                    Modifier
                        .size(size35)
                        .background(white, CircleShape), contentAlignment = Alignment.Center
                ) {
                    Image(
                        imageVector = ImageVector.vectorResource(R.drawable.ic_favorite),
                        contentDescription = stringResource(R.string.favorite_icon)
                    )
                }
                VerticalSpacer(height = space100)
                Text(
                    text = stringResource(R.string.strawberry_wheel),
                    style = text16Medium,
                    color = black
                )
                VerticalSpacer(height = space8)
                Text(
                    text = stringResource(R.string.these_baked_strawberry_donuts_are_filled_with_fresh_strawberries),
                    style = text12Normal,
                    color = black60
                )
                VerticalSpacer(height = space4)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    Spacer(modifier = Modifier.weight(1f))
                    Text(
                        text = stringResource(R.string._20),
                        style = text14Semi.copy(textDecoration = TextDecoration.LineThrough),
                        color = black60
                    )
                    HorizontalSpacer(width = space4)
                    Text(
                        text = stringResource(R.string._16),
                        style = text20Semi,
                        color = black
                    )
                    HorizontalSpacer(width = space8)
                }
                VerticalSpacer(height = space4)
            }
        }
        Column(Modifier.height(size280), verticalArrangement = Arrangement.Center) {
            Image(
                modifier = Modifier.size(size80),
                painter = painterResource(imageId),
                contentDescription = stringResource(
                    R.string.donut_image
                )
            )
            VerticalSpacer(height = space100)
        }
    }
}
