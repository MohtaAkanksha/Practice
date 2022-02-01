package com.company;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class Main1 {
    /**/
    public static boolean isPrime(int n)
    {
        if (n==1)
            return false;
        for (int i=2; i<Math.sqrt(n); i++)
            if (n%i==0)
                return false;
        return true;
    }


    public static void main(String[] args) {
        int s =1 ;
        System.out.println();
        int f =1, t = 10000;
        for(int i = f; i <= t; i++){
            if(isPrime(i)){
                System.out.println(" "+i) ;
            }
        }
    }

    }