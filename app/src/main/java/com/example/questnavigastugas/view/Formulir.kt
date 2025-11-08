package com.example.questnavigastugas.view

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.selection.selectable
import androidx.compose.foundation.shape.RoundedCornerShape
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

            Card(
                modifier = Modifier.fillMaxWidth(),
                colors = CardDefaults.cardColors(containerColor = Color.White),
                shape = RoundedCornerShape(8.dp),
                elevation = CardDefaults.cardElevation(defaultElevation = 4.dp)
            ) {
                Column(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(20.dp),
                    horizontalAlignment = Alignment.Start
                ) {
                    Text(
                        text = stringResource(R.string.namalengkap),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF42217E)
                    )
                    OutlinedTextField(
                        value = nama,
                        onValueChange = { nama = it },
                        singleLine = true,
                        label = { Text(stringResource(R.string.namalengkap)) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    )

                    Text(
                        text = stringResource(R.string.jeniskelamin),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF42217E),
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    Column(modifier = Modifier.padding(top = 4.dp)) {
                        jenisK.forEach { item ->
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .selectable(
                                        selected = selectedJenis == item,
                                        onClick = { selectedJenis = item }
                                    )
                                    .padding(vertical = 2.dp)
                            ) {
                                RadioButton(
                                    selected = selectedJenis == item,
                                    onClick = { selectedJenis = item }
                                )
                                Text(text = item)
                            }
                        }
                    }

                    Text(
                        text = stringResource(R.string.statusperkawinan),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF42217E),
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    Column(modifier = Modifier.padding(top = 4.dp)) {
                        statusPerkawinan.forEach { status ->
                            Row(
                                verticalAlignment = Alignment.CenterVertically,
                                modifier = Modifier
                                    .selectable(
                                        selected = selectedStatus == status,
                                        onClick = { selectedStatus = status }
                                    )
                                    .padding(vertical = 2.dp)
                            ) {
                                RadioButton(
                                    selected = selectedStatus == status,
                                    onClick = { selectedStatus = status }
                                )
                                Text(text = status)
                            }
                        }
                    }

                    Text(
                        text = stringResource(R.string.alamat),
                        fontSize = 12.sp,
                        fontWeight = FontWeight.Bold,
                        color = Color(0xFF42217E),
                        modifier = Modifier.padding(top = 8.dp)
                    )
                    OutlinedTextField(
                        value = alamat,
                        onValueChange = { alamat = it },
                        singleLine = true,
                        label = { Text(stringResource(R.string.alamat)) },
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(vertical = 8.dp)
                    )

                    Spacer(modifier = Modifier.height(20.dp))

                    Row(
                        modifier = Modifier.fillMaxWidth(),
                        horizontalArrangement = Arrangement.SpaceBetween
                    ) {
                        Button(
                            onClick = onKembaliClick,
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF673AB7)
                            )
                        ) {
                            Text(
                                text = stringResource(R.string.beranda),
                                color = Color.White
                            )
                        }

                        Button(
                            onClick = { showDialog = true },
                            enabled = nama.isNotEmpty() &&
                                    alamat.isNotEmpty() &&
                                    selectedJenis.isNotEmpty() &&
                                    selectedStatus.isNotEmpty(),
                            colors = ButtonDefaults.buttonColors(
                                containerColor = Color(0xFF673AB7)
                            )
                        ) {
                            Text(
                                text = stringResource(R.string.submit),
                                color = Color.White
                            )
                        }
                    }
                }
            }
        }
    }
}
