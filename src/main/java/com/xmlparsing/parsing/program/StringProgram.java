package com.xmlparsing.parsing.program;
public class StringProgram {
    public static void main(String[] args) {
        String s1="text";
        String s2="t"+"ext";
        String s3= new String("abc");
        String s4="abc";
        System.out.println(s1==s2);
        System.out.println(s3==s4);
    }
}
