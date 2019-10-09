package com.example;

public class Employee {
    private String name;
    private int age;
    private int salary;
    private int hours;
    private int id;
    private static int nrAngajat;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    public int getHours() {
        return hours;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Employee(String name, int age, int salary, int hours) {
        this.name = name;
        this.age = age;
        this.salary = salary;
        this.hours = hours;
        this.id = nrAngajat++;
    }

    public void afiseaza() {
        System.out.println("id: " + this.id + " nume: " + this.name + " age: " + this.age + " salary: " + this.salary + " hours: " + this.hours);
    }
}
