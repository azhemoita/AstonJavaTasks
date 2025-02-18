package second_task.stream_29.Strategy__;

class CashPayment implements PaymentStrategy {
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " in cash.");
    }
}
