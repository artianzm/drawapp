package com.example.drawingapp.Storage;

import com.example.drawingapp.GraphicElement;
import com.example.drawingapp.shapes.Shape;

import java.util.List;

public interface Screen {
    void addShapes(String shape);
    void viewElem(List<Shape> shapeList);
    void removeElem(GraphicElement elem);
}
