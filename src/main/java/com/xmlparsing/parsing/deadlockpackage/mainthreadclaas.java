package com.xmlparsing.parsing.deadlockpackage;

public class mainthreadclaas {

    public static Object Lock1 = new Object();
    public static Object Lock2 = new Object();

    public static void main(String[] args) {
        FirstThread firstThread= new FirstThread();
        SecondThread secondThread= new SecondThread();
        firstThread.start();
        secondThread.start();
    }

}
