package com.company;

import java.util.Scanner;

public class AverageStudent {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        /*
        enter the name ::
      akanksha
      enter the mark1 ::
      60
      enter the mark2 ::
      60
     total is120
     Average is 60
     Your grade is First Class*/


        System.out.println("enter the name ::");
        String name = sc.next();
        System.out.println("enter the mark1 ::");
        int ma1 = sc.nextInt();
        System.out.println("enter the mark2 ::");
        int ma2 = sc.nextInt();

        int total = ma1 + ma2;
        System.out.println("total is" + total);

        int average = total / 2;
        System.out.println("Average is " + average);


        String grade = null;
        if (average >= 60) {
            grade = "First Class";
        }
        else if (average == 50)
        {
            grade = "Second class";
        }
        else if (average >= 35)
        {
            grade = "Third class";
        }
        else if (average < 35)
        {
            grade = "Fail";
        }


        System.out.println("Your grade is "+grade);
    }
}