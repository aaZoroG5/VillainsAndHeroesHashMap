package com.pluralsight;

public class ShowdownApp {

    public static void main(String[] args) {

        //print that a battle has started
        System.out.println("A FIGHT BETWEEN SPIDER-MAN AND GREEN GOBLIN HAS STARTED");
        //making a villain and hero battle
        //create a villain and hero object
        SuperVillain goblin = new SuperVillain("Green Goblin", 100, 20);
        SuperHero spidey = new SuperHero("Spider-Man", 100, 20);

        //create a while loop that damages the hero and villain
        while(goblin.isAlive() && spidey.isAlive()) {
            //call the fight methods on each fighter
            spidey.fight(goblin);
            goblin.fight(spidey);

            //display health
            System.out.println("Spider-Man's health: " + spidey.getHealth());
            System.out.println("Green Goblin's health: " + goblin.getHealth());

            //create if statement that checks whether goblin or spidey is at 0 health
            if (goblin.health == 0) {
                System.out.println("Spider-Man defended the city from the Goblin!");
            } else if (spidey.health == 0) {
                System.out.println("Goblin got the best of Spidey!");
            }

        }

    }
}
