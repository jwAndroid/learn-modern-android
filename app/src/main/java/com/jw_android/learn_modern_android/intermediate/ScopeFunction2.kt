package com.jw_android.learn_modern_android.intermediate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.utils_study.Console

// 확장함수 ( run , let , apply , with , also ) 는 이걸 외운다기보다는
// 실제로 로직을 작성할때 문서를 확인하면서 적재적소에 쓰는연습을 해야한다.
// 함수가 5가지나 있고 사용하는 방식이 다 제각각 이여서
// 처음부터 다 외우면서 공부하기가 상당히 까다로움

//객체를 사용할 때 "Scope(범위, 영역)" 를 일시적으로 만들어서
//"속성(property)"이나 "함수"를 처리하는 용도로 사용되는 함수이다.
//"간편한 코드 사용"과 "가독성, 빌더 패턴"의 이용, "부가적인 후처리" 등을 하는 데에 도움을 준다.

// let , it , run
// 마지막에 it , this , this 를 사용하여 새로운 객체반환

data class Person (var name : String?)

data class Car (var name : String? , var price : Int)

class ScopeFunction2 : AppCompatActivity() {

    private var nullablePerson : Person? = null

    private val person = Person("")
    private val myCar = Car("페라리" , 2800)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scope_function2)

        StreamFunction()
    }

    fun legacy () {
        // 레거시한 방법
        val me = Person("최지웅")
        me.name = "안드로이드 개발자 최지웅"
        Console.log(me.toString())
    }

    fun scopeLet () {
        // let :  fun <T, R> T.let(block: (T) -> R): R
        // let 블럭은 마지막에 it 을 적고 새로운 객체를 반환할때 쓰인다.
        // 또한 let 블럭 안에는 non-null 만 들어올 수 있어 non-null 체크 시에 유용하게 쓸 수 있다.
        // 객체를 선언하는 상황일 경우에는 elvis operator(?:) 를 사용해서 기본값을 지정해줄 수도 있다.

        // 새로운 객체를 반환할때
        val resultIt = person.let {
            it.name = "마지막 it 으로 반환"
            it
        }

        // 단순 문자열을 반환할때
        val resultStr = person.let {
            it.name = "문자열 반환"

            val emt: String = it.name!!
            "{문자열 $emt 반환}"
        }

        // 아무것도 반환하지 않을때
        // 단 , 객체의 name 은 변경됨
        val resultUnit = person.let {
            it.name = "아무것도 반화되는게 없다."
        }

        val nameStr = nullablePerson?.let { it.name } ?: "Default name"
        // person 이 null 일때 it.name 을 반환하지말고 , Default name 를 반환해라.
        // person 이 null 이 아닐때 it.name 을 반환해라.

        // let 에 대한 정리
        // let 은 nullSafety 로도 쓰일수도 있다. 하지만 핵심기능은 아니다.
        // let 은 블록 맨 마지막에 it을 사용하여 새로운 자기 자신을 반환 할 수 있다.
    }

    fun scopeWith () {
    // with : fun <T, R> with(receiver: T, block: T.() -> R): R
    // let :  fun <T, R> T.let(block: (T) -> R): R
        // let 과 다르게 T 에 대한 ~ 가 없다. 이말이 일반함수 라는것이다
        // with 는 객체 receive 를 직접 입력받고 , 객체를 사용하기 위한 두번째 파라미터 블럭을 받음.

        with(person) {
            name = "with"
         // 이런식으로 작성한다.
            // 우리가 원하는 새로운 객체를 반환하려면?
        }

        // 이렇게 this 를 사용하여 반환해야한다.
        val obj : Person = with(person) {
            name = "with 를 사용한 이름"
            this
        }

        Console.log(obj.toString())

        // with 에 대한 정리
        // let 과 다르게 확장함수가 아니고 일반함수이다.
        // 블록 안에서 객체에 대한 프로퍼티에 곧바로 접근 가능하다.
        // this 를 사용하여 새로운 객체를 반환할 수 있다. 하지만 with 는
        // non-null 의 객체를 사용하고 , 블럭의 return 값(this)이 필요하지 않을 때 사용한다.
    }

    fun scopeRun () {
//        fun <T, R> T.run(block: T.() -> R): R
//        run 은 non-null 인 객체에 대한 확장함수 이다.
//        계산할때 많이쓴다.

        val getPrice = myCar.run {
            ++price
        }

        Console.log(getPrice.toString())
    }

    fun scopeRun2 () {
//        fun <R> run(block: () -> R): R
//        R 로써 리턴이되며 , run { } 으로 사용된다.
//        객체를 전달받아서 객체의 프로퍼티를 변경하는 확장함수가 아니다.
//         ** 이 함수는 어떤 객체를 생성하기 위한 값을 블럭 안에 묶음으로써
    //        가독성을 높이는 역할을 한다.

        val person = run {
            val name = "제이미"
            Person(name)
        }

        Console.log(person.toString())
    }

    fun scopeApply () {
//        fun <T> T.apply(block: T.() -> Unit): T

//        가장 많이 쓸것으로 예상함.

//        apply 는 블록 안에서 객체의 프로퍼티를 호출 할 때 it , this 를 사용할 필요도 없으며
//        마지막에 자기자신을 입력하지 않아도 된다.
//        run 과 유사하지만 리턴값을 받지 않으며 자기 자신인 T 를 반환한다.

//        객체의 초기화나 변경 시에 주로 사용된다.

        val result = person.apply {
            name = "어플라이 사용!"
        }

        Console.log(result.toString())
    }

    fun scopeAlso () {
//        객체의 속성을 전혀 사용하지 않거나 변경하지 않고 사용하는 경우에 also 를 사용한다.
//        "객체의 데이터 유효성"을 확인하거나, "디버그", 로깅 등의 부가적인 목적으로 사용할 때에 적합.

        val numbers = mutableListOf("one", "two", "three")
        numbers.also { Console.log("add 하기전에 값은$it") }.add("four")

        Console.log(numbers.toString())
    }

}
