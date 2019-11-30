package com.kodilla.inheritance.homework;

public class Control {
    public static void main(String[] args) {
        OperatingSystem operatingSystem = new OperatingSystem(1992);
        operatingSystem.turnOn();
        operatingSystem.turnOff();



        Win95 win95 = new Win95(1995);
        win95.turnOn();
        win95.turnOff();
        win95.playGame();
        win95.exitGame();
        win95.displayProductionYear();

        Win98 win98 = new Win98(1998);
        win98.turnOn();
        win98.turnOff();
        win98.playGame();
        win98.exitGame();
        win98.displayProductionYear();
    }
}
