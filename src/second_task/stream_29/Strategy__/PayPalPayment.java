package second_task.stream_29.Strategy__;

class PayPalPayment implements PaymentStrategy{
    @Override
    public void pay(int amount) {
        System.out.println("Paid " + amount + " using PayPal.");
    }
}
