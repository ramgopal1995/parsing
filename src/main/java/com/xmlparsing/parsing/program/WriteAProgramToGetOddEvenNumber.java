package com.xmlparsing.parsing.program;

import java.util.ArrayList;
import java.util.List;

public class WriteAProgramToGetOddEvenNumber {

    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,7,8,9,10};
        getevenNUmber(a);
    }

    private static void getevenNUmber(int[] a) {
        List<Integer> evenNumber=new ArrayList<>();
        List<Integer> oddNumber=new ArrayList<>();
        for (Integer aa:a){
            if(isevenNumber(aa)){
                evenNumber.add(aa);
            } else {
                oddNumber.add(aa);
            }
        }

        System.out.println("even number of list:"
                +evenNumber);
        System.out.println("oddNumber of list is :"+oddNumber);
    }

    private static boolean isevenNumber(Integer aa) {
        if (aa%2== 0){
            return true;
        } else {
            return false;
        }
    }
}
