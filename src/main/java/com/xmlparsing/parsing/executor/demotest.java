package com.xmlparsing.parsing.executor;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class demotest {

    static private int a=3;

    public static void main(String[] args) {
        Runnable r1=new Task("task1");
        Runnable r2=new Task("task2");
        Runnable r3=new Task("task3");
        Runnable r4=new Task("task4");
        Runnable r5=new Task("task5");
        ExecutorService executorService= Executors.newFixedThreadPool(3);
        executorService.execute(r1);
        executorService.execute(r2);
        executorService.execute(r3);
        executorService.execute(r4);
        executorService.execute(r5);
        executorService.shutdown();
    }
}
