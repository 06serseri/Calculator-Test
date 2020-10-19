package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class FinancingActivity extends AppCompatActivity {
    private static final String TAG = "FinancingActivity";

    EditText inputVehicleMSRP, inputTermInMonths, inputRate, inputTaxRate;
    TextView outputText;
    Button buttonCalculate, buttonReset;
    Spinner spinnerFrequency;
    ConstraintLayout constraintLayoutParent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_financing);

        initViews();

        buttonCalculate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initCalculate();
            }
        });
        buttonReset.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                initReset();
            }
        });
    }

    private void initCalculate(){
        Log.d(TAG, "initRegister: Started");
        if(validateData()){

            //Get rid of showSnackBar()
            String getMsrp = inputVehicleMSRP.getText().toString();
            TestFinancing.vehicleMsrp = Integer.parseInt(getMsrp);//Replace MSRP with Financing.vehicleMsrp

            String getTerm = inputTermInMonths.getText().toString();
            TestFinancing.termInMonths = Double.parseDouble(getTerm);

            String getRate = inputRate.getText().toString();
            TestFinancing.rate = Double.parseDouble(getRate);

            String getTaxRate = inputTaxRate.getText().toString();
            TestFinancing.taxRate = Double.parseDouble(getTaxRate);

            TestFinancing.paymentFrequency = spinnerFrequency.getSelectedItem().toString();

            TestFinancing.calculateFinancing();
            Double result = TestFinancing.payment;

            String outputPayment = String.valueOf(String.format("%.2f",result));
            outputText.setText("$" + outputPayment);
        }
    }

    private void initReset(){
        inputVehicleMSRP.setText("");
        inputTermInMonths.setText("");
        inputRate.setText("");
        inputTaxRate.setText("");
        outputText.setText("");
        spinnerFrequency.setSelection(0);
    }
    private boolean validateData(){
        Log.d(TAG, "validateData: Started");
        if(inputVehicleMSRP.getText().toString().equals("")){
            Toast.makeText(this, "Please enter vehicle MSRP", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(inputTermInMonths.getText().toString().equals("")){
            Toast.makeText(this, "Please enter the financing term", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(inputRate.getText().toString().equals("")){
            Toast.makeText(this, "Please enter the interest rate", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(inputTaxRate.getText().toString().equals("")) {
            Toast.makeText(this, "Please enter the tax rate", Toast.LENGTH_SHORT).show();
            return false;
        }
        if(spinnerFrequency.getSelectedItem().toString().equals("Payment Frequency")){
            Toast.makeText(this, "Please select payment frequency", Toast.LENGTH_SHORT).show();
            return false;
        }
//        if(inputPaymentFrequency.getText().toString().equals("")){
//            Toast.makeText(this, "Enter the fucking FREQUENCY", Toast.LENGTH_SHORT).show();
//            return false;
//        }
        return true;
    }
    private void initViews(){
        Log.d(TAG, "initViews: Started");
        inputVehicleMSRP = findViewById(R.id.inputVehicleMSRP);
        inputTermInMonths = findViewById(R.id.inputTermInMonths);
        inputRate = findViewById(R.id.inputRate);
        inputTaxRate = findViewById(R.id.inputTaxRate);

        spinnerFrequency = findViewById(R.id.spinnerFrequency);

        buttonCalculate = findViewById(R.id.buttonCalculate);
        buttonReset = findViewById(R.id.buttonReset);

        outputText = findViewById(R.id.outputText);
        constraintLayoutParent = findViewById(R.id.constraintLayoutParent);
    }
}