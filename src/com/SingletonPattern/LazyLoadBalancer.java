package com.SingletonPattern;

import java.util.ArrayList;
import java.util.List;

/**
 * 带双重锁懒汉式单例模式
 * 但是操作繁琐，也会影响性能
 */
public class LazyLoadBalancer {
    // 此处volatile不能省略，使用 volatile 可以禁止 JVM 的指令重排，保证在多线程环境下也能正常运行。
    private volatile static LazyLoadBalancer lb = null;

    private LazyLoadBalancer() { }

    public static LazyLoadBalancer getInstance() {
        if (lb == null) {
            synchronized (LazyLoadBalancer.class) {
                if (lb == null) {
                    lb = new LazyLoadBalancer();
                }
            }
        }
        return lb;
    }
}
