package com.jw_android.learn_modern_android.class_example

import android.util.Log

class ClassInheritChild : ClassInheritance() {


    override var openValue: String = "상속받고 수정된 값"

//    부모로부터 상속받음.
    fun myHello () {
        hello = "자식에서 바꾼 안녕하세요."
        sayHello()
    }

    override fun sayHello() {
        Log.d("ClassInheritChild" ,"안녕하세요!")
    }


}