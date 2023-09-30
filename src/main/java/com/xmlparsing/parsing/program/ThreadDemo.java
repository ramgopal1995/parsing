package com.xmlparsing.parsing.program;

public class ThreadDemo {
    public static void main(String[] args) {
        SharedObject s1= new SharedObject();
        SharedObject s2= new SharedObject();
        Thread1 thread1= new Thread1(s1,s2);
        Thread2 thread2=new Thread2(s1,s2);
        thread1.start();
        thread2.start();
    }
}
