public class InheritTheWind {
    public static void main(String[] args) {
      //  Bicycle b = new Bicycle(24,10)
//        Shape s = new Shape();
//        System.out.println(s);
Polygon p = new Polygon(5, "Pentagon");
        System.out.println(p);

        System.out.println();

        Polygon c = new Polygon();
        System.out.println(c);
        System.out.println();
        System.out.println();

        Seat seat = new Seat();
        FirstClassSeat firstClassSeat = new FirstClassSeat();

        seat.fillSeat();
        firstClassSeat.fillSeat();


    }
}
