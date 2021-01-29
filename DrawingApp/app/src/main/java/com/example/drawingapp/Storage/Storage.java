package com.example.drawingapp.Storage;

import com.example.drawingapp.shapes.Shape;

import java.util.ArrayList;

public interface Storage {

    void addShapes(Shape shape);
    void removeShapes();
}
