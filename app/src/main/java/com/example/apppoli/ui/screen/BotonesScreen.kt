package com.example.apppoli.ui.screens

import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.ui.tooling.preview.Preview



@Preview(showBackground = true)
@Composable
fun BotonesScreen() {

    var contador by remember { mutableStateOf(0) }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {

        Text(
            "Contador",
            style = MaterialTheme.typography.titleLarge
        )

        Text(
            "$contador",
            style = MaterialTheme.typography.headlineMedium
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {

            Button(
                onClick = { contador-- },
                shape = RoundedCornerShape(8.dp)
            ) {
                Icon(Icons.Default.Remove, contentDescription = "Restar")
            }

            Button(
                onClick = { contador++ },
                shape = RoundedCornerShape(8.dp)
            ) {
                Icon(Icons.Default.Add, contentDescription = "Sumar")
            }
        }

        Divider()

        Text(
            "Tipos de botones",
            style = MaterialTheme.typography.titleMedium
        )

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Botón Normal")
        }

        ElevatedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Botón Elevado")
        }

        FilledTonalButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Botón Tonal")
        }

        OutlinedButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Botón Outlined")
        }

        TextButton(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Botón Text")
        }

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Icon(Icons.Default.Favorite, contentDescription = null)
            Spacer(modifier = Modifier.width(8.dp))
            Text("Botón con icono")
        }

        Row(horizontalArrangement = Arrangement.spacedBy(8.dp)) {

            IconButton(onClick = {}) {
                Icon(Icons.Default.Favorite, contentDescription = null)
            }

            FilledIconButton(onClick = { contador++ }) {
                Icon(Icons.Default.Add, contentDescription = null)
            }

            OutlinedIconButton(onClick = {}) {
                Icon(Icons.Default.Favorite, contentDescription = null)
            }
        }

        Button(
            onClick = {},
            enabled = false,
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Botón deshabilitado")
        }
    }
}