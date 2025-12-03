package com.example.myapplication

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.*
import com.biswajit.libraryTest.TestScreen
//import com.biswajit.libraryTest.TestScreen
import org.jetbrains.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun App() {
    MaterialTheme {
        TestScreen()
    }
}