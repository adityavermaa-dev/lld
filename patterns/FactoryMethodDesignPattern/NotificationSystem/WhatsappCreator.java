package FactoryMethodDesignPattern.NotificationSystem;

public class WhatsappCreator extends NotificationCreator{
    public Notification createNotification(){
        return new WhatsappNotification();
    }
}
