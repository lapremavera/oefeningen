package be.vdab.concurrencyOefn;

public class Athlete extends Thread {

    private String name;

    public Athlete(String name){
        this.name = name;

    }

    public void run() {
        double tijdGelopen = 0;
        while (tijdGelopen <= 100){
            tijdGelopen += step();
            System.out.println(name + " heeft de "+ tijdGelopen +" meters");
            linger();
        }
        System.exit(0);
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
