package be.vdab.concurrencyOefn;

public class Athlete extends Thread {

    private String name;
    private Object signal;

    public Athlete(String name,Object signal){
        linger();
        this.name = name;
        this.signal= signal;

    }

    public void run() {
        //om iedereen op hetzelfde signaal te laten starten
        synchronized (signal){

        }
        double tijdGelopen = 0;
        while (tijdGelopen <= 100){
            tijdGelopen += step();
            System.out.println(name + " heeft de "+ tijdGelopen +" meters");
            linger();
        }
    }

    private void linger(){
        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public double step() {

        int min =1;
        int max= 3;
        return min + Math.random()* (max-min);
    }

}
