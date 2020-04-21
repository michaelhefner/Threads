package com.michaelhefner;

public class Synch {
    public static void main(String[] args) {
        Callme target = new Callme();
        Caller ob1 = new Caller(target, "Hello");
        Caller ob2 = new Caller(target, "Synch");
        Caller ob3 = new Caller(target, "World");

        ob1.thread.start();
        ob2.thread.start();
        ob3.thread.start();

        try {
            ob1.thread.join();
            ob2.thread.join();
            ob3.thread.join();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
