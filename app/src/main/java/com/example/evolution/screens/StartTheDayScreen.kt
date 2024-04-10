package com.example.evolution.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import com.example.evolution.R

@Composable
fun StartTheDayScreen() {

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(colorResource(id = R.color.white))
    ) {

        Image(
            painterResource(id = R.drawable.bruce_lee),
            contentDescription = "gg",
            alpha = 0.2f,
            modifier = Modifier.align(Alignment.CenterHorizontally)
        )
    }

}