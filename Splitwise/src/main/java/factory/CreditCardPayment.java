package factory;

public class CreditCardPayment implements Payment {


    @Override
    public void processPayment(double amount) {
        System.out.println(amount + " paid using credit card");
    }
}
