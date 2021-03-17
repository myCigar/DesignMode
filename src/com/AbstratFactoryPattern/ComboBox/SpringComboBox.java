package com.AbstratFactoryPattern.ComboBox;

public class SpringComboBox implements ComboBox {
    public SpringComboBox() {
        System.out.println("SpringComboBox init!");
    }

    @Override
    public void display() {
        System.out.println("SpringComboBox is displayed!");
    }
}
