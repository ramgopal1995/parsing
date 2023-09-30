package com.xmlparsing.parsing.executor;

import java.util.HashMap;

public class HashMapAction {

    public static void main(String[] args) {
        HashMap<Integer,String> map= new HashMap<>();
       /* map.put(1,"ram");
        map.put(1,"gopal");
        System.out.println(map.size());*/

        HashMap<Emplyee1,String> a = new HashMap<>();
        a.put(new Emplyee1("1",10),"ram");// condition if equal method overide then only it will give size 1
        //other wise size will be
        a.put(new Emplyee1("1",10),"ram");
        System.out.println(a.size());

        map.put(null,null);
        map.put(null,"a");
        System.out.println(a.size());
        System.out.println(map);







    }
}
