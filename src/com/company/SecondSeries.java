package com.company;

import java.util.Scanner;

import static java.lang.Math.pow;

public class SecondSeries {

    static public void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the last term");
        int last = sc.nextInt();
        //int prt=0;
        // int N = 0;
        int prt = 1;
        //System.out.println(getNthTerm(last));
        for (int i = 0; i <= last; i++) {

            prt = (int) (Math.pow(i, 2) + prt);
            System.out.print(prt + " ");
        }



        sc.close();
}

}
