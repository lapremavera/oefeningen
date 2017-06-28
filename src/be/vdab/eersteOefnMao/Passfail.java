package be.vdab.eersteOefnMao;

import java.util.Scanner;

/* Opdracht
Wanneer mark meer of gelijk is aan 50 is het 'pass', anders is het 'fail'

 */

public class Passfail {
    public static void main (String []args){


        System.out.println( "Geef nummer in: ");
        Scanner s = new Scanner (System.in);
        int mark = s.nextInt();

        if (mark >= 50){
            System.out.println ("Pass");

        }
        else {
            System.out.println("Fail");
        }


    }
}