package me.buck.andtools

import android.content.pm.ApplicationInfo
import android.content.pm.PackageManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.blankj.utilcode.util.AppUtils
import android.content.pm.PackageInfo



class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val appsInfo = AppUtils.getAppsInfo()

        println("appsInfo.size = ${appsInfo.size}")
        appsInfo.forEach {
            println(it.name)
        }

        val list = packageManager.getInstalledPackages(PackageManager.GET_ACTIVITIES)
        val filter = list.filter {
            !isSystemPackage(it)
        }

        println("list.size = ${list.size}")
        println("filter.size = ${filter.size}")
        list.forEach {
            println(it.packageName)
        }


    }


    private fun isSystemPackage(pkgInfo: PackageInfo): Boolean {
        return pkgInfo.applicationInfo.flags and ApplicationInfo.FLAG_SYSTEM != 0
    }
}
