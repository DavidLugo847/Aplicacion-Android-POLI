package com.example.apppoli.ui

import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.ui.Modifier
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Menu
import kotlinx.coroutines.launch
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview (showBackground = true)
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MainScreen() {

    var selectedOption by remember { mutableStateOf("Perfil") }

    val drawerState = rememberDrawerState(DrawerValue.Closed)
    val scope = rememberCoroutineScope()

    ModalNavigationDrawer(
        drawerState = drawerState,
        drawerContent = {
            ModalDrawerSheet(
                modifier = Modifier.width(
                    LocalConfiguration.current.screenWidthDp.dp * 0.7f
                )
            ) {
                DrawerMenu(
                    selectedOption = selectedOption,
                    onOptionSelected = { option ->
                        selectedOption = option
                        scope.launch { drawerState.close() }
                    }
                )
            }
        }
    ) {

        Scaffold(
            topBar = {
                TopAppBar(
                    title = { Text("AppPOLI") },
                    navigationIcon = {
                        IconButton(onClick = {
                            scope.launch { drawerState.open() }
                        }) {
                            Icon(Icons.Default.Menu, contentDescription = "Menu")
                        }
                    }
                )
            }
        ) { padding ->

            Box(modifier = Modifier.padding(padding)) {
                RightContent(selectedOption)
            }
        }
    }
}