import java.util.Scanner;

public class HelloYou {
    public static void main (String [] args){

        System.out.print ("Typ uw naam in:");
        Scanner naam = new Scanner (System.in);
        String ingevoerdeNaam = naam.nextLine();
        ingevoerdeNaam = ingevoerdeNaam.toUpperCase();
        System.out.print ("Hello "+ ingevoerdeNaam + "!");
        System.out.println();


      int myNumber = 5;
      String s ="Ik heb "+myNumber+" koekjes";
      System.out.println(s);
      System.out.println();

      String dorst = new String ("Drinken, ajb!");
      dorst = "Drinken, ajb!";
      System.out.print (dorst);



    }
}