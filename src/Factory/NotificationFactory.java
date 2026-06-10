package Factory;

public class NotificationFactory {
    private NotificationFactory(){

    }
    public static Notification getNotification(String type){

        if(type.equalsIgnoreCase("Email")){
            return new EmailNotification();
        }
        if(type.equalsIgnoreCase("SMS")){
            return new SMSnotification();
        }
        throw new IllegalArgumentException(type);
    }
}
