package com.bw.movie.utils;

import android.app.Application;
import android.content.Context;

/**
 * @ClassName App
 * @Description TODO
 * @Author tys
 * @Date 2020/3/614:46
 */
public class App extends Application {
    private static Context context;

    @Override
    public void onCreate() {
        super.onCreate();
        context = getApplicationContext();
    }

    public static Context getContext(){
        return context;
    }

}
