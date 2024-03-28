package ilp037.creational.factorymethod;

public class SmsNotification implements Notification {
    @Override
    public void notifyUser() {
        System.out.println("Sending a SMS to user...");
    }
}
