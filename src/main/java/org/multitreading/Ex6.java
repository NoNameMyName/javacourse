package org.multitreading;

public class Ex6 implements Runnable {

    @Override
    public void run() {
        System.out.println("Method run. Thread.getName(): " + Thread.currentThread().getName());
    }

    public static void main(String[] args) {
        Thread myThread = new Thread(new Ex6());
        myThread.run();
        System.out.println("Method main. Thread.getName(): " + Thread.currentThread().getName());
    }
}
