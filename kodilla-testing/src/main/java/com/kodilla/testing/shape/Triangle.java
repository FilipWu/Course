package com.kodilla.testing.shape;

public class Triangle implements Shape {
    private double height;
    private double base;

    public Triangle(double height, double base) {
        this.height = height;
        this.base = base;
    }
    @Override
    public String getName() {
        return "Triangle";
    }
    @Override
    public double getField() {
        return height * base;
    }

}
