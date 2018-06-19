package com.patterns.kodillapatterns2.observer.homework;


import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.List;

public class TaskQueue implements QueueObservable {
    private final int idQueue;
    private final ArrayDeque<Task> tasksQueue;
    private final List<QueueObserver> queueObservers;
    private final String student;


    public TaskQueue(int idQuee, String studentName) {
        this.idQueue = idQuee;
        this.tasksQueue = new ArrayDeque<>();
        this.queueObservers = new ArrayList<>();
        this.student = studentName;
    }

    public void addTaskToQueue(Task task) {
        tasksQueue.offer(task);
        notifyObserver();
    }

    public int getIdQueue() {
        return idQueue;
    }

    public ArrayDeque<Task> getTasksQuee() {
        return tasksQueue;
    }

    public String getStudent() {
        return student;
    }

    @Override
    public void registerQueueObserver(QueueObserver queueObserver) {
        queueObservers.add(queueObserver);
    }

    @Override
    public void notifyObserver() {
        queueObservers.stream().forEach(n -> n.update(this));
    }
}