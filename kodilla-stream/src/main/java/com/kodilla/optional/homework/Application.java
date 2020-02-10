package com.kodilla.optional.homework;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student("Mark Bark", null));
        students.add(new Student("Lou Boo", new Teacher("Orson Johnson")));
        students.add(new Student("Leticia Kewl", new Teacher("Matt Skatt")));
        students.add(new Student("Steve Yalk", new Teacher("Orson Johnson")));
        students.add(new Student("Hon Quin", null));

        for (Student student : students) {
            System.out.println(" Uczeń: " + student.getName() + ", Nauczyciel: " + student.getTeachersName());

        }
    }
}



