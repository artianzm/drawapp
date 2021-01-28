package com.example.drawingapp.shapes;

import android.content.Context;

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

    };

    public abstract String getName();
    public abstract Shape getShape(Context ctx);

}
