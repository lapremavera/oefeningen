import java.util.Scanner;

public class Arrays {
    public static void main (String []args){

        Scanner s = new Scanner (System.in);
        System.out.println ("Geef 3 getallen in:  ");

        int getallen [] = new int[3];


        for (int x = 0; x < getallen.length; x++){
            getallen[x] = s.nextInt();
        }

        for (int j = 0; j < getallen.length;j++){
            int v = getallen [j];
            System.out.print(v + " ");
        }








    }
}