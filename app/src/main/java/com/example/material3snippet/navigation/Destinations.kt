package com.example.material3snippet.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.material3snippet.R

sealed class Destination(
    val icon: ImageVector,
    val route: String,
    @StringRes val resId: Int
) {
    object Buttons : Destination(
        icon = Icons.Filled.CheckCircle,
        route = "main/buttons",
        resId = R.string.screen_buttons
    )
}