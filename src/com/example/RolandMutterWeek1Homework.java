package com.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class RolandMutterWeek1Homework {
    public static void h1Ex4() {
        boolean c = true;
        char h = 'd';
        int e = 5;
        long s = 500;
        double d = 52.3;
        String str = "Hello";
        String[] mazda = {"CX5", "6", "3", "rx8"};
        System.out.println(c);
        System.out.println(h);
        System.out.println(e);
        System.out.println(s);
        System.out.println(d);
        System.out.println(str);
        System.out.println(Arrays.toString(mazda));
    }

     public static void h1Ex5() {
         int u = 5;
         int p = 7;
         System.out.println("p - u =" + (p - u));
         System.out.println("++u:" + (++u));
         System.out.println("--p:" + (--p));
         System.out.println("u + p:" + (u + p));
         System.out.println("p - u:" + (p - u));
         System.out.println(p == u); /* pentru ca operatori*/
     }
     public static void h1Ex6() {
        Scanner nr1 = new Scanner(System.in);
        System.out.println("Enter nr a");
        int a = nr1.nextInt();
        Scanner nr2 = new Scanner(System.in);
        System.out.println("Enter nr b");
        int b = nr2.nextInt();

        if(a > b) {
            String adevarat = String.format("%d is larger than %d",a,b);
            System.out.println(adevarat);
        }
        else if(a < b) {
            String adevarat = String.format("%d is larger than %d",b,a);
            System.out.println(adevarat);
        }
        else if(a == b) {
            String adevarat = String.format("%d is equal to %d",a,b);
            System.out.println(adevarat);
        }
    }

    public static void h1Ex7() {
        int min = 1;
        int max = 100;
        Random rand = new Random();
        /*int[] numere = {rand.nextInt(max - min) + min,rand.nextInt(max - min) + min,rand.nextInt(max - min) + min,
                        rand.nextInt(max - min) + min,rand.nextInt(max - min) + min, 15,
                        rand.nextInt(max - min) + min, rand.nextInt(max - min) + min,
                        rand.nextInt(max - min) + min,rand.nextInt(max - min) + min};*/
        ArrayList<Integer> numere = new ArrayList<Integer>();
        numere.add(15);
        for (int i = 0; i < 9; i++){
            int numarRandom = rand.nextInt(max - min) + min;
            numere.add(numarRandom);
        }
        for(int numar: numere) {
            if(numar == 15) {
                continue;
            }
            System.out.println(numar);

        }
    }
}