package com.company;

import java.util.Scanner;

public class PurchaseSystem {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("enter the Item Cdoe :");
        double code = sc.nextDouble();
        System.out.println("enter the Description :");
        double desc = sc.nextDouble();
        System.out.println("enter the Quantity::");
        double qty = sc.nextDouble();
        System.out.println("enter the Price ::");
        double price = sc.nextDouble();
        System.out.println("enter your choice ");
        String choice = sc.nextLine();
    }


    // price calculation
    private double calculatePrice(double price, double qty) {
        return price * qty;
    }
//accept the choice


}
