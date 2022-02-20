package com.jw_android.learn_modern_android.view

import androidx.databinding.DataBindingUtil
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.ActivityLayoutBinding
import com.jw_android.learn_modern_android.view.base.BaseActivity
import kotlin.concurrent.thread

class LayoutActivity : BaseActivity<ActivityLayoutBinding>(R.layout.activity_layout) {

    override fun initView() {

            thread(start=true) {
//                서브 스레드
                Thread.sleep(3000)

                runOnUiThread {
//                    UI 와 관련된 모든 코드는 메인 스레드에 있어야함.
                    binding.apply {
                        textView.text = "3000L"
                    }
                }
            }


    }

    override fun initData() {

    }
}