package com.AbstratFactoryPattern;

import com.AbstratFactoryPattern.Button.Button;
import com.AbstratFactoryPattern.ComboBox.ComboBox;
import com.AbstratFactoryPattern.TextField.TextField;

import java.util.HashMap;


public interface AbstartFactory {
    Button createButton();
    TextField createTextField();
    ComboBox createComboBox();
}
