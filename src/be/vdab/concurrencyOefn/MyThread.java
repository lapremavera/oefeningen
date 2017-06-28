package be.vdab.concurrencyOefn;

public class MyThread extends Thread {


      public static void main(String[] args) {
          Thread t = new MyThread();

          t.start();  // geen t.run; creërt en lanceert meteen een execution run.

          System.out.println("Runs from the main thread");

      }

    public void run() {
        System.out.println("Runs from a second thread");
    }

}               // er wordt eerst de laatste afgeprint en dan het eerste!
                // van zodra je een thread start, heb je geen controle meer over de volgorde; RACE CONDITION
