package com.jw_android.learn_modern_android.intermediate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView
import com.jw_android.learn_modern_android.R

class Task : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_task)

        val textView = findViewById<TextView>(R.id.textView)
        textView.setOnClickListener {
            val intent = Intent(this , IntentSubActivity::class.java)
            startActivity(intent)
            finish()
        }
    }
}