package com.jw_android.learn_modern_android.view

import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.ActivityTestBinding
import com.jw_android.learn_modern_android.view.base.BaseActivity

class TestActivity : BaseActivity<ActivityTestBinding>(R.layout.activity_test) {
    override fun initView() {
       binding.apply {
           textView.text = "테스트 액티비티"

       }
    }

    override fun initData() {

    }

}