package com.example.brom.activitiesapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;
import android.widget.Toast;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.Arrays;

public class MainActivity extends AppCompatActivity {
            private String[] mountainNames = {"Matterhorn","Mont Blanc","Denali"};
            private String[] mountainLocations = {"Alps","Alps","Alaska"};
            private int[] mountainHeights ={4478,4808,6190};
            // Create ArrayLists from the raw data above and use these lists when populating your ListView.
            //FORKED?PUSH?



            ListView listView;
            private Button button;

            @Override
            protected void onCreate(Bundle savedInstanceState) {
                super.onCreate(savedInstanceState);
                setContentView(R.layout.activity_main);

                button =(Button) findViewById(R.id.button);
                button.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        openAndroidMountainActivity();
                    }
                });





                listView=(ListView) findViewById(R.id.listview);

                ArrayList<String> arrayList= new ArrayList<String>(Arrays.asList(mountainNames));

                ArrayAdapter arrayAdapter=new ArrayAdapter (this, R.layout.list_item_textview,R.id.list_item_textview, arrayList);

                listView.setAdapter(arrayAdapter);
                listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        openAndroidMountainActivity();

                        Intent intent = new Intent(MainActivity.this, AndroidMountainActivity.class);
                        intent.putExtra("Berg", mountainNames[position] + "\nHeight: " +  mountainHeights [position] + "\nLocation: " +  mountainLocations [position]);
                        startActivity(intent);

                    }

                });



        // 1. Create a ListView as in previous assignment
        // 2. Create a new activity named "MountainDetailsActivity
        // 3. Create a new Layout file for the MountainDetailsActivity called
        //    "activity_mountaindetails". MountainDetailsActivity must have MainActivity as its
        //    ´parent activity.
        // 4. The layout file created in step 3 must have a LinearLayout
        // 5. The layout file created in step 3 must be able to display
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 6. When tapping on a list item: create an Intent that includes
        //    * Mountain Name
        //    * Mountain Location
        //    * Mountain Height
        // 7. Display the MountainDetailsActivity with the data from the Intent created in step
        //    6
        // 8. From the MountainDetailsActivity you should have an option to "go back" using an
        //    left arro button. This is done by letting the MainActivity be the parent activity to
        //    MountainDetailsActivity.


    }

    public void openAndroidMountainActivity()
    {
        Intent intent= new Intent(this,AndroidMountainActivity.class);
        startActivity(intent);
    }

}
