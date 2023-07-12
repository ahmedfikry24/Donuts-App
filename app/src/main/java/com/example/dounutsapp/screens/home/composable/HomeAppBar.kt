package com.example.dounutsapp.screens.home.composable

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import com.example.dounutsapp.R
import com.example.dounutsapp.composables.VerticalSpacer
import com.example.dounutsapp.ui.theme.darkPink
import com.example.dounutsapp.ui.theme.black60
import com.example.dounutsapp.ui.theme.homeSubTitle
import com.example.dounutsapp.ui.theme.homeTitle
import com.example.dounutsapp.ui.theme.lightPink
import com.example.dounutsapp.ui.theme.size45
import com.example.dounutsapp.ui.theme.space16
import com.example.dounutsapp.ui.theme.space20
import com.example.dounutsapp.ui.theme.space4

@Composable
fun HomeAppBar() {
    Row(
        Modifier.fillMaxWidth().padding(space16),
        horizontalArrangement = Arrangement.SpaceBetween,
        verticalAlignment = Alignment.CenterVertically
    ) {
        Column {
            VerticalSpacer(height = space20)
            Text(
                text = stringResource(R.string.let_s_gonuts),
                style = homeTitle,
                color = darkPink
            )
            VerticalSpacer(height = space4)
            Text(
                text = stringResource(R.string.order_your_favourite_donuts_from_here),
                style = homeSubTitle,
                color = black60
            )
        }

        Box(
            modifier = Modifier
                .size(size45)
                .background(lightPink, RoundedCornerShape(space16)),
            contentAlignment = Alignment.Center
        ) {
            Icon(
                painter = painterResource(R.drawable.ic_search),
                contentDescription = stringResource(
                    R.string.search_icon
                ),
                tint = darkPink
            )
        }
    }
}