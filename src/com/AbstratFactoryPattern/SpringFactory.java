package com.AbstratFactoryPattern;

import com.AbstratFactoryPattern.Button.*;
import com.AbstratFactoryPattern.ComboBox.*;
import com.AbstratFactoryPattern.TextField.*;

import java.util.HashMap;

public class SpringFactory implements AbstartFactory {
    @Override
    public Button createButton() {
        return new SpringButton();
    }

    @Override
    public TextField createTextField() {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(1, 2);
        return new SpringTextField();
    }

    @Override
    public ComboBox createComboBox() {
        return new SpringComboBox();
    }
}
