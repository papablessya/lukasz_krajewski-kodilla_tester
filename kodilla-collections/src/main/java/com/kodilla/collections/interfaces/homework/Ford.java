package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    public int speed;

    public Ford(int speed) {
        this.speed = speed;

    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int increasedSpeed() {
        return this.speed += 25;
    }

    @Override
    public int decreasedSpeed() {
        return this.speed -= 5;
    }
}
