package com.example;

public class Human extends Interface {
    int health = 100;
    int ammo = 200;

    public void shootAlien(Alien alien){
        if(!isDead && ammo >= 15 && alien.getHealth() >= 1) {
            alien.health -= 25;
            this.ammo = ammo - 15;
        }else if(ammo < 15 && !isDead){
            System.out.println("Human doesn't have enough ammo to damage Alien!");
        }else{
            System.out.println("Human is dead, can't attack!");
        }
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

    @Override
    public boolean isDead() {
        if(health <= 0){
            isDead = true;
        }
        return isDead;
    }
}
