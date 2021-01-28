package com.example.drawingapp.shapes;

import android.content.Context;
import android.graphics.Canvas;

public class Quadrangle extends Shape {


    private int leftQ;
    private int topQ;
    private int rightQ;
    private int bottomQ;


    public Quadrangle(Context context) {
        super(context);
        initShape();
    }

    @Override
    protected void initShape() {
        setLeftQ(200);
        setTopQ(200);
        setBottomQ(600);
        setRightQ(600);
    }


    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawRect(getLeftQ(), getTopQ(), getRightQ(), getBottomQ(), getPaint());
        invalidate();
    }


    public int getLeftQ() {
        return leftQ;
    }

    public void setLeftQ(int leftQ) {
        this.leftQ = leftQ;
    }

    public int getTopQ() {
        return topQ;
    }

    public void setTopQ(int topQ) {
        this.topQ = topQ;
    }

    public int getRightQ() {
        return rightQ;
    }

    public void setRightQ(int rightQ) {
        this.rightQ = rightQ;
    }

    public int getBottomQ() {
        return bottomQ;
    }

    public void setBottomQ(int bottomQ) {
        this.bottomQ = bottomQ;
    }
}
