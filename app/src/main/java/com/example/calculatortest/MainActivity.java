package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;
import androidx.constraintlayout.widget.ConstraintLayout;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main Activity";

    //TODO: Buttons does not work whole cardview should be clickable
    Button buttonToFinancingActivity, buttonToLeasingActivity, buttonToSettingsActivity;
    ConstraintLayout constraintLayoutParentMain, constraintLayoutFinancingActivity, constraintLayoutToLeasingActivity, constraintLayoutSettingsActivity;
    MaterialCardView cardViewGoToFinancing, cardViewGoToLeasing, cardViewGoToSettings;
    ImageView imageViewFinancing, imageViewToLeasing, imageViewSettings;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        //https://stackoverflow.com/questions/17526533/moving-from-one-activity-to-another-activity-in-android
        //https://www.youtube.com/watch?v=aS__9RbCyHg
        cardViewGoToFinancing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, FinancingActivity.class);
                startActivity(intent);
            }
        });
        cardViewGoToLeasing.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, LeasingActivity.class);
                startActivity(intent);
            }
        });
        cardViewGoToSettings.setOnClickListener(new View.OnClickListener() {
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
        constraintLayoutFinancingActivity = findViewById(R.id.constraintLayoutFinancingActivity);
        constraintLayoutToLeasingActivity = findViewById(R.id.constraintLayoutToLeasingActivity);
        constraintLayoutSettingsActivity = findViewById(R.id.constraintLayoutSettingsActivity);
        cardViewGoToFinancing = findViewById(R.id.cardViewGoToFinancing);
        cardViewGoToLeasing = findViewById(R.id.cardViewGoToLeasing);
        cardViewGoToSettings = findViewById(R.id.cardViewGoToSettings);
    }
}
