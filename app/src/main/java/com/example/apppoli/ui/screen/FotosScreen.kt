package com.example.apppoli.ui.screens

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun FotosScreen() {

    val fotos = listOf(
        "Imagen 1",
        "Imagen 2",
        "Imagen 3"
    )

    var seleccion by remember { mutableStateOf("") }

    Column(modifier = Modifier.padding(16.dp)) {

        Text(
            text = "Galería",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(12.dp))

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(fotos) { nombre ->

                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .clickable {
                            seleccion = nombre
                        },
                    shape = RoundedCornerShape(16.dp)
                ) {

                    Column {

                        Box(
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(140.dp)
                        )

                        Text(
                            text = nombre,
                            modifier = Modifier.padding(12.dp)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        if (seleccion.isNotEmpty()) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Text(
                    text = "Seleccionaste: $seleccion",
                    modifier = Modifier.padding(16.dp)
                )
            }
        }
    }
}