package com.jw_android.learn_modern_android.view.base

import android.content.Context
import android.content.Intent
import android.os.Bundle
import androidx.annotation.LayoutRes
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.jw_android.learn_modern_android.R
import com.jw_android.learn_modern_android.databinding.ActivityLayoutBinding

abstract class BaseActivity<T : ViewDataBinding>(@LayoutRes
                                                 private val layoutResId: Int
                                                 ) : AppCompatActivity() {

//    TODO : BaseViewModel ,

    protected abstract fun initView()
    protected abstract fun initData()

//    lazy 로 사용해도 된다. 책에서봄
    protected val binding : T by lazy {
        DataBindingUtil.setContentView(this , R.layout.activity_layout)
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

}