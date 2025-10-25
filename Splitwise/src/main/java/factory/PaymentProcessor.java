package factory;

public class PaymentProcessor {

    public static void main(String[] args) {
        Payment payment = PaymentFactory.createPayment("CREDIT_CARD");
        payment.processPayment(20);
    }
}
