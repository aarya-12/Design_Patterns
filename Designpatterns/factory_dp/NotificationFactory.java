public class NotificationFactory implements Factory{

    public notification createNotification(String notif){
        if(notif.equalsIgnoreCase("SMS")){
            return new SMSnotification();
        }
        else if(notif.equalsIgnoreCase("EMAIL")){
            return new Emailnotification();
        }
        else if(notif.equalsIgnoreCase("PUSH")){
            return new Pushnotification();
        }
        return null;
    }
}