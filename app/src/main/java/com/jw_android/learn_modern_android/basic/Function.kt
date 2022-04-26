package com.jw_android.learn_modern_android.basic

import android.util.Log

class Function {

    // 함수의 파라미터는 모두 읽기전용인 val 이 생략된것이다.


    fun functionType1 (str : String) : String {
//        반환값과 타입이 있는 함수
        return str
    }

    fun functionType2 (str : String , str2 : String) {
        Log.d("practice0131" , "$str , $str2")
    }

    fun functionType3 () : Double {
        return 1.23
    }

    fun defaultParamFun (name : String , job : String? , age : Int = 28){
        Log.d("0131new" , "이름은: $name 이고 나이는 $age 이고 , 직업은 $job 입니다.")

        // 파라미터에 초기값세팅 할때 , name : String , age : Int = 15 , job : String
        // 이렇게 하면 안되고 항상 끝에 두어야한다
        //  name : String , job : String  , age : Int = 15 이렇게
    }

    fun ex1 (x : Int) : Int{
        var sum = 0

        for (i in 0..x) sum += i
        return sum
    }

}