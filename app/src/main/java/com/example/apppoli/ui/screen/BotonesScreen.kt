package com.example.apppoli.ui.screen

import android.widget.Toast
import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.filled.Remove
import androidx.compose.material.icons.filled.Favorite
import androidx.compose.material.icons.filled.Face
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview

@Preview(showBackground = true)
@Composable
fun BotonesScreen() {

    val context = LocalContext.current

    var contador by remember { mutableStateOf(0) }
    var mensaje by remember { mutableStateOf("Presiona un botón") }
    var favorito by remember { mutableStateOf(false) }
    var habilitado by remember { mutableStateOf(true) }

    Column(
        modifier = Modifier
            .padding(16.dp)
            .fillMaxSize()
            .verticalScroll(rememberScrollState()),

        verticalArrangement = Arrangement.spacedBy(16.dp)
    ) {



        Text(
            text = "Ejemplo de contador",
            style = MaterialTheme.typography.titleLarge
        )

        Text(
            text = "Contador: $contador",
            style = MaterialTheme.typography.headlineMedium
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(12.dp)
        ) {


            Button(
                onClick = {

                    contador--

                    mensaje = "Restaste 1"

                    Toast.makeText(
                        context,
                        "El contador disminuyó a $contador",
                        Toast.LENGTH_SHORT
                    ).show()
                },

                shape = RoundedCornerShape(8.dp)
            ) {

                Icon(
                    Icons.Default.Remove,
                    contentDescription = "Restar"
                )
            }


            Button(
                onClick = {

                    contador++

                    mensaje = "Sumaste 1"

                    Toast.makeText(
                        context,
                        "El contador aumentó a $contador",
                        Toast.LENGTH_SHORT
                    ).show()
                },

                shape = RoundedCornerShape(8.dp)
            ) {

                Icon(
                    Icons.Default.Add,
                    contentDescription = "Sumar"
                )
            }
        }

        Divider()



        Text(
            text = "Tipos de botones",
            style = MaterialTheme.typography.titleMedium
        )


        Button(
            onClick = {

                mensaje = "Presionaste el botón normal"

                Toast.makeText(
                    context,
                    "Este es un Button normal",
                    Toast.LENGTH_SHORT
                ).show()
            },

            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Botón Normal")
        }


        ElevatedButton(
            onClick = {

                mensaje = "Botón elevado presionado"

                Toast.makeText(
                    context,
                    "Este es un ElevatedButton",
                    Toast.LENGTH_SHORT
                ).show()
            },

            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Botón Elevado")
        }


        FilledTonalButton(
            onClick = {

                mensaje = "Botón tonal utilizado"

                Toast.makeText(
                    context,
                    "Este es un FilledTonalButton",
                    Toast.LENGTH_SHORT
                ).show()
            },

            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Botón Tonal")
        }


        OutlinedButton(
            onClick = {

                mensaje = "Botón outlined presionado"

                Toast.makeText(
                    context,
                    "Este es un OutlinedButton",
                    Toast.LENGTH_SHORT
                ).show()
            },

            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Botón Outlined")
        }


        TextButton(
            onClick = {

                mensaje = "Botón text presionado"

                Toast.makeText(
                    context,
                    "Este es un TextButton",
                    Toast.LENGTH_SHORT
                ).show()
            },

            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Botón Text")
        }


        Button(
            onClick = {

                favorito = !favorito

                mensaje = if (favorito) {
                    "Agregado a favoritos"
                } else {
                    "Quitado de favoritos"
                }

                Toast.makeText(
                    context,
                    mensaje,
                    Toast.LENGTH_SHORT
                ).show()
            },

            modifier = Modifier.fillMaxWidth()
        ) {

            Icon(
                Icons.Default.Favorite,
                contentDescription = null,
                tint = if (favorito) Color.Red else Color.White
            )

            Spacer(modifier = Modifier.width(8.dp))

            Text("Botón con icono")
        }



        Text(
            text = "Icon Buttons",
            style = MaterialTheme.typography.titleMedium
        )

        Row(
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {


            IconButton(
                onClick = {

                    mensaje = "IconButton presionado"

                    Toast.makeText(
                        context,
                        "Este es un IconButton",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            ) {

                Icon(
                    Icons.Default.Face,
                    contentDescription = null
                )
            }

            FilledIconButton(
                onClick = {

                    contador++

                    mensaje = "FilledIconButton aumentó el contador"

                    Toast.makeText(
                        context,
                        "Contador: $contador",
                        Toast.LENGTH_SHORT
                    ).show()
                }
            ) {

                Icon(
                    Icons.Default.Add,
                    contentDescription = null
                )
            }

            OutlinedIconButton(
                onClick = {

                    favorito = !favorito

                    mensaje = if (favorito) {
                        "Favorito activado"
                    } else {
                        "Favorito desactivado"
                    }

                    Toast.makeText(
                        context,
                        mensaje,
                        Toast.LENGTH_SHORT
                    ).show()
                }
            ) {

                Icon(
                    Icons.Default.Favorite,
                    contentDescription = null
                )
            }
        }

        Divider()


        Text(
            text = "Botón habilitable",
            style = MaterialTheme.typography.titleMedium
        )

        Button(
            onClick = {

                habilitado = !habilitado

                Toast.makeText(
                    context,
                    if (habilitado)
                        "Botón habilitado"
                    else
                        "Botón deshabilitado",

                    Toast.LENGTH_SHORT
                ).show()
            },

            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Activar / Desactivar botón")
        }

        Button(
            onClick = {

                mensaje = "Botón habilitado funcionando"

                Toast.makeText(
                    context,
                    "El botón funciona correctamente",
                    Toast.LENGTH_SHORT
                ).show()
            },

            enabled = habilitado,

            modifier = Modifier.fillMaxWidth()
        ) {

            Text("Botón deshabilitable")
        }

        Divider()


        Text(
            text = "Resultado:",
            style = MaterialTheme.typography.titleMedium
        )

        Text(
            text = mensaje,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}