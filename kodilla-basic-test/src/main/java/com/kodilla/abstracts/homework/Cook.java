package com.kodilla.abstracts.homework;

public class Cook extends Job {
    public Cook(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    public Cook(int salary) {
        super(1500);
    }


    @Override
    public void displayResponsibilities() {
        return;

    }
}
