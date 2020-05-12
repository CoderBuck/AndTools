package github.coderbuck.andtools

import android.app.Application
import com.blankj.utilcode.util.Utils

/**
 * Created by gwf on 2019/5/27
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Utils.init(this)
    }
}