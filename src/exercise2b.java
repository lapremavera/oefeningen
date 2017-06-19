import java.util.Scanner;

public class exercise2b {
    public static void main (String[] args){
        System.out.println("Geef je naam: ");
        Scanner naam = new Scanner(System.in);
        String ingevoerdeNaam = naam.nextLine();
        System.out.print("Hello "+ingevoerdeNaam);
        System.out.println();

        System.out.println("Geef je leeftijd: ");
        Scanner leeftijd = new Scanner (System.in);
        int ingevoerdeLeeftijd = leeftijd.nextInt();
        System.out.print ("Volgend jaar word jij "+(ingevoerdeLeeftijd+1));






    }
}