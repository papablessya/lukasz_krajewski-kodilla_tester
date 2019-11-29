package com.kodilla.modules.modul3;

public class AppRunner {
    public static void main(String[] args){
        RandomNumbers random = new RandomNumbers();
        int result = random.getCountOfRandomNumber();
        System.out.println(result);
        int max = random.getMax();
        System.out.println(max);
        int min = random.min;
        System.out.println(min);

    }
}
