package com.kodilla.collections.interfaces.homework;

public class Opel implements Car {
    public int speed = 0;

    public Opel(){

    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increasedSpeed() {
        this.speed += 20;
    }

    @Override
    public void decreasedSpeed() {
        this.speed -= 10;
    }
}

