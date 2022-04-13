package com.jw_android.learn_modern_android.intermediate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.widget.Button
import android.widget.EditText
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.utils_study.Console

class IntentSubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_sub)

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)

        intent.getStringExtra("key").let {
            editText.setText(it)
        }

        button.setOnClickListener {
            val intent = Intent(this , IntentStudy::class.java)
            intent.putExtra(REGISTER_KEY , editText.text.toString())
            setResult(RESULT_OK , intent)
            finish()
        }

        val strings : Editable = editText.text

    }
}