package com.jw_android.learn_modern_android.view.fragment

import androidx.core.view.ViewCompat
import androidx.viewpager2.widget.ViewPager2
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.ActivityViewpagerBinding
import com.jw_android.learn_modern_android.utils_study.Console
import com.jw_android.learn_modern_android.view.base.BaseActivity


class ViewpagerActivity : BaseActivity<ActivityViewpagerBinding>(R.layout.activity_viewpager) {

    private val pagerAdapter : MyPagerAdapter =  MyPagerAdapter(this)

    override fun initView() {
        val fragmentList = mutableListOf(Fragment1(),Fragment2(),Fragment3())

        fragmentList.forEach {
            pagerAdapter.addFragment(it)
        }

        binding.viewpager.adapter = pagerAdapter

        binding.indicator.let {
            it.setViewPager(binding.viewpager)
            it.createIndicators(fragmentList.size,0)
        }

        binding.viewpager.setOnClickListener {

        }

        binding.viewpager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                Console.log(position)
            }
        })

    }

    override fun initData() {

    }

}