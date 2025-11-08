package com.example.questnavigastugas.view

import androidx.compose.foundation.layout.*
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.questnavigastugas.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Formulir(
    jenisK: List<String> = listOf("Laki-laki", "Perempuan"),
    statusPerkawinan: List<String> = listOf("Janda", "Lajang", "Duda"),
    onKembaliClick: () -> Unit,
    onSubmitBtnClick: () -> Unit
) {
    var nama by remember { mutableStateOf("") }
    var selectedJenis by remember { mutableStateOf("") }
    var selectedStatus by remember { mutableStateOf("") }
    var alamat by remember { mutableStateOf("") }
    var showDialog by remember { mutableStateOf(false) }

    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFEBD7FC)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp, vertical = 16.dp),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Text(
                text = stringResource(R.string.formulir),
                fontSize = 22.sp,
                fontWeight = FontWeight.Bold,
                color = Color(0xFF42217E),
                modifier = Modifier.padding(top = 16.dp, bottom = 20.dp)
            )

        }
    }
}
