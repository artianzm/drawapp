package com.example.drawingapp.Factory;

import android.content.Context;

import com.example.drawingapp.shapes.Quadrangle;
import com.example.drawingapp.shapes.Shape;

public class QuadrangleFactory extends ShapeFactory {
    @Override
    public Shape createShape(Context context) {
        return new Quadrangle(context);
    }
}
