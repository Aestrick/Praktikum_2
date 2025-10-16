package com.example.praktikum2

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@Composable
fun TataLetakModern(modifier: Modifier = Modifier) {
    // Modifikasi Column yang sudah ada
    Column(
        modifier = modifier
            .fillMaxSize()      // Mengisi seluruh layar
            .padding(16.dp)     // Memberi jarak 16dp dari semua sisi
    ) {
        // Tambahkan Card baru di sini
        Card(
            modifier = Modifier
                .fillMaxWidth() // Lebar card mengisi layar
                .height(120.dp)   // Tinggi card 120dp
        ) {
            // Konten di dalam card akan kita tambahkan nanti
        }
    }
}