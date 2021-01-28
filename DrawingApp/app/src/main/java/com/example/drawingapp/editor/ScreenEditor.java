package com.example.drawingapp.editor;

import android.widget.RelativeLayout;

import com.example.drawingapp.GraphicElement;
import com.example.drawingapp.shapes.Shape;

import java.lang.ref.WeakReference;
import java.util.List;

public class ScreenEditor {

    private static ScreenEditor instance = null;
    private int width;
    private int height;


    private ScreenEditor() {
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






}
