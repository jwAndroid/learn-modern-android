package com.jw_android.learn_modern_android.intermediate

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.jw_android.learn_modern_android.MainActivity
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.utils_study.Console
import com.jw_android.learn_modern_android.utils_study.setOnSingleClickListener

const val REGISTER_KEY = "registerKey"

class IntentStudy : AppCompatActivity() {

    val textview: TextView by lazy { findViewById(R.id.textview) }
    private lateinit var resultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_studty)

        readyForResult()

        textview.setOnClickListener {
            val intent = Intent(this , IntentSubActivity::class.java)
            resultLauncher.launch(intent)
        }

        /*
        * task 는 어플리케이션에서 실행 되는 액티비티를 기록하는 스택이다.
        *  https://velog.io/@p4stel-dev/안드로이드-Intent-Flag-정리
        *
        * Intent FLAG
        *
        *
        * */

    }

//    intent
    fun intent (context: Context, targetActivity: Class<*>){
        val intent = Intent(context , targetActivity).apply {
            putExtra("key" , "value")
        }

        startActivity(intent)
    }

//    registerForActivityResult
    private fun readyForResult() {
        resultLauncher = registerForActivityResult(
            ActivityResultContracts.StartActivityForResult()){
            if (it.resultCode == Activity.RESULT_OK) {
                val data = it.data?.getStringExtra("registerKey") ?: ""
                textview.text = data
            }
        }
    }
}