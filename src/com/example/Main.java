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

        Organization org = new Organization();
        System.out.println("Afisare vector:");
        org.getV().add(new Employee("roland", 23, 23000, 15));
        org.getV().add(new Employee("ro23land", 223, 230400, 15));
        org.getV().add(new Employee("Bogdan", 23, 234000, 15));
        org.afiseaza();
        System.out.println("search:");
        org.search("roland");
        System.out.println("Delete la ro23land");
        org.delete("ro23land");
        System.out.println("Afisare vector dupa delete");
        org.afiseaza();
        System.out.println("Update, in loc de roland apare Fanel");
        org.update("roland", "Fanel", 26, 234, 24);
        System.out.println("Vector final dupa toate operatiile");
        org.afiseaza();

        Human h1 = new Human();
        Alien a1 = new Alien();

        System.out.println("Initial Human Health and Alien energy: " + h1.getHealth() + " " + a1.getEnergy());
        a1.biteHuman(h1);
        System.out.println("Human health and Alien energy after first bite : " + h1.getHealth() + " " + a1.getEnergy());
        h1.shootAlien(a1);
        h1.shootAlien(a1);
        System.out.println("Alien health and Human ammo after 2 shoots : " + a1.getHealth() + " " + h1.getAmmo());
        System.out.println(h1.getHealth());
        System.out.println(h1.isDead());



    }
}
