package com.kodilla.inheritance.homework;

public class Win95 extends OperatingSystem {

    public void playGame() {
        System.out.println("Playing Doom");
    }
    public void exitGame() {
        System.out.println("Stop playing Doom");
    }

    @Override
    public void turnOn() {
        System.out.println("Hello There!");
    }

    public Win95(int productionYear) {
        super(productionYear);
        System.out.println("Win 95 con");
    }
}
