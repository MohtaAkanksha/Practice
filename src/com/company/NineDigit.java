package com.company;

import java.util.Scanner;

public class NineDigit {
    public static void main(String args[]) {
        /* please enter the last term
            40
            the count is4

        */
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the last term ");
        int cnt = getCnt(sc);

        System.out.println ( "the count is " +cnt);

        }


    private static int getCnt(Scanner sc) {
        int last = sc.nextInt();
        //System.out.println(getNthTerm(last));
        int i=0;
        int cnt=0;
        while ((i >= 0) && (i <= last)) {

            int rem = i % 10;
         //   System.out.println(i);
            if (rem == 9) {
                cnt = cnt + 1;

            }

            i++;

        }
        return cnt;
    }
}


