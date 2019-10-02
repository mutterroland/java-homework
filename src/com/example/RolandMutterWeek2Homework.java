package com.example;

import java.util.*;

public class RolandMutterWeek2Homework {
    public static void h2Ex12(String one, String two) {
        System.out.println("String One equals String Two: " + one.equals(two));
        String reverse = "";
        for (int i = one.length() - 1; i >= 0; i--)
            reverse = reverse + one.charAt(i);
        if (one.equals(reverse))
            System.out.println("String One este palindrom");
        else
            System.out.println("String one nu este palindrom");
        System.out.println("Concatenate: " + one + two);
    }
    public static void h2Ex3(String liber, String next, String old, ArrayList<String> stringArray, List<String> stringList) {
        stringList.add("AcEd");
        stringList.add("cArS");
        stringList.add("aBeL");
        stringList.add("GOsu");
        stringList.add("hiDrA");
        stringList.add("VOinE");
        stringList.add("cevaCuX");
        for (int i = 0; i <= stringList.size() - 1; i++) {
            next = stringList.get(i).toLowerCase();
            if (next.startsWith("a") || next.startsWith("e") || next.startsWith("i") || next.startsWith("o") || next.startsWith("u")) {
                liber = liber + next.toLowerCase();
            } else if (next.length() < 3 || next.toLowerCase().contains("x")) {
                old = next;
                next = "skipped";
                System.out.println("Current word " + next + " ,replaced word is " + old);
            } else {
                stringArray.add(next.toUpperCase());
            }
        }
        System.out.println(stringArray);
        System.out.println(liber);
    }
    public static void h2Ex4(HashMap<String,String> angajati){
        angajati.put("Paul", "paul@softvision.ro");
        angajati.put("Raul", "raul@softvision.ro");
        angajati.put("Eugen", "eugen@softvision.ro");
        angajati.put("Erik", "erik@softvision.ro");
        System.out.println("Size of angajati is " + angajati.size());
        System.out.println(angajati.containsKey("Erik"));
        System.out.println(angajati.get("Paul"));
        angajati.remove("Eugen");
        /* What kind of sort? */
    }
}
