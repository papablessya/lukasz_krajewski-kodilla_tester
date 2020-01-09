package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    public int speed;

    public Opel(int speed){
        this.speed = speed;
    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int increasedSpeed() {
        return this.speed += 20;
    }

    @Override
    public int decreasedSpeed() {
        return this.speed -= 10;
    }
}

