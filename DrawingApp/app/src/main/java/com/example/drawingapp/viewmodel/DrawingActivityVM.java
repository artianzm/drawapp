package com.example.drawingapp.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.drawingapp.Storage.ShapeStorage;
import com.example.drawingapp.shapes.Shape;
import com.example.drawingapp.view.DrawingActivity;

public class DrawingActivityVM extends ViewModel {

    private ShapeStorage shapeStorage;

    public DrawingActivityVM() {
        super();
        shapeStorage = new ShapeStorage();
    }


    public void viewShapes(Shape shape) {
        shapeStorage.addShapes(shape);
    }

    public void removeShape() {

    }


}
