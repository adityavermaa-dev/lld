package FactoryMethodDesignPattern.NotificationSystem;

public class WhatsappNotification implements Notification {
    @Override
    public void send(){
        System.out.println("Sending whatsapp notification");
    }
}
