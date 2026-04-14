package com.example.apppoli.ui

import androidx.compose.runtime.Composable
import com.example.apppoli.ui.screens.*

@Composable
fun RightContent(option: String) {

    when (option) {
        "Perfil" -> PerfilScreen()
        "Fotos" -> FotosScreen()
        "Video" -> VideoScreen()
        "Web" -> WebScreen()
        "Botones" -> BotonesScreen()
    }
}