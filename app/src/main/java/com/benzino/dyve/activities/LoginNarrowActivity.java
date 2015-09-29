package com.benzino.dyve.activities;

import android.os.Bundle;
import android.util.Log;

import com.benzino.dyve.R;

public class LoginNarrowActivity extends BaseActivity {

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_login_narrow);
        Log.d("ANAS", "--LoginNarrowActivity");
    }
}
