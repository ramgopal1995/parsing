package com.xmlparsing.parsing;

import java.util.*;

public class smalestLagest {

    public static void main(String[] args) {
        int[] a={3,4,9,8};
        findAndPrintMissingElements(a);
        /*Arrays.sort(a);
        int n=a.length;
        int smallestement=0;
        int bigestelement=0;
        for (int i=0;i<n;i++){

            if (i==0){
                 smallestement=a[i];
            }

            if (i<n){
                bigestelement=a[n-1];
            }
        }
        System.out.println(smallestement);
        System.out.println(bigestelement);
        while (smallestement<bigestelement){

        }*/
    }

    public static void findAndPrintMissingElements(int[] arr) {
        if (arr.length == 0) {
            System.out.println("Array is empty");
            return;
        }

        int smallest = Integer.MAX_VALUE;
        int largest = Integer.MIN_VALUE;
        Set<Integer> numSet = new HashSet<>();

        // Find the smallest and largest numbers while populating the HashSet
        for (int num : arr) {
            numSet.add(num);
            if (num < smallest) {
                smallest = num;
            }
            if (num > largest) {
                largest = num;
            }
        }

        List<Integer> missingElements = new ArrayList<>();

        // Iterate through the range of numbers from smallest to largest
        for (int i = smallest + 1; i < largest; i++) {
            if (!numSet.contains(i)) {
                missingElements.add(i);
            }
        }

        System.out.println("Smallest number: " + smallest);
        System.out.println("Largest number: " + largest);
        System.out.println("Missing elements: " + missingElements);
    }
}
