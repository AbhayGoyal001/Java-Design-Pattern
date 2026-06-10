package Factory;

public class Client {
    static void main(String[] args) {
        Notification notification = NotificationFactory.getNotification("Email");
        notification.send();
        Notification notification1 = NotificationFactory.getNotification("SMS");
        notification1.send();
    }
}
