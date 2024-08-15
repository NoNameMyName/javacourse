package org.multitreading;

public class WaitNotifyExample {
    public static void main(String[] args) {
        Market market = new Market();
        Consumer consumer = new Consumer(market);
        Producer producer = new Producer(market);
        Thread thread1 = new Thread(consumer);
        Thread thread2 = new Thread(producer);
        thread1.start();
        thread2.start();
    }
}

class Market {
    private int breadCount = 0;
    private final Object lock = new Object();

    public void getBread() {
        synchronized (lock) {
            while (breadCount < 1) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount--;
            System.out.println("Потребитель купил 1 хлеб");
            System.out.println("Колличество хлеба в магазине: " + breadCount);
            lock.notify();
        }
    }

    public void putBread() {
        synchronized (lock) {
            while (breadCount >= 5) {
                try {
                    lock.wait();
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
            }
            breadCount++;
            System.out.println("Производитель добавил на витрину 1 хлеб");
            System.out.println("Колличество хлеба в магазине: " + breadCount);
            lock.notify();
        }
    }
}

class Consumer implements Runnable{

    Market market;
    Consumer (Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            market.getBread();
        }
    }
}

class Producer implements Runnable {

    Market market;
    Producer (Market market){
        this.market = market;
    }

    @Override
    public void run() {
        for (int i = 0; i < 10; i++){
            market.putBread();
        }
    }
}