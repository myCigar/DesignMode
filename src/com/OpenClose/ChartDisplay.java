package com.OpenClose;

public class ChartDisplay {

    private AbstractChart chart;

    public void setChart(AbstractChart chart) {
        this.chart = chart;
    }

    public void display() {
        chart.display();
    }
}
