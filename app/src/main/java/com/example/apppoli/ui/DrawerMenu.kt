package com.example.apppoli.ui

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.*

@Composable
fun DrawerMenu(
    selectedOption: String,
    onOptionSelected: (String) -> Unit
) {

    Column {

        DrawerHeader()

        Divider()

        DrawerItem("Perfil", Icons.Default.Person, selectedOption, onOptionSelected)
        DrawerItem("Fotos", Icons.Default.Image, selectedOption, onOptionSelected)
        DrawerItem("Video", Icons.Default.PlayArrow, selectedOption, onOptionSelected)
        DrawerItem("Web", Icons.Default.Language, selectedOption, onOptionSelected)
        DrawerItem("Botones", Icons.Default.Settings, selectedOption, onOptionSelected)
    }
}

@Composable
fun DrawerHeader() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .background(MaterialTheme.colorScheme.primary)
            .padding(16.dp)
    ) {
        Text(
            text = "AppPOLI",
            style = MaterialTheme.typography.titleLarge,
            color = MaterialTheme.colorScheme.onPrimary
        )

        Spacer(modifier = Modifier.height(4.dp))

        Text(
            text = "Menú de navegación",
            color = MaterialTheme.colorScheme.onPrimary
        )
    }
}

@Composable
fun DrawerItem(
    text: String,
    icon: androidx.compose.ui.graphics.vector.ImageVector,
    selectedOption: String,
    onClick: (String) -> Unit
) {

    val isSelected = text == selectedOption

    NavigationDrawerItem(
        label = { Text(text) },
        selected = isSelected,
        onClick = { onClick(text) },
        icon = { Icon(icon, contentDescription = text) },
        modifier = Modifier.padding(horizontal = 8.dp),
        shape = RoundedCornerShape(0.dp)
    )
}