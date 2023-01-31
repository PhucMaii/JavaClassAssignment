package Circle;

public class Circle {
    public int radius;
    public int diameter;

    public Circle(int radius, int diameter){
        this.radius = radius;
        this.diameter = diameter;
    }

    public float getArea() {
        float pi = (float) Math.PI;
        return radius * radius * pi;
    }

    public float getParameter() {
        float pi = (float) Math.PI;
        return 2*pi*radius;
    }
}


