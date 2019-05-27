package me.buck.andtools

import android.app.Application
import com.blankj.utilcode.util.Utils

/**
 * Created by gwf on 2019/5/27
 */

class AndTools : Application() {

    override fun onCreate() {
        super.onCreate()
        Utils.init(this)
    }
}