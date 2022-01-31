package com.jw_android.learn_modern_android.class_example

import android.util.Log

class PrimaryConstructor constructor(value : String, private val result : Int) {

    // 프라이머리 생성자
    // 접근 제한자 or 다른옵션이 없다면 생략이 가능

    // init 블록은 가장 먼저 실행된다.
    // 생성자로부터 넘어온 파라미터에 init 블록 스코프에서 접근할수있다.
    // init 초기화 작업이 필요하지 않다면 생략 가능하다.

    init {
        Log.d("0131new" , "생성자로부터 전달받은 값은 $value")
    }

    fun run () {
        // 파라미터에 val 을 붙여주면 스코프 전체에서 해당 파라미터를 사용 할 수있다.
        // var 은 쓰면 안된다. 파라미터는 읽기전용이다.
        print(result)
//        print(value) => 에러
    }

}