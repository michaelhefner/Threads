package com.michaelhefner;

public class CurrentThreadDemo {
    public static void main(String[] args) {
        System.out.println("Main");
        Thread thread = Thread.currentThread();
        System.out.println("Current Thread: " + thread);
        thread.setName("Main Thread");
        System.out.println("After name change: " + thread.getName());
        try {
            for (int n = 5; n > 0; n--){
                System.out.println(n);
                Thread.sleep(1000);
            }
        }catch (InterruptedException e){
            System.out.println("Main thread interrupted");
        }
        NewThread firstThread = new NewThread();
        NewThread secondThread = new NewThread();
        secondThread.setName("Second Child Thread");

        firstThread.thread.start();
        secondThread.thread.start();

        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Main Thread: " + i);
                Thread.sleep(1000);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        System.out.println("Main thread exiting");
    }
}
