package com.jw_android.learn_modern_android.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DataBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDataBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }
}