package com.kodilla.collections.adv.maps.homework;

import java.util.ArrayList;
import java.util.List;

public class School {
        private List<Integer> classes = new ArrayList<>();

        public School (int ... school){
            for(int schools : school)
                this.classes.add(schools);
        }

    @Override
    public String toString() {
        return "School{" +
                "school=" + classes +
                '}';
    }
    public int getSum(){
            int sum = 0;
            for(int cl : classes){
                sum += cl;
            }
            return sum;

    }

}
