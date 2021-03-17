package com.ObserverPattern.wuxia;

import java.util.Observable;
import java.util.Observer;

public class Player implements Observer {
    private String name;

    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void help() {
        System.out.println("坚持住：" + this.name + "来救你！");
    }

    public void beAttacked(PlayerControlCenter pcc) {
        System.out.println(this.name + "被攻击!");

    }

    @Override
    public void update(Observable o, Object arg) {
        String name = (String) arg;
        if (!this.name.equals(name)) {
            help();
        }
    }
}
