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
val welcomeText = TextStyle(
    fontSize = text54,
    fontWeight = FontWeight.Bold,
    fontFamily = inter,
)

val welcomeDescription = TextStyle(
    fontSize = text18,
    fontWeight = FontWeight.Normal,
    fontFamily = inter,
)

val buttonText = TextStyle(
    fontSize = text20,
    fontWeight = FontWeight.SemiBold,
    fontFamily = inter,
)

val homeTitle = TextStyle(
    fontSize = text18,
    fontWeight = FontWeight.SemiBold,
    fontFamily = inter,
)

val homeDonutName = TextStyle(
    fontSize = text16,
    fontWeight = FontWeight.Medium,
    fontFamily = inter,
)

val homeDonutDescription = TextStyle(
    fontSize = text12,
    fontWeight = FontWeight.Normal,
    fontFamily = inter,
)

val homeSubTitle = TextStyle(
    fontSize = text14,
    fontWeight = FontWeight.Medium,
    fontFamily = inter,
)

val homeOldPrice = TextStyle(
    fontSize = text14,
    fontWeight = FontWeight.SemiBold,
    fontFamily = inter,
)

val homeNewPrice = TextStyle(
    fontSize = text20,
    fontWeight = FontWeight.SemiBold,
    fontFamily = inter,
)