package com.jw_android.learn_modern_android.basicsyntax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.widget.Switch
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.ActivityBasicSyntaxBinding


private const val IMCONST = "저는 상수입니다"

class BasicSyntax : AppCompatActivity() {

    private val nullAbleReadOnlyValue : String? = null // 거의 가장 많이씀
    private lateinit var lateInitValue : String // VIEW MODEL 사용할때?
    var x : Int = 10
    val readOnlyValue = 5 // 코틀린은 타입생략가능


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityBasicSyntaxBinding.inflate(layoutInflater)
        setContentView(binding.root)

    }

    fun condition () {
        val x = true
        val y = false

        val a = 3
        val b = 4


//        else if 는 앞의 조건이 만족하면 탈출한다.
//        (!x) 에서 x가 false가 맞냐를 물어보는것이다. -> x = false 이면 if문 실행한다는것

        if (x){
            Log.d("practice0130" , "x가 true")

        } else if(x) {
            Log.d("practice0130" , "else if 에서 x가 true")

        } else if(x) {
            Log.d("practice0130" , "else if2 에서 x가 true")

        } else {
            Log.d("practice0130" , "위 모든식이 실행된게 없을때?")
        }

    }

    //*
    fun condition2() {
        val a = 5
        val b = 3

        val x = 10
        val y = 20

        val bigger = if (a > b && false) a else b
        Log.d("practice0130" , "$bigger")

        val bigger2 = if (x > y) {
          var c = 30
            Log.d("practice0130" , "$bigger")
            x
        } else {
            y
        }

        Log.d("practice0130" , "$bigger2")

    }

    // 함수명 쓸때 or and 이런거 쓰면안된다
    // 함수는 하나의 기능만 있는게 맞음. >> 함수의 원시성 이라함

    fun conditionWhen(x : Int?) : String {
        return when(x) {
            1 -> "1"
            2 -> "2"
            3 -> "3"
            else -> "?"
        }
    }

//    이런식으로도 가능
    fun compareNum(x : Int , y : Int) = if(x > y) x else y

    fun compareNum2(x : Int , y : Int) = if(x > y) {
        var c = 10
        x
    } else {
        y
    }

    fun conditionWhenComma(x : Int?) : String {
        return when(x) {
            1 , 9 -> "1"
            2 -> "2"
            3 -> "3"
            in 10..12 -> "10부터 12"
            !in 10..12 -> "10부터 12가 아닐때"
            else -> "?"
        }
    }

    fun conditionNoParam(){
        val x = 7

        when{
            x == 10 -> {
                Log.d("practice0130" , "x 는 10입니다.")
            }
            x == 12 -> {
                Log.d("practice0130" , "x 는 12입니다.")
            }
            x > 13 -> {
                Log.d("practice0130" , "x 는 13보다 큽니다.")
            }
            else -> {
                Log.d("practice0130" , "???")
            }
        }

    }


}