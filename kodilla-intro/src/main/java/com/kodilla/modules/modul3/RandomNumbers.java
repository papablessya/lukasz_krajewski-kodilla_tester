package com.kodilla.modules.modul3;

import java.util.Random;
public class RandomNumbers {
    int min = 31;
    private int max = 0;
    int num;



        public int getCountOfRandomNumber() {

            Random random = new Random();

            int sum = 0;
            while (sum < 5000) {
                int temp = random.nextInt(30) + 1;
                if (max < temp){
                    max = temp;
                }
                if (min > temp){
                    min = temp;
                }
                sum = sum + temp;

            }
            return sum;
        }

    public int getMax() {
        return max;
    }
}






