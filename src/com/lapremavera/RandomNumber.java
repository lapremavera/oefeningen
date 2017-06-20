package com.lapremavera;

import java.util.Random;
import java.util.Scanner;

public class RandomNumber {
    public static void toonOplossing5b (){

        Scanner s = new Scanner(System.in);

        System.out.println("Geef je min: ");
        int min;
        min = s.nextInt();

        System.out.println("Geef je max: ");
        int max;
        max = s.nextInt();

        Random ran = new Random();
        int n = ran.nextInt(((max-min)+1)+min);
        System.out.println(n);

    }
}
