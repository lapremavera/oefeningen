package be.vdab.bees;

public class Worker {
    private int capacity;                 //veld, member variable, instance variable genoemd
    private int basket;
    private String name;//alles wat in één lijn kan, wel met een constructor

    public Worker (String name, int capacity) {
        this (name, capacity, 0);

    }

    public Worker(String name, int capacity, int basket){
        this.capacity = capacity;
        this.basket = basket;
        this.name = name;
    }

                                                //method maken; public static
    public boolean gatherNectar(){
        System.out.println("Worker " + name + " is gathering some nectar");
        basket += 10;
        if (basket == capacity) {
            System.out.println(name + " can go home. Work is done!");
            return false;
        }else {
            System.out.println(name + " has " + (capacity - basket) + "left.");
            return true;
        }
    }
    public int getCapacity() {                      //getter
        return capacity;
    }
    public void setCapacity(int newCapacity) {      //setter
        if(newCapacity <0){                         //argumenten, zodat je je setter 'beveiligt
            newCapacity = 0;
        }
        this.capacity= newCapacity;
    }
    public int getBasket() {
        return basket;

    }
    public String getName(){
        return name;

    }
}

