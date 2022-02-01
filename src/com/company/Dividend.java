package com.company;

public class Dividend {
    public static void main(String[] args) {
        /*
        1 Number 420
        2 Number 840
        3 Number 1260
        4 Number 1680
        5 Number 2100

          */
        printSeries();

    }


    private static void printSeries() {
        int count = 0;
        int i=420;
        while ( count< 5 && i >= 7) {
            if ((i % 2 == 0) && (i % 3 == 0) && (i % 4 == 0) && (i % 5 == 0) && (i % 6 == 0)) {
                count++;
                //if(count<3 ||count==4){
                    System.out.println(count  + " "+"Number " + i);
                //}
            }
            i+=7;

        }
    }
}
