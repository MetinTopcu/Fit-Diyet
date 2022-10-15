package com.metin.firebaselogindeneme;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import com.google.android.material.floatingactionbutton.FloatingActionButton;

import java.util.Random;

public class LoginActivity extends AppCompatActivity {

    private Toolbar toolbar;
    private TextView textProfile, txtstr;
    public static int loginis;
    public static int fatmasslogin = 0;
    private FloatingActionButton flbt;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        toolbar = findViewById(R.id.toolbar);
        textProfile = findViewById(R.id.textprofile);
        txtstr = findViewById(R.id.txtstr);
        flbt = findViewById(R.id.flabtn);

        flbt.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(LoginActivity.this,ProfileActivity.class));
            }
        });
        if (loginis == 0){
            textProfile.setVisibility(View.INVISIBLE);
            txtstr.setVisibility(View.INVISIBLE);
        }
        else {
        }

        toolbar.setTitle("Welcome to FitDiyet");
        setSupportActionBar(toolbar);
    }
    public void Profile(View view) {
        startActivity(new Intent(LoginActivity.this,SuggestionsActivity.class));
    }

    public void nutrition(View view) {
            startActivity(new Intent(LoginActivity.this,GainWeightActivity.class));

    }

    public void sports(View view) {
        startActivity(new Intent(LoginActivity.this,SportsChooseActivity.class));
    }

    public void body(View view) {
        startActivity(new Intent(LoginActivity.this,BodyMassIndexActivity.class));
    }

}