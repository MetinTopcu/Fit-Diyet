package com.metin.firebaselogindeneme;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class BodyMassIndexActivity extends AppCompatActivity {
    private Toolbar toolbar;
    private int sonuc = 0;
    private TextView txttall, txtkilos, txtresult;
    private Button btnresult;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_body_mass_index);

        btnresult = findViewById(R.id.btnresult);
        txtresult = findViewById(R.id.txtresult);
        txtkilos = findViewById(R.id.txtkilos);
        txttall = findViewById(R.id.txttall);
        toolbar = findViewById(R.id.toolbar);
        toolbar.setTitle("Body Mass Index");
        btnresult.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!txttall.getText().toString().isEmpty() && !txtkilos.getText().toString().isEmpty()){
                    int a = Integer.parseInt(txttall.getText().toString());
                    int b = Integer.parseInt(txtkilos.getText().toString());
                    sonuc = b / ( a * a / 10000);
                    txtresult.setText(String.valueOf(sonuc));
                }
            }
        });

    }
}