package com.example.calculatortest;

import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class FinancingViewHolder extends AppCompatActivity implements View.OnClickListener {

    EditText inputVehicleMSRP, inputTermInMonths, inputRate, inputPaymentFrequency;
    TextView outputText;
    @Override

    public void onClick(View v) {

    }

    void getInputs(){
        Button buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonCalculate.setOnClickListener(this);

        inputVehicleMSRP = findViewById(R.id.inputVehicleMSRP);
        inputTermInMonths = findViewById(R.id.inputTermInMonths);
        inputRate = findViewById(R.id.inputRate);

        outputText = findViewById(R.id.outputText);
    }

}
