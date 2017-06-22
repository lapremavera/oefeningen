package be.vdab.shapes;
public class ResizableCircle extends CircleP implements Resizable {

    public ResizableCircle (double radius){
        super();
        this.radius= radius;

    }

    @Override
    public void resize(int percent) {
        double factor = (double)percent/100.0;
        this.radius = factor*radius;

    }
}
