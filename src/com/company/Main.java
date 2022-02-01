package com.company;

import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Scanner;
import java.util.regex.Pattern;

public class Main {
    /* I/P and O/P

    "C:\Program Files\Java\jdk-11.0.13\bin\java.exe" "-javaagent:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\lib\idea_rt.jar=60761:C:\Program Files\JetBrains\IntelliJ IDEA Community Edition 2021.3.2\bin" -Dfile.encoding=UTF-8 -classpath C:\Users\amohta\IdeaProjects\HelloWorld\out\production\HelloWorld com.company.Main
String is :ae io ab 1
 number of words 4
 number of Digits 1
 words in alphabetical order are :
1
ab
ae
io
{1=1, ab=1, ae=1, io=1}
words with maximum two vowel are ae
words with maximum two vowel are io

Process finished with exit code 0

     */



    public static void main(String[] args) {
        // write your code here
        int count = 0;

        String temp;
        String str = "COVID crisis requires greta alertness and we have to make sure that  we do not take anything  for granted . atleast  3 months more of caution is  important  for this country of 1.3 billion";
        //String str = "ae io ab 1";
        System.out.println("String is :" + str );
        String[] inputArr = str.split(" ");
        System.out.println(" number of words " + inputArr.length);
//no. of digits
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) >= 48 && str.charAt(i) <= 57)
                count++;

        }
        System.out.println(" number of Digits " + count);


        //sorted words
        for (int i = 0; i < inputArr.length; i++) {
            for (int j = i + 1; j < inputArr.length; j++) {
                if (inputArr[i].compareTo(inputArr[j]) > 0) {
                    temp = inputArr[i];
                    inputArr[i] = inputArr[j];
                    inputArr[j] = temp;
                }

            }
        }
        System.out.println(" words in alphabetical order are :");
        for (int i = 0; i < inputArr.length; i++) {
            System.out.println(inputArr[i]);

        }


        // occurence
        Map<String, Integer> words = new HashMap<>();
        for (String s : inputArr) {
            if (words.containsKey(s)) {
                words.put(s, 1 + words.get(s));

            } else {
                words.put(s, 1);
            }
        }

        System.out.println(words);


        // vowels

        int c = 0;
        for (String word : inputArr) {
            word = word.toLowerCase();

            for (int i = 0; i < word.length(); i++) {
                char ch = word.charAt(i);
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {

                    c++;
                }
                if (c >= 2) {
                    System.out.println("words with maximum two vowel are " +word);
                    break;
                }

            }


        }


    }}