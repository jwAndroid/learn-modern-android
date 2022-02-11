package com.jw_android.learn_modern_android.basic

class Generics {
//    제네릭 >> 컬렉션 , 배열에서 입력되는 값의 타입을 알기위해 사용한다.
//    ex ) var list : ArrayList<E>
//    <E> 에서 E는 타입을 지정하는것


    fun exampleGen() {
        var list : MutableList<String> = mutableListOf<String>()
    }
}