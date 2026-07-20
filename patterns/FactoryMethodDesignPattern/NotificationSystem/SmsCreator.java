package FactoryMethodDesignPattern.NotificationSystem;

public class SmsCreator extends NotificationCreator{
    public Notification createNotification(){
        return new SmsNotification();
    }
}
