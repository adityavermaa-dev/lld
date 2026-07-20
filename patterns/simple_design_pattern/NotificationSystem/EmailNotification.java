package simple_design_pattern.NotificationSystem;

public class EmailNotification implements Notification {
    @Override
    public void send(){
        System.out.println("Sending Email Notification");
    }
}
