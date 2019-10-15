package com.example;

public class Human implements Interface {
    int health = 100;
    int ammo = 200;
    boolean isDead = false;


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

    public void shootAlien(Alien alien){
        System.out.println(isDead);
        if(!isDead && ammo >= 15 && alien.getHealth() >= 1) {
            alien.health -= 25;
            this.ammo = ammo - 15;
            alien.isDead();
        }else if(ammo < 15 & !isDead){
            System.out.println("Human doesn't have enough ammo to damage Alien!");
        }else if(alien.getHealth() < 0){
            System.out.println("Alien is already dead");
        }else if(isDead){
            System.out.println("Human is dead, can't attack!");
        }
    }
}
