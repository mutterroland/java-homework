package com.example;

public class Alien extends Interface {

    int health = 200;
    int energy = 100;

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

    public int getEnergy() {
        return energy;
    }

    public void biteHuman(Human human){
        if(energy >= 80 && energy <= 100) {
            human.health -= 25;
        }else if(energy <= 80 && energy >= 50){
            human.health -= 15;
        }else if(energy <= 50 && energy >= 10){
            human.health -= 10;
        }
        this.energy -= 10;
    }
}
