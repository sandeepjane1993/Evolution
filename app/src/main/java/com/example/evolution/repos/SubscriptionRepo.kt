package com.example.evolution.repos

import com.example.evolution.network.ApiService
import javax.inject.Inject

class SubscriptionRepo @Inject constructor(private val apiService: ApiService) {

    suspend fun getSubscriptionsList() = apiService.getSubscriptionList()

}