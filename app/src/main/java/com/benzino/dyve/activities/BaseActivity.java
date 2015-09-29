package com.benzino.dyve.activities;

import android.os.Bundle;

import android.support.v4.app.FragmentActivity;

import android.support.v7.app.AppCompatActivity;

import com.benzino.dyve.infrastructure.DyveApplication;


public abstract class BaseActivity extends AppCompatActivity{

    protected DyveApplication application;

    @Override
    protected void onCreate(Bundle savedState) {
        super.onCreate(savedState);

        application = (DyveApplication) getApplication();
    }
}
