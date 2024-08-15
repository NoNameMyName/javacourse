package org.multitreading;

import java.util.concurrent.atomic.AtomicInteger;

public class AtomicIntegerEX {
    static AtomicInteger counter = new AtomicInteger(0);
    public static void increment(){
        counter.incrementAndGet();
    }

    public static void main(String[] args) throws InterruptedException {
        Thread thread1 = new Thread(new MyRunnableImplementation11());
        Thread thread2 = new Thread(new MyRunnableImplementation11());
        thread1.start();
        thread2.start();

        thread1.join();
        thread2.join();

        System.out.println(counter);
    }
}

class MyRunnableImplementation11 implements Runnable{

    @Override
    public void run() {
        for (int i = 0; i < 100; i++){
            AtomicIntegerEX.increment();
        }
    }
}