package com.kodilla.collections.interfaces.homework;

public class Mustang implements Car {
    public int speed;

    public Mustang(int speed){
        this.speed = speed;
    }


    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public int increasedSpeed() {
        return this.speed += 30;
    }

    @Override
    public int decreasedSpeed() {
        return this.speed -= 5;
    }
}

