package com.biswajit.libraryTest

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier

@Composable
fun TestScreen() {
    Box(modifier = Modifier.fillMaxSize()){
        Text("Here is demo", Modifier.align(Alignment.Center))
    }
}