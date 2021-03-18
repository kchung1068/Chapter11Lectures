public class Bicycle {
    private int numberOfGears;
    private double speed;

    public Bicycle(int n, double s) {
        this.numberOfGears = n;
        this.speed = s;
    }
    @Override
    public String toString() {
        return numberOfGears + "\n" + speed;
    }
}
