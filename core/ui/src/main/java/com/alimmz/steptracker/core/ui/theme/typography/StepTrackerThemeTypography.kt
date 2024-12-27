package com.alimmz.steptracker.core.ui.theme.typography

import androidx.compose.ui.text.PlatformTextStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.LineHeightStyle
import androidx.compose.ui.text.style.TextDirection
import androidx.compose.ui.unit.em
import androidx.compose.ui.unit.sp
import com.alimmz.steptracker.core.ui.R

val urbanist = FontFamily(
    Font(R.font.urbanist_bold, FontWeight.Bold),
    Font(R.font.urbanist_semibold, FontWeight.SemiBold),
    Font(R.font.urbanist_medium, FontWeight.Medium),
    Font(R.font.urbanist_regular, FontWeight.Normal)
)

val playfairDisplay = FontFamily(
    Font(R.font.playfair_display_bold, FontWeight.Bold),
    Font(R.font.playfair_display_semibold, FontWeight.SemiBold),
    Font(R.font.playfair_display_medium, FontWeight.Medium),
    Font(R.font.playfair_display_regular, FontWeight.Normal)
)

val robotoFlex = FontFamily(
    Font(R.font.roboto_flex, FontWeight.Bold),
    Font(R.font.roboto_flex, FontWeight.SemiBold),
    Font(R.font.roboto_flex, FontWeight.Medium),
    Font(R.font.roboto_flex, FontWeight.Normal)
)

data class StepTrackerTypography(
    val urbanist: UrbanistTypography = UrbanistTypography(),
    val playfairDisplay: PlayfairDisplayTypography = PlayfairDisplayTypography(),
    val robotoFlex: RobotoFlexTypography = RobotoFlexTypography()
) {
    // Urbanist TextStyles
    data class UrbanistTypography(
        val title1: TextStyle = TextStyle(
            fontFamily = robotoFlex,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            lineHeight = 1.5.em,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            ),
            lineHeightStyle = LineHeightStyle(
                alignment = LineHeightStyle.Alignment.Center,
                trim = LineHeightStyle.Trim.None
            ),
            textDirection = TextDirection.Rtl
        )
    )

    // Playfair Display TextStyles
    data class PlayfairDisplayTypography(
        val title1: TextStyle = TextStyle(
            fontFamily = robotoFlex,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            lineHeight = 1.5.em,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            ),
            lineHeightStyle = LineHeightStyle(
                alignment = LineHeightStyle.Alignment.Center,
                trim = LineHeightStyle.Trim.None
            ),
            textDirection = TextDirection.Rtl
        )
    )

    // Roboto Flex TextStyles
    data class RobotoFlexTypography(
        val title1: TextStyle = TextStyle(
            fontFamily = robotoFlex,
            fontWeight = FontWeight.Bold,
            fontSize = 32.sp,
            lineHeight = 1.5.em,
            platformStyle = PlatformTextStyle(
                includeFontPadding = false
            ),
            lineHeightStyle = LineHeightStyle(
                alignment = LineHeightStyle.Alignment.Center,
                trim = LineHeightStyle.Trim.None
            ),
            textDirection = TextDirection.Rtl
        )
    )

}