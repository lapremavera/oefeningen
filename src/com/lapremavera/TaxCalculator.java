package com.lapremavera;

import java.util.Scanner;

public class TaxCalculator {
    public static void toonOplossing5b() {

        Scanner input = new Scanner(System.in);

        System.out.println("Geef je maandelijks bruto inkomen in EUR in: ");
        double maandelijksBrutoInkomen = input.nextDouble();

        double socialeZekerheid = 0.1307;
        double socialeZekerheidBijdrage = maandelijksBrutoInkomen * socialeZekerheid;
        double afgerondSocialeZekerheidsBijdrage = Math.round(socialeZekerheidBijdrage * 100) / 100;
        System.out.println("Uw sociale zekerheidsbijdrage is: " + afgerondSocialeZekerheidsBijdrage + " EUR.");

        double jaarlijksBrutoInkomen = maandelijksBrutoInkomen * 12;
        double tax1 = 0.25;
        double tax2 = 0.30;
        double tax3 = 0.40;
        double tax4 = 0.45;
        double tax5 = 0.50;

        double jaarlijksSocialeBijdrage= socialeZekerheidBijdrage*12;
        double jaarlijksBrutoInkomenMinSB= jaarlijksBrutoInkomen - jaarlijksSocialeBijdrage;
        System.out.println("Uw jaarlijks belastbaar bruto inkomen is: "+jaarlijksBrutoInkomenMinSB+ " EUR");
        double maandelijksBrutoInkomenMinSB= jaarlijksBrutoInkomenMinSB/12;
        double afgerondeSB = Math.round((maandelijksBrutoInkomenMinSB*100))/100;
        System.out.println("Uw maandelijks belastbaar bruto inkomen is: "+afgerondeSB+ " EUR");

        double maandelijksBrutoInkomen1 = (jaarlijksBrutoInkomenMinSB * tax1)/12;
        double maandelijksBrutoInkomen2 = (jaarlijksBrutoInkomenMinSB * tax2)/12;
        double maandelijksBrutoInkomen3 = (jaarlijksBrutoInkomenMinSB * tax3)/12;
        double maandelijksBrutoInkomen4 = (jaarlijksBrutoInkomenMinSB * tax4)/12;
        double maandelijksBrutoInkomen5 = (jaarlijksBrutoInkomenMinSB * tax5)/12;

        if (jaarlijksBrutoInkomenMinSB > 8680) {
            System.out.println("Uw belastbaar inkomen is: " + maandelijksBrutoInkomen1+ " EUR");
        }else if ((jaarlijksBrutoInkomenMinSB> 8680 )&& (jaarlijksBrutoInkomenMinSB<=12360)){
            System.out.println("Uw belastbaar inkomen is: "+ maandelijksBrutoInkomen2+ " EUR");
        }else if ((jaarlijksBrutoInkomenMinSB>12360)&& (jaarlijksBrutoInkomenMinSB<=20600)){
            System.out.println("Uw belastbaar inkomen is: " +maandelijksBrutoInkomen3+ " EUR");
        }else if ((jaarlijksBrutoInkomenMinSB>20600)&& (jaarlijksBrutoInkomenMinSB<=37750)){
            System.out.println("Uw belastbaar inkomen is: " +maandelijksBrutoInkomen4+ " EUR");
        }else
        {
            System.out.println("Uw belastbaar inkomen is: " +maandelijksBrutoInkomen5+ " EUR");
        }

    }
}
