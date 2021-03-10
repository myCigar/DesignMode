package com.SingletonPattern;

public class TaskManagerTest {
    public static void main(String[] args) {
        TaskManager tm = TaskManager.getInstance();
        tm.displayProcesses();
        tm.displayServices();
    }
}
