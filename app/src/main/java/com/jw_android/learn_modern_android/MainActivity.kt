package com.jw_android.learn_modern_android

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jw_android.learn_modern_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        // binding
        //Mac Push Test
    }
}