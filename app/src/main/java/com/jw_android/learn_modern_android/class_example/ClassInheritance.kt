package com.jw_android.learn_modern_android.class_example

import android.util.Log

open class ClassInheritance {

//    상속
//   상속대상은 open 키워드를 넣는다.
//   상속을 받는쪽 자식에서 자식클래스 이름 : 부모클래스이름() 이렇게 상속한다. 괄호필수
//    부모쪽에서 파라미터가 있다면 자식쪽에서 전달받아 쓸수있다.

    var hello : String = "안녕하세요."
    open var openValue : String = "test"

    open fun sayHello () {
        Log.d("0201new" , hello)
    }

    fun eat () {
        Log.d("0201new" , "냠냠")
    }

}