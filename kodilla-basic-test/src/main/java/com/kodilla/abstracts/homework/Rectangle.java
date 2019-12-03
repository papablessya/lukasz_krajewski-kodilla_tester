package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    public Rectangle(double a, double b) {
        super.sideA = a;
        super.sideB = b;
    }

    double countArea() {
        return super.sideA * super.sideB;
    }

    double countPerimeter() {
        return super.sideA * 2 + super.sideB * 2;
    }
}

