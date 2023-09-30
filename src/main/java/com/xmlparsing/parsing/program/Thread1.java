package com.xmlparsing.parsing.program;

public class Thread1 extends Thread {
    SharedObject s1= new SharedObject();
    SharedObject s2= new SharedObject();


    public Thread1(SharedObject s1,SharedObject s2){
        this.s1=s1;
        this.s2=s2;
    }

    @Override
    public void run() {
        s1.test1(s2);
    }
}
