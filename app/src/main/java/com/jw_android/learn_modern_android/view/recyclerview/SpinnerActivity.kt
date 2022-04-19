package com.jw_android.learn_modern_android.view.recyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.TextView
import com.jw_android.learn_modern_android.R

class SpinnerActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_spinner)

        mSpinner()

    }

    private fun mSpinner(){
        val spinner = findViewById<Spinner>(R.id.spinner)
        val textView = findViewById<TextView>(R.id.textView)

        val data = listOf("선택" , "a" , "b" ,"c" ,"d" ,"e" ,"f")
        val adapter = ArrayAdapter(this , android.R.layout.simple_expandable_list_item_1 , data)
        spinner.adapter = adapter

        spinner.onItemSelectedListener = object : AdapterView.OnItemSelectedListener {
            override fun onItemSelected(adapterView: AdapterView<*>?, view: View?, position: Int, id: Long) {
                if (data[position] == data[0]) return else textView.text = data[position]
            }

            override fun onNothingSelected(p0: AdapterView<*>?) {

            }
        }
    }
}