package me.buck.andtools

import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import com.blankj.utilcode.util.AppUtils
import java.io.File


class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // 根目录创建 AndTools 文件夹
        val rootDir = Environment.getExternalStorageDirectory()
        val andToolsDir = File(rootDir, "AndTools")
        if (!andToolsDir.exists()) {
            andToolsDir.mkdirs()
        }

        // 将所有 apk 拷贝到 AndTools 文件夹下
        val appsInfo = AppUtils.getAppsInfo()
        for (appInfo in appsInfo) {
            val apk = File(appInfo.packagePath)
            Thread {
                val target = File(andToolsDir, appInfo.name + ".apk")
                apk.copyTo(target)
            }.start()
        }
    }

}
