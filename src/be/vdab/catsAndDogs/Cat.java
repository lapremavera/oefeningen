package be.vdab.catsAndDogs;

public class Cat {

    private String name = "Garfield";
    private int life = 9;

    public Cat() {


    }

    public Cat(String name, int life) {
        this.name = name;
        this.life = life;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getLife() {
        return life;
    }

    public void setLife(int life) {
        this.life = life;
    }
}
