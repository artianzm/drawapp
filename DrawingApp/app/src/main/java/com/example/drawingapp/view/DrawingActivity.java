package com.example.drawingapp.view;

import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.View;
import android.widget.ImageButton;
import android.widget.RelativeLayout;

import androidx.appcompat.app.AlertDialog;
import androidx.appcompat.app.AppCompatActivity;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;

import com.example.drawingapp.GraphicElement;
import com.example.drawingapp.R;
import com.example.drawingapp.editor.ScreenEditor;
import com.example.drawingapp.shapes.Circle;
import com.example.drawingapp.shapes.Shape;
import com.example.drawingapp.shapes.ShapeTypes;
import com.example.drawingapp.viewmodel.DrawingActivityVM;

import java.util.ArrayList;

public class DrawingActivity extends AppCompatActivity {

    RelativeLayout relativeLayout;
    private ImageButton drawShapes;
    private ImageButton deleteAll;
    private static DrawingActivityVM drawingActivityVM;


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        ScreenEditor.getScreenDim(displayMetrics.widthPixels,displayMetrics.heightPixels);


        drawingActivityVM = new DrawingActivityVM();
        relativeLayout = findViewById(R.id.graphic_id);



        drawShapes = findViewById(R.id.imageButton2);
        deleteAll = findViewById(R.id.delete_button);

        //enable back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);
        
        drawShapes.setOnClickListener(view -> {
            chooseShapeOnScreenDialog(view);
        });

        deleteAll.setOnClickListener(v -> {
            relativeLayout.removeAllViews();
        });



    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();  // go previous activity
        return super.onSupportNavigateUp();
    }


    public void chooseShapeOnScreenDialog(View view) {
        AlertDialog.Builder alertDialog = new AlertDialog.Builder(this);
        alertDialog.setTitle("Choose a shape");
        //List with the shapes
        String[] shapesText = {"Circle", "Triangle", "Quadrangle", "Line"};
        alertDialog.setItems(shapesText, (dialog, which) -> {
            for (ShapeTypes s : ShapeTypes.values()) {
                if (shapesText[which].equals(s.getName())) {
                    relativeLayout.addView(s.getShape(this));
                    drawingActivityVM.viewShapes(s.getShape(this));
                }
            }
        });
        alertDialog.setNegativeButton("Cancel", null);
        AlertDialog dialog = alertDialog.create();
        dialog.show();
    }

}



