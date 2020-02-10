package com.kodilla.optional.homework;

import java.util.Objects;
import java.util.Optional;

public class Student {
    String name;
    Optional<Teacher> teacher;

    public Student(String name, Teacher teacher) {
        this.name = name;
        this.teacher = Optional.ofNullable(teacher);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", teacher=" + teacher +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) &&
                Objects.equals(teacher, student.teacher);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, teacher);
    }

    public String getName() {
        return name;
    }

    public Optional<Teacher> getTeacher() {
        return teacher;
    }

    public String getTeachersName() {
        if (teacher.isPresent()) {
            return teacher.get().getName();
        } else {
            return "<undifined>";
        }
    }
}
