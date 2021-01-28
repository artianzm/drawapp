package com.example.drawingapp.shapes;

import android.content.Context;
import android.util.AttributeSet;

import androidx.annotation.Nullable;

import com.example.drawingapp.GraphicElement;

public abstract class Shape extends GraphicElement {

    public Shape(Context context) {
        super(context);
    }

    public Shape(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
    }


    protected abstract void initShape();


}
