package com.jw_android.learn_modern_android.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jw_android.learn_modern_android.R
import java.util.*

class Loop : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_loop)

        map ()
    }

    fun inLoop (first : Int , end : Int) {
        for (index in first .. end) {
            Log.d("practice0131" , index.toString())
        }
        // 같은말
//        for (int i = 0 , i >= 10 , i++) {
//            print(i)
//        }
    }

    fun untilLoop () {
        for (index in 0 until 5) {
            Log.d("practice0131" , index.toString())
        }
    }

    fun stepLoop () {
        for (index in 0 .. 7 step 2) {
            Log.d("practice0131" , index.toString())
        }
    }

    fun downToLoop () {
        for (index in 10 downTo 0 step 2) {
            Log.d("practice0131" , index.toString())
        }

        Log.d("practice0131" , "==============")

        for (index in 10 downTo 0) {
            Log.d("practice0131" , index.toString())
        }
    }

    fun mForEach () {
        val mList = mutableListOf<String>()
        for (index in 0..10) {
            mList.add("하나 + $index")
        }

//        mList.forEachIndexed { index, list ->
//            Log.d("practice0131" , "{index : $index value : $list}")
//        }

       val result =  mList.map { it.uppercase(Locale.getDefault()) }
        Log.d("practice0131" , result.toString())
    }

    fun map () {
        val mList = listOf("a","b","c","d","e","f","g")

        val upperCaseList = mList.map {
            it.uppercase()
        }

        Log.d("practice0131" , upperCaseList.toString())
    }

    fun map2 () {
        val names= listOf("James", "Duke", "Sara", "Mino")

        names.map {
                name -> name.uppercase()
        }.forEach{
                println(it)
            }

        names.map {
                name -> name.length
        }.forEach{
                println("Lenght=$it")
            }
    }
}