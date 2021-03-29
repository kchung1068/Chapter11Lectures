public class Runner {
    public static void main(String[] args) {
    FirstClassSeat s1 = new FirstClassSeat();

    s1.fillSeat();
    //If the classes have exactly the same method, the child's method runs.
        Seat s = new Seat();
        s.fillSeat();
//If the parent's method is called, the parent's method runs.
        //This is overwriting
    }
}
