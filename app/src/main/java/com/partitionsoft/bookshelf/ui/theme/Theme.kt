package com.partitionsoft.bookshelf.ui.theme

import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors
import androidx.compose.runtime.Composable

private val paletaOscura = darkColors(
    primary = Mint200,
    primaryVariant = Mint700,
    secondary = Teal200
)

private val paletaClara = lightColors(
    primary = Mint500,
    primaryVariant = Mint700,
    secondary = Teal200
)

@Composable
fun BookShelfTheme(darkTheme: Boolean = isSystemInDarkTheme(), content: @Composable () -> Unit) {
    val colors = if (darkTheme) {
        paletaOscura
    } else {
        paletaClara
    }

    MaterialTheme(
        colors = colors,
        typography = Typography,
        shapes = Shapes,
        content = content
    )
}