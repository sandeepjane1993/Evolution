package com.example.evolution.network

import com.example.evolution.dataclass.Subscription
import retrofit2.http.GET

interface ApiService {
    @GET("subscriptions")
    suspend fun getSubscriptionList() : List<Subscription>
}