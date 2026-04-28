package com.example.apppoli.ui.screens

import androidx.compose.runtime.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.clickable
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.layout.ContentScale
import androidx.compose.foundation.Image
import androidx.compose.ui.res.painterResource
import com.example.apppoli.R

@Preview(showBackground = true)
@Composable
fun FotosScreen() {

    val fotos = listOf(
        R.drawable.img1,
        R.drawable.img2,
        R.drawable.img3
    )

    var seleccion by remember { mutableStateOf<Int?>(null) }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp)
    ) {

        Text(
            text = "Galería",
            style = MaterialTheme.typography.titleLarge
        )

        Spacer(modifier = Modifier.height(12.dp))

        LazyRow(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(fotos) { imagenRes ->

                Card(
                    modifier = Modifier
                        .width(200.dp)
                        .clickable {
                            seleccion = imagenRes
                        },
                    shape = RoundedCornerShape(16.dp)
                ) {

                    Column {

                        Image(
                            painter = painterResource(id = imagenRes),
                            contentDescription = "Imagen",
                            contentScale = ContentScale.Crop,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(140.dp)
                        )

                        Text(
                            text = "Imagen",
                            modifier = Modifier.padding(12.dp)
                        )
                    }
                }
            }
        }

        Spacer(modifier = Modifier.height(16.dp))

        seleccion?.let { imagenSeleccionada ->

            Card(modifier = Modifier.fillMaxWidth()) {

                Column(modifier = Modifier.padding(16.dp)) {

                    Text(
                        text = "Imagen seleccionada",
                        style = MaterialTheme.typography.titleMedium
                    )

                    Spacer(modifier = Modifier.height(8.dp))

                    Image(
                        painter = painterResource(id = imagenSeleccionada),
                        contentDescription = "Imagen seleccionada",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .fillMaxWidth()
                            .height(200.dp)
                    )
                }
            }
        }
    }
}