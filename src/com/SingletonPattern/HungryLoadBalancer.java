package com.SingletonPattern;

/**
 * 饿汉式单例
 * 线程安全，但是实例会一直存在于内存。
 */
public class HungryLoadBalancer {
    private static final HungryLoadBalancer lb = new HungryLoadBalancer();

    private HungryLoadBalancer() { }

    public static HungryLoadBalancer getInstance() {
        return lb;
    }
}
