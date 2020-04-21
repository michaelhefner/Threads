package com.michaelhefner;

public class Callme {
    void call(String message){
        System.out.print("[" + message);
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            System.out.println("Interrupted");
            e.printStackTrace();
        }
        System.out.print("]");
    }
}
