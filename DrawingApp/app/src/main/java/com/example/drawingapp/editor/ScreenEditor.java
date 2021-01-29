package com.example.drawingapp.editor;

import android.widget.RelativeLayout;

import com.example.drawingapp.Factory.ShapeFactory;
import com.example.drawingapp.GraphicElement;
import com.example.drawingapp.Storage.ShapeStorage;
import com.example.drawingapp.shapes.Shape;
import com.example.drawingapp.shapes.ShapeTypes;
import com.example.drawingapp.view.DrawingActivity;

import java.lang.ref.WeakReference;
import java.util.List;

public class ScreenEditor implements Screen {

    private static ScreenEditor instance = null;
    private WeakReference<RelativeLayout> viewReference;
    private final ShapeStorage shapeStorage;
    private int width;
    private int height;


    private ScreenEditor() {
        this.shapeStorage = new ShapeStorage();
    }

    public static ScreenEditor getInstance() {
        if (instance == null) {
            instance = new ScreenEditor();
        }
        return instance;
    }


    public static void getScreenDim(int width, int height) {
        getInstance().width = width;
        getInstance().height = height;
    }

    public static int getWidth() {
        return getInstance().width;
    }
    public static int getHeight() {
        return getInstance().height;
    }


    public static void setDrawingLayout(RelativeLayout relativeLayout) {
        getInstance().viewReference = new WeakReference<>(relativeLayout);
    }

    public ShapeStorage getShapeStorage() {
        return shapeStorage;
    }


    @Override
    public void addShapes(String shape) {
        ShapeFactory shapeFactory;
        for (ShapeTypes sh : ShapeTypes.values()) {
            if (shape.equals(sh.getName())) {
                shapeFactory = sh.getShapeFactory();
                shapeStorage.addShapes(shapeFactory.createShape(DrawingActivity.getDrawContext().get()));
            }
        }
    }

    @Override
    public void viewElem(List<Shape> shapeList) {
        for (GraphicElement element : shapeList) {
            getInstance().viewReference.get().removeView(element);
            getInstance().viewReference.get().addView(element);
        }
    }

    @Override
    public void removeElem(GraphicElement elem) {
        getInstance().viewReference.get().removeView(elem);
    }
}
