import Fruit.fruit;
import Square.square;
import Circle.Circle;
import Cylinder.Cylinder;

public class App {
    public static void main(String[] args) throws Exception {
       
        fruit apple = new fruit();

        fruit mango = new fruit("Mango", "yellow", true, 1, true);

        square square1 = new square(4);
        System.out.println(square1.getArea());
        apple.eat();

        mango.remove();
        mango.eat();
        System.out.println(mango.color);

        //Car ferrari = new Car("Ferrari123", "Ferrari", 2018, 100, false );
    

        Circle circle1 = new Circle(10,20);
        Cylinder cylinder1 = new Cylinder(10, 20);

        System.out.println("Area of circle1: " + circle1.getArea());
        System.out.println("Parameter of circle1: " + circle1.getParameter());

        System.out.println("Volume of cylinder1: " + cylinder1.getVolume());

    }

}
