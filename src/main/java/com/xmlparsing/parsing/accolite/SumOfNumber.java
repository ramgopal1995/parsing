package com.xmlparsing.parsing.accolite;

public class SumOfNumber {
    public static void main(String[] args) {
        int sum=0;
        int count =0;
        for (int i=1;i<=100;i++){
            sum=sum+i;
            System.out.println(sum);
            count++;
            System.out.println(count);
        }
        double avg=Double.valueOf(sum)/count;
        System.out.println(avg);
    }
}
