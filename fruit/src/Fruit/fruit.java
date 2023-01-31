package Fruit;


public class fruit {
    public String name;
    public String color;
    boolean hasSkin;
    int weight;
    boolean isTasty;

    public fruit(){

    }

    // Default constructor
    public fruit(String name, String color, boolean hasSkin, int weight, boolean isTasty) {
        this.name = name;
        this.color= color;
        this.hasSkin = hasSkin;
        this.weight = weight;
        this.isTasty = isTasty;
    }

    public void eat() {
        System.out.println("Eating...");
    }

    public void remove() {
        System.out.println("Peeling fruit....removed");
    }


}
