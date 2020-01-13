package com.kodilla.collections.arrays.homework;

import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Ford;
import com.kodilla.collections.interfaces.homework.Mustang;
import com.kodilla.collections.interfaces.homework.Opel;

import java.util.Random;

public class CarApplication {
    public static void main(String[] args) {
        Car[] cars = new Car[15];
        for (int n = 0; n < cars.length; n++)
            cars[n] = drawCar();
        for (Car car : cars)
            CarUtils.describeCar(car);

    }


    private static Car drawCar(){
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int s = random.nextInt(50) ;
        if (drawnCarKind == 0)
            return new Ford(100 + s);
        else if (drawnCarKind == 1)
            return new Mustang(100 + s);
        else
            return new Opel(100 + s);
    }
}

