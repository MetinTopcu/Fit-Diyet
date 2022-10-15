package com.metin.firebaselogindeneme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class GainWeightActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button btngain,btnlose,btnkeep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_gain_weight);

        toolbar = findViewById(R.id.toolbar);
        btngain = findViewById(R.id.btngain);
        btnlose = findViewById(R.id.btnlose);
        btnkeep = findViewById(R.id.btnkeep);

        toolbar.setTitle("Gain Weight");
        setSupportActionBar(toolbar);

        btngain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GainWeightActivity.this,WinWeightActivity.class));
            }
        });
        btnkeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GainWeightActivity.this,KeepFitActivity.class));
            }
        });
        btnlose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(GainWeightActivity.this,LoseWeightActivity.class));
            }
        });
    }
}