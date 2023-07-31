package com.example.creditscore;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.AppCompatButton;

import android.os.Bundle;

public class CompoundInterestActivity extends AppCompatActivity {

    AppCompatButton btn_loan,btn_Rate,btn_Amount;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_compound_interest);
    }
}