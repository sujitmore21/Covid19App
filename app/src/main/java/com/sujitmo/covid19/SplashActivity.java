package com.sujitmo.covid19;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class SplashActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        new Handler().postDelayed(new Runnable() {
            @Override
            public void run() {

                Intent splashIntent = new Intent(SplashActivity.this,MainActivity.class);
                overridePendingTransition(android.R.anim.fade_in,android.R.anim.fade_out);
                startActivity(splashIntent);
                finish();

            }
        },5000);



    }
}
