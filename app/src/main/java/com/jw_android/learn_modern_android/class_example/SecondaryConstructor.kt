package com.jw_android.learn_modern_android.class_example

import android.util.Log

class SecondaryConstructor {

    // 세컨더리 생성자는 이 클래스를 함수처럼 스코프 안에 직접 작성할 수 있다.
    // init 블록을 작성하지 않고 constructor 다음에 괄호를 붙여서 코드를 작성한다.
    // 직접 사용할때 골라서 쓸수있다.

    constructor(stringValue : String) {
        Log.d("0131new" , "생성자로부터 전달받은 값 : $stringValue 입니다.")
    }

    constructor(intValue : Int) {
        Log.d("0131new" , "생성자로부터 전달받은 값 : $intValue 입니다.")
    }

    constructor(intValue : Int , stringValue : String) {
        Log.d("0131new" , "생성자로부터 전달받은 값 : $intValue 입니다.")
    }


    /*
    * Default 생성자
    * 아무것도 작성하지 않은채 코드작성
    *  init {} 이 있는것과 동일함.
    *
    * */


}