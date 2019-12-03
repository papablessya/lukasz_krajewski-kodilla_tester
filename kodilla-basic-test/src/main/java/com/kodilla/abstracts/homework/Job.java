package com.kodilla.abstracts.homework;

public abstract class Job {

    private int salary;
    private String responsibilities;

    public Job(int salary, String responsibilities) {
        this.salary = salary;
        this.responsibilities = responsibilities;
    }

    public Job(int salary) {
    }

    public abstract void displayResponsibilities();

    public String getResponsibilities(){
        return responsibilities;
    }

    public int getSalary(){
        return salary;
    }

}

