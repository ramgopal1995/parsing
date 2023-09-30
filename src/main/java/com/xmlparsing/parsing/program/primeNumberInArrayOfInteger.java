package com.xmlparsing.parsing.program;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class primeNumberInArrayOfInteger {

    public static void main(String[] args) {
        int a[] ={1,2,3,4,5,6,7,8,9,10};
       List<Integer> listOfPrimeNumber=findPrimeNUmber(a);
        System.out.println(listOfPrimeNumber);
    }

    private static List<Integer> findPrimeNUmber(int[] a) {
        List<Integer> list= new ArrayList<>();
        for (Integer integer:a){
            if (isprime(integer)) {
                list.add(integer);
            }
        }
        return list;
    }

    private static boolean isprime(Integer integer) {
        if (integer<=1){
            return false;
        }

        for (int i=2;i<=Math.sqrt(integer);i++){
            if (integer%i==0){
                return false;
            }
        }
        return true;
    }
}
