package com.lapremavera;

public class PyramidPattern {
    public static void toonOplossingPyramid() {


        for (int rij = 0; rij < 5; rij++) {
            for (int kolom = 0; kolom < 5 - rij; kolom++) {
                System.out.print(" ");
            }
            for (int patroon = 0; patroon <= rij; patroon++) {
                System.out.print("* ");
            }
            System.out.println();


        }
    }

}
