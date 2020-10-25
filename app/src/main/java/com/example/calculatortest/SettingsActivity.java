package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;

import com.google.android.material.card.MaterialCardView;

public class SettingsActivity extends AppCompatActivity {

    private static final String TAG = "Settings Activity";
    MaterialCardView cardViewRateApp, cardViewContactUs;
    ImageView imageRateApp, imageContactUs;
    TextView textDesignedBy, textRateApp, textContactUs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        initViews();

        cardViewContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactUs();
            }
        });

        cardViewRateApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rateApp(v);
            }
        });

    }

    private void contactUs() {
        Intent intent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "s3cilabs@gmail.com", null));
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }

    public void rateApp(View v) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + getPackageName())));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
        }
    }

    private void initViews() {
        Log.d(TAG, "initViews: started");

        cardViewRateApp = findViewById(R.id.cardViewRateApp);
        cardViewContactUs = findViewById(R.id.cardViewContactUs);
        imageRateApp = findViewById(R.id.imageRateApp);
        imageContactUs = findViewById(R.id.imageContactUs);
        textRateApp = findViewById(R.id.textRateApp);
        textContactUs = findViewById(R.id.textContactUs);
        textDesignedBy = findViewById(R.id.textDesignedBy);
    }
}