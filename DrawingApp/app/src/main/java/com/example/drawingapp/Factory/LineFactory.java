package com.example.drawingapp.Factory;

import android.content.Context;

import com.example.drawingapp.shapes.Line;
import com.example.drawingapp.shapes.Shape;

public class LineFactory extends ShapeFactory {
    @Override
    public Shape createShape(Context context) {
        return new Line(context);
    }
}
