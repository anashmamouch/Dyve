package com.benzino.dyve.activities;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

import com.benzino.dyve.R;
import com.benzino.dyve.fragments.LoginFragment;


public class LoginActivity extends BaseActivity implements View.OnClickListener {
    private View loginButton;
    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_login);

        Log.d("ANAS", "--LoginActivity");

        loginButton = findViewById(R.id.activity_login_login);
        if (loginButton != null){
            loginButton.setOnClickListener(this);
        }
    }

    @Override
    public void onClick(View view) {
        if( view == loginButton){
            startActivity(new Intent(LoginActivity.this, LoginNarrowActivity.class));
        }
    }
}
