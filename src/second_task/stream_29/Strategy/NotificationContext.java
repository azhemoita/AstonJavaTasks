package second_task.stream_29.Strategy;

class NotificationContext {
    private NotificationStrategy strategy;

    public void setStrategy(NotificationStrategy strategy) {
        this.strategy = strategy;
    }

    public  void executeSend(String message) {
        strategy.send(message);
    }
}
