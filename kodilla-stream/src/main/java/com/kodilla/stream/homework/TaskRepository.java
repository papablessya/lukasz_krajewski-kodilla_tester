package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks(){
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Project X", LocalDate.of(2020,11,12),LocalDate.of(2021,1,13)));
        tasks.add(new Task("Project Y", LocalDate.of(2019,9,27),LocalDate.of(2020,1,11)));
        tasks.add(new Task("Project Z", LocalDate.of(2020,1,11),LocalDate.of(2020,3,19)));

        return tasks;
    }
}
