package com.example.multiplicationlibrarytask

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.example.mulplicationlibrary.getMultiplication

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        Log.e("IDIDIDDI","IDID "+getMultiplication.getMultiplication(3,5))
    }
}