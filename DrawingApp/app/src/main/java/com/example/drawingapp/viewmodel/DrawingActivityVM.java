package com.example.drawingapp.viewmodel;

import androidx.lifecycle.ViewModel;

import com.example.drawingapp.Storage.ShapeStorage;
import com.example.drawingapp.editor.ScreenEditor;
import com.example.drawingapp.shapes.Shape;
import com.example.drawingapp.view.DrawingActivity;

public class DrawingActivityVM extends ViewModel {

    public DrawingActivityVM() {
        super();

    }


    public void selectShape(String shape) {
        ScreenEditor.getInstance().addShapes(shape);
    }

    public void clearScreen()  {
        ScreenEditor.getInstance().getShapeStorage().getShapes().clear();
        ScreenEditor.getInstance().getShapeStorage().removeShapes();

    }

}
