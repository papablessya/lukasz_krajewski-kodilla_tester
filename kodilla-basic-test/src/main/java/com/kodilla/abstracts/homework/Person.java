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
        Person person1 = new Person("Kris",21, new Cook(2000,"preparing dishes"));
        Person person2 = new Person("jose",32, new Plumber(2200,"fixing broken sinks"));
        Person person3 = new Person("Marcus",41, new CEO(15000,"managing"));

        System.out.println(person1.job.getResponsibilities());
        System.out.println(person2.job.getResponsibilities());
        System.out.println(person3.job.getResponsibilities());
    }
}

