package com.example.apppoli.ui.theme

import android.app.Activity
import android.os.Build
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext

private val LightColorScheme = lightColorScheme(
    primary = BluePrimary,
    secondary = BlueSecondary,
    background = LightGray,
    surface = Color.White,
    onPrimary = Color.White,
    onBackground = DarkGray
)

private val DarkColorScheme = darkColorScheme(
    primary = BlueSecondary,
    background = DarkGray,
    surface = DarkGray,
    onPrimary = Color.Black
)

@Composable
fun AppPOLITheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = if (darkTheme) DarkColorScheme else LightColorScheme

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography(),
        content = content
    )
}