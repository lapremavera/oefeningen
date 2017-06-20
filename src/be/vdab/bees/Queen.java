package be.vdab.bees;

public class Queen {

        private int hunger;
        private int power;
        private int eggs;
        private String name;

    public Queen (String name, int hunger, int power) {
        this.name = name;
        this.hunger = hunger;
        this.power = power;

    }

    public boolean layEggs() {
        System.out.println("Queen " + name + " is laying eggs.");
        if (hunger < 55) {
            System.out.println(name + " had done her job and goes to sleep.");
            return false;
        } else {
            System.out.println(name + " must go on.");
            return true;
        }
    }

    public boolean EatForPower(){
        System.out.println(name+ "heeft nog honger");
        hunger += 10;
        if (power == hunger){
            System.out.println(name + " sleep.");
            return false;
        } else {
            System.out.println(name + " heeft nog " + (power - hunger)+ " over" );
            return true;
        }
    }


}

