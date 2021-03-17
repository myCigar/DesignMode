package com.ObserverPattern;

public class ConcreteObserver implements Observer {
    @Override
    public void update() {
        System.out.println("update");
    }
}
