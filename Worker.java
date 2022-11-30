package org.example;

public class Worker implements Runnable{

    private  Mine mine;
    private Castle castle;

    Worker(Mine mine, Castle castle) {
        this.mine = mine;
        this.castle = castle;
    }
    @Override
    public void run() {
        while (mine.goldInMine > 0 && castle.goldInCastle < 100) {
            mine.takeGold();
            castle.putGold();
        }
    }
}
