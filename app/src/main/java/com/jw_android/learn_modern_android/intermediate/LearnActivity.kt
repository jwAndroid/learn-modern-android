package com.jw_android.learn_modern_android.intermediate

import android.app.Activity
import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jw_android.learn_modern_android.MainActivity
import com.jw_android.learn_modern_android.R
import kotlin.concurrent.thread

class LearnActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_learn)

    }

//    액티비는 : 기본 컴포넌트 ( 앱을 구성하는 요소 )
//    브로드캐스트 리시버 : 메세지를 수신하는 컴포넌트
//    서비스 : 백그라운드 코드 처리를 담당
//    콘텐트 브로바이더 : "앱"끼리  데이터를 공유
//     --> 여기까지가 안드로이드 4대 메이저 컴포넌트

//    인텐트 : 시스템에 전달되는 메세지도구 위에있는 모든것을 실행하기 위해 쓰이는 컴포넌트
//    콘텐트 리졸버 : 콘텐트 브로바이더가 제공하는 데이터를 사용하기 위한 도구

//    Context 란 무엇일까
//    화면 요소 ( 컴포넌트 ) 를 사용하기위해서는 컨텍스트가 필요하다.
//    시스템을 사용하기위한 정보(프로퍼티) 와 도구(메서드)가 담겨있는 클래스다.
//    대부분 컨텍스트는 컴포넌트 실행시 함께 생성된다. 생선된 컴포넌트가 가지고 있는 메서드를 호출
//      해서 각각의 도구들을 사용할 수 있다.
//    컨텍스트는 기본기능이 담겨져있는 기본 클래스이다. 액티비티는 컨텍스트를 상속받아서 구현된
//       구현체다

//    컴텍스트의 종류
//    애플리케이션 컨텍스트 : 액티비티 , 서비스 같은 컴포넌트에서 직접호출하여 사용 , 지점과 관계없이
//      모두 동일한 컨텍스트가 호출된다.
//    베이스 컨텍스트 : 호출지점에 따라 서로다른 컴텍스트가 호출된다.

//    컴포넌트에서 어떤거는 context 를 필요로 하지만 , 어떤거는 안필요한경우는 해당 컴포넌트가 context를
//      필요로하기 때문에 그렇다.


//    Intent 의 개념
//    인텐트는 무언가를 전달할때 쓰이는것 그게 액티비티던 , 데이터던..
//    액티비티가 만들어지고 , 실행되는 과정
//    1. 인텐트 인스턴스를 생성한다.
//    2. 데이터를 담고 타겟을 지정한다.
//    3. "액티비티 매니저" 에 의해서 지정한 액티비티를 실행시킨다.
//    4. 타겟 액티비티로 전송후 그쪽에서 받는다.



}