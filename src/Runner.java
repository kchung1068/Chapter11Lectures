import com.sun.org.apache.bcel.internal.generic.INSTANCEOF;

public class Runner {
    public static void main(String[] args) {
    FirstClassSeat s1 = new FirstClassSeat();

    s1.fillSeat();
    //If the classes have exactly the same method, the child's method runs.
        Seat s = new Seat();
        s.fillSeat();
//If the parent's method is called, the parent's method runs.
        //This is overwriting


        /// Overloading is when the child and parent's methods have the same name but could be different in arguments or order of arguments
        //Over writing is when the methods of the child and parent are exactly the same.
        Fish f = new Fish();

        Animal a = new Animal();

        Animal m = new Fish(); // m accesses the Animal methods. It can't access the fish methods
        System.out.println(m instanceof Fish); //Is m an Instance of Fish?


//        Dog d = (Dog)(m); // You can't do this casting. It will create an error because m is a Fish
//        d.Bark();

        System.out.println(m);
        System.out.println(a);




        Object o = new String("Hello");
        //Object type, not the reference type
        //String toString, not the Object toString
        //If the method isn't shared, then it goes by the reference
        //If the method is shared, it goes by the Object

        if (o instanceof String) {
            ((String) o).length();
        }

        System.out.println(o);
    }
}
class Fish extends Animal {
    private String scaleColor;
        public Fish() {

        }
    public Fish(String name) {

    }

    public void setScaleColor(String scaleColor) {
        this.scaleColor = scaleColor;
    }

    public String getScaleColor() {
        return scaleColor;
    }
    public void swim() {
        System.out.println("Swimming");
    }
}
class Animal {
    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
class Dog extends Animal {
    public void Bark() {
        System.out.println("Bark");
    }
}
