import java.util.Scanner;

public class SalaryCalculator{
    public static void main (String [] args){

        Scanner naam = new Scanner (System.in);
        System.out.println ("Geef de naam van de 3 werknemers: ");
        String naamWerknemer1 = naam.nextLine();
        String naamWerknemer2 = naam.nextLine();
        String naamWerknemer3 = naam.nextLine();

        System.out.println("Geef aantal gewerkte uren in: ");
        double GewerkteTijd1 = naam.nextDouble();
        double GewerkteTijd2 = naam.nextDouble();
        double GewerkteTijd3 = naam.nextDouble();

        System.out.println ("Geef het uurloon in: ");
        double uurLoon = naam.nextDouble();

/*

        int overUur = uurLoon * 1.5;
        int GewerkteTijd = int GewerkteTijd + int overUur;
        int Gewerktetijd2 = int GewerkteTijd2 + int overUur;
        int Gewerktetijd3 = int GewerkteTijd3 + int overUur;

        int salaris = (40*uurLoon)+ (overUur*uurLoon);


        if (GewerkteTijd, GewerkteTijd2, GewerkteTijd3 > 40){
            int aantalOverUur = GewerkteTijd, GewerkteTijd2, gewerkteTijd3 - 40
                    int salaris = (40*uurLoon) + (overUur*uurLoon);
            System.out.println("Uw salaris deze maand bedraagt: "+salaris);
        }
        else
            System.out.println("Uw salaris deze maand bedraagt: " + salaris);

            */



    }
}