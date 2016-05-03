package com.example.gridlayout;

import android.content.Context;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    // Declare all of your button objects that will be used in this class
    Button sound1;
    Button sound2;
    Button sound3;
    Button sound4;
    Button sound5;
    Button sound6;
    Button sound7;
    Button sound8;
    Button sound9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        // call the parent
        super.onCreate(savedInstanceState);
        // set your layout file to "res/layout/activity_main.xml"
        setContentView(R.layout.activity_main);

        // associate your declared button object with
        // the button in activity_main.xml
        sound1 = (Button)findViewById(R.id.sound1);
        sound2 = (Button)findViewById(R.id.sound2);
        sound3 = (Button)findViewById(R.id.sound3);
        sound4 = (Button)findViewById(R.id.sound4);
        sound5 = (Button)findViewById(R.id.sound5);
        sound6 = (Button)findViewById(R.id.sound6);
        sound7 = (Button)findViewById(R.id.sound7);
        sound8 = (Button)findViewById(R.id.sound8);
        sound9 = (Button)findViewById(R.id.sound9);

        // do something when you click on the buttons
        sound1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // OPTIONAL: show a message when playing a sound
                // showToast("Playing a sound");
                
            }
        });

        sound2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sound3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sound4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sound5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sound6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sound7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sound8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        sound9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }

    public void showToast(String textToShow){
        // This is what we want to display in the toast
        String toastText = textToShow;

        // This is how long we want to show the toast
        int duration = Toast.LENGTH_SHORT;

        // Get the context
        Context context = getApplicationContext();

        // Create the toast
        Toast toast = Toast.makeText(context, toastText, duration);

        // Show the toast
        toast.show();
    }
}
