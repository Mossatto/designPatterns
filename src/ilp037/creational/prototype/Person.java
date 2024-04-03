package ilp037.creational.prototype;



public class Person extends Prototype<Person> implements Cloneable{

    String name;
    Long document;


    public Person(){
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Long Time");
    }
    public  String toString(){
        return String.format(
                "Person = (name: %s, document: %d)"
                ,name,document
        );
    }
}
