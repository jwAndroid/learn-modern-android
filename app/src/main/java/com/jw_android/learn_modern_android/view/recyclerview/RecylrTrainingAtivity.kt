package com.jw_android.learn_modern_android.view.recyclerview

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.jw_android.learn_modern_android.R

class RecylrTrainingAtivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_recylr_training_ativity)

        val recyclerview = findViewById<RecyclerView>(R.id.recyclerview)
        val llm = LinearLayoutManager(applicationContext)
        val adapter = MyAdapter(loadData())
        recyclerview.layoutManager = llm
        recyclerview.adapter = adapter

    }

    private fun loadData() : MutableList<Memo> {
        val data : MutableList<Memo> = mutableListOf()

        for(i in 0..100){
            val title = "이것이 안드로이드다${i}"
            val date = System.currentTimeMillis().toString()
            val memo = Memo(0 , title , date)
            data.add(memo)
        }

        return data
    }
}