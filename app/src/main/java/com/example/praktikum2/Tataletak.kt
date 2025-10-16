package com.example.praktikum2

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.height
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp

@Composable
fun TataletakBoxColumnRow(modifier: Modifier = Modifier) {
    Column(modifier = modifier) {
        // TAMBAHAN BARU
        Box(
            modifier = Modifier
                .height(110.dp)
                .background(color = Color.Yellow),
            contentAlignment = Alignment.Center
        ) {
            // Konten di dalam box akan kita tambahkan nanti
        }
    }
}