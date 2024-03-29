package com.metin.firebaselogindeneme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ValueActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private Button btnContinue;
    private TextView txtHowPercent;
    public static int Howfitmass = 0;
    private ConstraintLayout constraintLayout;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_value);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Welcome to Fit Diyet");
        setSupportActionBar(toolbar);
        constraintLayout = findViewById(R.id.constraintlayout);
        if (Howfitmass >= 45)
        {
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(Color.RED));
        } else if (Howfitmass >= 25 && Howfitmass < 45) {
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(Color.BLUE));
        }
        else {
            constraintLayout.setBackgroundTintList(ColorStateList.valueOf(Color.GREEN));
        }
        btnContinue = findViewById(R.id.btncontinue);
        txtHowPercent = findViewById(R.id.txtHowPercent);
        int value = 100 - Howfitmass;
        txtHowPercent.setText("%" + String.valueOf(value) + " HEALTHY");
        btnContinue.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                LoginActivity loginActivity = new LoginActivity();
                if (loginActivity.loginis == 1)
                {
                    startActivity(new Intent(ValueActivity.this,LoginActivity.class));
                }
                else {
                    startActivity(new Intent(ValueActivity.this, WelcomeFitDiyetActivity.class));
                }
            }
        });
    }
}