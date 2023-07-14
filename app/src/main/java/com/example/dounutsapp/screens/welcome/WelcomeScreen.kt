package com.example.dounutsapp.screens.welcome

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.dounutsapp.R
import com.example.dounutsapp.composables.VerticalSpacer
import com.example.dounutsapp.screens.welcome.composable.DonutsImages
import com.example.dounutsapp.ui.theme.darkPink
import com.example.dounutsapp.ui.theme.black
import com.example.dounutsapp.ui.theme.text20Semi
import com.example.dounutsapp.ui.theme.lightPink
import com.example.dounutsapp.ui.theme.pink
import com.example.dounutsapp.ui.theme.size50
import com.example.dounutsapp.ui.theme.size67
import com.example.dounutsapp.ui.theme.space16
import com.example.dounutsapp.ui.theme.space60
import com.example.dounutsapp.ui.theme.text18Normal
import com.example.dounutsapp.ui.theme.text54Bold
import com.example.dounutsapp.ui.theme.white

@Composable
fun WelcomeScreen(padding: PaddingValues) {
    WelcomeContent(padding, onClickButton = {})
}

@Composable
private fun WelcomeContent(padding: PaddingValues, onClickButton: () -> Unit) {
    Column(
        Modifier
            .fillMaxSize()
            .background(lightPink)
            .padding(padding)
    ) {
        DonutsImages()
        Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.SpaceBetween) {
            Text(
                modifier = Modifier.padding(start = space60),
                text = "Gonuts\n" +
                        "with\n" +
                        "Donuts",
                style = text54Bold,
                color = darkPink,
            )
            Image(
                modifier = Modifier.size(80.dp, 150.dp),
                painter = painterResource(R.drawable.image_4), contentDescription = "",
                contentScale = ContentScale.FillBounds
            )
        }
        VerticalSpacer(height = space16)
        Text(
            modifier = Modifier.padding(horizontal = space60),
            text = stringResource(R.string.description_welcome),
            style = text18Normal,
            color = pink
        )
        Spacer(modifier = Modifier.weight(1f))
        TextButton(
            modifier = Modifier
                .fillMaxWidth()
                .height(size67)
                .padding(horizontal = space60),
            colors = ButtonDefaults.buttonColors(white),
            shape = RoundedCornerShape(size50),
            onClick = onClickButton
        ) {
            Text(text = stringResource(R.string.get_started), style = text20Semi, color = black)
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}