package com.example.evolution.dataclass

data class Subscription(
    val name : String,
    val recurringDate : String,
    val recurringPayment : String,
    val totalBalance : String)