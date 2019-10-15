package com.example;

public class Alien implements Interface {

    int health = 200;
    int energy = 100;
    boolean isDead = false;

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
        if(!isDead && energy >= 10 && human.getHealth() >= 1){
            if(energy >= 80 && energy <= 100) {
                human.health -= 25;
            }else if(energy <= 80 && energy >= 50){
                human.health -= 15;
            }else if(energy <= 50 && energy >= 10){
                human.health -= 10;
            }
            this.energy -= 10;
            human.isDead();
        }else if(energy < 10 && !isDead) {
            System.out.println("Alien doesn't have enough energy to damage Human!");
        }else if(human.getHealth() < 0){
            System.out.println("Human is already dead");
        }else if(isDead){
            System.out.println("Alien is dead, can't attack");
        }
    }
}
