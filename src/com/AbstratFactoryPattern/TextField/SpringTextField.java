package com.AbstratFactoryPattern.TextField;


public class SpringTextField implements TextField {
    public SpringTextField() {
        System.out.println("SpringTextField init!");
    }

    @Override
    public void display() {
        System.out.println("SpringTextField is displayed!");
    }
}
