package com.AbstratFactoryPattern.ComboBox;

public class SummerComboBox implements ComboBox {
    public SummerComboBox() {
        System.out.println("SummerComboBox init!");
    }

    @Override
    public void display() {
        System.out.println("SummerComboBox is displayed!");
    }
}
