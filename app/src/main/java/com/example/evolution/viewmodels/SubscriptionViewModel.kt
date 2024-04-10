package com.example.evolution.viewmodels

import android.util.Log
import androidx.compose.runtime.mutableStateOf
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.evolution.dataclass.Subscription
import com.example.evolution.repos.SubscriptionRepo
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class SubscriptionViewModel @Inject constructor(private val subscriptionRepo: SubscriptionRepo) : ViewModel() {

    /*val subscriptions by lazy {
        mutableStateOf<List<Subscription>>(listOf())
    }*/
    val subscriptions = mutableStateOf<List<Subscription>>(listOf())

    fun getSubscriptionList() {
        viewModelScope.launch {
            kotlin.runCatching {
                subscriptionRepo.getSubscriptionsList()
            }.onSuccess {
                subscriptions.value = it

            }.onFailure {
                val g = 123
                Log.d("test", it.message!!)
            }
        }
    }

}