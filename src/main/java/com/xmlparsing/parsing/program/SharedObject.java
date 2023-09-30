package com.xmlparsing.parsing.program;

public class SharedObject {


    synchronized void test1(SharedObject s){
        System.out.println("method 1 started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        s.test2();
        System.out.println("method 1 end ");
    }

    synchronized void test2(){
        System.out.println("method 2 started");
        try {
            Thread.sleep(1000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("test2 end ");
    }
}
