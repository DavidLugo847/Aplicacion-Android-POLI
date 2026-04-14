package com.example.apppoli

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.example.apppoli.ui.MainScreen
import com.example.apppoli.ui.theme.AppPOLITheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            AppPOLITheme {
                MainScreen()
            }
        }
    }
}