package com.patterns.kodillapatterns2.observer.homework;


public class Mentor implements QueueObserver {
    private final int idMentor;
    private int count;

    public Mentor(int idMentor) {
        this.idMentor = idMentor;
    }

    public int getIdMentor() {
        return idMentor;
    }

    @Override
    public void update(TaskQueue taskQuee) {
        System.out.println("Recived new task: " + taskQuee.getTasksQuee().peekLast().getTaskContent() + " from: " + taskQuee.getStudent());
        count++;
    }

    public int getUpdateCount() {
        return count;
    }
}