package factory;

public class MobileWalletPayment implements Payment {

    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " paid using mobile wallet");
    }
}
