package me.buck.andtools;

import android.content.pm.PackageManager;
import android.os.Bundle;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;
import com.blankj.utilcode.util.AppUtils;

import java.util.List;

/**
 * Created by gwf on 2019/5/27
 */
public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<AppUtils.AppInfo> appsInfo = AppUtils.getAppsInfo();
        for (AppUtils.AppInfo appInfo : appsInfo) {
            System.out.println("appInfo.getName = " + appInfo.getName());
        }


        PackageManager pm = getPackageManager();

    }
}
