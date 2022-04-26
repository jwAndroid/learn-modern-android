package com.jw_android.learn_modern_android.view.fragment

import androidx.viewpager2.adapter.FragmentStateAdapter
import androidx.viewpager2.widget.ViewPager2
import com.jw_android.learn_modern_android.Constants.Companion.TAG_FRAGMENT1
import com.jw_android.learn_modern_android.Constants.Companion.TAG_FRAGMENT2
import com.jw_android.learn_modern_android.Constants.Companion.TAG_FRAGMENT3
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.ActivityLoadFragmentBinding
import com.jw_android.learn_modern_android.utils_study.Console
import com.jw_android.learn_modern_android.utils_study.setOnSingleClickListener
import com.jw_android.learn_modern_android.view.base.BaseActivity
import me.relex.circleindicator.CircleIndicator3

class LoadFragmentActivity : BaseActivity<ActivityLoadFragmentBinding>(R.layout.activity_load_fragment) {

    private val layoutResId = R.id.frame_container

    override fun initView() {
        binding.apply {
            btnFragment1.setOnSingleClickListener {
                Console.log("1 click")
                loadFragment(TAG_FRAGMENT1, Fragment1.getInstance("1번"), layoutResId)
            }

            btnFragment2.setOnSingleClickListener {
                Console.log("2 click")
                loadFragment(TAG_FRAGMENT2, Fragment2() , layoutResId)
            }

            btnFragment3.setOnSingleClickListener {
                Console.log("3 click")
                loadFragment(TAG_FRAGMENT3, Fragment3() ,layoutResId)
            }
        }

        loadFragment(TAG_FRAGMENT1, Fragment1.getInstance("1번 이요~"), R.id.frame_container)
    }

    override fun initData() {

    }


}