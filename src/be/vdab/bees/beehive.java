package be.vdab.bees;

import java.util.Random;
import java.util.Scanner;

public class beehive {
    public static void main (String[] args){

        Worker w1 = new Worker("Jimi",100);
        Worker w2 = new Worker("Amy", 75);
        Worker w3 = new Worker("John",50);

        Queen q1 = new Queen("Mary", 50, 200);
        Queen q2 = new Queen("Anne", 80, 10);

        q1.layEggs();
        q2.layEggs();

        q1.EatForPower();
        q2.EatForPower();


        System.out.println();




        while (w1.gatherNectar()){
            System.out.println("Visit new flower");
        }

    }//maya.returnHome();  -> moet je nog aanmaken
}
