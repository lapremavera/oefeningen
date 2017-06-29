package be.vdab.concurrencyOefn;

public class Olympics {

    private static final int NUMBER_OF_LANES=5;

    public static void main(String[] args) {

        SignalMaster sm = new SignalMaster();


        String[] participants = {

                "Usain",
                "Marrion",
                "Florence",
                "Kevin",
                "Tyson",

        };

         for (int i=0; i <NUMBER_OF_LANES; i++){
             new Athlete(participants[i],sm).start();

         }
        try {
            sm.fireStartShot();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
