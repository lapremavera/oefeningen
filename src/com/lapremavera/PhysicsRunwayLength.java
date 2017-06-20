package com.lapremavera;

import java.util.Scanner;

public class PhysicsRunwayLength {
    public void toonOplossing4() {

        Scanner input = new Scanner(System.in);
        System.out.print("Geef acceleratie in m/s: ");
        double acceleration= input.nextDouble();
        System.out.print("Geef take off speed in m/s2: ");
        double speed = input.nextDouble();

        double minRunwayLength = ((speed*speed)/2*acceleration);
        System.out.println( "De minimum Runwawy lengte is: " + minRunwayLength);


    }
}
