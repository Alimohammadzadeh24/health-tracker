package com.alimmz.steptracker.core.ui.theme.colors

import androidx.compose.ui.graphics.Color


data class SurfaceThemeColorMode(
    val light: Color,
    val dark: Color,
)


data class SurfaceThemeColors(
    val surfaceGeneralBrand: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Primary.c900,
        dark = AppColors.Primary.c900,
    ),
    val surfaceGeneralWhite: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Others.Black,
    ),
    val surfaceGeneralBlack: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Black,
        dark = AppColors.Others.White,
    ),
    val surfaceGeneralSurfaceLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c900,
        dark = AppColors.Others.White,
    ),
    val surfaceGeneralSurfaceDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.GreyScale.c900,
    ),
    val surfaceAlertsStatusInfoPrimary: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.AlertStatus.InfoPrimary,
        dark = AppColors.AlertStatus.InfoPrimary,
    ),
    val surfaceAlertsStatusInfo: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.AlertStatus.Info,
        dark = AppColors.AlertStatus.Info,
    ),
    val surfaceAlertsStatusSuccess: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.AlertStatus.Success,
        dark = AppColors.AlertStatus.Success,
    ),
    val surfaceAlertsStatusWarning: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.AlertStatus.Warning,
        dark = AppColors.AlertStatus.Warning,
    ),
    val surfaceAlertsStatusError: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.AlertStatus.Error,
        dark = AppColors.AlertStatus.Error,
    ),
    val surfaceAlertsStatusLightDisabled: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.AlertStatus.LightDisabled,
        dark = AppColors.AlertStatus.DarkDisabled,
    ),
    val surfaceAlertsStatusDarkDisabled: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.AlertStatus.DarkDisabled,
        dark = AppColors.AlertStatus.LightDisabled,
    ),
    val surfaceAlertsStatusButtonDisabled: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.AlertStatus.ButtonDisabled,
        dark = AppColors.AlertStatus.ButtonDisabled,
    ),
    val surfaceGreyScale900: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c900,
        dark = AppColors.GreyScale.c50,
    ),
    val surfaceGreyScale800: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c800,
        dark = AppColors.GreyScale.c100,
    ),
    val surfaceGreyScale700: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c700,
        dark = AppColors.GreyScale.c200,
    ),
    val surfaceGreyScale600: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c600,
        dark = AppColors.GreyScale.c300,
    ),
    val surfaceGreyScale500: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c400,
    ),
    val surfaceGreyScale400: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c400,
        dark = AppColors.GreyScale.c500,
    ),
    val surfaceGreyScale300: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c300,
        dark = AppColors.GreyScale.c600,
    ),
    val surfaceGreyScale200: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c200,
        dark = AppColors.GreyScale.c700,
    ),
    val surfaceGreyScale100: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c100,
        dark = AppColors.GreyScale.c800,
    ),
    val surfaceGreyScale50: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c50,
        dark = AppColors.GreyScale.c900,
    ),
    val surfaceOthersRed: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Red,
        dark = AppColors.Others.Red,
    ),
    val surfaceOthersPink: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Pink,
        dark = AppColors.Others.Pink,
    ),
    val surfaceOthersPurple: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Purple,
        dark = AppColors.Others.Purple,
    ),
    val surfaceOthersDeepPurple: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.DeepPurple,
        dark = AppColors.Others.DeepPurple,
    ),
    val surfaceOthersIndigo: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Indigo,
        dark = AppColors.Others.Indigo,
    ),
    val surfaceOthersBlue: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Blue,
        dark = AppColors.Others.Blue,
    ),
    val surfaceOthersLightBlue: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.LightBlue,
        dark = AppColors.Others.LightBlue,
    ),
    val surfaceOthersCyan: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Cyan,
        dark = AppColors.Others.Cyan,
    ),
    val surfaceOthersTeal: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Teal,
        dark = AppColors.Others.Teal,
    ),
    val surfaceOthersGreen: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Green,
        dark = AppColors.Others.Green,
    ),
    val surfaceOthersLightGreen: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.LightGreen,
        dark = AppColors.Others.LightGreen,
    ),
    val surfaceOthersLime: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Lime,
        dark = AppColors.Others.Lime,
    ),
    val surfaceOthersYellow: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Yellow,
        dark = AppColors.Others.Yellow,
    ),
    val surfaceOthersAmber: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Amber,
        dark = AppColors.Others.Amber,
    ),
    val surfaceOthersOrange: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Orange,
        dark = AppColors.Others.Orange,
    ),
    val surfaceOthersDeepOrange: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.DeepOrange,
        dark = AppColors.Others.DeepOrange,
    ),
    val surfaceOthersBrown: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.Brown,
        dark = AppColors.Others.Brown,
    ),
    val surfaceOthersBlueGrey: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.BlueGrey,
        dark = AppColors.Others.BlueGrey,
    ),
    val surfaceBackgroundsPrimary: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Primary,
        dark = AppColors.Backgrounds.Primary,
    ),
    val surfaceBackgroundsBlue: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Blue,
        dark = AppColors.Backgrounds.Blue,
    ),
    val surfaceBackgroundsPurple: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Purple,
        dark = AppColors.Backgrounds.Purple,
    ),
    val surfaceBackgroundsGreen: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Green,
        dark = AppColors.Backgrounds.Green,
    ),
    val surfaceBackgroundsOrange: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Orange,
        dark = AppColors.Backgrounds.Orange,
    ),
    val surfaceBackgroundsRed: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Red,
        dark = AppColors.Backgrounds.Red,
    ),
    val surfaceBackgroundsTeal: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Teal,
        dark = AppColors.Backgrounds.Teal,
    ),
    val surfaceBackgroundsBrown: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Brown,
        dark = AppColors.Backgrounds.Brown,
    ),
    val surfaceBackgroundsYellow: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Yellow,
        dark = AppColors.Backgrounds.Yellow,
    ),
    val surfaceBackgroundsGrey: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Grey,
        dark = AppColors.Backgrounds.Grey,
    ),
    val surfaceTransparentPrimary: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Transparent.Primary,
        dark = AppColors.Transparent.Primary,
    ),
    val surfaceTransparentRed: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Transparent.Red,
        dark = AppColors.Transparent.Red,
    ),
    val surfaceTransparentBlue: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Transparent.Blue,
        dark = AppColors.Transparent.Blue,
    ),
    val surfaceTransparentPurple: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Transparent.Purple,
        dark = AppColors.Transparent.Purple,
    ),
    val surfaceTransparentGreen: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Transparent.Green,
        dark = AppColors.Transparent.Green,
    ),
    val surfaceTransparentOrange: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Transparent.Orange,
        dark = AppColors.Transparent.Orange,
    ),
    val surfaceTransparentTeal: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Transparent.Teal,
        dark = AppColors.Transparent.Teal,
    ),
    val surfaceTransparentBrown: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Transparent.Brown,
        dark = AppColors.Transparent.Brown,
    ),
    val surfaceTransparentYellow: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Transparent.Yellow,
        dark = AppColors.Transparent.Yellow,
    ),
    val surfaceTransparentGrey: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Transparent.Grey,
        dark = AppColors.Transparent.Grey,
    ),
    //    --------------------------------------------------
    val surfaceLightDarkLight1: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Dark.c1,
    ),
    val surfaceLightDarkLight2: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Dark.c2,
    ),
    val surfaceLightDarkLight3: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Dark.c3,
    ),
    val surfaceLightDarkLight4: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c50,
        dark = AppColors.Dark.c3,
    ),
    val surfaceLightDarkLight5: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c100,
        dark = AppColors.Dark.c2,
    ),
    val surfaceLightDarkLight6: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c100,
        dark = AppColors.Dark.c3,
    ),
    val surfaceLightDarkLight7: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c100,
        dark = AppColors.Dark.c4,
    ),
    val surfaceLightDarkLight8: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c200,
        dark = AppColors.Dark.c5,
    ),
    val surfaceLightDarkLight9: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c300,
        dark = AppColors.Dark.c5,
    ),
    val surfaceLightDarkLightBackground: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c100,
        dark = AppColors.Dark.c1,
    ),
    val surfaceLightDarkDark1: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c1,
        dark = AppColors.Others.White,
    ),
    val surfaceLightDarkDark2: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c2,
        dark = AppColors.Others.White,
    ),
    val surfaceLightDarkDark3: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c3,
        dark = AppColors.Others.White,
    ),
    val surfaceLightDarkDark4: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c3,
        dark = AppColors.GreyScale.c50,
    ),
    val surfaceLightDarkDark5: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c2,
        dark = AppColors.GreyScale.c100,
    ),
    val surfaceLightDarkDark6: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c3,
        dark = AppColors.GreyScale.c100,
    ),
    val surfaceLightDarkDark7: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c4,
        dark = AppColors.GreyScale.c100,
    ),
    val surfaceLightDarkDark8: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c5,
        dark = AppColors.GreyScale.c200,
    ),
    val surfaceLightDarkDark9: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c5,
        dark = AppColors.GreyScale.c300,
    ),
    val surfaceLightDarkDarkBackground: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c1,
        dark = AppColors.GreyScale.c100,
    ),
    //    --------------------------------------------------
    val surfaceComponentSurfaceFilled: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Others.White,
    ),
    val surfaceComponentGeneralFrameLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c50,
        dark = AppColors.Dark.c3,
    ),
    val surfaceComponentGeneralFrameDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c3,
        dark = AppColors.GreyScale.c50,
    ),
    val surfaceComponentDropDownLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Dark.c4,
    ),
    val surfaceComponentDropDownDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c4,
        dark = AppColors.Others.White,
    ),
    val surfaceComponentDropDownIconLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c900,
        dark = AppColors.GreyScale.c50,
    ),
    val surfaceComponentDropDownIconDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c900,
        dark = AppColors.GreyScale.c900,
    ),
    val surfaceComponentModalLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Dark.c3,
    ),
    val surfaceComponentModalDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c3,
        dark = AppColors.Others.White,
    ),
    val surfaceComponentBottomBarActionLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Dark.c1,
    ),
    val surfaceComponentBottomBarActionDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c1,
        dark = AppColors.Others.White,
    ),
    val surfaceComponentSearchSurfaceLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c400,
        dark = AppColors.GreyScale.c600,
    ),
    val surfaceComponentSearchSurfaceDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c600,
        dark = AppColors.GreyScale.c400,
    ),
    val surfaceComponentCategoryMenuLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Primary,
        dark = AppColors.Dark.c5,
    ),
    val surfaceComponentCategoryMenuDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c5,
        dark = AppColors.Backgrounds.Primary,
    ),
    val surfaceComponentMenuBarIcon500: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c500,
    ),
    val surfaceComponentMenuBarSurfaceLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = Color(0xff181A20).copy(alpha = 85f),
    ),
    val surfaceComponentMenuBarSurfaceDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = Color(0xff181A20).copy(alpha = 85f),
        dark = AppColors.Others.White,
    ),
    val surfaceComponentIconFormDefault500: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c500,
    ),
    val surfaceComponentIconFormDisabled600: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c600,
        dark = AppColors.GreyScale.c600,
    ),
    val surfaceComponentMapBackgroundLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Primary.c50,
        dark = AppColors.Dark.c3,
    ),
    val surfaceComponentMapBackgroundDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c3,
        dark = AppColors.Primary.c50,
    ),
    val surfaceComponentMapRoadLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Dark.c5,
    ),
    val surfaceComponentMapRoadDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c5,
        dark = AppColors.Others.White,
    ),
    val surfaceComponentBrandLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Primary.c900,
        dark = AppColors.Others.White,
    ),
    val surfaceComponentBrandDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Primary.c900,
    ),
    //    --------------------------------------------------
    val surfaceButtonsBrand: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Primary.c900,
        dark = AppColors.Primary.c900,
    ),
    val surfaceButtonsLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Primary,
        dark = AppColors.Dark.c5,
    ),
    val surfaceButtonsDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c5,
        dark = AppColors.Backgrounds.Primary,
    ),
    val surfaceButtonsDisabled: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.AlertStatus.ButtonDisabled,
        dark = AppColors.AlertStatus.ButtonDisabled,
    ),
    val surfaceButtonsSocialMediaLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Dark.c3,
    ),
    val surfaceButtonsSocialMediaDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c3,
        dark = AppColors.Others.White,
    ),
    val surfaceButtonsButton50: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c50,
        dark = AppColors.GreyScale.c50,
    ),
    val surfaceButtonsGreyScaleIcon900: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c900,
        dark = AppColors.GreyScale.c900,
    ),
    val surfaceButtonsWhiteIcon: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Others.White,
    ),
    val surfaceButtonsBrandLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Primary.c900,
        dark = AppColors.Others.White,
    ),
    val surfaceButtonsWhiteDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Others.White,
        dark = AppColors.Primary.c900,
    ),
    //    --------------------------------------------------
    val surfaceInputForm2DefaultLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c800,
    ),
    val surfaceInputForm2ReadOnlyLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.Dark.c5,
    ),
    val surfaceInputForm2DefaultDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c800,
        dark = AppColors.GreyScale.c500,
    ),
    val surfaceInputForm2ReadOnlyDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Dark.c5,
        dark = AppColors.GreyScale.c500,
    ),
    val surfaceInputForm2ReadOnlyIconDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c700,
    ),
    val surfaceInputForm2ReadOnlyIconLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c700,
        dark = AppColors.GreyScale.c500,
    ),
    val surfaceInputForm2DisabledIconLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c500,
        dark = AppColors.GreyScale.c700,
    ),
    val surfaceInputForm2DisabledIconDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c700,
        dark = AppColors.GreyScale.c500,
    ),
    //    --------------------------------------------------
    val surfaceTagSolidDefaultGrey600: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.GreyScale.c600,
        dark = AppColors.GreyScale.c600,
    ),
    val surfaceTagInvertedDefaultLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Grey,
        dark = AppColors.Dark.c5,
    ),
    val surfaceTagInvertedInfoLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Primary,
        dark = AppColors.Dark.c5,
    ),
    val surfaceTagInvertedSuccessLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Green,
        dark = AppColors.Dark.c5,
    ),
    val surfaceTagInvertedWarningLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Yellow,
        dark = AppColors.Dark.c5,
    ),
    val surfaceTagInvertedErrorLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light = AppColors.Backgrounds.Red,
        dark = AppColors.Dark.c5,
    ),
    val surfaceTagInvertedDefaultDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.Dark.c5,
        dark = AppColors.Backgrounds.Grey,
    ),
    val surfaceTagInvertedInfoDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.Dark.c5,
        dark = AppColors.Backgrounds.Primary,
    ),
    val surfaceTagInvertedSuccessDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.Dark.c5,
        dark = AppColors.Backgrounds.Green,
    ),
    val surfaceTagInvertedWarningDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.Dark.c5,
        dark = AppColors.Backgrounds.Yellow,
    ),
    val surfaceTagInvertedErrorDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.Dark.c5,
        dark = AppColors.Backgrounds.Red,
    ),
    //    --------------------------------------------------
    val surfaceAdditionalOverColorFrameLight: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.Others.White,
        dark = AppColors.Others.White,
    ),
    val surfaceAdditionalOverColorFrameDark: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.GreyScale.c900,
        dark = AppColors.GreyScale.c900,
    ),
    val surfaceAdditionalAbsoluteBrand: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.Primary.c900,
        dark = AppColors.Primary.c900,
    ),
    val surfaceAdditionalAbsoluteWhite: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.Others.White,
        dark = AppColors.Others.White,
    ),
    val surfaceAdditionalAbsolute900: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.GreyScale.c900,
        dark = AppColors.GreyScale.c900
    ),
    val surfaceAdditionalLightBrand: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.Primary.c900,
        dark = AppColors.Others.White,
    ),
    val surfaceAdditionalDarkBrand: SurfaceThemeColorMode = SurfaceThemeColorMode(
        light =AppColors.Others.White,
        dark = AppColors.Primary.c900,
    ),
)