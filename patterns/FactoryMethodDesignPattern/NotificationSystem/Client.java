package FactoryMethodDesignPattern.NotificationSystem;

public class Client {
    public static void main(String[] args) {
        NotificationCreator creator = new SmsCreator();
        Notification email = creator.createNotification();
        email.send();
    }
}
