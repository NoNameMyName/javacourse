package org.multitreading;

import java.sql.Time;
import java.util.concurrent.*;

public class CallableFactorialEx1 {
    static int factorialResult;

    public static void main(String[] args) throws InterruptedException {
        ExecutorService executorService = Executors.newSingleThreadExecutor();
        Factorial1 factorial1 = new Factorial1(5);
        Future<Integer> future = executorService.submit(factorial1);
        try {
            System.out.println(future.isDone());
            System.out.println("Want to get RESULT");
            factorialResult = future.get();
            System.out.println("Got RESULT");
            System.out.println(future.isDone());
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        } catch (ExecutionException e) {
            throw new RuntimeException(e.getCause());
        }
        finally {
            executorService.shutdown();
        }
        System.out.println(factorialResult);
    }
}

class Factorial1 implements Callable<Integer>{
    int f;

    public Factorial1(int f){
        this.f = f;
    }

    @Override
    public Integer call() throws Exception {
        if (f <= 0){
            throw new Exception("Entered not correct int");
        }
        int result = 1;
        for (int i = 1; i <= f; i++){
            result *= i;
        }
        Thread.sleep(1000);
        return result;
    }
}
