package com.example.evolution

import android.app.Application
import dagger.hilt.android.HiltAndroidApp

@HiltAndroidApp
class EvolutionApp : Application() {

    override fun onCreate() {
        super.onCreate()
    }
}