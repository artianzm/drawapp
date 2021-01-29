package com.example.drawingapp.Factory;

import android.content.Context;

import com.example.drawingapp.shapes.Circle;
import com.example.drawingapp.shapes.Shape;

public class CircleFactory  extends ShapeFactory{


    @Override
    public Shape createShape(Context context) {
        return new Circle(context);
    }
}
