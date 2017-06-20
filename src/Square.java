package be.vdab.shapes;

/**
 * Circle - Ellipse problem
 */
public class Square extends Rectangle {
    public Square(double side) {
        super(side, side);
    }

    public void setSide(double side) {
        setHeight(side);
        setWidth(side);
    }

    public double getSide() {
        return getWidth(); // or getHeight()
    }

    @Override
    public String toString() {
        return "This is a square with side " + getSide();
    }
}
