package com.xmlparsing.parsing.program;

public class ProgramForPrimeNUmber {
    public static void main(String[] args) {
        int n=4;

        if (isprimeNumber(n)){
            System.out.println("is prime number: "+n);
        } else {
            System.out.println("is not a prime number");
        }
    }

    private static boolean isprimeNumber(int n) {
        if (n<=1){
            return false;
        }

        for (int i=2;i<=Math.sqrt(n);i++){
            if (n%i==0){
                return false;
            }
        }
       // System.out.println("prime number is :"+n);
        return true;
    }

}
