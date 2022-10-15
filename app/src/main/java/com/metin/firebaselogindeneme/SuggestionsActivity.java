package com.metin.firebaselogindeneme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;

public class SuggestionsActivity extends AppCompatActivity {
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_suggestions);

        toolbar = findViewById(R.id.toolbar);

        toolbar.setTitle("General Suggestions");
        setSupportActionBar(toolbar);
    }
}