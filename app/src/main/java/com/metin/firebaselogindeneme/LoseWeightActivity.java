package com.metin.firebaselogindeneme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.widget.TextView;

public class LoseWeightActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_lose_weight);

        toolbar = findViewById(R.id.toolbar);

        toolbar.setTitle("Lose Weight");
        setSupportActionBar(toolbar);
    }
}