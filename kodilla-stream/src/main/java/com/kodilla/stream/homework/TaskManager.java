package com.kodilla.stream.homework;

import java.time.LocalDate;
import java.util.List;
import java.util.stream.Collectors;

public class TaskManager {
    public static void main(String[] args) {
        List<LocalDate> unfinishedTasks = TaskRepository.getTasks()
                .stream()
                .filter(task -> task.getDeadline().isAfter(LocalDate.now()))
                .map(t -> t.getDeadline())
                .collect(Collectors.toList());
        System.out.println("Number of all unfinished tasks with non-expired dates is equal to: " + unfinishedTasks.size() + ".");
        System.out.println("Above mentioned tasks have deadlines set to: " + unfinishedTasks + ".");
    }
}
