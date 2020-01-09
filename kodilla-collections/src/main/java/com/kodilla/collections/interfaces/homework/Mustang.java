package com.kodilla.collections.interfaces.homework;

public class Mustang implements Car {
    public int speed = 0;

    public Mustang(){
    }


    @Override
    public int getSpeed() {
        return this.speed;
    }

    @Override
    public void increasedSpeed() {
        this.speed += 30;
    }

    @Override
    public void decreasedSpeed() {
        this.speed -= 5;
    }
}

