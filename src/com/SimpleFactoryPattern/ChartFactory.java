package com.SimpleFactoryPattern;

import java.util.Calendar;

public class ChartFactory {
    public static HistogramChart getHistogramChart() {
        HistogramChart histogramChart = new HistogramChart();
        System.out.println("创建柱状图！");
        return histogramChart;
    }

    public static PieChart getPieChart() {
        PieChart pieChart = new PieChart();
        System.out.println("创建饼状图！");
        return pieChart;
    }

    public static LineChart getLineChart() {
        LineChart lineChart = new LineChart();
        System.out.println("创建折线图！");
        return lineChart;
    }
}
