package org.multitreading;

public class Ex5 {
    public static void main(String[] args) {
        MyThread5 myThread5 = new MyThread5();
        myThread5.setName("my_Thread");
        myThread5.setPriority(9);
        System.out.println("Name: " + myThread5.getName() + "\nPriority: " + myThread5.getPriority());
    }
}

class MyThread5 extends Thread{
    @Override
    public void run(){
        System.out.println("Hello");
    }
}