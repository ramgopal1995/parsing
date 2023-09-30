package com.xmlparsing.parsing.program;

public class AmstrongNumberProgram {
    //write a program for amastrong number
    public static void main(String[] args) {
        int number =407;


    }
    int number =9;


    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int numDigits = String.valueOf(number).length();
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, numDigits);
            number /= 10;
        }

        return sum == originalNumber;
    }

}
