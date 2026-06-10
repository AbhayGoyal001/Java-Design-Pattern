package Factory;

public class SMSnotification implements Notification {

    @Override
    public void send() {
        System.out.println("SMS notification");
    }
}
