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

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.initialization.InitializationStatus;
import com.google.android.gms.ads.initialization.OnInitializationCompleteListener;
import com.google.android.material.card.MaterialCardView;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "Main Activity";

    //TODO: Buttons does not work whole cardview should be clickable
    TextView textLabelBuy, textLabelLease, textLabelSettings;
//    Button buttonToFinancingActivity, buttonToLeasingActivity, buttonToSettingsActivity;
    ConstraintLayout constraintLayoutParentMain, constraintLayoutFinancingActivity, constraintLayoutToLeasingActivity, constraintLayoutSettingsActivity;
    MaterialCardView cardViewGoToFinancing, cardViewGoToLeasing, cardViewGoToSettings;
    ImageView imageViewFinancing, imageViewToLeasing, imageViewSettings;
    AdView adView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initViews();
        //TODO Update Ad ID
        //ca-app-pub-9425777381690046~6829510960
        MobileAds.initialize(this, new OnInitializationCompleteListener() {
            @Override
            public void onInitializationComplete(InitializationStatus initializationStatus) {
            }
        });
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

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

        textLabelBuy = findViewById(R.id.textLabelBuy);
        textLabelLease = findViewById(R.id.textLabelLease);
        textLabelSettings = findViewById(R.id.textLabelSettings);
        constraintLayoutParentMain = findViewById(R.id.constraintLayoutParentMain);
        constraintLayoutFinancingActivity = findViewById(R.id.constraintLayoutFinancingActivity);
        constraintLayoutToLeasingActivity = findViewById(R.id.constraintLayoutToLeasingActivity);
        constraintLayoutSettingsActivity = findViewById(R.id.constraintLayoutSettingsActivity);
        cardViewGoToFinancing = findViewById(R.id.cardViewGoToFinancing);
        cardViewGoToLeasing = findViewById(R.id.cardViewGoToLeasing);
        cardViewGoToSettings = findViewById(R.id.cardViewGoToSettings);
        adView = findViewById(R.id.adView);
    }
}
