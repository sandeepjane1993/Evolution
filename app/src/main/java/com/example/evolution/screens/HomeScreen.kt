package com.example.evolution.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.rememberNavController
import com.example.evolution.R
import com.example.evolution.customprogressindicator.CircleIndicator
import com.example.evolution.ui.theme.EvolutionTheme
import com.example.evolution.ui.theme.blueGray
import com.example.evolution.ui.theme.lightRed
import java.text.DateFormat
import java.util.Calendar

@Composable
fun HomeUI(navController: NavHostController) {
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

        Box(modifier = Modifier.fillMaxWidth()) {
            Text(
                modifier = Modifier
                    .align(Alignment.TopCenter)
                    .padding(28.dp, 16.dp),
                color = Color.Black,
                text = " \" Knowing is not enough, we must apply. Willing is not enough, we must do.\" "
            )
        }

        DisplayDate()

        Box (modifier = Modifier
            .fillMaxWidth()
            .height(200.dp)){
            CircleIndicator(
                progress = 20,
                minValue = 0,
                maxValue = 100,
                primaryColor = lightRed,
                secondaryColor = blueGray,
            )
        }

        Box(modifier = Modifier.fillMaxWidth()) {
            ElevatedButton(onClick = {
                navController.navigate("startday")
            }, modifier = Modifier.align(Alignment.Center)) {
                Text(text = "Start The Day")
            }
        }

    }
}

@Composable
fun DisplayDate() {

    val calendar = Calendar.getInstance().time
    val formattedDate = DateFormat.getDateInstance().format(calendar)

    Box(modifier = Modifier.fillMaxWidth()) {
        Text(text = formattedDate, modifier = Modifier
            .align(Alignment.TopCenter)
            .padding(12.dp))
    }

}

@Preview(showBackground = true)
@Composable
fun HomePreview() {
    EvolutionTheme {
        HomeUI(rememberNavController())
    }
}