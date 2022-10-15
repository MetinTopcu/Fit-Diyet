package com.metin.firebaselogindeneme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class fit5Activity extends AppCompatActivity {

    private Toolbar toolbar;
    private Button btnyes,btnno,btnocco;
    public static String frequency;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fit5);

        toolbar = findViewById(R.id.toolbar);
        btnyes = findViewById(R.id.btngain);
        btnno = findViewById(R.id.btnno);
        btnocco = findViewById(R.id.btnlose);

        toolbar.setTitle("Welcome to Fit Diyet");
        setSupportActionBar(toolbar);

        btnyes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frequency="lots";
                startActivity(new Intent(fit5Activity.this, fit6Activity.class));
            }
        });
        btnocco.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                frequency="occasionally";
                startActivity(new Intent(fit5Activity.this, fit6Activity.class));
            }
        });
        btnno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                frequency="little";
                startActivity(new Intent(fit5Activity.this, fit6Activity.class));
            }
        });
    }
}