package org.multitreading;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Bankomat {
    public static void main(String[] args) throws InterruptedException {
        Lock lock = new ReentrantLock();
        Employee employee1 = new Employee("Zaur", lock);
        Employee employee2 = new Employee("Oleg", lock);
        Employee employee3 = new Employee("Elena", lock);
        Thread.sleep(10000);
        Employee employee4 = new Employee("Viktor", lock);
        Employee employee5 = new Employee("Marina", lock);
    }
}

class Employee extends Thread{
    String name;
    private Lock lock;
    public Employee (String name, Lock lock){
        this.name = name;
        this.lock = lock;
        this.start();
    }
    @Override
    public void run(){
        if (lock.tryLock()){
            try {
    //            System.out.println(name + " ожидает");
    //            lock.lock();
                System.out.println(name + " пользуеться банкоматом");
                Thread.sleep(2000);
                System.out.println(name + " завершила свои дела");
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            finally {
                lock.unlock();
            }
        }else {
            System.out.println(name + " не хочет ждать в очереди");
        }
    }
}