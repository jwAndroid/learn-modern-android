package com.jw_android.learn_modern_android.utils_study

import android.util.Log

class Console {
    companion object {
        fun log (what : String?) {
            if (what == null) Log.d("ConsoleLog" , "null")
            else Log.d("ConsoleLog" , what)
        }
    }
}