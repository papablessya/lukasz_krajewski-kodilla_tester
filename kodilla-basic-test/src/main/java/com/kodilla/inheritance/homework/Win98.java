package com.kodilla.inheritance.homework;

public class Win98 extends OperatingSystem {

    public void playGame() {
        System.out.println("Playing Fifa98");
    }
    public void exitGame() {
        System.out.println("Stop playing Fifa98");
    }

    @Override
    public void turnOn() {
        System.out.println("Nice to see you again!");
    }

    public Win98(int productionYear) {
        super(productionYear);
        System.out.println("Win98 con");
    }
}
