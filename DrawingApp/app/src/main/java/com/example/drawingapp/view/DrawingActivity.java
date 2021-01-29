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

import java.lang.ref.WeakReference;
import java.util.ArrayList;

public class DrawingActivity extends AppCompatActivity {

    private static RelativeLayout relativeLayout;
    private ImageButton drawShapes;
    private ImageButton deleteAll;
    private ImageButton freeDraw;
    private static DrawingActivityVM drawingActivityVM;
    private static WeakReference<DrawingActivity> drawContext;
    private GraphicElement graphicElement;


    public static WeakReference<DrawingActivity> getDrawContext() {
        return drawContext;
    }

    private static void onClick(View v) {
        relativeLayout.removeAllViews();
        drawingActivityVM.clearScreen();
    }


    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_drawing);


        drawContext = new WeakReference<>(this);


        DisplayMetrics displayMetrics = new DisplayMetrics();
        getWindowManager().getDefaultDisplay().getMetrics(displayMetrics);
        ScreenEditor.getScreenDim(displayMetrics.widthPixels,displayMetrics.heightPixels);

        relativeLayout = findViewById(R.id.graphic_id);
        ScreenEditor.setDrawingLayout(relativeLayout);


        drawShapes = findViewById(R.id.imageButton2);
        deleteAll = findViewById(R.id.delete_button);
        freeDraw = findViewById(R.id.freeDraw);

        //enable back button
        getSupportActionBar().setDisplayHomeAsUpEnabled(true);
        getSupportActionBar().setDisplayShowHomeEnabled(true);



        drawingActivityVM = new DrawingActivityVM();
        
        drawShapes.setOnClickListener(view -> {
            chooseShapeOnScreenDialog(view);
        });

        deleteAll.setOnClickListener(DrawingActivity::onClick);
        freeDraw.setOnClickListener(this::onClick2);

    }


    @Override
    public boolean onSupportNavigateUp() {
        onBackPressed();  // go previous activity
        relativeLayout.removeAllViews();
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
                    drawingActivityVM.selectShape(s.getName());
                }
            }
        });
        alertDialog.setNegativeButton("Cancel", null);
        AlertDialog dialog = alertDialog.create();
        dialog.show();
    }

    private void onClick2(View v) {
        graphicElement = new GraphicElement(this);
        relativeLayout.removeView(graphicElement);
        relativeLayout.addView(graphicElement);
    }
}



