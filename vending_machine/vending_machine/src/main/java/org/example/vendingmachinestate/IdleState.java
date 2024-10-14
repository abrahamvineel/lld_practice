package org.example.vendingmachinestate;

import org.example.Product;
import org.example.ProductFactory;

public class IdleState implements VendingMachineState {

    @Override
    public void insertMoney(VendingMachineContext context, double amount) {
        System.out.println("Please select the product");
    }

    @Override
    public void selectProduct(VendingMachineContext context, String product) {
        Product prod = ProductFactory.getProduct(product);
        context.setSelectedProduct(prod);
        int quantity = context.getSelectedProduct().getQuantity();
        quantity--;
        context.getSelectedProduct().setQuantity(quantity);

        System.out.println("Thanks for selecting " + product + "Please pay ");
        context.setCurrentState(new AcceptingPaymentState());
    }

    @Override
    public void dispenseProduct(VendingMachineContext context) {
        System.out.println("Please select the product");
    }
}
