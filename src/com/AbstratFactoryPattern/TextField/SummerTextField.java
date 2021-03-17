package com.AbstratFactoryPattern.TextField;

public class SummerTextField implements TextField {
    public SummerTextField() {
        System.out.println("SummerTextField init!");
    }

    @Override
    public void display() {
        System.out.println("SummerTextField is displayed!");
    }
}
