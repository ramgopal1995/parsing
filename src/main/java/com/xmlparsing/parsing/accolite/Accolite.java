package com.xmlparsing.parsing.accolite;

public class Accolite {

    public static void main(String[] args) {
        int number =145;
       int reversenumber= getreverseofnumber(number);

      if (isprimeNumber(reversenumber)){
          System.out.println("is prime number :"+number);
      }
    }

    private static boolean isprimeNumber(int reversenumber) {
        boolean flag=true;
        if (reversenumber<0) {
            flag = false;
        }
            for (int j=2;j<Math.sqrt(reversenumber);j++){
                if (reversenumber/j==0){
                    return false;
                }
            }

        return flag;
    }

    private static int  getreverseofnumber(int number) {
        int sum=0;
        int reverse=0;
        while (number>0) {
            reverse = number % 10;
            sum = sum * 10 + reverse;
            number = number / 10;
        }
        return sum;
    }


}
