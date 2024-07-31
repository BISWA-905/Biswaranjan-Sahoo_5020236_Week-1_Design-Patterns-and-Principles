public class AdapterPatternTest {
    public static void main(String[] args) {
        // Create PayPal gateway and its adapter
        PayPalGateway payPalGateway = new PayPalGateway();
        PaymentProcessor payPalProcessor = new PayPalAdapter(payPalGateway);

        // Create Stripe gateway and its adapter
        StripeGateway stripeGateway = new StripeGateway();
        PaymentProcessor stripeProcessor = new StripeAdapter(stripeGateway);

        // Process payments using different gateways
        payPalProcessor.processPayment(150.00);
        stripeProcessor.processPayment(200.00);
    }
}
