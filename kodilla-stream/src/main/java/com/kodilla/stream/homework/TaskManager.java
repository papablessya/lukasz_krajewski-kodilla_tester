package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<String> tasks = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().equals(LocalDate.of(2020, 2, 10)))
                        .map(TaskManager::getTask)
                        .collect(Collectors.toList());
        System.out.println(tasks);


    }

    public static String getTask(Task task) {
        return task.getName();
    }
}
