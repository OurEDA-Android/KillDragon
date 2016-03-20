package com.lfk.tddemo;

import android.app.Application;

import com.lfk.justweengine.Utils.crashHandler.CrashHandler;

/**
 * Created by liufengkai on 16/1/16.
 */
public class Appli extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        CrashHandler.getInstance().init(this);
        CrashHandler.getInstance().setRestartActivity(MainActivity.class);
    }
}
