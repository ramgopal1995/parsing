package com.xmlparsing.parsing.deadlockpackage;

import static com.xmlparsing.parsing.deadlockpackage.mainthreadclaas.Lock1;
import static com.xmlparsing.parsing.deadlockpackage.mainthreadclaas.Lock2;

public class FirstThread extends Thread {
    public void run(){
        synchronized (Lock1) {
            System.out.println("Thread 1: Holding lock 1...");

            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {}
            System.out.println("Thread 1: Waiting for lock 2...");

            synchronized (Lock2) {
                System.out.println("Thread 1: Holding lock 1 & 2...");
            }
        }
    }
}
