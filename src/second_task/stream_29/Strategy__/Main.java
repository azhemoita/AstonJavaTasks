package second_task.stream_29.Strategy__;

public class Main {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Оплата кредитной картой
        context.setStrategy(new CreditCardPayment());
        context.payAmount(100);

        // Оплата через PayPal
        context.setStrategy(new PayPalPayment());
        context.payAmount(200);

        // Оплата наличными
        context.setStrategy(new CashPayment());
        context.payAmount(50);
    }
}
