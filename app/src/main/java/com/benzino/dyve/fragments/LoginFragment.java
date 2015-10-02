package com.benzino.dyve.fragments;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;

import com.benzino.dyve.R;

public class LoginFragment extends BaseFragment implements View.OnClickListener {
    private Button loginButton;
    private Callbacks callbacks;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_login, container, false);

        loginButton = (Button) view.findViewById(R.id.fragment_login_submit);
        loginButton.setOnClickListener(this);
        return view;
    }

    @Override
    public void onClick(View view) {
        if(view == loginButton){
            /*Notify parent activity*/
            application.getAuth().getUser().setIsLoggedIn(true);
            callbacks.onLoggedIn();
        }
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        callbacks = (Callbacks) activity;
    }

    @Override
    public void onDetach() {
        super.onDetach();
        callbacks = null;
    }

    public interface Callbacks{
        public void onLoggedIn();
    }
}
