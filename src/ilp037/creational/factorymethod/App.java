package ilp037.creational.factorymethod;

public class App {
    public static void main(String[] args) {
        Notification n = NotificationFactory.create(Notification.Type.PUSH);
        n.notifyUser();
    }
}
