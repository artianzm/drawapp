package com.example.drawingapp;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.view.MotionEvent;

public class FreeDraw extends GraphicElement {

    private Path path;

    public FreeDraw(Context context) {
        super(context);
        initializeFreeDraw();
    }

    public void initializeFreeDraw() {
        path = new Path();
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path, getPaint());
    }

    @Override
    public void changeColor(int color) {
        getPaint().setColor(color);
    }

    @Override
    public boolean onTouchEvent(MotionEvent event) {
        boolean value = super.onTouchEvent(event);
        float x = event.getX();
        float y = event.getY();
        switch (event.getAction()) {
            case MotionEvent.ACTION_DOWN: {
                path.moveTo(x, y);
                invalidate();
                return true;
            }
            case MotionEvent.ACTION_MOVE: {
                path.lineTo(x, y);
                invalidate();
                return true;
            }

            case MotionEvent.ACTION_UP: {
                path.lineTo(x, y);
                invalidate();
                return true;
            }
        }
        return value;
    }
}
