package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> tasks = TaskRepository.getTasks()
                .stream()
                .filter(u -> u.getDeadline().isAfter(LocalDate.now()))
                        .map(TaskManager::getTask)
                        .collect(Collectors.toList());
        System.out.println(tasks);


    }

    public static LocalDate getTask(Task task) {
        return task.getDeadline();
    }
}
