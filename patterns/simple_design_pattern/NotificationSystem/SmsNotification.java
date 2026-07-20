package simple_design_pattern.NotificationSystem;

public class SmsNotification implements Notification {
    @Override
    public void send(){
        System.out.println("Sending sms notification");
    }
}
