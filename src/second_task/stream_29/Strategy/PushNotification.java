package second_task.stream_29.Strategy;

public class PushNotification implements NotificationStrategy{
    public void send(String message){
        System.out.println("Сообщение: \"" + message + "\" отправлено push-уведомлением.");
    }
}
