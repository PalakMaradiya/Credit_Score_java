package com.example.creditscore;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;

public class optionAcitivity extends AppCompatActivity {


    LinearLayout  Caculaters;
    ImageView btnBack;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_option_acitivity);
        initview();
    }

    private void initview() {
        btnBack=findViewById(R.id.btnBack);
        btnBack.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(optionAcitivity.this,splashActivity.class);
                startActivity(i);
            }
        });
        Caculaters = findViewById(R.id.Caculaters);
        Caculaters.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(optionAcitivity.this,CaculatorActivity.class);
                startActivity(i);
            }
        });
    }
}