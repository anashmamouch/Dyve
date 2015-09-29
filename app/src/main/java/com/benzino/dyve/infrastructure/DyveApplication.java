package com.benzino.dyve.infrastructure;

import android.app.Application;

/**
 * Created by Anas on 26/9/15.
 */
public class DyveApplication extends Application {
    private Auth auth;

    @Override
    public void onCreate() {
        super.onCreate();
        auth = new Auth(this);
    }

    public Auth getAuth() {
        return auth;
    }
}
