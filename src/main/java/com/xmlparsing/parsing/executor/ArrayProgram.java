package com.xmlparsing.parsing.executor;

public class ArrayProgram {
    public static void main(String[] args) {
        int[] arr={1,2,3,4,5};
        int n=arr.length;
        for (int i=0;i<n;i++){
            for (int j=i+1;j<n-1;j++){
                int temp = arr[i+1];
                arr[i+1]=arr[j-1];
                arr[j-1] =temp;
            }
        }
        for (int a:arr){
            System.out.println(a);

        }
    }
}
