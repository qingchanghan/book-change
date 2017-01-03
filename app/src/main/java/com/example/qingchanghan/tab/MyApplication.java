package com.example.qingchanghan.tab;

import android.app.Application;
import android.content.Context;

/**
 * Created by Qingchang Han on 2016/12/31.
 */

public class MyApplication extends Application {

    private static Context context;

    @Override
    public void onCreate() {
        context = getApplicationContext();
    }

    public static Context getContext() {
        return context;
    }
}
