public class StrategyPatternTest {
    public static void main(String[] args) {
        PaymentContext context = new PaymentContext();

        // Pay using credit card
        PaymentStrategy creditCardPayment = new CreditCardPayment("1234567890123456", "John Doe", "123", "12/23");
        context.setPaymentStrategy(creditCardPayment);
        context.pay(250.75);

        // Pay using PayPal
        PaymentStrategy payPalPayment = new PayPalPayment("john.doe@example.com", "password123");
        context.setPaymentStrategy(payPalPayment);
        context.pay(250.75);
    }
}
