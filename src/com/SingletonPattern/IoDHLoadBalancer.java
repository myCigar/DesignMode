package com.SingletonPattern;

/**
 * 静态内部类
 * 结合了饿汉和懒汉模式的优点
 */
public class IoDHLoadBalancer {
    private IoDHLoadBalancer() { }

    private static class HolderClass {
        private final static IoDHLoadBalancer instance = new IoDHLoadBalancer();
    }

    public static IoDHLoadBalancer getInstance() {
        return HolderClass.instance;
    }
}
