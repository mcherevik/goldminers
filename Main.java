package org.example;

public class Main {
    public static void main(String[] args) {
        Mine mine = new Mine();
        Castle castle = new Castle();
        for (int i = 1; i < 6; i++) {
            Thread worker = new Thread(new Worker(mine, castle));
            worker.setName("Worker " + i);
            worker.start();
        }
    }
}