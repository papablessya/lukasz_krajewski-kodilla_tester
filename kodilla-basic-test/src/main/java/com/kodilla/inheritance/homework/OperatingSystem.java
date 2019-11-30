package com.kodilla.inheritance.homework;

public class OperatingSystem {
   private int productionYear;
   private int programs;


   public OperatingSystem(int productionYear) {
        this.productionYear = productionYear;
    }
    public void turnOn() {
        System.out.println("Welcome!");
    }
    public void turnOff() {
        System.out.println("Goodbye!");
    }

    public void displayProductionYear() {
        System.out.println("This system was produce in " + productionYear);
    }
}
