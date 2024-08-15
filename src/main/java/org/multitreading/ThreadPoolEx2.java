package org.multitreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class ThreadPoolEx2 {
    public static void main(String[] args) {
        ScheduledExecutorService executorService = Executors.newScheduledThreadPool(1);
//        for (int i = 0; i < 10; i++){
//            executorService.execute(new RunnableImplementation200());
//        }
//        executorService.schedule(new RunnableImplementation200(), 3, TimeUnit.SECONDS);
//        executorService.scheduleAtFixedRate(new RunnableImplementation200(), 3, 1, TimeUnit.SECONDS);
        executorService.scheduleWithFixedDelay(new RunnableImplementation200(), 3, 1, TimeUnit.SECONDS);

        try {
            Thread.sleep(10000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        executorService.shutdown();

        ExecutorService executorService1 = Executors.newCachedThreadPool();

    }
}

class RunnableImplementation200 implements Runnable{

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + " begins work");
//        try {
//            Thread.sleep(5000);
//        } catch (InterruptedException e) {
//            throw new RuntimeException(e);
//        }
        System.out.println(Thread.currentThread().getName() + " after work");
    }
}