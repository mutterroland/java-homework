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
        return isDead;
    }

    public void setDead(boolean dead) {
        isDead = dead;
    }

    public void dealDamage(int damage) {
        health -= damage;
    }
}
