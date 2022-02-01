package com.jw_android.learn_modern_android.class_example

import android.util.Log

data class DataClass(val name : String , var age : Int) {
    // 코틀린은 값의 저장용도로 data 클래스를 제공한다
    // class 키워드 앞에 data 가 들어가며 반드시 프라이머리 생성자가 필요하다.
    // val or var 를 생략할수 없다. => 입력값은 데이터 클래스 전역 스코프에서 접근 가능해야한다

    // 일반 클래스에서 (객체 클래스) toString() 을 호출하면 인스턴스의 주소 값을 반환하는데
    // 데이터 클래스는 값 자체를 반환해주기 때문에 디버깅이나 확인할때 좋다

    init {
        Log.d("0201new" , "DataClass initialized")
    }

    fun process() {
        Log.d("0201new" , "process()")
    }

}