package com.lapremavera;

import java.util.Scanner;

public class PopulationProjection {

    public void toonOplossing (){
        Scanner s = new Scanner(System.in);
        System.out.println("Dagelijkse cijfers.");

        double birthPerDag = 86400/7;
        double deathPerDag = 86400/13;
        double immiPerDag = 86400/45;
        int dagenPerJaar= 365;

        System.out.println("Geboortes per dag: "+birthPerDag);
        System.out.println("Sterfgevallen per dag: "+ deathPerDag);
        System.out.println("Immigranten per dag: "+immiPerDag);
        System.out.println();

        double currentPopulation = 312_032_486;

        System.out.println("Jaarlijkse cijfers.");

        double birthPerJaar = birthPerDag* dagenPerJaar;
        double deathPerjaar = deathPerDag * dagenPerJaar;
        double immiPerJaar = immiPerDag * dagenPerJaar;

        System.out.println("Geboortes per jaar: " + birthPerJaar);
        System.out.println("Sterfgevallen per jaar: " + deathPerjaar);
        System.out.println("Immigranten per jaar: " + immiPerJaar);
        System.out.println();

        double jaarlijkseGroei = ((birthPerJaar + immiPerJaar)- deathPerjaar);

        double jaar1Pop = currentPopulation + jaarlijkseGroei;
        double jaar2Pop = jaar1Pop + jaarlijkseGroei;
        double jaar3Pop = jaar2Pop + jaarlijkseGroei;
        double jaar4Pop = jaar3Pop + jaarlijkseGroei;
        double jaar5Pop = jaar4Pop + jaarlijkseGroei;

        System.out.println("Population jaar 1 : " + jaar1Pop +".");
        System.out.println("Population jaar 2 : " + jaar2Pop +".");
        System.out.println("Population jaar 3 : " + jaar3Pop +".");
        System.out.println("Population jaar 4 : " + jaar4Pop +".");
        System.out.println("Population jaar 5 : " + jaar5Pop +".");






    }
}
