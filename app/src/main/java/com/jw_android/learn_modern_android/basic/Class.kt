package com.jw_android.learn_modern_android.basic

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.class_example.PrimaryConstructor
import com.jw_android.learn_modern_android.class_example.SecondaryConstructor

class Class : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_class)

        //직접 호출.
        val primaryConstructor = PrimaryConstructor("클래스 연습" , 16)
        primaryConstructor.run()

        val asd = SecondaryConstructor("클래스 연습1")


    }
}