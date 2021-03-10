package com.SingletonPattern;

public class TaskManager {

    private static TaskManager tm = null;

    /**
     * 构造函数设置为private，禁止类的外部使用new来实例化
     */
    private TaskManager() {

    }

    /**
     * 显示进程
     */
    public void displayProcesses() {
        System.out.println("Processes TIM");
        System.out.println("Processes Stream");
        System.out.println("Processes Google Chrome");
    }

    /**
     * 显示服务
     */
    public void displayServices() {
        System.out.println("Services Windows updated");
        System.out.println("Services Controller");
        System.out.println("Services MySQL Service");
    }

    /**
     * 获取实例
     */
    public static TaskManager getInstance() {
        if (tm == null) {
            tm = new TaskManager();
        }
        return tm;
    }
}
