package io.github.yusukeiwaki.darkclock;

import android.app.Application;

import com.jakewharton.threetenabp.AndroidThreeTen;

public class DarkClockApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        AndroidThreeTen.init(this);
    }
}
