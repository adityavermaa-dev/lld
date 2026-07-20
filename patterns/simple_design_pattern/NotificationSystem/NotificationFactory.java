package simple_design_pattern.NotificationSystem;

public class NotificationFactory {
    public static Notification createNotification(String type) {
        switch (type) {

            case "EMAIL":
                return new EmailNotification();
            case "SMS":
                return new SmsNotification();
            case "WHATSAPP":
                return new WhatsappNotification();

            default:
                throw new IllegalArgumentException("Argument is Invalid");
        }
    }
}
