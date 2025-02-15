package com.kodilla.testing.shape;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class ShapeCollector {
private List<Shape> shapes = new ArrayList<>();

    public void addFigure(Shape shape) {
        shapes.add(shape);
    }
    public void removeFigure(Shape shape){
        shapes.remove(shape);
    }
    public Shape getFigure(int index) {
        if (index >= 0 && index < shapes.size()) {
            return shapes.get(index);
        }
        return null;
    }
    public String showFigures() {
        StringBuilder sb = new StringBuilder();
        for (Shape shape : shapes) {
            sb.append(shape.getName()).append(" ");
        }
        return sb.toString().trim();
    }

    public List<Shape> getShapes() {
        return shapes;
    }
    public int getSize(){
        return shapes.size();
    }


}
