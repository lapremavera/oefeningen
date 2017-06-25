package be.vdab.getallen;

import java.util.Scanner;

public class BodyMassIndex {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        double weightInPounds=0;
        double heightInInches=0;

        System.out.println("Geef uw gewicht in pond: ");
        weightInPounds= input.nextDouble();
        System.out.println("Geef uw lengte in inches weer: ");
        heightInInches= input.nextDouble();

        double poundsToKg = weightInPounds*0.45359237;
        double inchesToM = heightInInches*0.0254;

        double bMI= poundsToKg/(inchesToM*inchesToM);

        System.out.println("Uw BMI is: "+bMI);


    }
}
