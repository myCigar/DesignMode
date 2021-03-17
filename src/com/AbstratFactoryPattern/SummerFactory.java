package com.AbstratFactoryPattern;

import com.AbstratFactoryPattern.Button.Button;
import com.AbstratFactoryPattern.Button.SummerButton;
import com.AbstratFactoryPattern.ComboBox.ComboBox;
import com.AbstratFactoryPattern.ComboBox.SummerComboBox;
import com.AbstratFactoryPattern.TextField.SummerTextField;
import com.AbstratFactoryPattern.TextField.TextField;

public class SummerFactory implements AbstartFactory{
    @Override
    public Button createButton() {
        return new SummerButton();
    }

    @Override
    public TextField createTextField() {
        return new SummerTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SummerComboBox();
    }
}
