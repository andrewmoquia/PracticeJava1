package com.test.services;

import java.util.LinkedList;
import java.util.Queue;

public class TaskScheduler {
    // Using LinkedList as a Queue to manage tasks
    static Queue<Task> taskQueue = new LinkedList<>();

    // Task class representing individual tasks
    public static class Task {
        private final String taskName;
        private final int taskId;

        public Task(String taskName, int taskId) {
            this.taskName = taskName;
            this.taskId = taskId;
        }

        @Override
        public String toString() {
            return "Task ID: " + taskId + ", Task Name: " + taskName;
        }
    }

    public void AddTask(String taskName, int taskId) {
        taskQueue.offer(new Task(taskName, taskId));
    }

    public void CheckProcessingTask() {
        while (!taskQueue.isEmpty()) {
            Task currentTask = taskQueue.poll(); // Retrieves and removes the head of the queue
            System.out.println("Processing " + currentTask);
        }

        System.out.println("All tasks processed.");
    }
}
