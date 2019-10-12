package com.example;

public class Interface {
    int health;
    boolean isDead = false;

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public boolean isDead() {
        if(health == 0){
            isDead = true;
        }
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void dealDamage(int damage) {
        health -= damage;
    }
}
