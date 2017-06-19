package be.vdab.bees;
public class Square extends Rectangle {


    public Square() {
    }
    public Square(double width, double length){

    }
    public Square(String color, boolean filled) {
        super (color, filled, 1, 1);
    }

    public double getSide(){
        return getWidth();
    }
    public void setSide (double side){
        setWidth(side);
        setLength(side);

    }

    @Override
    public String toString() {
        System.out.println("vierkant");
        return super.toString();
    }
}
