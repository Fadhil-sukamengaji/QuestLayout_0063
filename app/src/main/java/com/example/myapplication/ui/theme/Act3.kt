package com.example.myapplication.ui.theme

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.R
import java.lang.reflect.Modifier

@Composable
fun ActivitasPertama(modifier: Modifier) {
    column(
        modidfier = Modifier.padding(top = 100.dp)
            .fillmaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally
    ){
        Text(
            stringResource(id = R.string.prodi),
            fontSize = 35.sp,
            fontWeigt = FontWeight.Bold
        )
        Text(
            stringResource(id = R.string.univ),
            fontsize = 22.sp
        )

    }
}