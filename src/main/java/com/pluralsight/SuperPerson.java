package com.pluralsight;

import java.util.HashMap;
import java.util.Map;

public abstract class SuperPerson {
    //create the class properties
    private String name;
    protected int health;
    protected int experiencePts;//NOTE: we made the properties "protected" so the child classes can access them

    //add a hash map called battleLog
    public HashMap<String, Integer> battleLog = new HashMap<>();

    //create the class constructor
    public SuperPerson(String name, int health) {
        this.name = name;
        this.health = health;
    }

    //method to determine if the super is alive
    public boolean isAlive(){
        if(this.health > 0 ){
            return true;
        }
        return false;
    }

    //if we take damage it should lower our health
    public void takeDamage(int amountOfDamage){
        this.health -= amountOfDamage;
        if(this.health < 0){
            this.health = 0;
        }
    }

    //this method allows one super person to fight another super person
    public abstract void fight (SuperPerson opponent);
    //changed the fight method into an abstract method because it overidden in the child classes
    //in order for the code to work, there needs to be a fight() method in the child classes

    public String getStatus(){
        return this.getName() + " has " + this.getHealth() + " health ";
    }
    //getters and setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getExperiencePts() {
        return experiencePts;
    }

    public void setExperiencePts(int experiencePts) {
        this.experiencePts = experiencePts;
    }

    //add log hit method and print battle method using the hashmap
    public void logHit(SuperPerson opponent){
        String name = opponent.name;//debug
        int count = battleLog.getOrDefault(name, 0); //what does the getOrDefault() do?
        battleLog.put(name, count + 1);
    }

    public void printBattleLog(){
        System.out.println("Battle Log for " + this.name);
        for(Map.Entry<String, Integer> entry : battleLog.entrySet()){//lookup these new methods used
            System.out.println("Round: " + entry.getValue() + "\n" + entry.getKey() + " was damaged!");
        }
        System.out.println(battleLog.size());//checking to see the number of elements in the hash map
    }
}
