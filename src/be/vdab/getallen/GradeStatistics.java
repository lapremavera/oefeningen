package be.vdab.getallen;

import java.util.*;

public class GradeStatistics {

    public static void main(String[] args) {

        List<Student> students = new ArrayList<Student>();
        //Set<Student> students = new HashSet<Student>();
        students.add(new Student("John"));
        students.add(new Student("Linde"));
        students.add(new Student("Jane"));
        students.add(new Student("Jenny"));
        students.add(new Student("Jill"));
        students.add(new Student("Kaat"));
        students.add(new Student("Koen"));

        int aantalStudenten = 0;
        int ingegevenCijfer = 0;


        Scanner s = new Scanner(System.in);
        int gemiddelde = 0;


        for (int i = 0; i < students.size(); i++) {
            System.out.println("Geef punten van " + students.get(i).getNaamStudent());
            ingegevenCijfer = s.nextInt();

            if (ingegevenCijfer < 0) {
                System.out.println("Cancelled by user.");
                return;

            } else {
                gemiddelde = gemiddelde + ingegevenCijfer;


            }
        }gemiddelde = gemiddelde / students.size();
        System.out.println("Het gemiddelde is: " + gemiddelde);
    }
}








