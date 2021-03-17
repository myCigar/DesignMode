package com.SimpleFactoryPattern;

public class LineChart implements Chart {
    public LineChart() {
        System.out.println("LineChart init!");
    }

    public void display() {
        System.out.println("LineChart display!");
    }
}
