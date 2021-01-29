package com.example.drawingapp;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Path;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;

import androidx.annotation.Nullable;

public class GraphicElement extends View {


    private Paint paint;
    private Path path;
    private Bitmap canvasBitmap;

    public GraphicElement(Context context) {
        super(context);
        initialize();
    }

    public GraphicElement(Context context, @Nullable AttributeSet attrs) {
        super(context, attrs);
        initialize();
    }


    public void initialize() {
        path = new Path();
        paint = new Paint();
        paint.setColor(Color.BLACK);
        paint.setStyle(Paint.Style.STROKE);
        paint.setAntiAlias(true);
        paint.setStrokeWidth(2f);
    }



    @Override
    protected void onSizeChanged(int w, int h, int oldw, int oldh) {
        canvasBitmap = Bitmap.createBitmap(w, h, Bitmap.Config.ARGB_8888);

    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawBitmap(canvasBitmap, 0, 0, paint);
        canvas.drawPath(path, paint);
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


    public Paint getPaint() {
        return paint;
    }
}
