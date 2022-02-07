package com.jw_android.learn_modern_android.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity

class DataBindingActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityDataBindingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        // 이방법보다는 원래작성하던 바인딩으로 진행하는게 좋은듯
        // xml 에 접근할떄 전에 쓰던방식이 편함
        // 그리고 전에쓰던방식이랑 이방법이랑 어떤차이가 있는지도 알아놓는게 좋을듯함

    }
}