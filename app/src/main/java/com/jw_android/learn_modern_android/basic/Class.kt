package com.jw_android.learn_modern_android.basic

import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.jw_android.learn_modern_android.class_example.*
import com.jw_android.learn_modern_android.class_example.Class

class Class : AppCompatActivity() {


        // 클래스 호출이 아닌 생성자 호출이다. 애초에 클래스는 호출하는게 아니다.
        // 생성자로부터 클래스의 속성 및 기능을 쓰는것

        // 생성자를 호출한후 생성되는 것 -> 인스턴스

        // 호출 -> class a 의 생성자 를 생성하고 -> class a 의 인스턴스가 생기고
        // 이 인스턴스는 변수에 할당이 가능하다.

        // 클래스 내부에 정의되는 변수와 함수는 -> 멤버 변수(프로퍼티) , 멤버 함수(메서드)라 한다.
        // 함수안에 정의되는 변수는 지역변수(변수)라 한다.

        /* 접근제한자
       * internal 같은 모듈에 있는 파일만 접근가능
        * protected private 과 같으니 상속 관계에서 접근가능
        * */



    fun useClass () {
        val primaryConstructor = PrimaryConstructor("클래스 연습" , 16)
        primaryConstructor.run()
        val asd = SecondaryConstructor(12, "asd")
    }

    fun getPersonInstance () {
        val person = Class()
        person.name = "최지웅"
        person.mPrint()
    }

    fun getObject () {
        Object.name = "꿀꿀이2"
        Object.printName()
    }

    fun getCompanionObject () {
//        이렇게 컴페니언 옵젝은 클래스인데 인스턴스를 만들지않고 바로 호출가능.
        CompanionObject.mPrint()

        //클래스명.~
//        반대로
//        밖에있는 walk() 는 인스턴스 생성후 호출해야함.
        val companionObject = CompanionObject()
        companionObject.walk()
    }

    fun getDataClass () {
        val me = DataClass("최지웅" , 28)
        me.process()
        Log.d("0201new" , "data 클래스의 toString() -> $me")
    }

    fun extends() {
        var test = ClassInheritChild().openValue
    }

}