public class MountainBike extends Bicycle {
    private boolean hasFrontShock;

    public MountainBike(int n, double s, boolean shock) {
        super(n,s);
        this.hasFrontShock = shock;
    }
    @Override
    public String toString() {
        return super.toString() + "\n" + hasFrontShock; }
}
