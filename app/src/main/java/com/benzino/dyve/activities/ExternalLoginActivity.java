package com.benzino.dyve.activities;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

import com.benzino.dyve.R;

public class ExternalLoginActivity extends BaseActivity implements View.OnClickListener {
    public static final String EXTRA_EXTERNAL_SERVICE = "EXTRA_EXTERNAL_SERVICE";

    private View testButton;
    private WebView webView;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);
        setContentView(R.layout.activity_external_login);

        testButton = findViewById(R.id.activity_external_login_testButton);
        webView = (WebView)findViewById(R.id.activity_external_login_webview);

        testButton.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {
        if( view == testButton){
            application.getAuth().getUser().setIsLoggedIn(true);
            setResult(RESULT_OK);
            finish();
        }

    }
}
