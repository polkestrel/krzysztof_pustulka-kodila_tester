package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class TaskRepository {
    public static List<Task> getTasks() {
        List<Task> tasks = new ArrayList<>();
        tasks.add(new Task("Task 1", LocalDate.of(2020,10,12), LocalDate.of(2021,12,30)));
        tasks.add(new Task("Task 2", LocalDate.of(2019,9,11), LocalDate.of(2019,10,9)));
        tasks.add(new Task("Task 3", LocalDate.of(2018,8,10), LocalDate.of(2021,12,8)));
        tasks.add(new Task("Task 4", LocalDate.of(2017,7,9), LocalDate.of(2017,8,7)));
        tasks.add(new Task("Task 5", LocalDate.of(2016,6,8), LocalDate.of(2016,7,6)));
        return tasks;
    }
}
