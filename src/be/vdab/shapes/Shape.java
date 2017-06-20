package be.vdab.shapes;

public abstract class Shape {
    private String color;
    private boolean filled;

    public Shape() {
        this("red", true);
    }

    public Shape(String color, boolean filled) {
        this.color = color;
        this.filled = filled;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public boolean isFilled() {
        return filled;
    }

    public void setFilled(boolean filled) {
        this.filled = filled;
    }

    public String toString() {
        return "This is a " + color + " shape which is " + (!filled ? "not" : "") + " filled in";
    }

    public abstract double calculateArea();

    public abstract double calculatePerimeter();
}
