package com.example;


import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String[] arrayMazda = {"CX5", "6", "3", "rx8"};
        RolandMutterWeek1Homework.h1Ex4(true, 'd', 5, 500, 52.3, "Hello", arrayMazda);
        RolandMutterWeek1Homework.h1Ex5(5, 7);
        RolandMutterWeek1Homework.h1Ex6(new Scanner(System.in), new Scanner(System.in));
        RolandMutterWeek1Homework.h1Ex7(1, 100);
        RolandMutterWeek2Homework.h2Ex12("StringOne", "StringTwo");
        RolandMutterWeek2Homework.h2Ex3("", "", "", new ArrayList<>(), new ArrayList<>());
        RolandMutterWeek2Homework.h2Ex4(new HashMap<>());
    }
}
