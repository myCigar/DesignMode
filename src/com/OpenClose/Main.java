package com.OpenClose;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ChartDisplay chartDisplay = new ChartDisplay();

        // PieChart
        chartDisplay.setChart(new PieChart());
        chartDisplay.display();

        // BarChart
        chartDisplay.setChart(new BarChart());
        chartDisplay.display();

        // LineChart
        chartDisplay.setChart(new LineChart());
        chartDisplay.display();

        // 加入其他画图类，只需要新增类，不需要修改源代码，然后再这里调用即可。
        // 满足开闭原则
    }
}
