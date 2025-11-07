package com.example.questnavigastugas.view

fun HalamanSelamatDatang(navController: NavHostController) {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color(0xFFECD7FC)
    ) {
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(horizontal = 24.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            Text(
                text = stringResource(id = R.string.selamatdatang),
                fontSize = 25.sp,
                color = Color(0xFF42217E),
                fontWeight = FontWeight.Medium
            )
        }
    }
}