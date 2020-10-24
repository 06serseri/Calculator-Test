package com.example.calculatortest;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class SettingsActivity extends AppCompatActivity {

    private static final String TAG = "Settings Activity";
    Button buttonRateApp, buttonContactUs;
    TextView textDesignedBy;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_settings);

        initViews();

        buttonContactUs.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                contactUs();
            }
        });

        buttonRateApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                rateApp(v);
            }
        });

        //https://incipia.co/post/app-development/what-should-your-app-include-in-settings/

        //contact us
        // current version

    }

    private void contactUs() {
//        Intent intent = new Intent(Intent.ACTION_SEND);
//        intent.putExtra(Intent.EXTRA_EMAIL, "tunaalkan91@gmail.com");
//        intent.setType("message/rfc822");
//        startActivity(Intent.createChooser(intent, "Choose an email client"));
        //https://stackoverflow.com/questions/21720640/sending-email-from-android-app-when-click-on-button
        Intent intent = new Intent(Intent.ACTION_SENDTO,
                Uri.fromParts("mailto", "tunaalkan91@gmail.com", null));
        startActivity(Intent.createChooser(intent, "Choose an email client"));
    }

    public void rateApp(View v) {
        try {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("market://details?id=" + "com.android.chrome")));
        } catch (ActivityNotFoundException e) {
            startActivity(new Intent(Intent.ACTION_VIEW,
                    Uri.parse("http://play.google.com/store/apps/details?id=" + getPackageName())));
        }
    }

    private void initViews() {
        Log.d(TAG, "initViews: started");

        buttonRateApp = findViewById(R.id.buttonRateApp);
        buttonContactUs = findViewById(R.id.buttonContactUs);
        textDesignedBy = findViewById(R.id.textDesignedBy);
    }
}