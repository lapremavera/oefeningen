package be.vdab.getallen;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {

    public static void main(String[] args) {

        System.out.println("Geef 2 waardes in.");
        Scanner s = new Scanner(System.in);
        System.out.println("Waarde 1: ");
        int waarde1;
        waarde1 = s.nextInt();
        System.out.println("Waarde 2 (groter dan waarde 1): ");
        int waarde2 = s.nextInt();
        System.out.println("Raad het nummer tussen " + waarde1 + " en " + waarde2);

        GuessingValues guessingValues= new GuessingValues(waarde1, waarde2);
        boolean win = false;

        while (true)
        {
            // inlezen waarde
            int gokWaarde = s.nextInt();

            try {
                win = guessingValues.guessNummer(gokWaarde);

                if (win == true)
                {
                    // gewonnen!
                    break;
                }


                System.out.println("Probeer nog eens...");

            }
            catch (Exception e){
                System.out.println(e.getMessage());
                System.out.println("Het nummer was: " + guessingValues.getNummerToGuess());
                return;
            }

        }

        if (win)
        {
            System.out.println("Proficiat u hebt het correct nummer geraden: " + guessingValues.getNummerToGuess());
        }



/*
        int aantalKeren= 0;
        int nummerToGuess=0;

        while (aantalKeren<3){
            int guess = s.nextInt();
            aantalKeren++;

            if (guess==nummerToGuess){
                win = true;
                System.out.println("Proficiat! U heeft het juiste nummer geraden!");
                break;
            }
            else
                {if (aantalKeren>2) {
                }
            System.out.println("Game Over!");
                }else {
                System.out.println("Jammer, probeer nog een keer.");

            }

        } System.out.println("Het te raden nummer was "+nummerToGuess);

*/
    }
}