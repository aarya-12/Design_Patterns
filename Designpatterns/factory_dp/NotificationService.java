public class NotificationService{
    public static void main(String[] args){
        NotificationFactory n = new NotificationFactory();
       notification n1 =  n.createNotification("Sms");
       n1.notifyUser();
    }
}