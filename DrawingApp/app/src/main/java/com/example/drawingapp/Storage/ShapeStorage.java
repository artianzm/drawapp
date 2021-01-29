package com.example.drawingapp.Storage;
import com.example.drawingapp.editor.ScreenEditor;
import com.example.drawingapp.shapes.Shape;
import java.util.ArrayList;
import java.util.Iterator;


public class ShapeStorage  implements Storage {

    private final ArrayList<Shape> addedShapes = new ArrayList<>();

    public ShapeStorage() {

    }

    public ArrayList<Shape> getShapes() {
        return addedShapes;
    }

    @Override
    public void addShapes(Shape shape){
        if (!getShapes().contains(shape)) {
            getShapes().add(shape);
            System.out.println("Shape just added");//this line is for debugging to see if the shape was added.
        }
        ScreenEditor.getInstance().viewElem(getShapes());
    }
    @Override
    public void removeShapes()  {
        for (Iterator<Shape> it = addedShapes.iterator(); it.hasNext(); ) {
            Shape sh = it.next();
            if (sh.isSelected()) {
                it.remove();
                ScreenEditor.getInstance().removeElem(sh);
            }
        }
    }

}
