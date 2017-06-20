package com.lapremavera;

import java.util.Scanner;

public class FullMultiplicationTable {
    public static void  toonOplossing5C (){

        int tabelgrootte = 10;
        Scanner s = new Scanner(System.in);
        System.out.println("Geef tabelgrootte op: " );
        tabelgrootte= s.nextInt();


        System.out.format ("      ");
        for (int i=1; i<=tabelgrootte; i++){
            System.out.format ("%4d",i);

        }
        System.out.println();
        System.out.println("---------------------------------------------");

        for (int rij = 1; rij<= tabelgrootte; rij++){
            System.out.format ("%4d |",rij);
            for (int kolom=1; kolom <= tabelgrootte; kolom++){
                System.out.format ("%4d", rij*kolom);

            }System.out.println();
        }
    }
        //printMultiplicationTable(tabelgrootte);




}

