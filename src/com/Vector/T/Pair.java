package com.Vector.T;

public class Pair<T> {
    T first;
    T second;

    public Pair(T first, T second) {
        this.first = first;
        this.second = first;
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }
}
