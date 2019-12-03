package com.kodilla.abstracts.homework;

public class CEO extends Job {
    {
        super.getSalary();
        super.getResponsibilities();
    }

    public CEO(int salary, String responsibilities) {
        super(salary, responsibilities);
    }

    public CEO(int salary) {
        super(5000);
    }


    @Override
    public void displayResponsibilities() {
        return;

    }
}
