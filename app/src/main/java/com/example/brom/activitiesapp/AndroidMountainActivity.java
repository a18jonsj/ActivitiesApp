package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.ImageView;
import android.widget.TextView;

public class AndroidMountainActivity extends AppCompatActivity {

    private static final String TAG = "AndroidMountainActivity";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_android_mountain);
        TextView incomingData = (TextView) findViewById(R.id.textView2);
        Log.d(TAG, "onCreate: Started.");

        Intent incomingIntent = getIntent();
        String incomingBerg = incomingIntent.getStringExtra("Berg");
        int incomingBerg1 = incomingIntent.getIntExtra("Berg1",0);
        String incomingBerg2 = incomingIntent.getStringExtra("Berg2");
        Log.d(TAG,"onCreate: Found incoming:" + incomingBerg2);
        incomingData.setText(""+incomingBerg1);

        TextView name = findViewById(R.id.textView);
        name.setText(incomingBerg2);

        ImageView bild1 = findViewById(R.id.bild);
        bild1.setImageResource(R.drawable.denali);

        if (incomingBerg.equals("Denali")){
            bild1.setImageResource(R.drawable.denali);


        }
        else if (incomingBerg.equals("Mont Blanc")){
            bild1.setImageResource(R.drawable.testmb);
        }
        else if (incomingBerg.equals("Matterhorn")){
            bild1.setImageResource(R.drawable.swiss);
        }
    }
}
