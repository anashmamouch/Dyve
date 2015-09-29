package com.benzino.dyve.infrastructure;

import android.content.Context;

/**
 * Created by Anas on 26/9/15.
 */
public class Auth {
    private final Context context;
    private User user;

    public Auth(Context context) {
        this.context = context;
        user = new User();
    }

    public User getUser() {
        return user;
    }
}
