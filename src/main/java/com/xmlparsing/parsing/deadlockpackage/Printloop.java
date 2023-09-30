package com.xmlparsing.parsing.deadlockpackage;

public class Printloop {

    public static void printStatement(String statement){
        for (int i=0;i<10;i++){
            System.out.println(statement+i);
        }
    }
}
