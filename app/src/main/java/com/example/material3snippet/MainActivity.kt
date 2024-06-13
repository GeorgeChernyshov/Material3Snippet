package com.example.material3snippet

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.runtime.Composable
import com.example.material3snippet.screen.MainScreen
import com.example.material3snippet.theme.Material3SnippetTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent { App() }
    }
}

@Composable
fun App() {
    Material3SnippetTheme {
        MainScreen()
    }
}