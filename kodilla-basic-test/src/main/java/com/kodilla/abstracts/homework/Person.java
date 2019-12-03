package com.kodilla.abstracts.homework;

public class Person {
    private String firstName;
    private int age;
    private Job job;

    public Person(String firstName, int age, Job job) {
        this.firstName = firstName;
        this.age = age;
        this.job = job;

    }

    public String getFirstName() {
        return firstName;
    }

    public int getAge() {
        return age;
    }

    public Job getJob() {
        return job;
    }

    public static void main(String[] args) {

        Job cook = new Cook(1500, "preparing dishes ");
        System.out.println("Kris" + " " + 21 + "y/o is responsible for" + " " + cook.getResponsibilities() );




        Job plumber = new Plumber(2000,"fixing broken sinks");
        System.out.println("Jose" + " " + 32 + "y/o is responsible for" + " " + plumber.getResponsibilities() );



        Job ceo = new CEO(5000, "managing a company");
        System.out.println("Marcus" + " " + 41 + "y/o is responsible for " + " "+ ceo.getResponsibilities());


    }
}

