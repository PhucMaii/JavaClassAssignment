package Square;

public class square {
    public int side;

    public square(){

    }
    
    public square(int side) {
        this.side = side;
    }

    // void means doesn't return anything
    // int means it returns an integer
    // string means it returns a string
    public int getArea() {
        return this.side * this.side;
    }

    public int getParameter() {
        return 4 * this.side;
    }
}
