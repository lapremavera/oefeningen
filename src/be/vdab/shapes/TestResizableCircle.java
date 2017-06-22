package be.vdab.shapes;

public class TestResizableCircle {
    public static void main(String[] args) {

        double radius = 2.0;
        ResizableCircle r1= new ResizableCircle(radius);
        r1.resize(50);
          System.out.println ("De cirkel is veranderd van grootte:"+ r1.getArea());
        }

    }

