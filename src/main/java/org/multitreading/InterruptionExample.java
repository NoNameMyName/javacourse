package org.multitreading;

public class InterruptionExample {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Main starts");
        InterruptedThread interruptedThread = new InterruptedThread();
        interruptedThread.start();
        Thread.sleep(2000);
        interruptedThread.interrupt();
        interruptedThread.join();
        System.out.println("Main ends");

    }
}


class InterruptedThread extends Thread{
    double sqrtSum = 0;
    public void run(){
        for (int i = 0; i <= 1000000000; i++){
            if (isInterrupted()) {
                System.out.println("Поток хотят прервать");
                System.out.println("Мы убедились что состояние всех обьектов нормальное и заканчиваем работу потока ");
                System.out.println(sqrtSum);
                return;
            }
            sqrtSum += Math.sqrt(i);
        }
        System.out.println(sqrtSum);
    }
}