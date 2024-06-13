package com.example.material3snippet.theme

import android.app.Activity
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.material3.lightColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.SideEffect
import androidx.compose.ui.graphics.toArgb
import androidx.compose.ui.platform.LocalView
import androidx.core.view.WindowCompat

private val LightColorScheme = lightColorScheme(
    primary = Purple40,
    onPrimary = White,
    primaryContainer = Purple90,
    onPrimaryContainer = Purple10,
    inversePrimary = Purple80,
    secondary = PurpleGrey40,
    onSecondary = White,
    secondaryContainer = PurpleGrey90,
    onSecondaryContainer = PurpleGrey10,
    tertiary = Pink40,
    onTertiary = White,
    tertiaryContainer = Pink90,
    onTertiaryContainer = Pink10,
    background = Neutral98,
    onBackground = Neutral10,
    surface = Neutral98,
    onSurface = Neutral10,
    surfaceVariant = NeutralVariant90,
    onSurfaceVariant = NeutralVariant30,
    surfaceTint = Purple40,
    inverseSurface = Neutral20,
    inverseOnSurface = Neutral95,
    error = Red40,
    onError = White,
    errorContainer = Red90,
    onErrorContainer = Red10,
    outline = NeutralVariant50,
    outlineVariant = NeutralVariant80,
    scrim = Black,
    surfaceBright = Neutral98,
    surfaceContainer = Neutral94,
    surfaceContainerHigh = Neutral92,
    surfaceContainerHighest = Neutral90,
    surfaceContainerLow = Neutral96,
    surfaceContainerLowest = White,
    surfaceDim = Neutral87
)

private val DarkColorScheme = darkColorScheme(
    primary = Purple80,
    onPrimary = Purple20,
    primaryContainer = Purple30,
    onPrimaryContainer = Purple90,
    inversePrimary = Purple40,
    secondary = PurpleGrey80,
    onSecondary = PurpleGrey20,
    secondaryContainer = PurpleGrey30,
    onSecondaryContainer = PurpleGrey90,
    tertiary = Red80,
    onTertiary = Red20,
    tertiaryContainer = Red30,
    onTertiaryContainer = Red90,
    background = Neutral06,
    onBackground = Neutral90,
    surface = Neutral06,
    onSurface = Neutral90,
    surfaceVariant = NeutralVariant30,
    onSurfaceVariant = NeutralVariant80,
    surfaceTint = Purple80,
    inverseSurface = Neutral90,
    inverseOnSurface = Neutral20,
    error = Red80,
    onError = Red20,
    errorContainer = Red30,
    onErrorContainer = Red90,
    outline = NeutralVariant60,
    outlineVariant = NeutralVariant30,
    scrim = Black,
    surfaceBright = Neutral24,
    surfaceContainer = Neutral12,
    surfaceContainerHigh = Neutral17,
    surfaceContainerHighest = Neutral22,
    surfaceContainerLow = Neutral10,
    surfaceContainerLowest = Neutral04,
    surfaceDim = Neutral06
)

@Composable
fun Material3SnippetTheme(
    darkTheme: Boolean = isSystemInDarkTheme(),
    content: @Composable () -> Unit
) {
    val colorScheme = when {
        darkTheme -> DarkColorScheme
        else -> LightColorScheme
    }

    val view = LocalView.current
    if (!view.isInEditMode) {
        SideEffect {
            val window = (view.context as Activity).window
            window.statusBarColor = colorScheme.primary.toArgb()
            WindowCompat.getInsetsController(window, view).isAppearanceLightStatusBars = darkTheme
        }
    }

    MaterialTheme(
        colorScheme = colorScheme,
        typography = Typography,
        content = content
    )
}