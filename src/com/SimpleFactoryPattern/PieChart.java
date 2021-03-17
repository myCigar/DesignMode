package com.SimpleFactoryPattern;

public class PieChart implements Chart {
    public PieChart() {
        System.out.println("PieChart init!");
    }

    public void display() {
        System.out.println("PieChart display!");
    }
}
