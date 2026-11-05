package com.example.pam8.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.stringResource
import com.example.pam8.R
import com.example.pam8.model.Siswa

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TampilSiswa(
    statusUiSiswa: Siswa,
    onBackButtonClicked: () -> Unit,
    modifier: Modifier = Modifier
) {
    val items = listOf(
        Pair("Nama", statusUiSiswa.nama),
        Pair("Jenis Kelamin", statusUiSiswa.gender),
        Pair("Alamat", statusUiSiswa.alamat)
    )

    Scaffold(
        modifier = modifier,
        topBar = {
            TopAppBar(
                title = { Text(text = "Detail Siswa", color = Color.White) },
                colors = TopAppBarDefaults.mediumTopAppBarColors(
                    containerColor = colorResource(id = R.color.purple_500)
                )
            )
        }
    ) { isiRuang ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(isiRuang)
                .padding(dimensionResource(R.dimen.padding_medium)),
            verticalArrangement = Arrangement.SpaceBetween
        ) {
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(
                    modifier = Modifier.padding(dimensionResource(R.dimen.padding_medium)),
                    verticalArrangement = Arrangement.spacedBy(
                        dimensionResource(R.dimen.padding_small)
                    )
                ) {
                    items.forEach { (label, isi) ->
                        Row(
                            modifier = Modifier.fillMaxWidth(),
                            horizontalArrangement = Arrangement.SpaceBetween
                        ) {
                            Text(text = label)
                            Text(text = isi)
                        }
                    }
                }
            }
            Button(
                modifier = Modifier.fillMaxWidth(),
                onClick = onBackButtonClicked
            ) {
                Text(stringResource(R.string.kembali))
            }
        }
    }
}