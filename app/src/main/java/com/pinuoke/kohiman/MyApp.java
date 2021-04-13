package com.pinuoke.kohiman;

import android.app.Application;

import com.pedaily.yc.ycdialoglib.toast.ToastUtils;


public class MyApp extends Application {
    private static MyApp sInstance;

    @Override
    public void onCreate() {
        super.onCreate();
        sInstance = this;
        ToastUtils.init(this);
    }

    public static MyApp getInstance() {
        return sInstance;
    }
}
