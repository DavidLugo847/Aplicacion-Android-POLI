package com.example.apppoli.ui

import androidx.compose.runtime.Composable
import com.example.apppoli.ui.screens.*
import androidx.compose.ui.tooling.preview.Preview
import com.example.apppoli.ui.screen.BotonesScreen
import com.example.apppoli.ui.screen.VideoScreen


@Preview(showBackground = true)
@Composable
fun RightContent(option: String = "Perfil") {

    when (option) {
        "Perfil" -> PerfilScreen()
        "Fotos" -> FotosScreen()
        "Video" -> VideoScreen()
        "Web" -> WebScreen()
        "Botones" -> BotonesScreen()
    }
}