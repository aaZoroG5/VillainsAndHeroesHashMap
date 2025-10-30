package com.pluralsight;

import java.util.Random;

public class SuperHero extends SuperPerson{

    public SuperHero(String name, int health, int willPower){
        //super is synonymous with parent
        super(name, health);
        this.experiencePts = willPower;
    }

    @Override
    public void fight(SuperPerson opponent){
        //generate a random number of damage
        Random random = new Random();
        //return a whole number from 0-100
        int baseDamage = random.nextInt(51);

        int totalDamage = baseDamage + this.experiencePts;

        if(baseDamage == 0){
            System.out.println(this.getName() + " swings heroically and misses!");
        }
        else{
            System.out.println(this.getName() + " lands a super punch on " + opponent.getName() + " and caused " + totalDamage + " damage!");
            //make the opponent take damage
            opponent.takeDamage(totalDamage);
            logHit(opponent);
            printBattleLog();
        }
    }
}
