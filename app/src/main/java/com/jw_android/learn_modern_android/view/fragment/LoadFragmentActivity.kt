package com.jw_android.learn_modern_android.view.fragment

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.ActivityLoadFragmentBinding
import com.jw_android.learn_modern_android.view.base.BaseActivity

private const val TAG_FRAGMENT1 = "fragment1"
private const val TAG_FRAGMENT2 = "fragment2"
private const val TAG_FRAGMENT3 = "fragment3"

class LoadFragmentActivity : BaseActivity<ActivityLoadFragmentBinding>(R.layout.activity_load_fragment) {
    override fun initView() {
        binding.apply {
            btnFragment1.setOnClickListener {
                setFragment(TAG_FRAGMENT1, Fragment1())
            }

            btnFragment1.setOnClickListener {
                setFragment(TAG_FRAGMENT2, Fragment2())
            }

            btnFragment3.setOnClickListener {
                setFragment(TAG_FRAGMENT3, Fragment3())
            }
        }

        setFragment(TAG_FRAGMENT1, Fragment1())

    }

    override fun initData() {}

    private fun setFragment(tag: String, fragment: Fragment) {
        val manager: FragmentManager = supportFragmentManager
        val ft: FragmentTransaction = manager.beginTransaction()

        if (manager.findFragmentByTag(tag) == null) {
            ft.add(R.id.frame_container, fragment, tag)
        }

        val fragment1 = manager.findFragmentByTag(TAG_FRAGMENT1)
        val fragment2 = manager.findFragmentByTag(TAG_FRAGMENT2)
        val fragment3 = manager.findFragmentByTag(TAG_FRAGMENT3)

        if (fragment1 != null) {
            ft.hide(fragment1)
        }
        if (fragment2 != null) {
            ft.hide(fragment2)
        }
        if (fragment3 != null) {
            ft.hide(fragment3)
        }

        if (tag == TAG_FRAGMENT1) {
            if (fragment1 != null) {
                ft.show(fragment1)
            }
        }
        if (tag == TAG_FRAGMENT2) {

            if (fragment2 != null) {
                ft.show(fragment2)
            }
        }
        if (tag == TAG_FRAGMENT3) {
            if (fragment3 != null) {
                ft.show(fragment3)
            }
        }

        ft.commitAllowingStateLoss()
    }

}