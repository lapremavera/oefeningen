package be.vdab.shapes;

public class Circle extends Shape {
    private double radius;

    protected Circle() {
        this(1.0);
    }

    public Circle(double radius) {
        super();
        this.radius = radius;
    }

    public Circle(String color, boolean filled, double radius) {
        super(color, filled);
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    /**
     * Better name than getArea(), due to not being confusing.
     */
    public double calculateArea() {
        return radius * radius * Math.PI;
    }

    public double calculatePerimeter() {
        return 2 * radius * Math.PI;
    }

    @Override
    public String toString() {
        return "This is a circle with radius " + radius + " and color " + getColor() + " and filled " + isFilled();
    }
}
