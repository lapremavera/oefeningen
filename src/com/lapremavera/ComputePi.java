package com.lapremavera;

public class ComputePi {
    public static void toonOplossingPi(){

        double som = 0.0;
        int teller= 1;
        int maxNoemer = 10000000;

        for (int noemer= 1; noemer <= maxNoemer; noemer+=2){
            if (noemer%4==1){
                som += teller * (1.0/noemer);
                System.out.printf("n =%d, sign =%d\n", noemer, teller);
                teller *= -1;
            }
            double closeToPi = 4 * som;
            System.out.println("Pi = " + closeToPi);


        }
    }
}
