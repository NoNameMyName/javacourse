package org.multitreading;

public class Ex9 {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main begins");
        Thread thread1 = new Thread(new Worker());
        System.out.println(thread1.getState());
        thread1.start();
        System.out.println(thread1.getState());
        thread1.join(4000);
        System.out.println(thread1.getState());
        System.out.println("Main ends");
    }
}

class Worker implements Runnable{

    @Override
    public void run() {
        System.out.println("Work begins");
        try {
            Thread.sleep(2500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Work ends");
    }
}