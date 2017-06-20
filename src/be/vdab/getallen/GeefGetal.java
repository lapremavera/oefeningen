package be.vdab.getallen;

import java.util.InputMismatchException;
import java.util.Scanner;

public class GeefGetal {

    public static void main(String[] args) {

        Scanner getal = new Scanner(System.in);

        System.out.println("Geef getal op: ");
        try {

            int ingevoerdGetal = getal.nextInt();
            System.out.println("Gekozen getal is " + ingevoerdGetal);

        } catch (InputMismatchException e) {
            System.out.println("Er is een foute invoer!");
        }
    }
}
