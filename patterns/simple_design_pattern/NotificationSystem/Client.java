package simple_design_pattern.NotificationSystem;

public class Client {
    public static void main(String[] args) {
        Notification notification =  NotificationFactory.createNotification("WHATSAPP");
        notification.send();
    }
}
