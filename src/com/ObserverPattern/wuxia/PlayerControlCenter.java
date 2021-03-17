package com.ObserverPattern.wuxia;

import java.util.Observable;
import java.util.Observer;

public class PlayerControlCenter extends Observable {
    // 战队名称
    private String allyName;

    public PlayerControlCenter(String allyName) {
        System.out.println(allyName + "战队组建成功！");
        System.out.println("------------------------------");
        this.allyName = allyName;
    }

    public void setAllyName(String allyName) {
        this.allyName = allyName;
    }

    public String getAllyName() {
        return this.allyName;
    }

    public void addObserver(Player player) {
        System.out.println(player.getName() + "加入" + this.allyName + "战队！");
        super.addObserver(player);
    }

    public void deleteObserver(Player player) {
        System.out.println(player.getName() + "退出" + this.allyName + "战队！");
        super.addObserver(player);
    }

    @Override
    public void setChanged() {
        super.setChanged();
    }

    @Override
    public void notifyObservers(Object arg) {
        String name = (String) arg;
        System.out.println(this.allyName + "战队紧急通知，盟友" + name + "遭受敌人攻击！");
        super.notifyObservers(name);
    }
}
