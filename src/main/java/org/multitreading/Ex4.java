package org.multitreading;

public class Ex4 {
    public static void main(String[] args) {
        new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Hello");
            }
        }).start();

        System.out.println("Poka");
        new Thread(()-> System.out.println("BB")).start();
    }
}
