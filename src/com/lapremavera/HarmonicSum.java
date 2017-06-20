package com.lapremavera;
public class HarmonicSum {
    public static void toonOplossing5c(){

        int max = 50000;


        double sumLR= 0;
        double sumRL= 0;

        for (int i=1; i<= max; i++){
            sumLR += (double)1/i;
            sumRL += (double)(1)/(max -i+1);
        }

        System.out.println("Van links naar rechts= "+sumLR);
        System.out.println("Van rechts naar links= "+sumRL);
        System.out.println("Verschil is= " + (sumRL-sumLR));
    }
}
