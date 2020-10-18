package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main Activity";


    Button buttonToFinancingActivity, buttonToLeasingActivity, buttonToSettingsActivity;
    ConstraintLayout constraintLayoutParentMain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        //https://stackoverflow.com/questions/17526533/moving-from-one-activity-to-another-activity-in-android
        //https://www.youtube.com/watch?v=aS__9RbCyHg
        buttonToFinancingActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FinancingActivity.class);
                startActivity(intent);
            }
        });
        buttonToLeasingActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LeasingActivity.class);
                startActivity(intent);
            }
        });
        buttonToSettingsActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SettingsActivity.class);
                startActivity(intent);
            }
        });
    }

    private void initViews(){
        Log.d(TAG, "initViews: Started");

        buttonToFinancingActivity = findViewById(R.id.buttonToFinancingActivity);
        buttonToLeasingActivity = findViewById(R.id.buttonToLeasingActivity);
        buttonToSettingsActivity = findViewById(R.id.buttonToSettingsActivity);
        constraintLayoutParentMain = findViewById(R.id.constraintLayoutParentMain);
    }
}
