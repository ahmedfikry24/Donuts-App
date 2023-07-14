package com.example.dounutsapp.screens.donutInfo.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.res.vectorResource
import com.example.dounutsapp.R
import com.example.dounutsapp.ui.theme.space16

@Composable
fun DonutInfoAppBar(onClick: () -> Unit) {
    Row(Modifier.fillMaxWidth(), horizontalArrangement = Arrangement.Start) {
        Image(
            modifier = Modifier
                .padding(start = space16)
                .clickable(onClick = onClick),
            imageVector = ImageVector.vectorResource(R.drawable.ic_back),
            contentDescription = stringResource(
                R.string.icon_back
            )
        )
    }
}