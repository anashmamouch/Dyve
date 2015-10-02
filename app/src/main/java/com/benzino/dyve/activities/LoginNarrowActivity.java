package com.benzino.dyve.activities;

import android.os.Bundle;
import android.util.Log;
import android.view.SurfaceHolder;
import android.widget.Button;

import com.benzino.dyve.R;
import com.benzino.dyve.fragments.LoginFragment;

public class LoginNarrowActivity extends BaseActivity implements LoginFragment.Callbacks {

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_login_narrow);
    }

    @Override
    public void onLoggedIn() {
        setResult(RESULT_OK);
        finish();
    }
}
