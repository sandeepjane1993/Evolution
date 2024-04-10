package com.example.evolution.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.evolution.R
import com.example.evolution.dataclass.Subscription
import com.example.evolution.ui.theme.EvolutionTheme
import com.example.evolution.viewmodels.SubscriptionViewModel

@Composable
fun SubscriptionsUI(subscriptionViewModel: SubscriptionViewModel = hiltViewModel()) {

    val subscriptionList = subscriptionViewModel.subscriptions.value

    Column(modifier = Modifier
        .fillMaxSize()
        .background(colorResource(id = R.color.white))) {
        /*Text(
            modifier = Modifier.align(Alignment.Start),
            color = Color.Black,
            text = "Subscription"
        )*/
        LazyColumn {
            items(subscriptionList) { item ->
                SubscriptionItem(text = item.name)
            }
        }
    }

    LaunchedEffect(key1 = Unit) {
        subscriptionViewModel.getSubscriptionList()
    }
}

@Composable
fun SubscriptionItem(text: String) {
    Text(
        text = text,
        modifier = Modifier
            .padding(16.dp)
            .fillMaxWidth()
    )
}

/*fun getSubscriptions(): List<Subscription> {
    return mutableListOf()
}


@Composable
fun SubscriptionsList() {
    LazyColumn {
        items(getSubscriptions()) { item ->
            SubscriptionItem(text = item.name)
        }
    }
}*/

@Preview(showBackground = true)
@Composable
fun SubscriptionsPreview() {
    EvolutionTheme {
        SubscriptionsUI()
    }
}