package com.jw_android.learn_modern_android.basic

import android.util.Log
import java.util.*

private const val FIRST = 5
private const val END = 10

class Loop {
    fun inLoop (first : Int , end : Int) {
        if(first > end) {
            for (i in first .. end) {
                Log.d("practice0131" , i.toString())
            }
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

       val result =  mList.map { it ->
          it.uppercase(Locale.getDefault())
       }
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

        names.map { it.uppercase() }.forEach{ println(it) }

        names.map { it.length }.forEach{ println("Length=$it") }
    }

    fun mWhile() {
        var i = 0

        // 얘는 조건이 맞으면 실행하는데
        while (FIRST > i) {
            i ++
            println(i)
        }

        // 얘는 조건이 맞든 안맞든 한번은 실행함.
        do {

        }while (FIRST > i)
    }

    fun loopBreak() {
        for(index in 1..10) {

            if (index > 5) break
            // index 가 6 일때 == true 일때 루프를 탈출해라

            Log.d("practice0131" , "현재 인덱스는 : $index 입니다.")
        }

    }

    fun loopContinue() {
        for(index in 1..10) {

            if (index in 6..7) {
                continue
            }
            // index 6 , 7 일때 다음줄(로그)을 실행하지 마라

            Log.d("practice0131" , "현재 인덱스는 : $index 입니다.")
        }
    }
}