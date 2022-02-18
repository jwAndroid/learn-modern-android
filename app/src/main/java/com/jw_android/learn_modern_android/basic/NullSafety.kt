package com.jw_android.learn_modern_android.basic

import android.app.Person
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.utils_study.Console

class NullSafety : AppCompatActivity() {

//    nullSafety
    private var nullAble : String? = null // null 을 허용한다.
//    왠만해서 null 을 허용하는건 안쓰는게 좋음
//    코틀린은 null 을 엄격하게 잡아내는데 개나소나 null 을 모두 허용해버리면 나중에 디버깅 할때
//    상당히 골치아플수도 있다.
    var notNull : String = "this value must not null" // 반드시 변수에 값을 할당해야한다.

//    lateinit
    private lateinit var name : String
//    var로 선언된 클래스의 프로퍼티(name) 에만 사용가능하다
//    null은 허용되지 않는다 == name 은 null 이 아니다. lateinit 쓴다해서 기본값이 있는게 아님.
//    기본 자료형은 사용할수 없다. int 등..
//    변수가 초기화되지 않은 상황이 발생할수있다면 nullAble ( asd : Type? = null ) or
    //    빈 값으로 초기화 하는것이 좋다.

    private val job : String by lazy {
        "lazy 한 변수"
    }

//    lazy 로 선언되거나 초기화된 변수는 읽기전용이다.
//    똑같은 지연 초기화다.
//    lateinit 도 어쨋든 나중에 초기화를 한다.
//    같은 맥락에서 lazy 는 바로 {} 를 이용해 지연시키며 초기화를 한다는것이다.
//    따로 초기화를 할 필요가 없다.
//    타입을 추론 가능하기떄문에 타입생략이 가능하다.



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_null_safety)

        val result = safeCall(null)

//        Console.log(name)
//        UninitializedPropertyAccessException ==> name 은 반드시 초기화 시켜야한다.

        name = "asd"
//        ::name.get()

        if (::name.isInitialized){
//            세미콜론 두개로 isInitialized 되었는지 방지할수있다.
//    더블콜론 (리플렉션) 은 변수에 대한 속성을 참조할 수 있고 , :: 을 명시하면
//    변수가 아닌 객체로 참조할 수 있게 된다.
//    함수내부 스코프에서 사용하면 안된다. 전역필드에서 써야한다.

            Console.log(name)
        }

    }

   private fun nullParameter (str : String?) {
        if (str == null) {
            Console.log(str)
        }
    }

    private fun nullReturn () : String {
        return "null return"
    }

    private fun safeCall(str: String?): String {
//        이렇게 변수?.메서드 or 프로퍼티는
//        변수가 null 이면 뒤에껄 실행하지마라. 라는말임

//        변수?.fun() => 해당값 리턴
//        null?.fun() => null 리턴

        return str?.length.toString()
    }

    private fun elvisOperator (str : String?):Int {
        return str?.length?:10
//        세이프 콜이랑은 반대로 ?. 는 무조건 앞에가 null 이면 null 을 반환하는데
//        ?: 는 앞에가 널이면 이렇게 초기값(정해준값)을 반환한다.

    }


}