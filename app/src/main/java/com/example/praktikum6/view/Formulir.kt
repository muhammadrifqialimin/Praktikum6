package com.example.praktikum6.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.example.praktikum6.R

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FormIsian(
    jenisK: List<String> = listOf("laki-laki", "Perempuan"),
    OnSubmitBtnClick : () -> Unit
){
    Scaffold (modifier= Modifier,
        topBar ={
            TopAppBar(
                title = { Text(text = stringResource(id = R.string.home),
                    color = Color.White)},
                colors = TopAppBarDefaults.topAppBarColors
                    (containerColor = colorResource(id = R.color.teal_700))
            )
        }
    ){ isiRuang ->
        Column(modifier = Modifier.padding(paddingValues = isiRuang),
            verticalArrangement = Arrangement.Top,
            horizontalAlignment = Alignment.CenterHorizontally
            ) {
            OutlinedTextField(
                value = "",
                singleLine = true,
                modifier = Modifier
                    .padding(top = 20.dp)
                    .width(width = 250.dp),
                label = {Text(text = "Nama Lengkap")},
                onValueChange = {},
            )
            HorizontalDivider(modifier = Modifier
                .padding(all = 20.dp)
                .width(width = 250.dp), thickness = Thickness.color =
                Color.Red)
            Row{
                jenisK.forEach {
                    item->
                    Row (verticalAlignment = Alignment.CenterVertically){
                        RadioButton(
                            selected = false,
                            onClick = {item}
                        )
                    }
                }
            }
        }

    }
}