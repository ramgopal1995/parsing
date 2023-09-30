package com.xmlparsing.parsing.program;

import java.util.stream.Stream;

public class FibonaceProgram {
    public static void main(String[] args) {
        int n1=0;
        int n2=1;
        int n3=0;
        System.out.println(n1);
        for (int i=2;i<10;i++){
            n3=n1+n2;
            System.out.println(n3);
            n1=n2;
            n2=n3;
        }


       // Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]}).limit(10).map(t->t[0]).forEach(System.out::println);
    }
}
