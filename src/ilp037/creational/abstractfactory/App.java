package ilp037.creational.abstractfactory;

public class App {
    public static void main(String[] args) {
        String type = args[0];
        KingdomFactory factory =  KingdomFactory.getInstance(type);

        extracted(factory);
    }

    private static void extracted(KingdomFactory factory) {
        Army army = factory.createArmy();
        Castle castle = factory.createCastle();
        King king = factory.createKing();

        System.out.println(army.getClass().getSimpleName());
        System.out.println(castle.getClass().getSimpleName());
        System.out.println(king.getClass().getSimpleName());
    }
}
