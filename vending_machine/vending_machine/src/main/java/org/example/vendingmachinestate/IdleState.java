package org.example.vendingmachinestate;

import org.example.Product;
import org.example.ProductFactory;

public class IdleState implements VendingMachineState {

    @Override
    public void insertMoney(VendingMachineContext context, double amount) {
        System.out.println("Please select the product");
    }

    @Override
    public void selectProduct(VendingMachineContext context, String productName) {
        Product prod = ProductFactory.getProduct(productName);
        context.setSelectedProduct(prod);

        System.out.println("Thanks for selecting " + productName + "Please pay " + prod.getPrice());
        context.setCurrentState(new AcceptingPaymentState());
    }

    @Override
    public void dispenseProduct(VendingMachineContext context) {
        System.out.println("Please select the product");
    }
}
