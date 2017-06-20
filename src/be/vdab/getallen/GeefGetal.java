package be.vdab.getallen;

import java.util.Scanner;

public class GeefGetal {

    public static void main(String[] args) {

        Scanner getal = new Scanner(System.in);

        System.out.println("Geef getal op: ");
        int ingevoerdGetal =  getal.nextInt();
        System.out.println("Gekozen getal is "+ ingevoerdGetal);
        System.out.println();

    }
}
