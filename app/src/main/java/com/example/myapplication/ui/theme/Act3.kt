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
import androidx.compose.ui.graphics.Color
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
            stringResource(R.string.prodi),
            fontSize = 35.sp,
            fontWeigt = FontWeight.Bold
        )
        Text(
            stringResource(R.string.univ),
            fontsize = 22.sp
        )
        Spacer(modifier = Modifier.heigt(25.dp))
        Card(
            modifier = Modifier
                .fillMaxWidth(fraction = 1f)
                .padding(all = 12.dp),
            colors = CardDefaults.cardColors(
                containerColor = colouResource(id = R.color.card_0_bg)
            )
        ){
            Row() {
                val gambar = painterResource(id = R.drawable.logo_umy)
                Image(
                    painter = gambar,
                    contentDescription = null,
                    modifier = Modifier.size(100.dp).padding(all = 5.dp)
                )
                Spacer(modifier = Modifier.width(30.dp))
                Column() {
                    Text(
                        stringResource("Fadhil Mudzaki Hartono Putra"),
                        fontSize = 30.sp,
                        fontFamily = FontFamily.Cursive,
                        color = Color.White,
                        modifier = Modifier.padding(top = 15.dp)
                    )
                    Text(
                        stringResource(R.string.alamat),
                        fontSize = 20.sp,
                        color = Color.Yellow,
                        modifier = Modifier.padding(top = 10.dp)
                    )
                }
            }
        }
    }
}