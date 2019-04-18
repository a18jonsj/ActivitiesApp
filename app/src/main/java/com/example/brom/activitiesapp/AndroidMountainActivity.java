package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class AndroidMountainActivity extends AppCompatActivity {

    private static final String TAG = "AndroidMountainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_mountain);
        TextView incomingData = (TextView) findViewById(R.id.textView);
        Log.d(TAG, "onCreate: Started.");

        Intent incomingIntent = getIntent();
        String incomingBerg = incomingIntent.getStringExtra("Berg");
        Log.d(TAG,"onCreate: Found incoming:" + incomingBerg);
        incomingData.setText(incomingBerg);
    }
}
