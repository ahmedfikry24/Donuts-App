package com.example.dounutsapp.screens.donutInfo

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.dounutsapp.R
import com.example.dounutsapp.composables.VerticalSpacer
import com.example.dounutsapp.screens.donutInfo.composable.DonutInfoAppBar
import com.example.dounutsapp.screens.donutInfo.composable.DonutInfoCard
import com.example.dounutsapp.screens.donutInfo.state.DonutInfoUiState
import com.example.dounutsapp.ui.theme.lightPink
import com.example.dounutsapp.ui.theme.size210
import com.example.dounutsapp.ui.theme.space20

@Composable
fun DonutInfoScreen(
    padding: PaddingValues,
    viewModel: DonutInfoViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    DonutInfoContent(
        padding = padding,
        state = state,
        onClickBack = {},
        onClickMines = viewModel::onClickMines,
        onClickPlus = viewModel::onClickPlus,
        onClickAddToCart = {}
    )
}

@Composable
private fun DonutInfoContent(
    padding: PaddingValues,
    state: DonutInfoUiState,
    onClickBack: () -> Unit,
    onClickMines: () -> Unit,
    onClickPlus: () -> Unit,
    onClickAddToCart: () -> Unit,
) {
    val cardHeight = LocalConfiguration.current.screenHeightDp / 1.7
    Column(
        Modifier
            .fillMaxSize()
            .background(lightPink)
            .padding(padding),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        VerticalSpacer(height = space20)
        DonutInfoAppBar(onClickBack)
        Image(
            modifier = Modifier.size(size210),
            painter = painterResource(R.drawable.donut_6),
            contentDescription = stringResource(
                R.string.donut_image
            )
        )
        Spacer(modifier = Modifier.weight(1f))
        DonutInfoCard(
            cardHeight = cardHeight.toInt(),
            state = state,
            onClickMines = onClickMines,
            onClickPlus = onClickPlus,
            onClickAddToCart = onClickAddToCart,
        )
    }
}