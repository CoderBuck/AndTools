package github.coderbuck.andtools

import android.os.Bundle
import android.os.Environment
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.blankj.utilcode.util.AppUtils
import com.blankj.utilcode.util.FileUtils
import github.coderbuck.andtools.databinding.ActivityMainBinding
import timber.log.Timber
import java.io.File


class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
    }

    private fun tmp() {
        // 根目录创建 AndTools 文件夹
        val rootDir = Environment.getExternalStorageDirectory()
        val andToolsDir = File(rootDir, "AndTools")
        if (!andToolsDir.exists()) {
            andToolsDir.mkdirs()
        }

        // 将所有 apk 拷贝到 AndTools 文件夹下
        val appsInfo = AppUtils.getAppsInfo()
        //        for (appInfo in appsInfo) {
        //            val apk = File(appInfo.packagePath)
        //            Thread {
        //                val target = File(andToolsDir, appInfo.name + ".apk")
        //                apk.copyTo(target)
        //            }.start()
        //        }
        appsInfo.withIndex().forEach {
            val index = it.index
            val info = it.value
            Timber.d("app info $index  ${info.name}  ${info.packagePath}")

            val apk = File(info.packagePath)
            apk.length()
            FileUtils.getSize(apk)
        }
    }

}
