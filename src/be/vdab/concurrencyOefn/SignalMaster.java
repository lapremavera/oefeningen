package be.vdab.concurrencyOefn;

public class SignalMaster {

    public void fireStartShot() throws InterruptedException {
        System.out.println("Ready");
        Thread.sleep(1000);
        System.out.println("On your marks");
        Thread.sleep(1000);
        System.out.println("3");
        Thread.sleep(1000);
        System.out.println("2");
        Thread.sleep(1000);
        System.out.println("1");
        Thread.sleep(1000);
        System.out.println("Go!");

        synchronized (this) {
            this.notifyAll();   //zorgt dat iedereen op dit signaal wacht; this

        }

    }
}
