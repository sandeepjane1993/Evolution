package com.example.evolution.navigation

import com.example.evolution.R

sealed class NavItem(val route: String, val label: String) {
    data object StartTheDay : NavItem("startTheDay", "StartTheDay")
}