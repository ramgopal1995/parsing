package com.xmlparsing.parsing.programInterview;

public class SwapTwoNumberWithoutUsingThird {

    public static void main(String[] args) {
        int x=10;
        int y=20;



       /* x=x+y;
        System.out.println(x);
        y=x-y;
        System.out.println(y);
        x=x-y;
        System.out.println(x);
        System.out.println(y);*/

        int p=0;
       int  temp =x;



        while(x>0){
            int rem=x%10;
            p=p+(rem*rem*rem);
            x=x/10;

        }

        if (p==temp){
            System.out.println("amstrong number ");
        } else {
            System.out.println("its not a amstrong number");
        }

    }
}
