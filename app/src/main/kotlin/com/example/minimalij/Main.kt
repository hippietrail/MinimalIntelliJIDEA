package com.example.minimalij

import android.app.Activity
import android.os.Bundle
import android.util.Log

class Main : Activity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Log.d("Minimal", "IntelliJ IDEA version")
    }
}