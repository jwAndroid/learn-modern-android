package com.jw_android.learn_modern_android.class_example

import android.util.Log

object Object {
//    오브젝트는 class 의 생성자 , 인스턴스를 생성후 하지 않아도
//    static 하게 접근하능하다.

    var name : String = "꿀꿀이"

    fun printName () {
        Log.d("0201new" , "애완동물의 이름은 $name 입니다.")
    }
}