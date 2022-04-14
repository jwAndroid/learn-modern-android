package com.jw_android.learn_modern_android.view

import android.content.Intent
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.ActivityLayoutBinding
import com.jw_android.learn_modern_android.view.base.BaseActivity

class LayoutActivity : BaseActivity<ActivityLayoutBinding>(R.layout.activity_layout) {

    override fun initView() {
        binding.apply {
            textView.text = "레이아웃 액티비티"

            textView.setOnClickListener {
                startActivity(this@LayoutActivity , TestActivity::class.java)
            }

        }

    }

    override fun initData() {

    }
}