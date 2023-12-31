public class NotificationFactory{
    public Notification createNotification(String channel){
        if(channel == null || channel.isEmpty()){
            return null;
        }
        switch(channel){
            case "Email":
                return new EmailNotification();
            default:
                throw new IllegalArgumentException("Unknown channel " + channel);
        }
    }
}
