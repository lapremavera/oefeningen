import java.util.Scanner;

public class IfElse {
    public static void main (String[]args){

        int a = 1507;
        System.out.println(a >2000 ? "Big" : "Small");

        System.out.println("Geef een nummer in: ");
        Scanner s = new Scanner (System.in);
        int getal = s.nextInt();

        if(getal > 10){
            System.out.println ("Big number");

        } else {
            System.out.println("small number");


            }
        }
    }
