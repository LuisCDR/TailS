package com.example.tails.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val DarkColorPalette = darkColors(
    primary = CuriousBlue,
    secondary = Saffron,
    background = BrightGray,
    error = PickedBluewood,
    surface = CuriousBlue,
    onPrimary = Beeswax,
    onSecondary = Beeswax,
    onBackground = Beeswax,
    onError = Punch,
    onSurface = Beeswax
)

private val LightColorPalette = lightColors(
    primary = Saffron,
    secondary = CuriousBlue,
    background = Beeswax,
    error = Punch,
    surface = Saffron,
    onPrimary = BrightGray,
    onSecondary = BrightGray,
    onBackground = BrightGray,
    onError = PickedBluewood,
    onSurface = BrightGray
)

@Composable
fun TailSTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        DarkColorPalette
    } else {
        LightColorPalette
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}