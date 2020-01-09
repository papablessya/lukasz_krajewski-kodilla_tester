package com.kodilla.collections.interfaces.homework;

public class Ford implements Car {
    public int speed = 0;

    public Ford() {

    }

    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increasedSpeed() {
        this.speed += 25;
    }

    @Override
    public void decreasedSpeed() {
        this.speed -= 5;
    }
}
