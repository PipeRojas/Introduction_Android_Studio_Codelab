package com.example.helloworld

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.d("MainActivity", "Hello World")
        try {
            throw Exception("Ups!!!")
        }catch (ex: Exception){
            Log.e("Exception Caught", "Exception Caught", ex)
        }

    }
}