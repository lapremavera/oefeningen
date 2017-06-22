package be.vdab.shapes;

public class
ShapeRunner {
    public static void main(String[] args) {
        Rectangle r = new Rectangle(5, 7);

        Shape q = new Square(8);
        System.out.println(q.calculatePerimeter());

        Circle c = new Circle("pink", false, 5);
        System.out.println(c.calculateArea());

    }
}
