package com.example;

import java.util.Vector;

public class Organization {
    private Vector<Employee> v;

    public Vector<Employee> getV() {
        return v;
    }

    public void setV(Vector<Employee> v) {
        this.v = v;
    }

    public Organization() {
        this.v = new Vector<>();
    }

    public void afiseaza() {
        for(Employee i:v) {
            i.afiseaza();
        }
    }

    public void search(String toSearch) {
        boolean check = false;
        for(Employee i:v){
            if(i.getName().equals(toSearch)){
                i.afiseaza();
                check = true;
            }
        }
        if(!check){
            System.out.println("Numele nu a fost gasit");
        }
    }

    public void delete(String toDelete) {
        for(Employee i:v) {
            if(i.getName().equals(toDelete)){
                v.remove(i.getId());
            }
        }
    }

    public void update(String toUpdate, String newName, int newAge, int newSalary, int newHours) {
        for(Employee i:v) {
            if(i.getName().equals(toUpdate)) {
                i.setAge(newAge);
                i.setSalary(newSalary);
                i.setHours(newHours);
                i.setName(newName);
            }
        }
    }


}
