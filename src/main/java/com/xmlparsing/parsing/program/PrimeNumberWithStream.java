package com.xmlparsing.parsing.program;

import java.util.stream.IntStream;
import java.util.stream.Stream;

public class PrimeNumberWithStream {


    public static void main(String[] args) {
        int limit =10;
        genereatePrimeNUmber(limit).forEach(System.out::println);

        //Stream.iterate(new int[]{0,1},t->new int[]{t[1],t[0]+t[1]}).limit(10).map(x->x[0]).forEach(System.out::println);
    }

    private static IntStream genereatePrimeNUmber(int limit) {
        return IntStream.rangeClosed(2,limit).filter(PrimeNumberWithStream::isprime);
    }

    private static boolean isprime(int i) {
        if (i<=1){
            return false;
        }
        return IntStream.rangeClosed(2,(int)Math.sqrt(i)).noneMatch(i2->i2%i==0);
    }
}
