package com.example.drawingapp.shapes;

import android.content.Context;
import android.graphics.Canvas;

import com.example.drawingapp.editor.ScreenEditor;

public class Circle extends Shape {

    private int circleX;
    private int circleY;
    private int radius;

    public Circle(Context context) {
        super(context);
        initShape();
    }

    @Override
    protected void initShape() {
        setCircleX(ScreenEditor.getWidth() / 2);
        setCircleY(ScreenEditor.getHeight() / 2);
        setRadius(200);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawCircle(getCircleX(), getCircleY(), getRadius(), getPaint());
        invalidate();
    }


    public int getCircleX() {
        return circleX;
    }

    public void setCircleX(int circleX) {
        this.circleX = circleX;
    }

    public int getCircleY() {
        return circleY;
    }

    public void setCircleY(int circleY) {
        this.circleY = circleY;
    }

    public int getRadius() {
        return radius;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
}
