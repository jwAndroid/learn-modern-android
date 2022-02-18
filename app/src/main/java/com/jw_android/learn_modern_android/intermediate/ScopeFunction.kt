package com.jw_android.learn_modern_android.intermediate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.utils_study.Console

//https://blog.yena.io/studynote/2020/04/15/Kotlin-Scope-Functions.html

class ScopeFunction : AppCompatActivity() {

//    코드를 축약해서 표현해주는것 : 스코프함수
//    run , let , apply , with , also

    // 자기자신 오브젝트를 반환하는것이다 *중요*
    // 마지막 표현식 this 로 할당하는것이다.
    // 마지막 표현식이 없다면 Unit 이 반환된다.

    /*
    *   새로운 오브젝트나 리스트를 만드려할때
    *   val newObj = oldObj.let { it ->
    *       it.new = "123" // 변경
    *       it // 할당
    *    }
    *
    * */

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope_function)


    }

    private fun scopeFunctionRun () {
//        run {} 중괄호 안 스코프 함수 내부에서 호출한 대상을 this 로 사용가능하다
        val list = mutableListOf<String>()

        list.run {
//            this.size 대신 size 로 도트연산자없이 접근가능하다.
            add("run 스코프함수 내부에서 add 를함.")
            Console.log(size.toString())
            Console.log(this[0])
        }
    }
    private fun scopeFunctionRun2 () {
        val test  = RunTestObject("초기이름" , 0)

        Console.log(test.toString())

        val runResult = test.run {
            name = "jw"
            age = 28
            this
        }

        Console.log(runResult.toString())

    }

    private fun scopeFunctionLet () {
        val obj = RunTestObject("초기값" , 0)

      val letResult = obj.let { newObj ->
//            let 함수 내부에서 it 으로 사용 or 참조 할 수있다.
            newObj.name = "let 함수 지웅"
            newObj.age =  28
            newObj
        }
        Console.log(letResult.toString())
    }
    private fun scopeFunctionLet2 () {
        val obj = RunTestObject("초기값" , 0)

        obj.let {
            it.name = "let2 함수 지웅"
            it.age =  28
        }

        Console.log(obj.toString())
    }



}


data class RunTestObject(var name : String , var age : Int) {
    override fun toString(): String {
        return "RunTestObject(name=$name, age=$age)"
    }
}