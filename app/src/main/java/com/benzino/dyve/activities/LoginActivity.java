package com.benzino.dyve.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.benzino.dyve.R;
import com.benzino.dyve.fragments.LoginFragment;


public class LoginActivity extends BaseActivity implements View.OnClickListener, LoginFragment.Callbacks {
    private static final int REQUEST_NARROW_LOGIN = 101;
    private static final int REQUEST_REGISTER = 202 ;
    private static final int REQUEST_EXTERNAL_LOGIN = 303;

    private View loginButton;
    private View registerButton;
    private View facebookButton;
    private View googleButton;
    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_login);

        loginButton = findViewById(R.id.activity_login_login);
        registerButton = findViewById(R.id.activity_login_register);
        facebookButton = findViewById(R.id.activity_login_facebook);
        googleButton = findViewById(R.id.activity_login_google);

        if (loginButton != null){
            loginButton.setOnClickListener(this);
        }

        registerButton.setOnClickListener(this);
        facebookButton.setOnClickListener(this);
        googleButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if( view == loginButton){
            startActivityForResult(new Intent(this, LoginNarrowActivity.class)
                    , REQUEST_NARROW_LOGIN);
        }else if ( view == registerButton ){
            startActivityForResult(new Intent(this, RegisterActivity.class)
                    , REQUEST_REGISTER);
        }else if( view == facebookButton){
            doExternalLogin("Facebook");
        }else if ( view == googleButton){
            doExternalLogin("Google");
        }
    }

    private void doExternalLogin(String externalService) {
        Intent intent = new Intent(this, ExternalLoginActivity.class);
        intent.putExtra(ExternalLoginActivity.EXTRA_EXTERNAL_SERVICE, externalService);
        startActivityForResult(intent, REQUEST_EXTERNAL_LOGIN);
        finish();
    }

    @Override
    protected void onActivityResult(int requestCode, int resultCode, Intent data) {
        if(resultCode != RESULT_OK)
            return;

        if(requestCode == REQUEST_NARROW_LOGIN ||
           requestCode == REQUEST_REGISTER ||
           requestCode == REQUEST_EXTERNAL_LOGIN){
            finishLogin();
        }
    }

    private void finishLogin() {
        startActivity(new Intent(this, MainActivity.class));
        finish();
    }

    @Override
    public void onLoggedIn() {
        finishLogin();
    }
}
