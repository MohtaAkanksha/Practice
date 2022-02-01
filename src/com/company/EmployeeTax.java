package com.company;

import java.util.Scanner;

public class EmployeeTax {
    public static void main(String[] args) {
        /*
        enter the name of employee :
            akanksha
            enter the empid::
            234
            enter the basic pay ::
            40000
            enter the special allowances ::
            1000
            enter the monthly tax saving investments::
            1200
            monthly gross salary is41000
            enter the bonus percentage ::
            12
            enter the Annual salary is ::492000.0
            enter the bonus amount is ::8.333333
            total including bonus is ::492008.33333301544
            the amount after tax deduction is 324907.91731739044*/


        Scanner sc = getScanner();
        extracted(sc);
        int id = sc.nextInt();
        System.out.println("enter the basic pay ::");
        int basic = sc.nextInt();
        System.out.println("enter the special allowances ::");
        int allowance = sc.nextInt();

        System.out.println("enter the monthly tax saving investments::");
        int investment = sc.nextInt();


        int grossSal = basic + allowance;
        System.out.println("monthly gross salary is " + grossSal);


        System.out.println("enter the bonus percentage ::");
        Float bonus = sc.nextFloat();
        Float bonusCal;
        double annualSal = grossSal * 12;
        System.out.println("enter the Annual salary is ::" + annualSal);
        bonusCal = getaFloat(grossSal, annualSal);


        double total = annualSal + bonusCal;
        System.out.println("total including bonus is ::" + total);

        if (investment != 0) {
            total = total - 150000;
        }

        if (total <= 250000) {
            System.out.println("Annual salary is" + total);
        } else if (total > 250000 && total <= 500000) {
            Float temp = (float) ((total * 5) / 100);
            double net = total - temp;

            System.out.println("the amount after tax deduction is " + net);

        } else if (total > 500000 && total <= 1000000) {
            Float temp = (float) ((total * 20) / 100);
            double net = total - temp;
            System.out.println("the amount after tax deduction is " + net);

        } else if (total > 1000000) {
            Float temp = (float) ((total * 30) / 100);
            double net = total - temp;
            System.out.println("the amount after tax deduction is " + net);
        }

    }


    private static void extracted(Scanner sc) {
        String name = sc.next();
        System.out.println("enter the empid::");
    }


    private static Scanner getScanner() {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the name of employee :");
        return sc;
    }


    private static Float getaFloat(int grossSal, double annualSal) {
        Float bonusCal;
        bonusCal = (float) ((grossSal / annualSal) * 100);
        System.out.println("enter the bonus amount is ::" + bonusCal);
        return bonusCal;
    }

}