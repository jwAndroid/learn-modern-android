package com.jw_android.learn_modern_android.view.fragment

import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.Fragment1Binding
import com.jw_android.learn_modern_android.view.base.BaseFragment

class Fragment1 : BaseFragment<Fragment1Binding>(R.layout.fragment_1) {

    override fun initView() {
        binding.apply {
            fragment1Textview.text = "안녕하세요 프래그먼트 1 입니다."
        }
    }

    override fun initData() {

    }

}