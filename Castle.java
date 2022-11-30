package org.example;

import java.util.Random;

public class Castle {
    int goldInCastle = 0;

    synchronized void putGold() {
        Random random = new Random();
        if (goldInCastle < 100) {
            goldInCastle += 10;
            System.out.println(Thread.currentThread().getName() + " puts 10 kg of gold into castle");
            System.out.println("Gold in castle: " + goldInCastle);
            try {
                Thread.sleep((random.nextInt(3) + 1) * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
