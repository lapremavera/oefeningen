package be.vdab.concurrencyOefn;

public class Olympics {

    private static final int NUMBER_OF_LANES=5;

    public static void main(String[] args) {

        String[] participants = {

                "Usain",
                "Marrion",
                "Mohammed",
                "Kevin",
                "Tyson",

        };

         for (int i=0; i <NUMBER_OF_LANES; i++){
             new Athlete(participants[i]).start();

         }
    }
}
