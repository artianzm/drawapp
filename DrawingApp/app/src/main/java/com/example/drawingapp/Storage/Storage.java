package com.example.drawingapp.Storage;

import com.example.drawingapp.shapes.Shape;

import java.util.ArrayList;

public interface Storage {

    ArrayList<Shape> shapes = new ArrayList<>();
    ArrayList<Shape> getShapes();
    void addShapes(Shape shape);
    void removeShapes();
}
