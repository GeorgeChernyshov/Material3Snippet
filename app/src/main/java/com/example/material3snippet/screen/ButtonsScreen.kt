package com.example.material3snippet.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.RowScope
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.ButtonElevation
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.FilledTonalButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.material3snippet.theme.Material3SnippetTheme
import com.example.material3snippet.R

@Composable
fun ButtonsScreen() {
    Column(
        modifier = Modifier.fillMaxSize()
            .verticalScroll(rememberScrollState())
    ) {
        Button(
            onClick = {  },
            enabled = true
        ) {
            Text(stringResource(id = R.string.filled_button))
        }

        Button(
            onClick = {  },
            enabled = false
        ) {
            Text(stringResource(id = R.string.filled_button_disabled))
        }

        FilledTonalButton(
            onClick = {  },
            enabled = true
        ) {
            Text(stringResource(id = R.string.filled_tonal_button))
        }

        FilledTonalButton(
            onClick = {  },
            enabled = false
        ) {
            Text(stringResource(id = R.string.filled_tonal_button_disabled))
        }

        MyFilledTonalButton(
            onClick = {  },
            enabled = true
        ) {
            Text(stringResource(id = R.string.my_filled_tonal_button))
        }

        MyFilledTonalButton(
            onClick = {  },
            enabled = false
        ) {
            Text(stringResource(id = R.string.my_filled_tonal_button_disabled))
        }

        OutlinedButton(
            onClick = { },
            enabled = true
        ) {
            Text(stringResource(id = R.string.outlined_button))
        }

        OutlinedButton(
            onClick = { },
            enabled = false
        ) {
            Text(stringResource(id = R.string.outlined_button_disabled))
        }

        MyOutlinedButton(
            onClick = { },
            enabled = true
        ) {
            Text(stringResource(id = R.string.my_outlined_button))
        }

        MyOutlinedButton(
            onClick = { },
            enabled = false
        ) {
            Text(stringResource(id = R.string.my_outlined_button))
        }
        
        ElevatedButton(
            onClick = { },
            enabled = true
        ) {
            Text(text = stringResource(id = R.string.elevated_button))
        }

        ElevatedButton(
            onClick = { },
            enabled = false
        ) {
            Text(text = stringResource(id = R.string.elevated_button_disabled))
        }

        MyElevatedButton(
            onClick = { },
            enabled = true
        ) {
            Text(text = stringResource(id = R.string.my_elevated_button))
        }

        MyElevatedButton(
            onClick = { },
            enabled = false
        ) {
            Text(text = stringResource(id = R.string.my_elevated_button_disabled))
        }
        
        TextButton(
            onClick = { /*TODO*/ },
            enabled = true
        ) {
            Text(text = stringResource(id = R.string.text_button))
        }

        TextButton(
            onClick = { /*TODO*/ },
            enabled = false
        ) {
            Text(text = stringResource(id = R.string.text_button_disabled))
        }

        MyTextButton(
            onClick = { /*TODO*/ },
            enabled = true
        ) {
            Text(text = stringResource(id = R.string.text_button))
        }

        MyTextButton(
            onClick = { /*TODO*/ },
            enabled = false
        ) {
            Text(text = stringResource(id = R.string.text_button_disabled))
        }
    }
}

@Composable
fun MyFilledTonalButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable (RowScope.() -> Unit)
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonColors(
            containerColor = MaterialTheme.colorScheme.secondaryContainer,
            contentColor = MaterialTheme.colorScheme.onSecondaryContainer,
            disabledContainerColor = MaterialTheme.colorScheme
                .onSurface
                .copy(alpha = 0.12f),
            disabledContentColor = MaterialTheme.colorScheme
                .onSurface
                .copy(alpha = 0.38f)
        )
    ) { content() }
}

@Composable
fun MyOutlinedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable (RowScope.() -> Unit)
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonColors(
            containerColor = Color.Transparent,
            contentColor = MaterialTheme.colorScheme.primary,
            disabledContainerColor = Color.Transparent,
            disabledContentColor = MaterialTheme.colorScheme
                .onSurface
                .copy(alpha = 0.38f)
        ),
        border = BorderStroke(
            width = 1.0.dp,
            color = if (enabled)
                MaterialTheme.colorScheme.outline
            else MaterialTheme.colorScheme.outline.copy(alpha = 0.12f)
        )
    ) { content() }
}

@Composable
fun MyElevatedButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable (RowScope.() -> Unit)
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonColors(
            containerColor = MaterialTheme.colorScheme.surfaceContainerLow,
            contentColor = MaterialTheme.colorScheme.primary,
            disabledContainerColor = MaterialTheme.colorScheme
                .onSurface
                .copy(alpha = 0.12f),
            disabledContentColor = MaterialTheme.colorScheme
                .onSurface
                .copy(alpha = 0.38f)
        ),
        elevation = ButtonDefaults.buttonElevation(
            defaultElevation = 1.0.dp,
            pressedElevation = 1.0.dp,
            focusedElevation = 1.0.dp,
            hoveredElevation = 3.0.dp,
            disabledElevation = 0.0.dp
        )
    ) { content() }
}

@Composable
fun MyTextButton(
    onClick: () -> Unit,
    modifier: Modifier = Modifier,
    enabled: Boolean = true,
    content: @Composable (RowScope.() -> Unit)
) {
    Button(
        onClick = onClick,
        modifier = modifier,
        enabled = enabled,
        colors = ButtonColors(
            containerColor = Color.Transparent,
            contentColor = MaterialTheme.colorScheme.primary,
            disabledContainerColor = Color.Transparent,
            disabledContentColor = MaterialTheme.colorScheme
                .onSurface
                .copy(alpha = 0.38f)
        ),
        contentPadding = PaddingValues(
            start = 12.dp,
            end = 12.dp
        )
    ) { content() }
}

@Preview(showBackground = true)
@Composable
fun MyFilledTonalButtonPreview() {
    Material3SnippetTheme {
        MyFilledTonalButton(onClick = { }) {}
    }
}

@Preview(showBackground = true)
@Composable
fun MyOutlinedButtonPreview() {
    Material3SnippetTheme {
        MyOutlinedButton(onClick = { }) {}
    }
}

@Preview(showBackground = true)
@Composable
fun MyElevatedButtonPreview() {
    Material3SnippetTheme {
        MyElevatedButton(onClick = { }) {}
    }
}

@Preview(showBackground = true)
@Composable
fun MyTextButtonPreview() {
    Material3SnippetTheme {
        MyTextButton(onClick = { }) {}
    }
}

@Preview(showBackground = true)
@Composable
fun ButtonsScreenPreview() {
    Material3SnippetTheme {
        ButtonsScreen()
    }
}