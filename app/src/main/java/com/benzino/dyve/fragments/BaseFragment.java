package com.benzino.dyve.fragments;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentActivity;

import com.benzino.dyve.infrastructure.DyveApplication;

public abstract class BaseFragment extends Fragment {
    protected DyveApplication application;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        application = (DyveApplication) getActivity().getApplication();
    }
}
