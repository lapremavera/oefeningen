package be.vdab.reflection;

public class Truck {

    private String model;
    private String brand;

    public Truck(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }
    public String toString(){
        return this.getClass().getSimpleName() + " "+ brand;
    }

    //public String toString() {
    //return this.getClass().getSimpleName()+ brand+ " "+ model;
    //}
   private void wash (String wassen){
        System.out.println("Was mij!");


   }
   private void drive(int afstand){
       System.out.println("Ik rij "+afstand+ " met mijn auto.");

   }
}
