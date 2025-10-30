package com.pluralsight;

import java.util.Random;

public class SuperVillain extends SuperPerson{

    public SuperVillain(String name, int health, int darkPower){
        //super is synonymous with parent
        super(name, health);
        this.experiencePts = darkPower;
    }

    @Override
    public void fight(SuperPerson opponent){

        Random random = new Random();
        int damage = random.nextInt(51);

        int totalDamage = damage + this.experiencePts;

        if(damage == 0){
            System.out.println(this.getName() + "'s missed his attack!");
        }
        else{
            System.out.println(this.getName() + " slashes " + opponent.getName() + " and caused " + damage + " damage!");

            //make the opponent take damage
            opponent.takeDamage(totalDamage);
        }
    }

}
