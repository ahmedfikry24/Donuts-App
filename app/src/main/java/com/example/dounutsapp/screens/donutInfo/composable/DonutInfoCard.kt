package com.example.dounutsapp.screens.donutInfo.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.example.dounutsapp.R
import com.example.dounutsapp.composables.HorizontalSpacer
import com.example.dounutsapp.composables.VerticalSpacer
import com.example.dounutsapp.screens.donutInfo.state.DonutInfoUiState
import com.example.dounutsapp.ui.theme.black
import com.example.dounutsapp.ui.theme.black60
import com.example.dounutsapp.ui.theme.darkPink
import com.example.dounutsapp.ui.theme.size45
import com.example.dounutsapp.ui.theme.size67
import com.example.dounutsapp.ui.theme.space16
import com.example.dounutsapp.ui.theme.space20
import com.example.dounutsapp.ui.theme.space35
import com.example.dounutsapp.ui.theme.space40
import com.example.dounutsapp.ui.theme.space8
import com.example.dounutsapp.ui.theme.text14Normal
import com.example.dounutsapp.ui.theme.text16Medium
import com.example.dounutsapp.ui.theme.text18Medium
import com.example.dounutsapp.ui.theme.text20Semi
import com.example.dounutsapp.ui.theme.text22Medium
import com.example.dounutsapp.ui.theme.white
import com.example.dounutsapp.ui.theme.white60

@Composable
fun DonutInfoCard(
    cardHeight: Int,
    state: DonutInfoUiState,
    onClickMines: () -> Unit,
    onClickPlus: () -> Unit,
    onClickAddToCart: () -> Unit,
    onClickFavorite: () -> Unit,
) {
    Box(contentAlignment = Alignment.TopEnd) {
        Card(
            modifier = Modifier
                .fillMaxWidth()
                .height(cardHeight.dp + space20)
                .padding(top = space20),
            shape = RoundedCornerShape(topStart = space40, topEnd = space40),
            colors = CardDefaults.cardColors(white60)
        ) {
            Column(
                Modifier
                    .fillMaxSize()
                    .padding(horizontal = space40)
            ) {
                VerticalSpacer(height = space35)
                Text(
                    text = stringResource(R.string.strawberry_wheel),
                    style = text20Semi,
                    color = darkPink
                )
                VerticalSpacer(height = space35)
                Text(
                    text = stringResource(R.string.about_gonut),
                    style = text16Medium,
                    color = black
                )
                VerticalSpacer(height = space8)
                Text(
                    text = stringResource(R.string.donut_decription),
                    style = text14Normal,
                    color = black60
                )
                VerticalSpacer(height = space20)
                Text(
                    text = stringResource(R.string.quantity),
                    style = text18Medium,
                    color = black
                )
                VerticalSpacer(height = space20)
                Row(horizontalArrangement = Arrangement.spacedBy(space20)) {
                    DonutQuantity(onClickMines, "-", !state.quantityStatus)
                    Box(
                        modifier = Modifier
                            .size(size45)
                            .background(white, RoundedCornerShape(space16)),
                        contentAlignment = Alignment.Center,
                    ) {
                        Text(text = state.quantity.toString(), style = text22Medium, color = black)
                    }
                    DonutQuantity(onClickPlus, "+", state.quantityStatus)
                }
                Spacer(modifier = Modifier.weight(1f))
                Row(Modifier.fillMaxWidth(), verticalAlignment = Alignment.CenterVertically) {
                    Text(
                        text = "$ " + state.totalPrice.toString(),
                        style = text20Semi,
                        color = black
                    )
                    HorizontalSpacer(width = space20)
                    Button(
                        onClick = onClickAddToCart,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(size67),
                        shape = RoundedCornerShape(space40),
                        colors = ButtonDefaults.buttonColors(darkPink)
                    ) {
                        Text(
                            text = stringResource(R.string.add_to_cart),
                            style = text20Semi,
                            color = white
                        )
                    }
                }
                Spacer(modifier = Modifier.weight(1f))
            }
        }
        Row {
            val icon = if (state.isFavorite) R.drawable.ic_favorite_fill else R.drawable.ic_favorite
            Box(
                Modifier
                    .size(size45)
                    .background(white, RoundedCornerShape(space16))
                    .clickable(
                        onClick = onClickFavorite,
                        interactionSource = MutableInteractionSource(),
                        indication = null
                    ),
                contentAlignment = Alignment.Center
            ) {
                Image(
                    imageVector = ImageVector.vectorResource(icon),
                    contentDescription = stringResource(R.string.favorite_icon)
                )
            }
            HorizontalSpacer(width = space40)
        }
    }
}