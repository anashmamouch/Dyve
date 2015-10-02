package com.benzino.dyve.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.benzino.dyve.R;
import com.benzino.dyve.fragments.LoginFragment;

public class RegisterActivity  extends  BaseActivity implements View.OnClickListener {
    public LoginFragment.Callbacks callbacks;

    private EditText usernameText;
    private EditText emailText;
    private EditText passwordText;
    private Button registerButton;
    private View progressBar;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_register);

        usernameText = (EditText)findViewById(R.id.activity_register_username);
        emailText = (EditText)findViewById(R.id.activity_register_email);
        passwordText = (EditText)findViewById(R.id.activity_register_password);
        registerButton = (Button)findViewById(R.id.activity_register_submit);
        progressBar = findViewById(R.id.activity_register_progressBar);

        registerButton.setOnClickListener(this);
        progressBar.setVisibility(View.GONE);

    }

    @Override
    public void onClick(View view) {
        if (view == registerButton){
            application.getAuth().getUser().setIsLoggedIn(true);
            setResult(RESULT_OK);
            finish();
        }
    }
}
