package com.example.dounutsapp.screens.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.navigation.NavController
import com.example.dounutsapp.AppDestination
import com.example.dounutsapp.R
import com.example.dounutsapp.composables.VerticalSpacer
import com.example.dounutsapp.screens.home.composable.DonutsCard
import com.example.dounutsapp.screens.home.composable.HomeAppBar
import com.example.dounutsapp.screens.home.composable.TodayOffersCard
import com.example.dounutsapp.screens.home.state.HomeUiSate
import com.example.dounutsapp.ui.theme.black
import com.example.dounutsapp.ui.theme.space16
import com.example.dounutsapp.ui.theme.space20
import com.example.dounutsapp.ui.theme.space8
import com.example.dounutsapp.ui.theme.text20Semi
import com.example.dounutsapp.ui.theme.white60
import com.example.dounutsapp.ui.theme.whiteBlue
import com.example.dounutsapp.ui.theme.whitePink

@Composable
fun HomeScreen(
    padding: PaddingValues, navController: NavController, viewModel: HomeViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    HomeContent(padding, state) { navController.navigate(AppDestination.DonutInfoScreen.screen) }
}

@Composable
private fun HomeContent(padding: PaddingValues, state: HomeUiSate, onClickDonut: () -> Unit) {
    Column(
        Modifier
            .fillMaxSize()
            .background(white60)
            .padding(padding)
    ) {
        HomeAppBar()
        VerticalSpacer(height = space20)
        Text(
            modifier = Modifier.padding(start = space16),
            text = stringResource(R.string.today_offers),
            style = text20Semi,
            color = black
        )
        VerticalSpacer(height = space16)
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(space20),
            contentPadding = PaddingValues(horizontal = space16)
        ) {
            items(state.todayOfferDonuts.size) {
                val background = if (it % 2 == 0) whiteBlue else whitePink
                TodayOffersCard(onClickDonut, background, state.todayOfferDonuts[it])
            }
        }
        VerticalSpacer(height = space16)
        Text(
            modifier = Modifier.padding(start = space16),
            text = "Donuts",
            style = text20Semi,
            color = black
        )
        VerticalSpacer(height = space8)
        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(space20),
            contentPadding = PaddingValues(horizontal = space16)
        ) {
            items(state.donuts) {
                DonutsCard(it, onClickDonut)
            }
        }
        BottomAppBar(Modifier.fillMaxWidth(), containerColor = white60) {
            Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceAround) {
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.home),
                    contentDescription = ""
                )
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.heart),
                    contentDescription = ""
                )
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.notification),
                    contentDescription = ""
                )
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.shopping),
                    contentDescription = ""
                )
                Image(
                    imageVector = ImageVector.vectorResource(R.drawable.person),
                    contentDescription = ""
                )
            }
        }
    }
}