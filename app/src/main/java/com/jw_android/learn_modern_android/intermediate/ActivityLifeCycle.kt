
package com.jw_android.learn_modern_android.intermediate

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.utils_study.Console
import kotlin.concurrent.thread

class ActivityLifeCycle : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        Console.log("onCreate")
        //액티비티가 생성됨
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_life_sycle)


        /*  액티비티의 생명주기
        * onCreate() - 만들어짐 - 액티비티 생성
        * onStart() - 화면에 나타남 - 화면이 보이기 시작하는 단계
        * onResume() - 화면에 나타남 ,  현재 실행중 - 실제 액티비티가 실행되고 있는상태
        * onPause() - 화면이 없어지기 시작함 - 액티비티 화면의 일부가 없어지기 시작함 (or 일부가 포개어짐)
        * onStop() - 화면이 없이짐 - 다른 액티비티가 실행되어서 화면이 완전히 가려짐
        * onDestroy() - 종료됨 - 종료
        *
        * 안드로이드 생명주기를 반드시 이해하고 넘어가야함
        *
        * finish() 같은경우 pause stop 이 동시에 발생후 destroy
        *
        * 백스택(BackStack) : 액티비티 또는 화면 컴포넌트를 담는 안드로이드의 저장 공간.
        *   이동시 화면을 저장하는 공간
        * */

        thread(start=true) {
//                서브 스레드
            Thread.sleep(3000)

            val intent = Intent(this, IntentStudy::class.java)
            startActivity(intent)
            finish()

        }

    }

    override fun onStart() {
        super.onStart()
//        화면에 보이기 시작함
        Console.log("onStart")
    }

    override fun onResume() {
        super.onResume()
//        화면에 나타남 , 현재 앱이 실행되는중
        Console.log("onResume")
    }

    override fun onPause() {
        super.onPause()
//        다른화면에 살짝 포개어지거나 가려지는 상태
        Console.log("onPause")
    }

    override fun onStop() {
        super.onStop()
//        다른 액티비티에 완전히 가려진 상태
        Console.log("onStop")
    }

    override fun onDestroy() {
        super.onDestroy()
//        이 액티비티가 종료된 상
        Console.log("onDestroy")
    }

}