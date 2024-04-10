package com.example.evolution.navigation

import com.example.evolution.R

sealed class BottomNavItem(val route: String, val icon: Int, val label: String) {
    data object Home : BottomNavItem("home", R.drawable.ic_home_24, "Home")
    data object Subscriptions : BottomNavItem("subscriptions", R.drawable.ic_subscriptions_24, "Subscriptions")
}

