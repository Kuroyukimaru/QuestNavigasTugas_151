package com.example.questnavigastugas

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.questnavigastugas.view.HalamanListPeserta
import com.example.questnavigastugas.view.HalamanSelamatDatang
import com.example.questnavigastugas.view.Formulir

enum class Navigasi {
    SelamatDatang,
    ListPeserta,
    Formulir
}

@Composable
fun DataApp(
    navController: NavHostController = rememberNavController()
) {
    Scaffold { innerPadding ->
        NavHost(
            navController = navController,
            startDestination = Navigasi.SelamatDatang.name,
            modifier = Modifier.padding(innerPadding)
        ) {
// Frame 1
            composable(route = Navigasi.SelamatDatang.name) {
                HalamanSelamatDatang(navController = navController)
            }

            // Frame 2
            composable(route = Navigasi.ListPeserta.name) {
                HalamanListPeserta(navController = navController)
            }

            composable(route = Navigasi.Formulir.name) {
                Formulir(
                    onKembaliClick = { navController.popBackStack() },
                    onSubmitBtnClick = { navController.navigate(Navigasi.ListPeserta.name) }
                )
            }
        }
    }
}
