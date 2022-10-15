package com.metin.firebaselogindeneme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fit7Activity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button btngain,btnlose;
    public static String purpose;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fit7);


        toolbar = findViewById(R.id.toolbar);
        btngain = findViewById(R.id.btngain);
        btnlose = findViewById(R.id.btnlose);

        toolbar.setTitle("Welcome to Fit Diyet");
        setSupportActionBar(toolbar);

        btngain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                purpose = "gain weight";
                startActivity(new Intent(fit7Activity.this,RegisterActivity.class));
            }
        });
        btnlose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                purpose = "lose weight";
                startActivity(new Intent(fit7Activity.this,RegisterActivity.class));
            }
        });

    }
}