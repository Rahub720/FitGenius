package com.example.fitgenius

import android.app.Application

class FitGeniusApplication : Application() {
    val db by lazy { AppDatabase.getInstance(this) }
}