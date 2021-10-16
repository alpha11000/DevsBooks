package com.example.devsbooks;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

public class splash_screen extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash_screen);

        Handler handle = new Handler();


        handle.postDelayed(new Runnable() {
            @Override
            public void run() {
                showLoginActivity();
            }
        }, 2000);

    }

    private void showLoginActivity(){

        Intent loginScreen = new Intent(splash_screen.this, TelaDeLogin.class);
        startActivity(loginScreen);
        finish();

    }

}