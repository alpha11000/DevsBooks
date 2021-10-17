package com.example.devsbooks;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar topBar = findViewById(R.id.tollbar);

        setSupportActionBar(topBar);
        if(getSupportActionBar() != null){
            getSupportActionBar().setTitle("");
        }
    }
}