package com.ObserverPattern;

public class ConcreteSubject extends Subject {
    @Override
    public void notifyUpdate() {
        for (Observer obs : observers) {
            obs.update();
        }
    }
}
