package com.alimmz.steptracker.core.ui.theme.colors

import androidx.compose.ui.graphics.Color


data class StrokeThemeColorMode(
    val light: Color,
    val dark: Color,
)


data class StrokeThemeColors(
    val strokeGeneralBrand: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.Primary.c900,
        dark = AppColors.Primary.c900,
    ),
    val strokeGeneralWhite: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Others.Black,
    ),
    val strokeGeneralBlackWhite: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.Others.Black,
        dark = AppColors.Others.White,
    ),
    val strokeGeneralGreyScale900: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.GreyScale.c900,
        dark = AppColors.GreyScale.c50,
    ),
    val strokeGeneralGreyScale800: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.GreyScale.c800,
        dark = AppColors.GreyScale.c100,
    ),
    val strokeGeneralGreyScale700: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.GreyScale.c700,
        dark = AppColors.GreyScale.c200,
    ),
    val strokeGeneralGreyScale600: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.GreyScale.c600,
        dark = AppColors.GreyScale.c300,
    ),
    val strokeGeneralGreyScale500: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c400,
    ),
    val strokeGeneralGreyScale400: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.GreyScale.c400,
        dark = AppColors.GreyScale.c500,
    ),
    val strokeGeneralGreyScale300: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.GreyScale.c300,
        dark = AppColors.GreyScale.c600,
    ),
    val strokeGeneralGreyScale200: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.GreyScale.c200,
        dark = AppColors.GreyScale.c700,
    ),
    val strokeGeneralGreyScale100: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.GreyScale.c100,
        dark = AppColors.GreyScale.c800,
    ),
    val strokeGeneralGreyScale50: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.GreyScale.c50,
        dark = AppColors.GreyScale.c900,
    ),
    val strokeAlertStatusInfoPrimary: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.AlertStatus.InfoPrimary,
        dark = AppColors.AlertStatus.InfoPrimary,
    ),
    val strokeAlertStatusInfo: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.AlertStatus.Info,
        dark = AppColors.AlertStatus.Info,
    ),
    val strokeAlertStatusSuccess: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.AlertStatus.Success,
        dark = AppColors.AlertStatus.Success,
    ),
    val strokeAlertStatusWarning: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.AlertStatus.Warning,
        dark = AppColors.AlertStatus.Warning,
    ),
    val strokeAlertStatusError: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.AlertStatus.Error,
        dark = AppColors.AlertStatus.Error,
    ),
    val strokeAlertStatusLightDisabled: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.AlertStatus.LightDisabled,
        dark = AppColors.AlertStatus.LightDisabled,
    ),
    val strokeAlertStatusDarkDisabled: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.AlertStatus.DarkDisabled,
        dark = AppColors.AlertStatus.DarkDisabled,
    ),
    val strokeAlertStatusButtonDisabled: StrokeThemeColorMode = StrokeThemeColorMode(
        light = AppColors.AlertStatus.ButtonDisabled,
        dark = AppColors.AlertStatus.ButtonDisabled,
    ),
    val strokeComponentDropDown: Color,
    val strokeComponentSearchStrokeLight: Color,
    val strokeComponentSearchStrokeDark: Color,
    val strokeComponentBrandLight: Color,
    val strokeComponentBrandDark: Color,
    val strokeComponentBottomBarStrokeLight: Color,
    val strokeComponentBottomBarStrokeDark: Color,
    val strokeComponentIconFormLight: Color,
    val strokeComponentIconFormDark: Color,
    val strokeButtonsSocialMediaLight: Color,
    val strokeButtonsSocialMediaDark: Color,
    val strokeInputForm2DefaultLight: Color,
    val strokeInputForm2ReadOnlyLight: Color,
    val strokeInputForm2DisabledLight: Color,
    val strokeInputForm2DefaultDark: Color,
    val strokeInputForm2ReadOnlyDark: Color,
    val strokeInputForm2DisabledDark: Color,
    val strokeTagSolidDefaultGrey600: Color,
    val strokeTagInvertedDefaultLight: Color,
    val strokeTagInvertedInfoLight: Color,
    val strokeTagInvertedSuccessLight: Color,
    val strokeTagInvertedWarningLight: Color,
    val strokeTagInvertedErrorLight: Color,
    val strokeTagInvertedDefaultDark: Color,
    val strokeTagInvertedInfoDark: Color,
    val strokeTagInvertedSuccessDark: Color,
    val strokeTagInvertedWarningDark: Color,
    val strokeTagInvertedErrorDark: Color,
    val strokeAdditionalLightGrey: Color,
    val strokeAdditionalDarkGrey: Color,
    val strokeAdditionalLightBrand: Color,
    val strokeAdditionalDarkBrand: Color
)