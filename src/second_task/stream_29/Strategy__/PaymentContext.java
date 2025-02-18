package second_task.stream_29.Strategy__;

class PaymentContext {
    private PaymentStrategy strategy;

    public void setStrategy(PaymentStrategy strategy) {
        this.strategy = strategy;
    }

    public void payAmount(int amount) {
        if (strategy == null) {
            throw new IllegalStateException("Payment strategy is not set");
        }
        strategy.pay(amount);
    }
}
