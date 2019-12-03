package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args){
        Square a = new Square(2.0);
        Rectangle b = new Rectangle(2.0, 4.0);
        Triangle c = new Triangle(2.0,4.0,3.0,3);

        System.out.println("Math");
        System.out.println();
        System.out.println("Perimeter of the square = " + a.countPerimeter());
        System.out.println("Square area = " + a.countArea());
        System.out.println("Perimeter of the rectangle = " + b.countPerimeter());
        System.out.println("Rectangle area = " + b.countArea());
        System.out.println("Perimeter of the triangle = " + c.countPerimeter());
        System.out.println("Triangle area = " + c.countArea());
    }
}
