package com.example.drawingapp.Storage;
import com.example.drawingapp.editor.ScreenEditor;
import com.example.drawingapp.shapes.Shape;
import java.util.ArrayList;


public class ShapeStorage  implements Storage {

    @Override
    public ArrayList<Shape> getShapes() {
        return Storage.shapes;
    }

    @Override
    public void addShapes(Shape shape) {
      getShapes().add(shape);
    }

    @Override
    public void removeShapes() {

    }





}
