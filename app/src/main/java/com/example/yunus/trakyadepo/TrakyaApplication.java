package com.example.yunus.trakyadepo;

import android.app.Application;
import com.activeandroid.ActiveAndroid;

/**
 * Created by yunus on 11.01.2016.
 */
public class TrakyaApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();
        ActiveAndroid.initialize(this);
    }

    @Override
    public void onTerminate() {
        super.onTerminate();

    }
}
