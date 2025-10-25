package factory;

public class PaymentFactory {

    public static Payment createPayment(String paymentType) {
        switch (paymentType) {
            case "CREDIT_CARD":
                return new CreditCardPayment();
            case "MOBILE_WALLET":
                return new MobileWalletPayment();
            default:
                throw new IllegalArgumentException("Unsupported payment type: " + paymentType);
        }
    }
}
