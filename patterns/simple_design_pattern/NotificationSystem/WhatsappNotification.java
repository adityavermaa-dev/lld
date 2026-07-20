package simple_design_pattern.NotificationSystem;

public class WhatsappNotification implements Notification {
    @Override
    public void send(){
        System.out.println("Sending whatsapp notification");
    }
}
