package org.multitreading;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class RunnableFactorialEx1 {
    static long factorialResult;

    public static void main(String[] args) throws InterruptedException {

        ExecutorService executorService = Executors.newSingleThreadExecutor();

        executorService.execute(new Factorial(20));
        executorService.shutdown();
        executorService.awaitTermination(10, TimeUnit.SECONDS);
        System.out.println(factorialResult);

    }
}

class Factorial implements Runnable{
    long f;
    public Factorial (int f){
        this.f = f;
    }
    @Override
    public void run() {
        if (f <= 0){
            System.out.println("U enter not correct int");
            return;
        }
        long result = 1;
        for (int i = 1; i <= f; i++){
            result *= i;
        }
        RunnableFactorialEx1.factorialResult = result;

    }
}