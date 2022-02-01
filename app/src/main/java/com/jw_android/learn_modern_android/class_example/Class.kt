package com.jw_android.learn_modern_android.class_example

import android.util.Log

class Class {

//    클래스랑 오브젝트의 차이가 있었는데
//    오브젝트는 앱전역 1 개만 생성이 가능하다는 단점이있다.

//    근데 클래스를 오브젝트 처럼 사용할수 있는 중요한 문법이 있는데
//    그게 바로 companion 오브젝트다. 클래스에 감싸주면 끝이다.

    var name : String = "지웅"

    fun mPrint() {
        Log.d("0201new" , "이름은 : $name 입니다.")
    }

}