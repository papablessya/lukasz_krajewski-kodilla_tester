package com.kodilla.collections.interfaces;

public class Triangle implements Shape {
    public double width;
    public double height;
    public double hypotenuse;

    public Triangle(double width, double height, double hypotenuse) {
        this.width = width;
        this.height = height;
        this.hypotenuse = hypotenuse;
    }
    public double getArea() {
        return width + height + hypotenuse;
    }

    public double getPerimeter() {
        return width * height / 2;
    }
}
