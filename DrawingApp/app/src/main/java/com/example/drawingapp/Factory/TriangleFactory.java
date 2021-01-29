package com.example.drawingapp.Factory;

import android.content.Context;

import com.example.drawingapp.shapes.Shape;
import com.example.drawingapp.shapes.Triangle;

public class TriangleFactory extends ShapeFactory{

    @Override
    public Shape createShape(Context context) {
        return new Triangle(context);
    }
}
