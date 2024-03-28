package ilp037.creational.builder;

public class App {
    public static void main(String[] args) {
//        Armor a = new Armor();
//        HairColor hc = new HairColor();
//        Profession p = new Profession();
//        Hero h = new  Hero(a,hc,p);
        Hero h = new Hero().newBuilder()
                .withArmor(new Armor())
                .build();

        System.out.println(h);
    }

}
