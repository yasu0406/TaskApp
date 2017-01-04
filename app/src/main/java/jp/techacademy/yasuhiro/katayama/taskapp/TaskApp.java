package jp.techacademy.yasuhiro.katayama.taskapp;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by katayama on 2016/12/26.
 */

public class TaskApp extends Application {
    @Override
    public void onCreate() {
        super.onCreate();
        Realm.init(this);
    }
}
