package be.vdab.shapes;

/**
 * Created by KVRRQ70 on 20/06/2017.
 */
public class Cylinder {
    private double height;
    private Circle base; // composition or aggregation or association

    public Cylinder(double height, Circle base) {
        this.height = height;
        this.base = base;
    }

    public Cylinder(double height, double radius) {
        this.height = height;
        this.base = new Circle(radius);
    }

    public double volume() {
        return base.calculateArea() * height;
    }
}
