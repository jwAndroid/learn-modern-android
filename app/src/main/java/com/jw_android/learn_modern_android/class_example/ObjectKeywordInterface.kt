package com.jw_android.learn_modern_android.class_example

import android.util.Log

class ObjectKeywordInterface {

        var objectKeywordInterface = object : Interface {

            override lateinit var variable: String

            override fun get() : String {
//            TODO("Not yet implemented")
                return variable
            }

            override fun set() {
                variable = "asd"
//            TODO("Not yet implemented")
            }

        }

}