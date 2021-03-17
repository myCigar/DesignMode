package com.ObserverPattern.wuxia;

public class Client {
    public static void main(String[] args) {
        PlayerControlCenter pcc;
        pcc = new PlayerControlCenter("金庸武侠");

        Player player1 = new Player("杨过");
        pcc.addObserver(player1);

        Player player2 = new Player("令狐冲");
        pcc.addObserver(player2);

        Player player3 = new Player("张无忌");
        pcc.addObserver(player3);

        Player player4 = new Player("段誉");
        pcc.addObserver(player4);

        player1.beAttacked(pcc);
        pcc.setChanged();
        pcc.notifyObservers(player1.getName());
    }
}
