package com.ygcoding.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import com.ygcoding.myapplication.ui.theme.FiledownloaderTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        val downloader = AndroidDownloader(this)

        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            FiledownloaderTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Column(
                        verticalArrangement = Arrangement.Center,
                        horizontalAlignment = Alignment.CenterHorizontally,
                        modifier = Modifier
                            .padding(innerPadding)
                            .fillMaxSize()
                    ) {
                        Button(onClick = {
                            downloader.downloadFile("https://pl-coding.com/wp-content/uploads/2022/04/pic-squared.jpg")
                        }) {
                            Text(text = "Click here bro")
                        }
                    }
                }
            }
        }
    }
}
