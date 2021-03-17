package com.SimpleFactoryPattern;

import javafx.util.Pair;

public class HistogramChart implements Chart {
    public HistogramChart() {
        System.out.println("HistogramChart init!");
    }

    @Override
    public void display() {
        System.out.println("HistogramChart display!");
    }
}
