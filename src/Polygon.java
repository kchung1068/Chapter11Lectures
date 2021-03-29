public class Polygon extends Shape {
    private int numberOfSides;

    public Polygon() {
        super("Triangle");
        numberOfSides = 10;
        System.out.println("In Sub Constructor");
    }

    public Polygon(int numberOfSides) {
        this.numberOfSides = numberOfSides;
        System.out.println("In sub argument c");
    }

    public Polygon (int numberOfSides, String name) {
        super(name);
        this.numberOfSides = numberOfSides;
        System.out.println("In Sub Argument C");
    }
    public String toString() {
        return super.toString() + "\n" + numberOfSides +  "";
    }
}
