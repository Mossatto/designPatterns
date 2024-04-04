package ilp037.strucutural.adapter;

public class App {
    public static void main(String[] args) {
        Advertisement adv1 = new Advertisement("Título 1","Descrição",10.0);

        adv1.publish();
        adv1.inactivate();
        adv1.activate();
        adv1.delete();

        Ad ad = new Ad();
        ad.description = "Samsung Mobile Phone";
        ad.price = 150.0;
        ad.status = "reviewed";



        Advertisement adv2 = new AdvertisementAdapter(ad);
        adv2.publish();
        adv2.inactivate();
        adv2.activate();
        adv2.delete();   }
}
