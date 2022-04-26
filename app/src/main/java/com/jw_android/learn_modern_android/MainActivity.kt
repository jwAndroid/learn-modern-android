package com.jw_android.learn_modern_android

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.jw_android.learn_modern_android.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


    }
}