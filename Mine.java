package org.example;

import java.util.Random;

public class Mine {
    int goldInMine = 100;

    synchronized void takeGold() {
        Random random = new Random();
        if (goldInMine > 0) {
            goldInMine -= 10;
            System.out.println(Thread.currentThread().getName() + " takes 10 kg of gold from mine");
            System.out.println("Gold in mine left: " + goldInMine);
            try {
                Thread.sleep((random.nextInt(3) + 1) * 1000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
