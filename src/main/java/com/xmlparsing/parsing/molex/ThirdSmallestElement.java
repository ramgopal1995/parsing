package com.xmlparsing.parsing.molex;

public class ThirdSmallestElement {

    public static void thirdSmallestElement(int[] arrA) {

        if (arrA.length < 3) {
            System.out.println("Invalid Input, array size is less than 3");
        }

        int first = Integer.MAX_VALUE;
        int second = Integer.MAX_VALUE;
        int third = Integer.MAX_VALUE;
        for (int i = 0; i < arrA.length; i++) {
            int current = arrA[i];
            if (first > current) {
                third = second;
                second = first;
                first = current;
            } else if (second > current) {
                third = second;
                second = current;
            } else if (third > current) {
                third = current;
            }
        }
        System.out.println("Third smallest element is: " + third);
    }

    public static void main(String[] args) {
        int[] arrA = new int[]{6, 8, 1, 9, 2, 10};
       // thirdSmallestElement(arrA);

        int n=1;
       int value= 0/n;
        System.out.println(value);
    }

    public static int findThirdLargest(int[] arr) {
        if (arr.length < 3) {
            System.out.println("Array does not have at least three elements.");
            return -1; // Handle this case as needed
        }
        int firstLargest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;
        int thirdLargest = Integer.MIN_VALUE;

        for (int num : arr) {
            if (num > firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = firstLargest;
                firstLargest = num;
            } else if (num > secondLargest && num != firstLargest) {
                thirdLargest = secondLargest;
                secondLargest = num;
            } else if (num > thirdLargest && num != firstLargest && num != secondLargest) {
                thirdLargest = num;
            }
        }

        return thirdLargest;

    }

}
