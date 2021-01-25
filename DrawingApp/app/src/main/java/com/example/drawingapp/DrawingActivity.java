package com.example.drawingapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.DisplayMetrics;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import java.util.Objects;

public class DrawingActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);

        relativeLayout = findViewById(R.id.graphic_id);

        //enable back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);

    }



    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();  // go previous activity
        return super.onSupportNavigateUp();
    }

}



