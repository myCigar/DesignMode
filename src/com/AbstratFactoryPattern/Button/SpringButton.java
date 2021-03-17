package com.AbstratFactoryPattern.Button;

public class SpringButton implements Button {
    public SpringButton() {
        System.out.println("SpringButton init!");
    }

    @Override
    public void display() {
        System.out.println("SpringButton is displayed !");
    }
}
