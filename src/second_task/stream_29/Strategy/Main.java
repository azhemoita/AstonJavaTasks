package second_task.stream_29.Strategy;

public class Main {
    public static void main(String[] args) {
        NotificationContext context = new NotificationContext();

        // Выбираем стратегию
        context.setStrategy(new EmailNotification());
        context.executeSend("Привет! Это тестовое сообщение для отправки по e-mail!");

        context.setStrategy(new SMSNotification());
        context.executeSend("Привет! Это тестовое сообщение для отправки по СМС!");

        context.setStrategy(new PushNotification());
        context.executeSend("Привет! Это тестовое сообщение для отправки push-уведомлением!");
    }
}
