package com.kodilla.abstracts.homework;

public class Square extends Shape {

    public Square(double a) {
        super.sideA = a;
    }

    double countArea() {
        return super.sideA * super.sideA;
    }

    double countPerimeter() {
        return super.sideA * 4;
    }
}

