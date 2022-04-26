package com.jw_android.learn_modern_android.intermediate

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.appcompat.app.AppCompatActivity
import com.jw_android.learn_modern_android.R

class IntentSubActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_sub)

        val editText = findViewById<EditText>(R.id.editText)
        val button = findViewById<Button>(R.id.button)

        intent.getStringExtra("key")?.let {
            editText.setText(it)
        }

        button.setOnClickListener {
            val intent = Intent(this , IntentStudy::class.java)
            intent.putExtra(REGISTER_KEY , editText.text.toString())
            setResult(RESULT_OK, intent)
            finish()
        }

    }
}

//    만약 객체를 넘기고 싶다면
//    받는쪽에서 val pathData = intent.getSerializableExtra("path") as Path (객체명 타입으로 캐스팅)