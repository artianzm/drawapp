package com.example.drawingapp.shapes;

import android.content.Context;
import android.graphics.Color;

public abstract class Decorator extends Shape {


    public Decorator(Context context) {
        super(context);
    }


    public enum Colors {

        RED {
            @Override
            public String getColorName() {
                return "Red";
            }

            @Override
            public int getColor() {
                return Color.RED;
            }
        },
        GREEN {
            @Override
            public String getColorName() {
                return "Green";
            }

            @Override
            public int getColor() {
                return Color.GREEN;
            }
        },
        BLUE {
            @Override
            public String getColorName() {
                return "Blue";
            }

            @Override
            public int getColor() {
                return Color.BLUE;
            }
        },
        BLACK {
            @Override
            public String getColorName() {
                return "Black";
            }

            @Override
            public int getColor() {
                return Color.BLACK;
            }

        };

        public abstract String getColorName();
        public abstract int getColor();

    }

}
