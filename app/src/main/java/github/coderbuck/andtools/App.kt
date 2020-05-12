package github.coderbuck.andtools

import android.app.Application
import com.blankj.utilcode.util.CrashUtils
import com.blankj.utilcode.util.Utils
import java.io.File

/**
 * Created by gwf on 2019/5/27
 */

class App : Application() {

    override fun onCreate() {
        super.onCreate()
        Utils.init(this)
        CrashUtils.init(filesDir.path + "/crash/")
    }
}