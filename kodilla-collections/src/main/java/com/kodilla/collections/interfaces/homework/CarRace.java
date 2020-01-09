package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford(100);
        doRace(ford);

        Opel opel = new Opel(80);
        doRace(opel);

        Mustang mustang = new Mustang(150);
        doRace(mustang);
        }
     public static void doRace(Car car){
        car.increasedSpeed();
        car.decreasedSpeed();
         System.out.println(car.getSpeed());
    }
}
