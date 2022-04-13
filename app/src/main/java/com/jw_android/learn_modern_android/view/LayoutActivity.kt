package com.jw_android.learn_modern_android.view

import androidx.databinding.DataBindingUtil
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.ActivityLayoutBinding
import com.jw_android.learn_modern_android.view.base.BaseActivity
import kotlin.concurrent.thread

class LayoutActivity : BaseActivity<ActivityLayoutBinding>(R.layout.activity_layout) {

    override fun initView() {

        binding.apply {
            textView.text = "3000L"
        }

    }

    override fun initData() {

    }
}