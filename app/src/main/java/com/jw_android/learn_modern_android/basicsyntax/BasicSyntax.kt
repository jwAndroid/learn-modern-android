package com.jw_android.learn_modern_android.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.ActivityBasicSyntaxBinding

class BasicSyntax : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBasicSyntaxBinding.inflate(layoutInflater)
        setContentView(binding.root)

        Log.d("0128new" , "${Variable().test()}")


    }
}