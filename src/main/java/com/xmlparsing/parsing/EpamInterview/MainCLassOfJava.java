package com.xmlparsing.parsing.EpamInterview;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;


public class MainCLassOfJava {
    static IntFunction square=(a)->a*a;


    public static void main(String[] args) {

        ArrayList<Integer> numbers=new ArrayList<>();
        numbers.add(1);
        numbers.add(5);
        numbers.add(3);
        numbers.add(4);
        Collections.sort(numbers);


        for (Integer a:numbers){
            System.out.println(a);
        }




     /* List<Integer> a=  numbers.stream().map(square::apply).collect(Collectors.toList());
      for (Integer a1:a){
          System.out.println(a1);
      }*/
    }


  /*  private void methoddata(){
        List<Integer> numbers = java.awt.List.of(1, 2, 3, 4, 5);
    }*/
}
