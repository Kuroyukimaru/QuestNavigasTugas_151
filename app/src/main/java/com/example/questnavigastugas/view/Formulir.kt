package com.example.questnavigastugas.view


import androidx.compose.material3.*
import androidx.compose.runtime.*


@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Formulir(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    statusPerkawinan: List<String> = listOf("Janda", "Lajang", "Duda"),
    onKembaliClick: () -> Unit,
    onSubmitBtnClick: () -> Unit
) {
}
