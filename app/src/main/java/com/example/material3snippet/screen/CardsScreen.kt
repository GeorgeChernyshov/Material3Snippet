package com.example.material3snippet.screen

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Card
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.OutlinedCard
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.material3snippet.theme.Material3SnippetTheme
import com.example.material3snippet.R

@Composable
fun CardsScreen() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(horizontal = 16.dp)
            .verticalScroll(rememberScrollState())
    ) {
        Card(Modifier.size(width = 240.dp, height = 100.dp)) {
            Text(
                text = stringResource(id = R.string.filled_card),
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center,
            )
        }

        ElevatedCard(
            modifier = Modifier.size(width = 240.dp, height = 100.dp)
                .padding(top = 16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.elevated_card),
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center,
            )
        }
        
        OutlinedCard(
            modifier = Modifier.size(width = 240.dp, height = 100.dp)
                .padding(top = 16.dp)
        ) {
            Text(
                text = stringResource(id = R.string.outlined_card),
                modifier = Modifier.padding(16.dp),
                textAlign = TextAlign.Center,
            )
        }
    }
}

@Preview(showBackground = true)
@Composable
fun CardsScreenPreview() {
    Material3SnippetTheme {
        CardsScreen()
    }
}