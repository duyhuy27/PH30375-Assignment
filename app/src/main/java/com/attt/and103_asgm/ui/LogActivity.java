package com.attt.and103_asgm.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.attt.and103_asgm.R;
import com.attt.and103_asgm.ui.fragment.SplashFragment;

public class LogActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log);

        getSupportFragmentManager().beginTransaction().replace(R.id.container_login, new SplashFragment()).addToBackStack(null).commit();

    }

    //function to get the fragment manager

}