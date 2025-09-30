package com.example.spotify.components

import androidx.compose.foundation.Image
import androidx.compose.foundation.horizontalScroll
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.spotify.R


@Composable
fun ImagesList() {
    Box() {
        Row(
            modifier = Modifier,
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.Bottom
        ) {
            Image(
                painter = painterResource(id = R.drawable.imagen3),
                contentDescription = "Imagen bonita",
                modifier = Modifier.height(height = 50.dp).width(width = 50.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.imagen2),
                contentDescription = "Imagen bonita",
                modifier = Modifier.height(height = 50.dp).width(width = 50.dp)
            )
            Image(
                painter = painterResource(id = R.drawable.imagen1),
                contentDescription = "Imagen bonita",
                modifier = Modifier.height(height = 50.dp).width(width = 50.dp)
            )
        }
    }
}

@Preview
@Composable
fun ImageListPreview(){
    ImagesList()
}