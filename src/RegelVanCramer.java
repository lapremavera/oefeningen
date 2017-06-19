import java.util.Scanner;

public class RegelVanCramer {
    public static void main (String []args){

        Scanner s = new Scanner (System.in);
        System.out.println("Geef waarden op voor a, b, c, d, e en f: ");


        double a = s.nextDouble();
        double b = s.nextDouble();
        double c = s.nextDouble();
        double d = s.nextDouble();
        double e = s.nextDouble();
        double f = s.nextDouble();

        //waarden zijn eigenlijk al toegekend, bv. a= 3,4, ...;
        //je kan ook double a = 3.4, b = 50.2, c = 44.5, d= 2.1, e = 0.55, f = 5.9;

        double x, y;
        //mag ook bij de rest staan, gewoon visueel duidelijk;
        //in sommige programmeertalen is de x een 0, maar hier in Java moet je ze expliciet initialiseren;

        x = (e*d - b*f) / (a*d - b*c);
        y = (a*f - e*c) / (a*d - b*c);

        // mag ook: double x = (e*d - b*f) / (a*d - b*c);

        System.out.println ("x = " + x);
        System.out.println ("y = " + y);




    }
}