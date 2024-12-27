package com.alimmz.steptracker.core.ui.theme.colors

import androidx.compose.ui.graphics.Color


data class TextThemeColorMode(
    val light: Color,
    val dark: Color,
)

data class TextThemeColors(
    val textGeneralBrand: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Primary.c900,
        dark = AppColors.Primary.c900,
    ),
    val textGeneralWhite: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Others.Black,
    ),
    val textGeneralBlack: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Others.Black,
        dark = AppColors.Others.White,
    ),
    val textGeneralTextLight: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c900,
        dark = AppColors.Others.White,
    ),
    val textGeneralTextDark: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.GreyScale.c900,
    ),
    val textGreyScale900: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c900,
        dark = AppColors.GreyScale.c50,
    ),
    val textGreyScale800: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c800,
        dark = AppColors.GreyScale.c100,
    ),
    val textGreyScale700: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c700,
        dark = AppColors.GreyScale.c200,
    ),
    val textGreyScale600: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c600,
        dark = AppColors.GreyScale.c300,
    ),
    val textGreyScale500: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c400,
    ),
    val textGreyScale400: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c400,
        dark = AppColors.GreyScale.c500,
    ),
    val textGreyScale300: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c300,
        dark = AppColors.GreyScale.c600,
    ),
    val textGreyScale200: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c200,
        dark = AppColors.GreyScale.c700,
    ),
    val textGreyScale100: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c100,
        dark = AppColors.GreyScale.c800,
    ),
    val textGreyScale50: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c50,
        dark = AppColors.GreyScale.c900,
    ),
    val textAlertStatusInfoPrimary: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.AlertStatus.InfoPrimary,
        dark = AppColors.AlertStatus.InfoPrimary,
    ),
    val textAlertStatusInfo: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.AlertStatus.Info,
        dark = AppColors.AlertStatus.Info,
    ),
    val textAlertStatusSuccess: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.AlertStatus.Success,
        dark = AppColors.AlertStatus.Success,
    ),
    val textAlertStatusWarning: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.AlertStatus.Warning,
        dark = AppColors.AlertStatus.Warning,
    ),
    val textAlertStatusError: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.AlertStatus.Error,
        dark = AppColors.AlertStatus.Error,
    ),
    val textComponentTextFilled: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Others.White,
    ),
    val textComponentSearchTextLight: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c400,
        dark = AppColors.GreyScale.c600,
    ),
    val textComponentSearchTextDark: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c600,
        dark = AppColors.GreyScale.c400,
    ),
    val textComponentMenuBarText500: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c500,
    ),
    val textComponentTextFormDefault500: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c500,
    ),
    val textComponentTextFormDisabled600: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c600,
        dark = AppColors.GreyScale.c600,
    ),
    val textComponentSeatAvailableLight: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Primary.c600,
        dark = AppColors.Others.White,
    ),
    val textComponentSeatAvailableDark: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Primary.c600,
    ),
    val textComponentBrandLight: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Primary.c900,
        dark = AppColors.Others.White,
    ),
    val textComponentBrandDark: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Primary.c900,
    ),
    val textButtonsBrand: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Primary.c900,
        dark = AppColors.Primary.c900,
    ),
    val textButtonsBrandLight: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Primary.c900,
        dark = AppColors.Others.White,
    ),
    val textButtonsWhiteDark: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Primary.c900,
    ),
    val textButtonsWhite: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Others.White,
    ),
    val textButtonsGreyScale900: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c900,
        dark = AppColors.GreyScale.c900,
    ),
    val textButtonsSocialMediaLight: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c900,
        dark = AppColors.Others.White,
    ),
    val textButtonsSocialMediaDark: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.GreyScale.c900,
    ),
    val textInputFormDefaultLight: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c400,
        dark = AppColors.GreyScale.c700,
    ),
    val textInputFormReadOnlyLight: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c700,
        dark = AppColors.GreyScale.c500,
    ),
    val textInputFormDisabledLight: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c700,
    ),
    val textInputFormDefaultDark: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c700,
        dark = AppColors.GreyScale.c400,
    ),
    val textInputFormReadOnlyDark: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c700,
    ),
    val textInputFormDisabledDark: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c700,
        dark = AppColors.GreyScale.c500,
    ),
    val textTagSolidDefault600: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c600,
        dark = AppColors.GreyScale.c600,
    ),
    val textTagInvertedDefaultLight: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c600,
        dark = AppColors.GreyScale.c300,
    ),
    val textTagInvertedDefaultDark: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c300,
        dark = AppColors.GreyScale.c600,
    ),
    val textAdditionalAbsoluteBrand: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Primary.c900,
        dark = AppColors.Primary.c900,
    ),
    val textAdditionalAbsoluteWhite: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Others.White,
    ),
    val textAdditionalAbsolute900: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.GreyScale.c900,
        dark = AppColors.GreyScale.c900,
    ),
    val textAdditionalLightBrand: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Primary.c900,
        dark = AppColors.Others.White,
    ),
    val textAdditionalDarkBrand: TextThemeColorMode = TextThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Primary.c900,
    ),
)