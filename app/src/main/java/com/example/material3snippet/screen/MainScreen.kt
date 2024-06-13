package com.example.material3snippet.screen

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.material3snippet.theme.Material3SnippetTheme
import com.example.material3snippet.R
import com.example.material3snippet.components.MyBottomAppBar
import com.example.material3snippet.navigation.Destination

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {
    val navController = rememberNavController()

    Scaffold(
        topBar = {
            TopAppBar(title = {
                Text(stringResource(id = R.string.top_app_bar))
            })
        },
        bottomBar = { MyBottomAppBar(
            destinations = listOf(Destination.Buttons, Destination.Cards),
            onDestination = { navController.navigate(it.route) }
        ) },
    ) { paddingValues ->
        MainScreenNavHost(
            navController = navController,
            modifier = Modifier.padding(paddingValues)
        )
    }
}

@Composable
fun MainScreenNavHost(
    navController: NavHostController,
    modifier: Modifier = Modifier
) {
    NavHost(
        navController = navController,
        startDestination = Destination.Buttons.route,
        modifier = modifier
    ) {
        composable(route = Destination.Buttons.route) {
            ButtonsScreen()
        }

        composable(route = Destination.Cards.route) {
            CardsScreen()
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun MainScreenPreview() {
    Material3SnippetTheme {
        MainScreen()
    }
}