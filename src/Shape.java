public class Shape {
    private String name;
    public String toString() {
        return  name;
    }
    public Shape() {
        name = "Shape";
        System.out.println("In Super Constructor");
    }
    public Shape(String name) {
        this.name = name;
        System.out.println("In Super Argument C");
    }
}
