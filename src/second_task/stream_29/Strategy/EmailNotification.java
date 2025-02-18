package second_task.stream_29.Strategy;

public class EmailNotification implements NotificationStrategy{
    public void send(String message) {
        System.out.println("Сообщение: \"" + message + "\" отправлено по e-mail.");
    }
}
