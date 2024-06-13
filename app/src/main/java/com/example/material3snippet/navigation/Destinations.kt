package com.example.material3snippet.navigation

import androidx.annotation.StringRes
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.CheckCircle
import androidx.compose.ui.graphics.vector.ImageVector
import com.example.material3snippet.R

sealed class Destination(
    val icon: ImageVector,
    val route: String,
    @StringRes val resId: Int
) {
    data object Buttons : Destination(
        icon = Icons.Filled.CheckCircle,
        route = "main/buttons",
        resId = R.string.screen_buttons
    )

    data object Cards : Destination(
        icon = Icons.Filled.AccountCircle,
        route = "main/cards",
        resId = R.string.screen_buttons
    )
}