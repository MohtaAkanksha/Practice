package com.company;

import java.util.Scanner;

public class SeriesNthOdd {
    /*
    input output
    please enter the last term
       6
        1 3 7 13 21 31 */


    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the last term");
        int last=sc.nextInt();
        //System.out.println(getNthTerm(last));
        for(int i=1;i<=last;i++)
        {
            int pr=0;
           pr = (i * (i- 1)) + 1;
            System.out.print(pr+" ");

        }
        sc.close();

        }
}
