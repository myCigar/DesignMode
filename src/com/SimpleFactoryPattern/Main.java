package com.SimpleFactoryPattern;

public class Main {
    public static void main(String[] args) {
        Chart chart = ChartFactory.getHistogramChart();
        chart.display();

        chart = ChartFactory.getPieChart();
        chart.display();

        chart = ChartFactory.getLineChart();
        chart.display();
    }
}
