package com.jw_android.learn_modern_android.class_example

import android.util.Log

class CompanionObject {

    companion object {

        var name : String = "지웅"

        fun mPrint() {
            Log.d("0201new" , "이름은 : $name 입니다.")
        }

    }

    fun walk() {
        Log.d("0201new" , "$name 이 걸어갑니다.")
    }

}