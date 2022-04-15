package com.jw_android.learn_modern_android.intermediate

import android.app.Activity
import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import androidx.activity.result.ActivityResultLauncher
import androidx.activity.result.contract.ActivityResultContracts
import androidx.appcompat.app.AppCompatActivity
import com.jw_android.learn_modern_android.R

const val REGISTER_KEY = "registerKey"

class IntentStudy : AppCompatActivity() {

    val textview: TextView by lazy { findViewById(R.id.textview) }
    private lateinit var resultLauncher: ActivityResultLauncher<Intent>

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_intent_studty)

        intent(this@IntentStudy , IntentSubActivity::class.java)
//        readyForResult()
//
//        textview.setOnClickListener {
//            val intent = Intent(this , IntentSubActivity::class.java)
//            resultLauncher.launch(intent)
//        }
    }

    private fun intent(context: Context, targetActivity: Class<*>){
        val intent = Intent(context , targetActivity).apply {
            putExtra("key" , "value")
        }
        startActivity(intent)
    }

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