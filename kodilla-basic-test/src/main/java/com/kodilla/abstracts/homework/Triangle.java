package com.kodilla.abstracts.homework;

public class Triangle extends Shape {
    public Triangle(double a, double b, double c, double h) {
        super.sideA = a;
        super.sideB = b;
        super.sideC = c;
        super.heightH = h;
    }

    double countArea() {
        return super.sideA + super.sideB + sideC;
    }

    double countPerimeter() {
        return super.sideA * super.heightH / 2;
    }
}
