package com.xmlparsing.parsing.EpamInterview;

public class ProgramtoConcatTwoARray {

    public static void main(String[] args) {
        int[] a={1,4,6};
        int[] b={7,9,8};

        int a1=a.length;
        int b1=b.length;
        int c1=a1+b1;
        int c[] =new int[c1];
        for (int i=0;i<a1;i++){
            c[i] = a[i];
        }

        for (int i=0;i<b1;i++){
            c[a1+i] =b[i];
        }

        for (int i=0;i<c1;i++){
            System.out.println(c[i]);
        }


        for (int i=0;i<c.length;i++){
            for (int j=i+1;j<c.length;j++){
                if (c[i]>c[j]){
                    int temp=c[i];
                    c[i]=c[j];
                    c[j]=temp;
                }

            }
        }
        for (int i=0;i<c.length;i++){
            System.out.println("sorted element"+c[i]);
        }


    }
}
