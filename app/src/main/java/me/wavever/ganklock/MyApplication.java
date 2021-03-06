package me.wavever.ganklock;

import android.content.Context;
import com.activeandroid.app.Application;
import me.wavever.ganklock.util.SharedPreferencesUtil;

/**
 * Created by WAVE on 2016/3/2.
 */
public class MyApplication extends Application {

    private static Context context;

    private static SharedPreferencesUtil sp;


    @Override public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
        sp = new SharedPreferencesUtil(context);
    }

    /**
     * 获得一个全局的Context对象
     */
    public static Context getContext() {
        return context;
    }

    public static SharedPreferencesUtil getSp(){
        return sp;
    }
}
