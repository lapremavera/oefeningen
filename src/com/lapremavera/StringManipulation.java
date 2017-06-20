package com.lapremavera;

import java.util.Scanner;

public class StringManipulation {
    public void toonOplossing5a (){

        Scanner naam = new Scanner(System.in);
        System.out.println("Geef je voornaam in: ");
        String voornaam = naam.nextLine();
        System.out.println("Geef je achternaam in: ");
        String achternaam = naam.nextLine();
        achternaam = achternaam.toUpperCase();
        System.out.println( voornaam+ " " + achternaam);

    }

}
