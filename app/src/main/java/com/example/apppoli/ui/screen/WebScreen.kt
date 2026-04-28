package com.example.apppoli.ui.screens

import android.webkit.WebView
import android.webkit.WebViewClient
import androidx.compose.runtime.*
import androidx.compose.material3.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.ui.Modifier
import androidx.compose.ui.viewinterop.AndroidView
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Preview(showBackground = true)
@Composable
fun WebScreen() {

    var url by remember { mutableStateOf("") }
    var loadUrl by remember { mutableStateOf("") }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
        verticalArrangement = Arrangement.spacedBy(8.dp)
    ) {

        OutlinedTextField(
            value = url,
            onValueChange = { url = it },
            label = { Text("Ingrese URL") },
            modifier = Modifier.fillMaxWidth()
        )

        Button(
            onClick = {
                loadUrl = if (url.startsWith("http")) url else "https://$url"
            },
            modifier = Modifier.fillMaxWidth(),
            shape = RoundedCornerShape(5.dp)
        ) {
            Text("Cargar")
        }

        if (loadUrl.isNotEmpty()) {
            AndroidView(
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f),
                factory = { context ->
                    WebView(context).apply {
                        webViewClient = WebViewClient()
                        settings.javaScriptEnabled = true
                        loadUrl(loadUrl)
                    }
                },
                update = { webView ->
                    webView.loadUrl(loadUrl)
                }
            )
        }
    }
}