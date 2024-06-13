package com.example.material3snippet.components

import androidx.compose.material3.Badge
import androidx.compose.material3.BadgedBox
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Check
import androidx.compose.material.icons.filled.Edit
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Menu
import androidx.compose.material3.BottomAppBar
import androidx.compose.material3.BottomAppBarDefaults
import androidx.compose.material3.FloatingActionButton
import androidx.compose.material3.FloatingActionButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.semantics.contentDescription
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import com.example.material3snippet.navigation.Destination
import com.example.material3snippet.theme.Material3SnippetTheme

@Composable
fun MyBottomAppBar(
    destinations: List<Destination> = emptyList(),
    onDestination: (Destination) -> Unit = {}
) {
    BottomAppBar(
        actions = {
            IconButton(
                onClick = {
                    destinations.getOrNull(0)?.let { onDestination.invoke(it) }
                }
            ) {
                Icon(
                    imageVector = destinations.getOrNull(0)?.icon ?: Icons.Filled.Check,
                    contentDescription = "Localized description"
                )
            }
            IconButton(
                onClick = {
                    destinations.getOrNull(1)?.let { onDestination.invoke(it) }
                }
            ) {
                BadgedBox(badge = { Badge() }) {
                    Icon(
                        imageVector = destinations.getOrNull(1)?.icon ?: Icons.Filled.Edit,
                        contentDescription = "Localized description"
                    )
                }
            }

            IconButton(onClick = { /* do something */ }) {
                BadgedBox(badge = {
                    Badge {
                        val badgeNumber = "8"

                        Text(
                            badgeNumber,
                            modifier = Modifier.semantics {
                                contentDescription = "$badgeNumber new notifications"
                            }
                        )
                    }
                }) {
                    Icon(
                        Icons.Filled.Menu,
                        contentDescription = "Localized description",
                    )
                }
            }

            IconButton(onClick = { /* do something */ }) {
                BadgedBox(badge = {
                    Badge {
                        val badgeNumber = "999+"

                        Text(
                            badgeNumber,
                            modifier = Modifier.semantics {
                                contentDescription = "$badgeNumber new notifications"
                            }
                        )
                    }
                }) {
                    Icon(
                        Icons.Filled.Email,
                        contentDescription = "Localized description",
                    )
                }
            }
        },
        floatingActionButton = {
            FloatingActionButton(
                onClick = { /* do something */ },
                containerColor = BottomAppBarDefaults.bottomAppBarFabColor,
                elevation = FloatingActionButtonDefaults.bottomAppBarFabElevation()
            ) {
                Icon(Icons.Filled.Add, "Localized description")
            }
        }
    )
}

@Preview(showBackground = true)
@Composable
fun MyBottomAppBarPreview() {
    Material3SnippetTheme {
        MyBottomAppBar()
    }
}