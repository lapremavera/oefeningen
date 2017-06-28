package be.vdab.eersteOefnMao;

public class AverageSpeedinMiles {
    public static void main (String [] args){

            /*
            als je meerdere lijnen commentaar wil geven, dan gebruik je de slash ster
            en eindig je met
            het omgekeerde ;-)
            */

        double distance = 14.0; //in km;
        int tijd = 45*60 +30;

            /* alles in seconden zetten
             je kan hier ook een double gebruiken

             double tijdInUren = tijd / 3600.0;

            alles wordt afgerond, dit doet Java omdat hij denkt dat hij twee int moet berekenen.
            Je gaat met de int een double maken door er een .0 achter te zetten of een d
          */

        int aantalSecondenPerUur = 3600;
        double tijdInUren = tijd / (double)aantalSecondenPerUur;

            //getallen casten, door er een double voor te zetten.


        double kilometerPerUur = distance / tijdInUren;

        double milesPerUur = kilometerPerUur / 1.6;
        double eindResultaat = Math.round(milesPerUur * 100) /100d;

            // omdat Java op de 0 afrondt en niet 2 cijfers na de komma. Daarom *100 en delen door 100

        System.out.println(eindResultaat);

        System.out.format ("%.2f", milesPerUur);

            /*dan is het resultaat op de komma ; als je nu een verdere berekening doet, dan gaat hij verder met
             het volledige getal en niet met het afgeronde getal.

             je kan ook
             system.out.printf ("%.2f", milesPerUur);
             */




    }
        }