package com.jw_android.learn_modern_android.view.base

import android.content.Context
import android.content.Intent
import android.os.Bundle
import android.util.Log
import androidx.annotation.IdRes
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentTransaction
import com.jw_android.learn_modern_android.Constants.Companion.TAG_FRAGMENT1
import com.jw_android.learn_modern_android.Constants.Companion.TAG_FRAGMENT2
import com.jw_android.learn_modern_android.Constants.Companion.TAG_FRAGMENT3
import com.jw_android.learn_modern_android.R

abstract class BaseActivity<T : ViewDataBinding>(@LayoutRes private val layoutResId: Int) : AppCompatActivity() {

    protected abstract fun initView()
    protected abstract fun initData()

    protected val binding : T by lazy {
        DataBindingUtil.setContentView(this , layoutResId)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        initView()
        initData()
    }

    open fun startActivity(context : Context, activity :  Class<*>) {
        val intent = Intent(context , activity)
        startActivity(intent)
        finish()
    }

    open fun loadFragment(tag: String, fragment: Fragment, rootIdRes: Int) {
        val manager = supportFragmentManager
        val ft = manager.beginTransaction()

        if (manager.findFragmentByTag(tag) == null) {
            ft.add(rootIdRes, fragment, tag)
        }

        val fragment1 = manager.findFragmentByTag(TAG_FRAGMENT1)
        val fragment2 = manager.findFragmentByTag(TAG_FRAGMENT2)
        val fragment3 = manager.findFragmentByTag(TAG_FRAGMENT3)

        val dump = mutableListOf(fragment1 , fragment2 , fragment3)

        dump.forEach {
            it?.let {
                ft.hide(it)
            }
        }

        dump.forEach {
            if (tag == it?.tag){
                it.let {
                    ft.show(it)
                }
            }
        }

        ft.commitAllowingStateLoss()
    }

}