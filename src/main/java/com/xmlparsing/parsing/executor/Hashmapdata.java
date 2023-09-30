package com.xmlparsing.parsing.executor;

import java.util.HashMap;

public class Hashmapdata {
    public static void main(String[] args) {
        HashMap<Employee ,String>  h1 = new HashMap<>();
        h1.put(new Employee("10","ram"),null);
        h1.put(new Employee("10","ram"),null);
        h1.size();
       // System.out.println(h1);
        System.out.println(h1.size());



        HashMap<Integer,String> map = new HashMap<>();
        map.put(10,"ram");
        map.put(20,"gopal");
        System.out.println(map.size());
        HashMap<Emplyee1,String> a= new HashMap<>();
        a.put(new Emplyee1("ram",800),null);
        a.put(new Emplyee1("ram",800),null);
        System.out.println(a.size());
    }


}
