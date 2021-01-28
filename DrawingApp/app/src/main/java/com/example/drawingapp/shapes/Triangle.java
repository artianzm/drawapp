package com.example.drawingapp.shapes;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Path;
import android.graphics.Point;

public class Triangle extends Shape {

    private Point a;
    private Point b;
    private Point c;
    private Path path;


    public Triangle(Context context) {
        super(context);
        initShape();
        initializePath();
    }

    @Override
    protected void initShape() {
        a = new Point(600, 400);
        b = new Point(400, 800);
        c = new Point(800, 800);
    }


    private void initializePath() {
        path = new Path();
        path.moveTo(a.x, a.y);
        path.lineTo(b.x, b.y);
        path.lineTo(c.x, c.y);
        path.lineTo(a.x, a.y);
        path.close();
    }

    public double area(Point a, Point b, Point c) {
        return Math.abs((a.x * (b.y - c.y) + b.x * (c.y - a.y) +
                c.x * (a.y - b.y)) / 2.0);
    }

    public boolean isInside(Point a, Point b, Point c, double x, double y) {
        Point p = new Point((int) x, (int) y);
        /* Calculate area of triangle ABC */
        double A = area(a, b, c);

        /* Calculate area of triangle PBC */
        double A1 = area(p, b, c);

        /* Calculate area of triangle PAC */
        double A2 = area(a, p, c);

        /* Calculate area of triangle PAB */
        double A3 = area(a, b, p);

        return (A == A1 + A2 + A3);
    }

    @Override
    protected void onDraw(Canvas canvas) {
        canvas.drawPath(path, getPaint());
    }

}
