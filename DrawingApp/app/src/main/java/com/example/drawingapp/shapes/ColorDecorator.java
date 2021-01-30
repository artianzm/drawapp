package com.example.drawingapp.shapes;

import android.content.Context;

import com.example.drawingapp.GraphicElement;

import java.util.ArrayList;
import java.util.List;

public class ColorDecorator extends Decorator {

    final ArrayList<Shape> shapes;

    public ColorDecorator(Context context, int color,ArrayList<Shape> shapes) {
        super(context);
        this.shapes = shapes;
        changeColor(color);
    }

    @Override
    protected void initShape() {

    }

    @Override
    public void changeColor(int color) {
        for(Shape s : shapes) {
            s.changeColor(color);
            s.invalidate();
        }
    }
}
