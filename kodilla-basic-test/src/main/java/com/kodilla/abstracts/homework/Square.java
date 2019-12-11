package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(double a) {
        super.sideA = a;
    }

    public double countArea() {
        return super.sideA * super.sideA;
    }

    public double countPerimeter() {
        return super.sideA * 4;
    }
}

