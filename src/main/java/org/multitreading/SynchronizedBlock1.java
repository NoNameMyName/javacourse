package org.multitreading;

public class SynchronizedBlock1 {

    public static void main(String[] args) throws InterruptedException {
        MyRunnableImp2 runnable = new MyRunnableImp2();
        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        Thread thread3 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class Counter2{
    volatile static int count = 0;
}

class MyRunnableImp2 implements Runnable{

    public void doWork2(){
        System.out.println("Ura!");
    }
    public void doWirk1(){
        doWork2();
        synchronized (this) {
            Counter.count++;
            System.out.println(Counter.count);
        }
    }

    @Override
    public void run() {
        for (int i = 0; i < 3; i++){
            doWirk1();
        }
    }
}