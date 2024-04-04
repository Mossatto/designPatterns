package ilp037.strucutural.bridge;

public class App {
    public static void main(String[] args) {
        Circle bCircle = new Circle(new Blue());
        System.out.println(bCircle.draw());

        Circle rCircle = new Circle((new Red()));
        System.out.println(rCircle.draw());
    }
}
