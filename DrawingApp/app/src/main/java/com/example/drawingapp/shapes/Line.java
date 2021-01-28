package com.example.drawingapp.shapes;

import android.content.Context;
import android.graphics.Canvas;

import com.example.drawingapp.editor.ScreenEditor;

public class Line extends Shape {

    private int startPointX;
    private int startPointY;
    private int endPointX;
    private int endPointY;

    public Line(Context context) {
        super(context);
        initShape();
    }

    @Override
    protected void initShape() {
        setStartPointX(ScreenEditor.getWidth() / 8 + 700);
        setStartPointY(ScreenEditor.getHeight() / 5);
        setEndPointX(ScreenEditor.getWidth() / 8 );
        setEndPointY(ScreenEditor.getHeight() / 5);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawLine(getStartPointX(), getStartPointY(), getEndPointX(), getEndPointY(), getPaint());
    }


    public int getStartPointX() {
        return startPointX;
    }

    public void setStartPointX(int startPointX) {
        this.startPointX = startPointX;
    }

    public int getStartPointY() {
        return startPointY;
    }

    public void setStartPointY(int startPointY) {
        this.startPointY = startPointY;
    }

    public int getEndPointX() {
        return endPointX;
    }

    public void setEndPointX(int endPointX) {
        this.endPointX = endPointX;
    }

    public int getEndPointY() {
        return endPointY;
    }

    public void setEndPointY(int endPointY) {
        this.endPointY = endPointY;
    }
}
