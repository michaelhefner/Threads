package com.michaelhefner;

public class Caller implements Runnable {
    String message;
    Callme target;
    Thread thread;

    public Caller(Callme target, String string){
        this.target = target;
        this.message = string;
        this.thread = new Thread(this);
    }
    @Override
    public void run() {
        target.call(message);
    }
}
