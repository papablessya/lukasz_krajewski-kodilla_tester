package com.kodilla.collections.interfaces.homework;

public class CarRace {
    public static void main(String[] args) {
        Ford ford = new Ford();
        doRace(ford);

        Opel opel = new Opel();
        doRace(opel);

        Mustang mustang = new Mustang();
        doRace(mustang);
        }
     public static void doRace(Car car){
         car.increasedSpeed();
         car.increasedSpeed();
         car.increasedSpeed();
         car.decreasedSpeed();
         car.decreasedSpeed();
         System.out.println(car.getSpeed());
    }
}
