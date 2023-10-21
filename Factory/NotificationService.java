public class NotificationService {
    public static void main(String[] args) throws Exception {
        NotificationFactory notificationFactory = new NotificationFactory();
        Notification notification = notificationFactory.createNotification("Email");
        notification.notifyUser();
    }
}
