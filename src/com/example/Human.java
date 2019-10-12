package com.example;

public class Human extends Interface {
    int health = 100;
    int ammo = 200;

    public void shootAlien(Alien alien){
        alien.health -= 25;
        this.ammo = ammo - 15;
    }

    public int getAmmo() {
        return ammo;
    }

    @Override
    public int getHealth() {
        return health;
    }

    @Override
    public void setHealth(int health) {
        this.health = health;
    }
}
