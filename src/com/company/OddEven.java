package com.company;

import java.util.Scanner;

public class OddEven {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the last term");
        int last=sc.nextInt();
        int num=0,i=0;
        //System.out.println(getNthTerm(last));
        for( i=1;i<=last;i++)
        {
            //System.out.println(i);
            if (i!=1 && i%2==0)
            {
                num=num+4;
        }

            else if ( i==2 || i % 2!=0)
            {
                    num=i;
                    num=num+3;
                }

            System.out.println(num);
        }
        }
}
