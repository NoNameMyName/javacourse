package org.multitreading;

public class Ex12 {
    static final Object lock = new Object();
    void mobileCall() {
        System.out.println(lock);
        synchronized (lock){
            System.out.println("Mobile call starts");
            try {
                Thread.sleep(3000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Mobile call ends");
        }
    }
    void skypeCall() {
        System.out.println(lock);
        synchronized (lock){
            System.out.println("Skype call starts");
            try {
                Thread.sleep(5000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("Skype call ends");
        }
    }
    void whatsAppCall() {
        System.out.println(lock);
        synchronized (lock){
            System.out.println("WhatsApp call starts");
            try {
                Thread.sleep(7000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            System.out.println("WhatsApp call ends");
        }
    }

    public static void main(String[] args) {
        Thread thread1 =new Thread(new RunnableImpMobile());
        Thread thread2 =new Thread(new SkypeImpMobile());
        Thread thread3 =new Thread(new WhatsAppImpMobile());

        thread1.start();
        thread2.start();
        thread3.start();
    }
}

class RunnableImpMobile implements Runnable{

    @Override
    public void run() {
        new Ex12().mobileCall();
    }
}
class SkypeImpMobile implements Runnable{

    @Override
    public void run() {
        new Ex12().skypeCall();
    }
}
class WhatsAppImpMobile implements Runnable{

    @Override
    public void run() {
        new Ex12().whatsAppCall();
    }
}

class Car{

}