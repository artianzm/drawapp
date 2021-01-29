package com.example.drawingapp.shapes;

import android.content.Context;

import com.example.drawingapp.Factory.CircleFactory;
import com.example.drawingapp.Factory.LineFactory;
import com.example.drawingapp.Factory.QuadrangleFactory;
import com.example.drawingapp.Factory.ShapeFactory;
import com.example.drawingapp.Factory.TriangleFactory;

public enum ShapeTypes {

    CIRCLE {
        @Override
        public String getName() {
            return "Circle";
        }

        @Override
        public Shape getShape(Context ctx) {
            return new Circle(ctx);
        }

        @Override
        public ShapeFactory getShapeFactory() {
            return new CircleFactory();
        }
    },
    LINE {
        @Override
        public String getName() {
            return "Line";
        }

        @Override
        public Shape getShape(Context ctx) {
            return new Line(ctx);
        }

        @Override
        public ShapeFactory getShapeFactory() {
            return new LineFactory();
        }

    },
    TRIANGLE {
        @Override
        public String getName() {
            return "Triangle";
        }

        @Override
        public Shape getShape(Context ctx) {
            return new Triangle(ctx);
        }

        @Override
        public ShapeFactory getShapeFactory() {
            return new TriangleFactory();
        }

    },
    QUADRANGLE {
        @Override
        public String getName() {
            return "Quadrangle";
        }

        @Override
        public Shape getShape(Context ctx) {
            return new Quadrangle(ctx);
        }

        @Override
        public ShapeFactory getShapeFactory() {
            return new QuadrangleFactory();
        }

    };

    public abstract String getName();
    public abstract Shape getShape(Context ctx);

    public abstract ShapeFactory getShapeFactory();
}
