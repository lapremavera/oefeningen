package com.lapremavera;

public class PyramidNumbers {
    public static void toonOplossingPyramidNumbers() {


        int aantalRijen = 8;
        int start = 0;

        for (int i = aantalRijen; i > 0; i--) {
            for (int j = 0; j <= i * 2; j++) ;
            System.out.print("\t");
        }
        for (int j = 0; j <= start; j++) {
            double kwadraat = Math.pow(2, j);
            int kwadraatAfgerond = (int) Math.round(kwadraat);
            System.out.print(kwadraatAfgerond + " \t");
        }
        for (int j = start - 1; j >= 0; j--) {
            double kwadraat = Math.pow(2, j);
            int kwadraatAfgerond = (int) Math.round(kwadraat);
            System.out.print(kwadraatAfgerond +" \t");

        } System.out.println();

    }
}

