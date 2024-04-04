package ilp037.strucutural.adapter;

public class Advertisement {
    String title;
    String description;
    Double price;
    AdvertisementStatus status = AdvertisementStatus.DRAFT;

    public Advertisement(String title, String description, Double price){
        this.title = title;
        this.description = description;
        this.price = price;
    }

    public void publish(){
        System.out.println("Advertisement publishiment process..");
    }
    public void inactivate(){
        System.out.println("Advertisement inactivate process..");
    }
    public void activate(){
        System.out.println("Advertisement activate process..");
    }
    public void delete(){
        System.out.println("Advertisement delete process..");
    }

    @Override
    public String toString(){
        return  String.format("Advertisement = (%s,%s,%.2f,%s)"
                ,title
                ,description
                ,price
                ,status);
    }
}
