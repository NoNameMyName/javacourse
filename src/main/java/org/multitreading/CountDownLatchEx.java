package org.multitreading;

import java.util.concurrent.CountDownLatch;

public class CountDownLatchEx {
    static CountDownLatch countDownLatch = new CountDownLatch(3);
    public static void main(String[] args) throws InterruptedException {
        new Friend("Zaur", countDownLatch);
        new Friend("Oleg", countDownLatch);
        new Friend("Ivan", countDownLatch);
        new Friend("Roman", countDownLatch);
        new Friend("Sergay", countDownLatch);
        new Friend("Katya", countDownLatch);
        marketStaffIsOnPlace();
        everythingIsReady();
        openMarket();

    }
    private static void marketStaffIsOnPlace() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Market staff came to work");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
    private static void everythingIsReady() throws InterruptedException {
        Thread.sleep(2000);
        System.out.println("Everything is ready, so lets open a market");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
    private static void openMarket() throws InterruptedException {
        Thread.sleep(4000);
        System.out.println("Market is opened");
        countDownLatch.countDown();
        System.out.println("countDownLatch = " + countDownLatch.getCount());
    }
}

class Friend extends Thread{
    String name;
    private CountDownLatch countDownLatch;
    public Friend (String name, CountDownLatch countDownLatch){
        this.name = name;
        this.countDownLatch = countDownLatch;
        this.start();
    }
    public void run(){
        try {
            countDownLatch.await();
            System.out.println(name + " starts shopping");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
    }
}