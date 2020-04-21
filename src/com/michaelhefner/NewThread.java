package com.michaelhefner;

public class NewThread implements Runnable {
    Thread thread;

    NewThread() {
        thread = new Thread(this, "Demo Thread");
        System.out.println("Child thread: " + thread.getName());
    }
    @Override
    public void run() {
        try {
            for (int i = 5; i > 0; i--){
                System.out.println("Child thread: " + i);
                Thread.sleep(500);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
