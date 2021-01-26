package com.example.drawingapp;

import android.os.Bundle;
import android.os.PersistableBundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AppCompatActivity;

import com.example.drawingapp.editor.ScreenEditor;

import java.util.Objects;

public class DrawingActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    private ImageButton drawShapes;
    private GraphicElement graphicElement;

    private static void onClick(View v) {

    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        ScreenEditor.getScreenDim(displayMetrics.widthPixels,displayMetrics.heightPixels);


        relativeLayout = findViewById(R.id.graphic_id);
        drawShapes = findViewById(R.id.imageButton2);

        //enable back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        
        drawShapes.setOnClickListener(v -> {
            graphicElement = new Circle(this);
            relativeLayout.addView(graphicElement);
        });

    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();  // go previous activity
        return super.onSupportNavigateUp();
    }

}



