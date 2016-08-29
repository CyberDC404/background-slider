package com.example.pandu.example;

import android.app.Application;

/**
 * Created by Pandu on 6/23/2016.
 */
public class MyApp extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        TypefaceUtil.overrideFont(getApplicationContext(), "SERIF", "fonts/roboto-condensed.regular.ttf");
    }
}
