package com.example.drawingapp.Factory;

import android.content.Context;

import com.example.drawingapp.shapes.Shape;

public abstract class ShapeFactory {

    public ShapeFactory(){

    }

    public abstract Shape createShape(Context context);
}
