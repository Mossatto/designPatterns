package ilp037.creational.factorymethod;

public class EmailNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a email ...");
    }
}
