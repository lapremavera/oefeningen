package com.lapremavera;

public class Mypoint {
    private int x =0;
    private int y= 0;

    public Mypoint(int x, int y){
        this.x= x;
        this.y= y;

    }
    public int getX(){
        return x;
    }
    public int getY(){
        return y;

    }
    public int distance (Mypoint point){
        int x_distance= this.getX()-point.getX();
        int y_distance= this.getY()-point.getY();
        int arg1 = (int)Math.pow(x_distance, 2);
        int arg2 = (int)Math.pow(y_distance, 2);
        return (int)Math.sqrt(arg1+arg2);
    }
}

