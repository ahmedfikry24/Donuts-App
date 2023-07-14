package com.example.dounutsapp.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.dounutsapp.R

val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = FontFamily.Default,
        fontWeight = FontWeight.Normal,
        fontSize = 16.sp,
        lineHeight = 24.sp,
        letterSpacing = 0.5.sp
    )
)

val inter = FontFamily(
    Font(R.font.inter_regular, FontWeight.Normal),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_medium, FontWeight.Medium),
    Font(R.font.inter_semibold, FontWeight.SemiBold),
    Font(R.font.inter_bold, FontWeight.Bold)
)
val text54Bold = TextStyle(
    fontSize = text54,
    fontWeight = FontWeight.Bold,
    fontFamily = inter,
)

val text18Normal = TextStyle(
    fontSize = text18,
    fontWeight = FontWeight.Normal,
    fontFamily = inter,
)

val text20Semi = TextStyle(
    fontSize = text20,
    fontWeight = FontWeight.SemiBold,
    fontFamily = inter,
)

val text18Semi = TextStyle(
    fontSize = text18,
    fontWeight = FontWeight.SemiBold,
    fontFamily = inter,
)

val text18Medium = TextStyle(
    fontSize = text18,
    fontWeight = FontWeight.Medium,
    fontFamily = inter,
)

val text16Medium = TextStyle(
    fontSize = text16,
    fontWeight = FontWeight.Medium,
    fontFamily = inter,
)

val text12Normal = TextStyle(
    fontSize = text12,
    fontWeight = FontWeight.Normal,
    fontFamily = inter,
)

val text14Medium = TextStyle(
    fontSize = text14,
    fontWeight = FontWeight.Medium,
    fontFamily = inter,
)

val text14Semi = TextStyle(
    fontSize = text14,
    fontWeight = FontWeight.SemiBold,
    fontFamily = inter,
)
val text14Normal = TextStyle(
    fontSize = text14,
    fontWeight = FontWeight.Normal,
    fontFamily = inter,
)

val text32Medium = TextStyle(
    fontSize = text32,
    fontWeight = FontWeight.Medium,
    fontFamily = inter,
)
val text22Medium = TextStyle(
    fontSize = text22,
    fontWeight = FontWeight.Medium,
    fontFamily = inter,
)