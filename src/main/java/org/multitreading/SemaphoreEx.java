package org.multitreading;

import java.util.concurrent.Semaphore;

public class SemaphoreEx {
    public static void main(String[] args) {
        Semaphore callBox = new Semaphore(2);
        new Peson("Igor", callBox);
        new Peson("Katya", callBox);
        new Peson("Oleg", callBox);
        new Peson("Roma", callBox);
        new Peson("Anton", callBox);
    }
}

class Peson extends Thread{
    String name;
    private Semaphore callBox;
    public Peson(String name, Semaphore callBox){
        this.name = name;
        this.callBox = callBox;
        this.start();
    }

    @Override
    public void run(){
        try {
            System.out.println(name + " is waiting");
            callBox.acquire();
            System.out.println(name + " using a phone");
            sleep(2000);
            System.out.println(name + " drop a phone");
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        finally {
            callBox.release();
        }
    }

}
