package com.jw_android.learn_modern_android.view.fragment

import android.os.Bundle
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.Fragment1Binding
import com.jw_android.learn_modern_android.utils_study.Console
import com.jw_android.learn_modern_android.view.base.BaseFragment

class Fragment1 : BaseFragment<Fragment1Binding>(R.layout.fragment_1) {

    companion object{
        fun getInstance(str: String): Fragment1 {
            val fragment1 = Fragment1()
            val bundle = Bundle()
            bundle.putString("data", str)
            fragment1.arguments = bundle
            return fragment1
        }
    }

    override fun initView() {
        binding.apply {
            fragment1Textview.text = "안녕하세요 프래그먼트 1 입니다."
        }

        arguments.apply {
            Console.log(this?.getString("data"))
        }
    }

    override fun initData() {

    }

}