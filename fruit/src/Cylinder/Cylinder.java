package Cylinder;

public class Cylinder {
    public int height;
    public int radius;

    public Cylinder(int height, int radius) {
        this.height = height;
        this.radius = radius;
    }

    public float getVolume(){
        float pi = (float) Math.PI;
        return pi * radius * radius * height;
    }


}



