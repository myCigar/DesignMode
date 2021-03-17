package com.AbstratFactoryPattern.Button;

public class SummerButton implements Button {
    public SummerButton() {
        System.out.println("SummerButton init!");
    }

    @Override
    public void display() {
        System.out.println("SummerButton is displayed!");
    }
}
