package be.vdab.shapes;

import be.vdab.bees.*;

public class CircleP implements GeometricObject {

    protected double radius;

    public CircleP() {
        radius = 1.0;
    }

    public double getRadius(){
        return radius;

    }

    public double getArea() {
        return radius * radius * Math.PI;
    }

    public double getPerimeter() {
        return 2 * radius * Math.PI;
    }

}
