package com.metin.firebaselogindeneme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SportsChooseActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button btngain,btnlose,btnkeep;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sports_choose);

        toolbar = findViewById(R.id.toolbar);
        btngain = findViewById(R.id.btngain);
        btnlose = findViewById(R.id.btnlose);
        btnkeep = findViewById(R.id.btnkeep);

        toolbar.setTitle("Sports Choose");
        setSupportActionBar(toolbar);

        btngain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SportsChooseActivity.this,SportsProgramActivity.class));
            }
        });
        btnkeep.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SportsChooseActivity.this,SportsProgram1Activity.class));
            }
        });
        btnlose.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(SportsChooseActivity.this,SportsProgram2Activity.class));
            }
        });
    }
}