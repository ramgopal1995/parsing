package com.xmlparsing.parsing.executor;

import java.util.Arrays;

public class prog {

    public static void main(String[] args) {
        String[]  a = {"eat","tea","tan","ate","nat","bat"};
        int flag = 1;
        for (int i=0;i<a.length;i++){
            for(int j=i+1;j<a.length-1;j++){
                String a1=a[i] ;
                String a2=a[j];
                if(a1.length()==a2.length()){
                    char[] c1= a1.toCharArray();
                    char[] c2=  a2.toCharArray();
                    Arrays.sort(c1);
                    Arrays.sort(c2);
                    for (int i2=0;i2<c1.length;i2++){
                        if(c1[i2]==c2[i2]){
                            flag=0;
                        } else{
                            flag=1;
                        }
                    }
                }
            }
        }

        if(flag ==0){
            System.out.println("its ana gram ");
        } else {
            System.out.println("its not anagram");
        }

    }
}
