package com.company;

import java.util.Scanner;

public class SquareSeries {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the last term");
        int last = sc.nextInt();

        /*Scanner sc = new Scanner(System.in);
        System.out.println("please enter the last term");
        int X = sc.nextInt();
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the last term");
        int N = sc.nextInt();*/

        extracted(last);
    }

    private static void extracted(int last) {
        for (int i = 1; i <= last; i++) {
            for (int j = i; j <= i; j++) {

                int rec = i * i;
                if ((rec % 2) == 0) {
                    System.out.print("-" + rec + "\n");

                    break;
                }

                System.out.print(rec);

            }

        }
    }
}