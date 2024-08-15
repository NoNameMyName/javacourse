package org.multitreading;

import java.util.*;

public class SynchronizedCollectionEx1 {
    public static void main(String[] args) throws InterruptedException {
        List<Integer> synchList = Collections.synchronizedList(new ArrayList<>());
        ArrayList<Integer> source = new ArrayList<>();
        for (int i = 0; i < 5; i++){
            source.add(i);
        }
        ArrayList<Integer> target = new ArrayList<>();
        Runnable runnable = () -> {synchList.addAll(source);};

        Thread thread1 = new Thread(runnable);
        Thread thread2 = new Thread(runnable);
        thread1.start();
        thread2.start();
        thread1.join();
        thread2.join();
        System.out.println(synchList);
    }
}
